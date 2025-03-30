package com.example.blogApp.repository;

import com.example.blogApp.entity.Category;
import com.example.blogApp.entity.Post;
import com.example.blogApp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface PostRepo extends JpaRepository<Post,Long> {
    Page<Post> findAll(Pageable pageable);
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
    List<Post> findByTitleContaining(String title);

}
