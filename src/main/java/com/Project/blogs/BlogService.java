package com.Project.blogs;

import java.util.List;

public interface BlogService {
	
	List<BlogPost> getAllPosts() ;
	
	BlogPost getPost(String id);
	
	void addPost(BlogPost blogPost) ;
	
	void updatePost(BlogPost blogPost);
	
	void deletePost(String id);

}
