package b25_Constructor;

import java.net.MulticastSocket;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country;
    public String title;
    public String genre;
    public String releaseDate;
    public String director;

    public ArrayList<String>casts=new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String str){
        casts.add(str);
    }
    public void addCasts(String[] arr){
     casts.addAll(Arrays.asList(arr));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts.size() +
                '}';
    }
}
