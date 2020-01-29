package org.test.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonCreator;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class TestChildWrapper implements Serializable {

  @JsonCreator
  public TestChildWrapper(String childWrapper) {
    super();
  }

  private static final long serialVersionUID = 1L;

  private Set<TestChild> child = new HashSet<>();
}
