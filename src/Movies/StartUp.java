/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movies;

import common.Movie;
import common.MoviesByTitle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author aschindler1
 */
public class StartUp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Schindler's List", "Steven Spielberg", "19931");
        Movie movie2 = new Movie("Jurassic Park", "Steven Spielberg", "19931");    
        Movie movie3 = new Movie("Airplane!", "Zucker, Abraham and Zucker", "19801");
        Movie movie4 = new Movie("Star Wars", "George Lucas", "19771");
        
        Map map = new HashMap();
        map.put("Schindler's List", movie1);
        map.put("Jurassic Park", movie2);
        map.put("Airplane!", movie3);
        map.put("Star Wars", movie4);
        
        Set keys = map.keySet();
        for(Object key: keys){
            Movie found = (Movie)map.get(key);
            System.out.println(found.toString());
        }
        
        Map keys2 = new TreeMap(map);
        Collection<Movie> values = keys2.values(); 
        List<Movie> sortedList = new ArrayList<>(values);
        System.out.println();
        
        Collections.sort(sortedList);
        for(Movie m: sortedList){
            System.out.println(m);
        }
        System.out.println();
        Collections.sort(sortedList, new MoviesByTitle());
        for(Movie m: sortedList){
            System.out.println(m);
        }
        
        Set<Movie> set = new TreeSet<Movie>();
        set.add(movie1);
        set.add(movie2);
        set.add(movie3);
        set.add(movie4);
        
        System.out.println("The new size of the set is " + set.size());
        for(Movie m: set){
            System.out.println(m);
        }
    }
}
