package com.company;


/* Create Generic class that takes a collection of any type (Set of Countries (Strings)),
   num of people (Integer / Long etc), sorts it via its value and output the collection to the console*/


import java.math.BigDecimal;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Country russia = new Country("Russia", new BigDecimal("200"));
        Country poland = new Country("Poland", new BigDecimal("900"));
        Country usa = new Country("USA", new BigDecimal("3"));
        Country kazaxstan = new Country("Kazaxstan", new BigDecimal("25"));
        Country a = new Country("A", new BigDecimal("5"));


        SortedSet<Country> setOfCountries = new TreeSet<>();
        setOfCountries.add(russia);
        setOfCountries.add(poland);
        setOfCountries.add(a);
        setOfCountries.add(usa);
        setOfCountries.add(kazaxstan);

        GenericClass<Country> countries = new GenericClass<Country>(setOfCountries);

        Iterator<Country> it = countries.getCollection().iterator();
        while (it.hasNext())
        {
            Country str = it.next();
            System.out.println(str.getName() + ", " + str.getPopulation());
        }

    }
}
