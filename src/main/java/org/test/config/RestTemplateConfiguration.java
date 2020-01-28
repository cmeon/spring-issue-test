package org.test.config;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

  @Bean
  public RestTemplate restTemplate() {

    RestTemplate restTemplate = new RestTemplate();

    restTemplate.setMessageConverters(Arrays.asList(
        new MappingJackson2HttpMessageConverter(Jackson2ObjectMapperBuilder.xml().build()),
        new MappingJackson2HttpMessageConverter(Jackson2ObjectMapperBuilder.json().build()),
        new FormHttpMessageConverter()));

    restTemplate.setErrorHandler(new DefaultResponseErrorHandler());

    return restTemplate;
  }

}
