/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Foo {
 public static void main(String[] args) {
  Map<Integer, String> unsortMap = new HashMap<>();
  unsortMap.put(10, "z");
  unsortMap.put(5, "b");
  unsortMap.put(11, "d");
  unsortMap.put(7, "e");
  unsortMap.put(50, "j");
  Map<Integer, String> treeMap = new TreeMap<>((Integer o1, Integer o2) -> o2.compareTo(o1));
//  Map<Integer, String> treeMap = new TreeMap<>();
  treeMap.putAll(unsortMap);
  for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
   System.out.print(entry.getValue() + " ");
  }
 }
}