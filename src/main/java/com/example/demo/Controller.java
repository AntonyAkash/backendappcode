package com.example.demo;

import java.util.List;
import com.example.service.Servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Posts;

@RestController
@CrossOrigin(origins="https://antonyakash.netlify.app/")
@RequestMapping("/posts")
public class Controller {
	
	@Autowired
	private Servicelayer service;
	 
	@PostMapping(path="/save")
	public ResponseEntity<List<Posts>> getid(@RequestBody Posts post){
		List<Posts> allposts=service.savePosts(post);
	  return new ResponseEntity<List<Posts>>(allposts,HttpStatus.OK); 
	}
	
	@GetMapping(path="/fetchall")
	public ResponseEntity<List<Posts>> getPost(){
		List<Posts> allposts=service.getallposts();
	  return new ResponseEntity<List<Posts>>(allposts,HttpStatus.OK); 
	}
	
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<HttpStatus> DeletePost(@PathVariable Integer id){
		service.delete(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	  
	}
	
	@PatchMapping(path="/Edit/{id}")
	public ResponseEntity<Posts>EditPost(@RequestBody Posts post,@PathVariable Integer id){
		service.savePosts(post);
		Posts onepost=service.FindonePost(id);
		return new ResponseEntity<Posts>(onepost,HttpStatus.OK);
	}
	
}





