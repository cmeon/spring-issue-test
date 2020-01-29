package org.test.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * TODO: Get list of HS Codes and their documents in one go TODO: Use jsonPath to filter out common
 * fields and display in form TODO: Add controller to insert select inputs (every time I upload,
 * replace all options) TODO: Add proper exception handling TODO: Add logic to control input fields
 * TODO: Only when viewing documents if select should return array of options
 */

/**
 * Tests {@code TestController}
 * 
 */
@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void testRouteRequest() throws Exception {
    String request =
    // @formatter:off
      "<request>" +
        "<id>1</id>" +
        "<doubleProperty>0</doubleProperty>" +
        "<longProperty>0</longProperty>" +
        "<stringProperty>string</stringProperty>" +
        "<children>" +
          "<child>" +
            "<childStuffA>0</childStuffA>" +
            "<childStuffB>0</childStuffB>" +
            "<childStuffC>string</childStuffC>" +  
          "</child>" +
        "</children>" +
      "</request>";
    // @formatter:on

    // String response =
    // // @formatter:off
    //   "<response>" +
    //     "<finalResponse>string</finalResponse>" +
    //   "</response>";
    // // @formatter:on

    mvc.perform(post("/test/api/route1").content(request).contentType(MediaType.APPLICATION_XML))
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_XML));
  }

}
