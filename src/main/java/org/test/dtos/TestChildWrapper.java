package org.test.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class TestChildWrapper implements Serializable {

  private static final long serialVersionUID = 1L;

  @JacksonXmlProperty(localName = "child")
  @JacksonXmlElementWrapper(useWrapping = false)
  private Set<TestChild> child = new HashSet<>();
}
