package com.project.surya.blog.controller;

import com.project.surya.blog.dto.PostDto;
import com.project.surya.blog.security.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/posts/")
public class PostController 
{
	
	

    @Autowired
    private PostService postService;

    @PostMapping("/createPost")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) 
    {
        postService.createPost(postDto);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/all")
    public ResponseEntity<List<PostDto>> showAllPosts()
    {
        return new ResponseEntity<>(postService.showAllPosts(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PostDto> getSinglePost(@PathVariable @RequestBody Long id) 
    {
        return new ResponseEntity<>(postService.readSinglePost(id), HttpStatus.OK);
    }
    
    
}
