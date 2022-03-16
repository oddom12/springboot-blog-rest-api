package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 1/4/2022.
 */


public interface PostRepository extends JpaRepository<Post,Long>{


}
