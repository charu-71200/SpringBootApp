package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Map;

public class Hybrid {
     
	private List<Topic> allUsers ;
	private Topic firstUser ;
	private String firstUserName ;
	private Map<String,Topic> allUserMap ;
	private Integer totalUsers ;
	
	
	
	
	public List<Topic> getAllUsers() {
		return allUsers;
	}
	public void setAllUsers(List<Topic> allUsers) {
		this.allUsers = allUsers;
	}
	public Topic getFirstUser() {
		return firstUser;
	}
	public void setFirstUser(Topic firstUser) {
		this.firstUser = firstUser;
	}
	public String getFirstUserName() {
		return firstUserName;
	}
	public void setFirstUserName(String firstUserName) {
		this.firstUserName = firstUserName;
	}
	public Map<String,Topic> getAllUserMap() {
		return allUserMap;
	}
	public void setAllUserMap(Map<String,Topic> allUserMap) {
		this.allUserMap = allUserMap;
	}
	public Integer getTotalUsers() {
		return totalUsers;
	}
	public void setTotalUsers(Integer totalUsers) {
		this.totalUsers = totalUsers;
	}
}
