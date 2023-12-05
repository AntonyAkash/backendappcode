package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.Posts;

@EnableJpaRepositories
@Repository
public interface Irepo extends JpaRepository<Posts,Integer>{

}
