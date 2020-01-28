package org.test.dtos;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CommodityItem
 * 
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@JacksonXmlRootElement(localName = "request")
public class TestRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private TestChildWrapper children;

  private Double doubleProperty;
  private Long longProperty;
  private String stringProperty;

}
