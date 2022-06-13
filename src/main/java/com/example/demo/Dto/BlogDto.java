package com.example.demo.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class BlogDto {
	private int id;
	private int category;
	private String title;
	private boolean status;
	private Integer[] position;
	private LocalDate data_public;
}
