package com.example.demo.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.BlogDto;
import com.example.demo.Entity.Blog;
import com.example.demo.Respository.BlogRespository;
import com.example.demoModelMapper.BlogMapper;
@Service
public class BlogService {
	@Autowired
	BlogRespository blogRespository;
	public Blog createBlog(Blog blog) {
		return  blogRespository.save(blog);
	}
	public List<Blog> getAllBlog(){
		List<Blog> list=new ArrayList<Blog>(); 
		blogRespository.findAll().forEach(list::add);
		return list;
	}
	public Blog findBlogById(int id){
		return blogRespository.findById(id).get();
	}
	public Blog updateBlogById(int id,Blog blog) {
		Blog blogfind= blogRespository.findById(id).orElse(null);
		if(blogfind !=null) {
			blog.setId(id);
			return blogRespository.save(blog);
		}
		else {
			return null;
		}
	}
	public boolean deleteBlogById(int id) {
		Blog blog =blogRespository.findById(id).orElse(null);
		blogRespository.deleteById(id);
		return blog!=null;
	}
}
