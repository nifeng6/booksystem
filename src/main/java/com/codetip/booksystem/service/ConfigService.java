package com.codetip.booksystem.service;

import com.codetip.booksystem.domain.Config;
import com.codetip.booksystem.domain.User;

public interface ConfigService {

    Config findById(int id);

    User find();
}
