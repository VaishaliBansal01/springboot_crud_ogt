package com.springboot.crud.crud_operation.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
@PostMapping("/user")
public User createUser(@RequestBody User user)
{
//   User user =userService.save((User) userDto);
    return userService.save(user);
}
}
