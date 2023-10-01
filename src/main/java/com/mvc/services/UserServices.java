package com.mvc.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvc.dao.UserRepository;
import com.mvc.exception.DuplicateUserFoundException;
import com.mvc.exception.UserNotFoundException;
import com.mvc.models.User;

/**
 * @author JitinKumar
 * 
 * */
@Service
public class UserServices {
	@Autowired
	 private UserRepository repo;
	
	/**
	 * @Param Integer
	 * @Param User
	 * This is for Storing cache data
	 * 
	 **/
  StoredData<Integer,User>cache=new StoredData<Integer,User>(60000L);
  
	
	/**
	 * @param User
	 * @return boolean value
	 * This is method return User object after creating user in database as well as stored data in cache
	 * 
	 **/
	public boolean createNewUser(User user)
	{
		User u=repo.save(user);
		
		cache.put(u.getId(), u);
		System.out.println("Expired Keys : "+cache.getExpiredKeys());
		if(u!=null) {
			return true;
		}
		//This Exception class it's handle by the Global Handler class which is defined in Exception package
		 throw new DuplicateUserFoundException("User Already Exist");
	}

	
	/**
	 * 
	 * @param username
	 * @return
	 * Get User Using User Name
	 */
	public User getUsers(String username)
	{
        User user =repo.findByUsername(username);
	 if(user!=null)
	 {
		 return user;
	 }
	 else
	 {
		//This Exception class it's handle by the Global Handler class which is defined in Exception package
		 throw new UserNotFoundException("User not found");
		
	 }
	}
	
	 
	/**
	 * 
	 * @param id
	 * @return
	 * User get Using By Id
	 */
	public User getUserById(int id) {
		
		Optional<User> userOpt = repo.findById(id);
		if(userOpt.isPresent())
		{
			return userOpt.get();
		}
		else 
		{
			//This Exception class it's handle by the Global Handler class which is defined in Exception package
			throw new UserNotFoundException("User not found");
		}
	}
	
	

	 /**
	  * 
	  * @param id
	  * Delete User USing by id
	  */
	public  void deleteUsers(int id)
	{
		Optional<User> userdel =	 repo.findById(id);
		 
		 if(userdel.isPresent())
		 {
			repo.delete(userdel.get()); 
		 }
		 else
		 {
			 throw new UserNotFoundException("User not found");
		 }
	}
	
	
	/**
	 * 
	 * 
	 * @return All Users
	 * Get List OF All User
	 */
	public List<User> getUsers()
	{
		return repo.findAll();
	}
	
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * For Verify the user 
	 */
	public User verifyLogin(String username, String password) {
		
				return repo.findByUsernameAndPassword(username,password);
	}
	/**
	 * Method created for  applying jobs
	 * @param user
	 * @return
	 */
	public User  applyForJob(User user)
	{
		return repo.save(user);
	}
	
	
	
	
	/**
	 * For Update users
	 * @param u
	 * @return
	 */
	public boolean updateUser(User u) {
        @SuppressWarnings("deprecation")
        User user=repo.getById(u.getId());
        user.setId(u.getId());
        user.setName(u.getName());
        user.setUsername(u.getUsername().trim());
        user.setEmail(u.getEmail());
        user.setPassword(u.getPassword());
        user.setAddress(u.getAddress());
        user.setMobile(u.getMobile());
        user.setEducation(u.getEducation());
        user.setSchool(u.getSchool());
        user.setCollege(u.getCollege());
        user.setSkills(u.getSkills());
        user.setExperience(u.getExperience());
      
        User updateUser =repo.save(user);
        if(updateUser!=null)
        	return true;
        throw new UserNotFoundException("User not found");
            
        }

	
	/**
	 * To count how many entity are stored in database 
	 * @return
	 */
    public long count() {
    	return repo.countUsers();    	
    }
    
 
    
    /**
     * It is For change password
     * @param oldpassword
     * @param newpassword
     * @param username
     * @return
     */
    public boolean verifyUsername(String oldpassword, String newpassword,String username)
    {
        User u=repo.findByUsername(username);
        if(u.getPassword().equals(oldpassword)) {
            u.setPassword(newpassword);
            repo.save(u);
            return true;
        }
        else {
        	//This Exception class it's handle by the Global Handler class which is defined in Exception package
            throw new UserNotFoundException("Password is incorrect");

        }
    }    
//    public User getFromcache(String username) {
//    	
//    	User user=repo.findByUsername(username);
//    	lru.put(user.getId(),user);
//    	if(lru.get(user.getId()))
//    	return user;
//    	
//    }
}
