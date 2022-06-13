package com.example.demoModelMapper;

import org.modelmapper.ModelMapper;

import com.example.demo.Dto.BlogDto;
import com.example.demo.Entity.Blog;

public class BlogMapper {
	private static BlogMapper INSTANCE;
	public static BlogMapper getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new BlogMapper();
		}
		return INSTANCE;
		
	}
	public Blog toEntity(BlogDto dto) {
		ModelMapper modelMapper=new ModelMapper();
		Blog blog =modelMapper.map(dto, Blog.class);
		return blog; 
	}
	public BlogDto toDTO(Blog blog) {
		ModelMapper modelMapper = new ModelMapper();
		BlogDto dto = modelMapper.map(blog, BlogDto.class);
		return dto;
	}
}
