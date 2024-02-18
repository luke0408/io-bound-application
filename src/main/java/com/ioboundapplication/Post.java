package com.ioboundapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity(name = "post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_seq")
	@SequenceGenerator(name="post_id_seq", sequenceName = "post_id_seq", allocationSize = 1)
	private Long id;
	private String content;

}
