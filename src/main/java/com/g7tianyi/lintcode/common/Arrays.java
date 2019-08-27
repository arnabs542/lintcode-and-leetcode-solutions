package com.g7tianyi.lintcode.common;

import static com.g7tianyi.lintcode.common.Numbers.nextInt;

/** Created by g7tianyi on Aug 24, 2019 */
public final class Arrays {

  public static int[] makeArrayFrom(int... args) {
    int[] arr = new int[args.length];
    int index = 0;
    for (int elem : args) {
      arr[index++] = elem;
    }
    return arr;
  }

  public static int[] makeArray(int len) {
    return makeArray(len, len + 1);
  }

  public static int[] makeArray(int len, int max) {
    int[] arr = new int[len];
    for (int i = 0; i < len; ++i) {
      arr[i] = nextInt(max);
    }
    return arr;
  }
}
