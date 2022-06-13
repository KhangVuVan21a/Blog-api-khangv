package com.example.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.BlogDto;
import com.example.demo.Entity.Blog;
import com.example.demo.Service.BlogService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/Blog")
public class BlogController {
	@Autowired
	private BlogService blogService;
	@RequestMapping(value = "/findall", method=RequestMethod.GET)
	public List<Blog> findAll(){	
		return blogService.getAllBlog();
	}
	@RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
	public Blog findAllByName(@PathVariable("id") int id){
		return blogService.findBlogById(id);
//		return productService.findAllByName(name);
	}
	@RequestMapping(value = "/create",method = RequestMethod.POST)
	public Blog  creatProduct(@RequestBody Blog blog)
	{
//			productService.createProduct(product);
//			return BaseResponseService.getResponse(product, "created", HttpStatus.CREATED);
			return blogService.createBlog(blog);
		
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public Blog  updateProduct(@PathVariable("id") int id,@RequestBody Blog blog){
		return blogService.updateBlogById(id,blog);
	}
	@RequestMapping(value = "/deletebyid/{id}",method = RequestMethod.DELETE)
	public boolean deleteProductById(@PathVariable("id") int id) {
		return blogService.deleteBlogById(id);
		//return productService.deleteProductById(id);
	}
}
