package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

import java.util.List;

/**
 * Created by user on 2/15/2022.
 */
public interface CommentService {
    CommentDto createComment(long postid,CommentDto commentDto);

    List<CommentDto> getCommentByPostId(long postId);

    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId , long commentId,CommentDto commentRequest);

    void deleteComment(Long postId,Long commentId);

}
