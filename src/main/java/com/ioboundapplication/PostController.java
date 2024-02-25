package com.ioboundapplication;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	PostRepository postRepository;

	// 1. 글을 작성한다.
	@PostMapping("/post")
	public Post createPost(@RequestBody Post post) {
		return postRepository.save(post);
	}

	// 4. 글 내용으로 검색 -> 해당 내용이 포함된 모든 글
	@GetMapping("/search")
	public List<Post> findPostsByContent(@RequestParam String content) {
		return postRepository.findByContent(content);
	}

}
