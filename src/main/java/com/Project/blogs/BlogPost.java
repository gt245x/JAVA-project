package com.Project.blogs;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.*;

@Entity
public class BlogPost {
	
	private String id;
	private String title;
	private String content;

	private Date posted;
	
	public BlogPost() {};
	
	
	public BlogPost(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	@Id
	@GeneratedValue( generator = "uuid" )
	@GenericGenerator(
			name = "uuid",
			strategy = "org.hibernate.id.UUIDHexGenerator",
			parameters = {
					@Parameter(
							name = "uuid_gen_strategy_class",
							value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
					),
					@Parameter(
							name = "separator",
							value = "-"
					)
			}
	)
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	public Date getPosted() {
		return posted;
	}
	public void setPosted(Date posted) {
		this.posted = posted;
	}
	
	

}
