  package com.example.service;

import java.util.List;

import com.example.model.Posts;

public interface Iservice {
	
	public List<Posts> getallposts();
	public List<Posts> savePosts(Posts post);
	public Posts FindonePost(Integer id);
	public void delete(Integer id);
	
}
