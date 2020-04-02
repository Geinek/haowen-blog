package com.geinek.blog.service;

import com.geinek.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
