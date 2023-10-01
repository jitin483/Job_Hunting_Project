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
@Table(name="hr_tbl")
public class Hr{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String name;
    private String companyname;
    private String forpost;
    private String experience;
    private String skills;
    private String mobile;
    private String email;
    private String isActive;
    private String address;
    private String gender;
    private Date brthdate;
    private String location;
    private String maritalStatus;
    private String jobDescription;
    private String about;
     
   
    }