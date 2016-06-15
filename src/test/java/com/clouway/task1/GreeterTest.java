package com.clouway.task1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @Author Martin Milev
 * @Date 15.06.16.
 */
public class GreeterTest {
  @Test
  public void happyPath() throws Exception {
    Greeter g = new Greeter("Hi!");
    assertThat(g.greet(), is(equalTo("Hi!")));
  }
}
