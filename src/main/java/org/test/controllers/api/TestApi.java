package org.test.controllers.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.Api;
import org.test.dtos.TestRequest;
import org.test.dtos.TestResponse;

@Api(value = "test-api", description = "Api to communicate with test machines")
@RequestMapping(value = "/test/api", produces = {MediaType.APPLICATION_XML_VALUE},
    consumes = {MediaType.APPLICATION_XML_VALUE})
public interface TestApi {

  @RequestMapping(value = "route1", method = RequestMethod.POST)
  public ResponseEntity<TestResponse> testRoute(@RequestBody TestRequest request);

}
