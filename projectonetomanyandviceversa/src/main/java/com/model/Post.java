package com.model;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Post {

	@Id
    @GeneratedValue
    private Long id;
 
    private String title;
 
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true
    )
    private List<PostComment> comments = new ArrayList<PostComment>();

	public Post() {
		super();
	}

	
	public Post(String title) {
		super();
		this.title=title;
	}


	public Post(Long id, String title, List<PostComment> comments) {
		super();
		this.id = id;
		this.title = title;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<PostComment> getComments() {
		return comments;
	}

	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", comments=" + comments + "]";
	}

	
    
}
