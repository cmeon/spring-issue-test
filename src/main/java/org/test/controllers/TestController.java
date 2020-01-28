package org.test.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import org.test.controllers.api.TestApi;
import org.test.dtos.TestRequest;
import org.test.dtos.TestResponse;

@Api(value = "machine-api", description = "Api to communicate with machines")
@RestController
public class TestController implements TestApi {

  @Override
  public ResponseEntity<TestResponse> testRoute(TestRequest request) {
    return ResponseEntity.ok(new TestResponse("I'm done!"));
  }

}
