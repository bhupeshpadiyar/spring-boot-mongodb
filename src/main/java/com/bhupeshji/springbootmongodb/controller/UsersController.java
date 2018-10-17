package com.bhupeshji.springbootmongodb.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhupeshji.springbootmongodb.models.Users;
import com.bhupeshji.springbootmongodb.repo.UsersRepo;

/**
 * @author Bhupesh.Singh
 *
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired 
	UsersRepo usersRepo;
	
	/**
	 * GET /create --> Create a new user and save it in the MongoDB.
	 */
	@RequestMapping("/create")
	public Map<String, Object> create(Users users) {
		users.setCreatedDate(new Date());
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "User created successfully");
		dataMap.put("status", "1");
		dataMap.put("booking", usersRepo.save(users));
		return dataMap;
	}

	/**
	 * GET /read --> Read a booking by booking id from the database.
	 */
	@RequestMapping("/read")
	public Map<String, Object> read(@RequestParam String id) {

		Object user = usersRepo.findById(id);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "User found successfully");
		dataMap.put("status", "1");
		dataMap.put("user", user);
		return dataMap;
	}
	
	/**
	 * GET /update --> Update an User's record and save it in the database.
	 */
	
	 /* @RequestMapping("/update") public Map<String, Object> update(@RequestParam String userId, @RequestParam String userRole) {
	  
	  Users users = usersRepo.findById(userId);
	  users.setUpdateDate(new Date());
	  users.setRole(userRole);
	  users = usersRepo.save(users);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "User updated successfully"); 
	  dataMap.put("status","1"); 
	  dataMap.put("user", users); return dataMap; }*/
	
	/**
	 * GET /delete --> Delete a User from the database.
	 */
	@RequestMapping("/delete")
	public Map<String, Object> delete(@RequestParam String userId) {
		usersRepo.deleteById(userId);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "User deleted successfully");
		dataMap.put("status", "1");
		return dataMap;
	}

	/**
	 * GET /read --> Read all Users from the database.
	 */
	@RequestMapping("/read-all")
	public Map<String, Object> readAll() {
		List<Users> users = usersRepo.findAll();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Users found successfully");
		dataMap.put("status", "1");
		dataMap.put("bookings", users);
		return dataMap;
	}

}
