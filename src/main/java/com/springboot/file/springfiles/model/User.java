package com.springboot.file.springfiles.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="file_type")
	private String fileType;
	
	@Transient
	private MultipartFile file;
	
	public User() {}
	
	public User(String name, String email, String phoneNumber, String fileType) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.fileType = fileType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
}
