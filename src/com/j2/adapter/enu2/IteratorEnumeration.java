package com.j2.adapter.enu2;

import java.util.*;

public class IteratorEnumeration implements Enumeration<Object> {
 Iterator iterator;
 
 public IteratorEnumeration(Iterator iterator) {
  this.iterator = iterator;
 }
 public boolean hasMoreElements() {
  return iterator.hasNext();
 }
 public Object nextElement() {
  return iterator.next();
 }
}
