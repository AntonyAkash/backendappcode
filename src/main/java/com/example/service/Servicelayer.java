package com.example.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.exception.Postsnotfoundexception;
import com.example.model.Posts;
import com.example.repo.Irepo;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class Servicelayer implements Iservice {
	
	@Autowired
	Irepo repo;
	
	
	public List<Posts> savePosts(Posts post){
		repo.save(post);
		List<Posts> allpost=repo.findAll();
		return allpost;
	}


	@Override
	public List<Posts> getallposts() {
		List<Posts> allpost=repo.findAll();
		return allpost;
	}


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Posts post=FindonePost(id);
		repo.delete(post);
	}
	
	public Posts FindonePost(Integer id) {
		 Optional<Posts>onepost=repo.findById(id);
		 Posts post= onepost.orElseThrow(()->new Postsnotfoundexception("Posts not found"));
		 return post;
	}
	

}
