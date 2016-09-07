package com.blog.document;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Article {
	@Id
	private BigInteger id;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	private String upVotes;
	private String title;
	private String html;
	private String createdBy;
	public String getUpVotes() {
		return upVotes;
	}
	public void setUpVotes(String upVotes) {
		this.upVotes = upVotes;
	}
	private Date createdDate;
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Article(String title, String html){
		this.title = title;
		this.html = html;
	}
	public Article(){
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
}
