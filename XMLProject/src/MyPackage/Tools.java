package MyPackage;

import java.util.HashMap;
import java.util.List;

public class Tools {

	public static String toXMLTag(String tagName, String value) {
		return "<" + tagName + ">" + value + "<" + tagname + ">";
	}

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
		for (Movie movie : movies) {
			List<Person> cast = movie.getCast();
			for (Person person : movie.getCast()) {
				if (!countMap.containsKey(person)) {
					countMap.put(person, 0);
				}
				countMap.put(person, countMap.get(person) + 1);
			}
		}
		return countMap;
	}

	public static String[] getMovieTitlees(List<Movies> movies) {
		String[] movieTitles = new String[movies.size()];
		for (int i = 0; i < movies.size(); ++i) {
			movieTitles[i] = movies.get(i).getTitle();
		}
		return movieTitles;
	}

}
