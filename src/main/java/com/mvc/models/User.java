package com.mvc.models;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author JitinKumar
 *This is Model Class 
 *here lombok is used for @Setter,@Getter,@AllArgsConstructor,@NoArgsConstructor,@ToString,@Entity,@Table(name="User_tbl")
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="User_tbl")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String address;
    private String mobile;
    private String education;
    private String school;
    private String college;
    private String skills;
    private String experience;
    @Column(name = "verification_code", length = 64)
    private String verificationCode;
    private boolean enabled;
    /**
     * Many to many relationship with jobs model
     */
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Jobs>  jobsApplied = new ArrayList<Jobs>();
 }