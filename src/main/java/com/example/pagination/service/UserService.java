package com.example.pagination.service;

import com.example.pagination.model.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
