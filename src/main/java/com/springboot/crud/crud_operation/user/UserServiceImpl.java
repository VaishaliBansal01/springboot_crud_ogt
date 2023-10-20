package com.springboot.crud.crud_operation.user;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User save(User user) {
        return user;
    }
}
