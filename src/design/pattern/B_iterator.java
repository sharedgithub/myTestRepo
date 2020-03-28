package main.designPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class B_Iterator {
    //provoid common ways to iterate over different objects
    public static void main(String[] args) {
        Movie90DB db1=new Movie90DB();
        Moview70DB db2=new Moview70DB();
        displayMovies(db1);displayMovies(db2);
    }

    static public void displayMovies(MovieIterator movie){
        Iterator it=movie.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}



interface MovieIterator{
    public Iterator iterator();
}

class Movie90DB implements MovieIterator{
    String[] moview;
    public Iterator iterator(){
        return Arrays.asList(moview).iterator();
    }
}

class Moview70DB implements MovieIterator{
    List<String> moview=new ArrayList<>();
    public Iterator iterator(){
        return moview.iterator();
    }
}
