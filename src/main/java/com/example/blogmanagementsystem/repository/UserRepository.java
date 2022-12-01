package com.example.blogmanagementsystem.repository;

import com.example.blogmanagementsystem.domain.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public interface UserRepository  extends ElasticsearchRepository<User, String> {
    User findByUsername(String username);
}
