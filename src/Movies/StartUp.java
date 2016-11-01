/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movies;

import common.Movie;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    }
}
