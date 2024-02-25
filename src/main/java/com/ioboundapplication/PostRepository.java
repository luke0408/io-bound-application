package com.ioboundapplication;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostRepository extends ElasticsearchRepository<Post, String> {
	List<Post> findByContent(String content);

}
