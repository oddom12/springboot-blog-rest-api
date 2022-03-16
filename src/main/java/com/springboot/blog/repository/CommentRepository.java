package com.springboot.blog.repository;

import com.springboot.blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by user on 1/29/2022.
 */


public interface CommentRepository extends JpaRepository<Comment,Long> {
    //create query method
    List<Comment> findByPostId(long postId);

}
