package com.clouway.task1;

/**
 * @Author Martin Milev
 * @Date 15.06.16.
 */
public class Greeter {
  private String greeting;

  public Greeter(String greeting) {
    this.greeting = greeting;
  }

  public String greet() {
    return greeting;
  }
}
