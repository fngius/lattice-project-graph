package org.example.lat;

import java.util.*;

import org.javatuples.Pair;

class OrderLattice implements Comparator<Pair<Set<String>, Set<String>>>{  

  @Override
  public int compare(Pair<Set<String>, Set<String>> arg0, Pair<Set<String>, Set<String>> arg1) {
    Pair<Set<String>, Set<String>> p1 = (Pair<Set<String>, Set<String>>)arg0;
    Pair<Set<String>, Set<String>> p2 = (Pair<Set<String>, Set<String>>)arg1;

    if (p1.getValue0().size() == p2.getValue0().size()) {
      return 0;
    }
    else if (p1.getValue0().size() > p2.getValue0().size()) {
      return 1;
    }
      else{
        return -1;
      }
  }
}