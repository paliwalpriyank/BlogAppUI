package com.blog.document;

import java.util.Date;

public class Article extends AbstractDocument {
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
