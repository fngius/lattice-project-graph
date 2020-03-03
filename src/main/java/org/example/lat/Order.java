package org.example.lat;

import java.util.*;

import org.javatuples.Pair;

class Order implements Comparator<Pair<Set<String>, Set<String>>>{  

  @Override
  public int compare(Pair<Set<String>, Set<String>> arg0, Pair<Set<String>, Set<String>> arg1) {
    Pair<Set<String>, Set<String>> p1 = (Pair<Set<String>, Set<String>>)arg0;
    Pair<Set<String>, Set<String>> p2 = (Pair<Set<String>, Set<String>>)arg1;

    if (p1.getValue0().equals(p2.getValue0()) && p1.getValue1().equals(p2.getValue1())) {
      return 0;
    }
    else if (p1.getValue0().contains(p2.getValue0()) && p2.getValue1().contains(p1.getValue1())) {
      return 1;
    }
      else{
        return -1;
      }
  }
}