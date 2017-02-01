package com.Project.blogs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/api/blogs")
	public List<BlogPost> getAllPosts() {
		return blogService.getAllPosts();
	}
	
	@RequestMapping("/api/blogs/{id}")
	public BlogPost getPost(@PathVariable String id) {
		return blogService.getPost(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/blogs")
	public void addPost(@RequestBody BlogPost blogPost) {
		blogService.addPost(blogPost);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/blogs/{id}")
	public void updatePost(@RequestBody BlogPost blogPost, @PathVariable String id) {
		blogPost.setId(id);
		blogService.updatePost(blogPost);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/blogs/{id}")
	public void deletePost(@PathVariable String id) {
		blogService.deletePost(id);
	}
	
		
}
