package com.slimen.users.service;

import java.util.List;

import com.slimen.users.entities.Role;
import com.slimen.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}
