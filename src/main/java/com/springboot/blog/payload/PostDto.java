package com.springboot.blog.payload;

import lombok.Data;

import java.util.Set;

/**
 * Created by user on 1/4/2022.
 */
@Data
public class PostDto {


    private long id ;
    private String title ;
    private String description ;
    private String content ;
    private Set<CommentDto> commentDtoSet ;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<CommentDto> getCommentDtoSet() {
        return commentDtoSet;
    }

    public void setCommentDtoSet(Set<CommentDto> commentDtoSet) {
        this.commentDtoSet = commentDtoSet;
    }
}
