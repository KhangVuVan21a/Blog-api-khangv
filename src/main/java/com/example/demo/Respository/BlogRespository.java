package com.example.demo.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Blog;
@Repository
public interface BlogRespository extends CrudRepository<Blog, Integer> {

}
