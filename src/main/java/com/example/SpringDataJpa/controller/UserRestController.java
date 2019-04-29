package com.example.SpringDataJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDataJpa.model.User;
import com.example.SpringDataJpa.repository.UserRepository;

@RestController
@RequestMapping(value = "/rest/users")
public class UserRestController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/all")
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@GetMapping("/update/{id}/{username}/{password}")
	public User update(@PathVariable("id") final Integer id, @PathVariable("username") final String username,
			@PathVariable("password") final String password) {

		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);

		return userRepository.save(user);
	}

}
