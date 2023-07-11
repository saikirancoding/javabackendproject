package com.model;

import javax.persistence.*;

@Entity
public class PostComment {

	
	    @Id
	    @GeneratedValue
	    private Long id;
	 
	    private String review;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    private Post post;

		public PostComment(Long id, String review, Post post) {
			super();
			this.id = id;
			this.review = review;
			this.post = post;
		}
		public Post getPost() {
			return post;
		}
		public void setPost(Post post) {
			this.post = post;
		}
		public PostComment() {
			super();
		}
		public PostComment(String review) {
			super();
			this.review = review;
		}
	    
		public PostComment(Long id, String review) {
			super();
			this.id = id;
			this.review = review;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getReview() {
			return review;
		}

		public void setReview(String review) {
			this.review = review;
		}

		
	    
}
