package com.FayNe.Chat.BackEnd.user.controller;

import com.FayNe.Chat.BackEnd.mapper.UserMapper;
import com.FayNe.Chat.BackEnd.user.UserRepo;
import com.FayNe.Chat.BackEnd.user.model.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/user")
@AllArgsConstructor
public class UserController {

	private UserRepo userRepo;
	private UserMapper userMapper;

	@PostMapping("/add")
	public UserDTO createUser(@RequestBody UserDTO userDTO) {
		return userMapper.toUserDTO(userRepo.save(userMapper.toUser(userDTO)));
	}
}
