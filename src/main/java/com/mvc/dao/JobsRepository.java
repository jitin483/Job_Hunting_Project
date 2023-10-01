package com.mvc.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.mvc.models.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Integer> {
	
	public List<Jobs> findByhrName(String hrName);
	
	@Query("select count(job) from Jobs job")
	public Long countJobs();
	
	@Query("select count(job2) from Jobs job2 where isActive='yes' ")
	public Long  countactiveJobs();
	
	@Query("select count(job1) from Jobs job1 where isActive='no' ")
	public Long  countInactiveJobs();
	
	
}
