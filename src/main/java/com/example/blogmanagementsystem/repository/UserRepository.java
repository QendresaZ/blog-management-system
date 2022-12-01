package com.example.blogmanagementsystem.repository;

import com.example.blogmanagementsystem.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository  extends ElasticsearchRepository<User, String> {
    User findByUsername(String username);
}
