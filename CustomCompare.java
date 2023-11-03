package list;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Movie{
	String name;
	int year;
	int rating;
	
	Movie(String name, int year,int rating){
		this.name=name;
		this.year=year;
		this.rating=rating;
	}

	@Override
	public String toString() {
		return "Movie name= " + name + ", year=" + year + ", rating=" + rating ;
	}
	
}
class SortYear implements Comparator<Movie>{

	

	@Override
	public int compare(Movie x, Movie y) {
		
		return y.year - x.year;
	}
	
}
public class CustomCompare {
	public static void main(String[] args) {
		Queue<Movie> q = new PriorityQueue<Movie>(new SortYear());
		q.add(new Movie("Appu",2008,5));
		q.add(new Movie("KGF",2020,4));
		q.add(new Movie("Baby",2023,8));
		for(Movie m:q) {
			System.out.println(m);
		}
		
	}

}
