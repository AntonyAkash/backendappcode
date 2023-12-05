package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="posts_table")
public class Posts {
	
	@Id
	@Column(name="Post_Id", length=50)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="Post_Title", length=100)
	private String title;
	@Column(name="Post_Body", length=500)
	private String body;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	

}
