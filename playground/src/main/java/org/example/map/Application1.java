package org.example.map;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Application1 {

  public static void main(String[] args) {
    /* HashMap */
    HashMap map = new HashMap();

    /* 키와 값을 쌍으로 저장 */
    map.put("one", new Date());
    map.put(12, "red apple");
    map.put(33, 123);

    /* 저장 순서와 무관하게 저장되어 있음 */
    System.out.println("map : " + map);

    HashMap<Integer, String> map1 = new HashMap<>();
    map1.put(1, "one");
    map1.put(2, "red apple");
    map1.put(3, "yellow");

    /* 문자열 타입을 키, 값으로 하는 HashMap */
    HashMap<String, String> hmap = new HashMap<>();
    hmap.put("one", "java");
    hmap.put("two", "mysql");
    hmap.put("three", "jdbc");
    hmap.put("four", "html");

    /* Map 타입의 순회 방법 */
    /* 1. keySet() : key 순회 */
    Iterator<String> keyIter = hmap.keySet().iterator();
    while (keyIter.hasNext()) {
      String key = keyIter.next();
      String value = hmap.get(key);
      System.out.println(key + " : " + value);
    }

    for (String key : hmap.keySet()) {
      String value = hmap.get(key);
      System.out.println(key + " : " + value);
    }

    /* 2. values() */
    Collection<String> values = hmap.values();
    Iterator<String> valueIter = values.iterator();
    while (valueIter.hasNext()) {
      System.out.println("value : " + valueIter.next());
    }

    /* 3. entrySet() */
    Set<Entry<String, String>> set = hmap.entrySet();
    Iterator<Map.Entry<String, String>> iterator = set.iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, String> entry = iterator.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    for (Map.Entry<String, String> entry : hmap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
