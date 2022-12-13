package com.example.blogmanagementsystem.repository;

import com.example.blogmanagementsystem.domain.Article;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Lazy
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {
    Optional<Article> findByLink(String link);
    Page<Article> findByTitleContainingAndBodyContaining(String title, String body, Pageable pageable);

    Page<Article> findAll(Integer page, Integer size);
}
