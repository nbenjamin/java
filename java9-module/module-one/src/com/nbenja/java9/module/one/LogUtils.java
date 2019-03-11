package com.nbenja.java9.module.one;


import java.util.logging.Logger;

public class LogUtils {

  private static final Logger LOGGER = Logger.getLogger(LogUtils.class.getName());

  public static void log(String msg) {
    LOGGER.info(msg);
  }
}
