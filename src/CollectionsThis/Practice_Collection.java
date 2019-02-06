package CollectionsThis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Practice_Collection {
	
	
	public static void main(String args[]) {
		System.out.println("practice set2");
		
		MovieNameSet m1=new MovieNameSet();
		m1.addHero("arjun");
		m1.addHero("hero");
		m1.addHero("ved");
		m1.addHero("hero");
		m1.addHero("ashok");
		m1.showAllHeroes();
		m1.removeHero("hero");
		m1.showAllHeroes();
		
		
		Movie m1=new Movie("m1",1988);
		Movie m2=new Movie("m1",1988);
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		// the below conditioin will always return false...to check equal on set you have to override equals and hashcode
		//overrirding hashcode because when equals returns true ...hashcode should also return true;
		if(m1.equals(m2)) {
			System.out.println("equal yes");
		}
		
//		
		MovieDB mdb=new MovieDB();
		mdb.addMovie(new Movie("m1",1988));
		mdb.addMovie(new Movie("m21",1999));
		mdb.addMovie(new Movie("m1",1988));
		mdb.addMovie(new Movie("m4",1989));		
		
		mdb.showMovies();

		

	}

}


class MovieNameSet {
	static Logger log=Logger.getLogger(MovieNameSet.class.getName());
	private Set<String> heroes=new LinkedHashSet(); //change it to hashset and Treeset to see the difference
	

	public void addHero(String hero) {
		heroes.add(hero);
	}
	
	public void removeHero(String hero) {
		heroes.remove(hero);
	}
	
	public void showAllHeroes() {
		Iterator<String> it=heroes.iterator();
		
		System.out.println("with iterator ___");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("with for each ___");
		for(String hero:heroes) {
			System.out.println(hero);
		}
	}
}

class MovieComparator implements Comparator<Movie>{
	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getYear()>o2.getYear()) {
			return 1;
		}else if(o1.getYear()<o2.getYear()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

class Movie implements Comparable<Movie>{
	private String name;
	private Integer year;
	public static Logger log=Logger.getLogger(Movie.class.getName());
	private static int DEFAULT_YEAR=0000;
	
	Movie(String name,Integer year){
		this.name=name;this.year=year;
	}

	@Override
	public String toString() {
		return "MoviesDB [Name=" + name + ", year=" + year + "]";
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie o) {
		if(this.year>o.getYear()) {
			return 1;
		}else if(this.year<o.getYear()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	@Override
	public int hashCode() {
		return this.year;
	}
	
	@Override
	public boolean equals(Object o) {
		int year=((Movie) o).getYear();
		if(year==this.year) {
			return true;
		}else {
			return false;
		}
		
	}
	
}

class MovieDB{
//	private static Set<Movie> movies=new HashSet<Movie>();
		private static Set<Movie> movies=new TreeSet<Movie>( new MovieComparator());// here hashset and LinkedHasSet will work but treeset with throw error as Movie is not comparable
		
		public void addMovie(Movie m) {
			movies.add(m);
		}
		
		public void showMovies() {
			for(Movie m:movies) {
				System.out.println(m.toString());
			}
		}
		
		public void moreMethods() {
		}
 }

class Diff_Linked_Array_List{
	static List<String> a=new ArrayList();
	static List<String> b=new ArrayList();
	
	public static void main(String[] args) {
	

		addElements(a);
		addElements(b);
		
		showElements(a);
		showElements(b);
		
		//methods in both linked and arraylist is same
		
		
	
	}
	
	public static void addElements(List<String> list) {
		list.add("hello");
		list.add("Yr");
		list.add("popo");
	}
	
	public static void showElements(List<String> list) {
		for(String e:list) {
			System.out.println(e);
		}
	}
}


class mapDeo{
	public static void main(String args[]) {
		List<String> ls = new ArrayList<>();
		
		ls.add("disco");
		ls.add("pancer");
		ls.add("al habibi");

		ls.add("disco");
		
		Set<String> a=new HashSet<>(ls); // this statement will remove the duplicate values
		
		for(String s:a) {
			System.out.println(s);
		}
		
	
	}
}
	
class adbc{
	public static void main(String[] args) {

		
		String a="this is wat a notification is";
		
		char[] b=a.toCharArray();

		List<String> d=Arrays.asList(a);
		
		Set<String> e=new HashSet<>(d);

		int db=2;
	}
}
