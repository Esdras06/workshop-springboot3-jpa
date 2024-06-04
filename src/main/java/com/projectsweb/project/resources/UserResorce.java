package com.projectsweb.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectsweb.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResorce {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria", "Maria@gmal.com", "9999999","12345");
		return ResponseEntity.ok().body(u);
	}

}
