/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.app.dis.proxy.thrift.entity;

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum InterType implements org.apache.thrift.TEnum {
  KEY_WORD_SEARCH(1),
  APP_LIST_SEARCH(2),
  TOP_LIST_SEARCH(3),
  PKG_SEARCH(4),
  HOT_WORD_SEARCH(5),
  APP_RECOMMEND_SEARCH(6);

  private final int value;

  private InterType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static InterType findByValue(int value) { 
    switch (value) {
      case 1:
        return KEY_WORD_SEARCH;
      case 2:
        return APP_LIST_SEARCH;
      case 3:
        return TOP_LIST_SEARCH;
      case 4:
        return PKG_SEARCH;
      case 5:
        return HOT_WORD_SEARCH;
      case 6:
        return APP_RECOMMEND_SEARCH;
      default:
        return null;
    }
  }
}
