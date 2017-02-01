package com.Project.blogs;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogPost, String> {

}
