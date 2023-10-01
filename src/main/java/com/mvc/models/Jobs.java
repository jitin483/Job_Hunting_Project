package com.mvc.models;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Jobs")
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String hrName;
	private String companyName;
	private String jobprofile;
	private String location;
	private String jobType;
	private String skillsRequired;
	private String experience;
	private int userid;
	private String isapplied;
	private String isActive;
	private String jobDescription;
	private Date validTill;
	 
   
	
}
