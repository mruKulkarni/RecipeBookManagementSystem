// UserProxy.java
package com.becoder.service;

import org.springframework.stereotype.Service;

import com.becoder.dao.UserDao;
import com.becoder.entity.User;

@Service

public class UserProxy {
   
	 private final UserDao userDao;
	 
    public UserProxy(UserDao userDao) {
        this.userDao= userDao;
    }

    public User login(String email, String password) {
        // Implement additional logic if needed before invoking the actual login method
        return userDao.login(email, password);
    }

    public int registerUser(User user) {
        // Implement additional logic if needed before invoking the actual registerUser method
        return userDao.saveUser(user);
    }
    public void deleteUser(int userId) {
        // Implement additional logic if needed before invoking the actual deleteUser method
        userDao.deleteUser(userId);
    }
}
