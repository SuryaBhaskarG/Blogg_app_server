package com.project.surya.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.surya.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
