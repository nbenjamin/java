package com.nbenja.gc;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
import sun.reflect.Reflection;

public class GCTest {

  public static void main(String[] args) throws Exception {
    Unsafe unsafe ;
    Long test = 100L;
    //unsafe = Unsafe.getUnsafe();
    Field field = Unsafe.class.getDeclaredField("theUnsafe");
    field.setAccessible(true);
    unsafe = (Unsafe) field.get(null);

    long baseOffset = unsafe.arrayBaseOffset(Object[].class);

    for(int i =0; i<1000; i++) {

      Object[] a = new Object[1];
      a[0] = (new GCT());
      System.out.println(unsafe.getLong(a, baseOffset));
    }

  }

  static class  GCT {
    long a;
  }
}
