package com.najib.users.service;

import com.najib.users.entities.Role;
import com.najib.users.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}