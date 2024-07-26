package com.snehiOnlineCourse.service;

import java.util.List;

import com.snehiOnlineCourse.entity.User;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}


