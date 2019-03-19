package com.nbenja.gc;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.stream.Stream;

public class MXBean {

  public static void main(String[] args) {
    List<GarbageCollectorMXBean> list = ManagementFactory.getGarbageCollectorMXBeans();

    list.stream().forEach(garbageCollectorMXBean -> {
      System.out.println("Bean Name  - " +garbageCollectorMXBean.getName());
      System.out.println("Collection Count   - " +garbageCollectorMXBean.getCollectionCount());
      System.out.println("Bean Name  - " +garbageCollectorMXBean.getName());
      System.out.println("Pool Names - ");
      Stream.of(garbageCollectorMXBean.getMemoryPoolNames()).forEach(System.out::println);
    });
  }
}
