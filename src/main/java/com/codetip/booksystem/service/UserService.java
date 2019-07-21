package com.codetip.booksystem.service;

import com.codetip.booksystem.domain.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User findByName(String name);
}
