package b25_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class movieObject {
    public static void main(String[] args) {
        Movie movie = new Movie("USA","Journey to SDET: Cydeo Batch 25","Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");
        String [] castsArr ={"Asiye","Adam","Muhter","Umut","Mila","Tuma","Kaysar"};
        String name ="mila";
        movie.addCasts(castsArr);
        System.out.println(movie);
    }
}
