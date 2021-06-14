package com.company;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @param <T> the type of the value being boxed
 */
public class GenericClass <T>{

    // T stands for "Type"
    private SortedSet<T> collection;

    public GenericClass(SortedSet<T> coll){

      this.collection=coll;

  }

  public SortedSet<T> getCollection() {
    return collection;
  }

  public void setCollection(SortedSet<T> coll) {
    this.collection = coll;
  }











}

