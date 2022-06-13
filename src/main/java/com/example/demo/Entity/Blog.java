package com.example.demo.Entity;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int category;
	private String des;
	private String title;
	private String detail;
	private String thumbs;
	@Column(name="public")
	private boolean status;
	private Integer[] position;
	@Column(name="data_pubblic")
	private LocalDate datapublic;
}
