package com.scentedentity.olfactoryfaculty.service;

import com.scentedentity.olfactoryfaculty.entity.User;

public interface UserService {
    User getUser(Long id);
    User getUser(String username);
    User saveUser(User user);
}
