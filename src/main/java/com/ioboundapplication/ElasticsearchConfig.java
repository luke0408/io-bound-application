package com.ioboundapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ReactiveElasticsearchConfiguration;

@Configuration
public class ElasticsearchConfig extends ReactiveElasticsearchConfiguration {

	@Value("#{'${spring.data.elasticsearch.hosts}'.split(',')}")
	private List<String> hosts;

	@Value("${spring.data.elasticsearch.port}")
	private int port;

	@Override
	public ClientConfiguration clientConfiguration() {

		String[] connectionStrings = hosts.stream()
				.map(host -> host + ":" + port)
				.toArray(String[]::new);

		return ClientConfiguration.builder()
				.connectedTo(connectionStrings)
				.build();
	}
}
