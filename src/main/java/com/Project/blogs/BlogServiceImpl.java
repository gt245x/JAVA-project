package com.Project.blogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
  @Autowired
  private BlogRepository blogRepository;

  public List<BlogPost> getAllPosts() {
    List<BlogPost> blogs = new ArrayList<>();
    blogRepository.findAll()
        .forEach(blogs:: add);
    return blogs;
  }

  public BlogPost getPost(String id) {
    return blogRepository.findOne(id);
  }

  public void addPost(BlogPost blogPost) {
    blogRepository.save(blogPost);
  }

  public void updatePost(BlogPost blogPost) {
    blogRepository.save(blogPost);
  }

  public void deletePost(String id) {
    blogRepository.delete(id);
  }
}
