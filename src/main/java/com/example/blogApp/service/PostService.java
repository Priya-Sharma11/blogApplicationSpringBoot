package com.example.blogApp.service;

import com.example.blogApp.entity.Post;
import com.example.blogApp.payloads.PostDto;
import com.example.blogApp.payloads.PostResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

//create
    PostDto createPost(PostDto postDto,Long userId, Long categoryId);

    //update
    PostDto updatePost(PostDto postDto, Long postId);

    //delete
    void deletePost(Long postId);

    //get all posts
    PostResponse getAllPosts(int page, int size,String sortBy,String sortDir);

    //get post by id
    PostDto getPostById(Long postId);

    //get post by category
    List<PostDto> getPostsByCategory(Long categoryId);

    //get all posts by user
    List<PostDto> getPostByUser(Long userId);

    //search post
    List<PostDto> searchPosts(String keyword);

}
