package com.ioboundapplication;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName = "post")
public class Post {

	@Id
	private String id;

	private String content;

}
