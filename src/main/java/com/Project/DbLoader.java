package com.Project;


import com.Project.Cavs.Cavalier;
import com.Project.Cavs.CavalierRepository;
import com.Project.blogs.BlogPost;
import com.Project.blogs.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class DbLoader implements CommandLineRunner{

  @Autowired
  private  CavalierRepository cavsRepository;

  @Autowired
  private BlogRepository blogRepository;

  @Override
  public void run(String... strings) throws Exception {
    cavsRepository.save(new Cavalier("Lebron", "James", 30, 80, "GF", "N/A", 25, 25000000));
    cavsRepository.save(new Cavalier("Kyrie", "Irving", 23, 72, "PG", "Duke", 22, 15000000));

    blogRepository.save(new BlogPost("test blog 1", "This is the first testing blog"));
    blogRepository.save(new BlogPost("test blog 2", "This is the second testing blog"));

  }
}
