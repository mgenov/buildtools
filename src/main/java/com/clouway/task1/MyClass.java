package com.clouway.task1;

import org.apache.log4j.Logger;

/**
 * @Author Martin Milev
 * @Date 15.06.16.
 */
public class MyClass {
  private static Logger log = Logger.getLogger(MyClass.class.getName());

  public static void main(String[] args) {
    Greeter greeter = new Greeter("Hello!!!");
    log.info(greeter.greet());
  }
}
