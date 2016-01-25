package MyPackage;

import java.util.HashMap;
import java.util.List;

public class Tools {
	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<person>");
		sb.append(Tools.toXMLTag("firstName", getFirstName()));
		sb.append(Tools.toXMLTag("lastName", getLastName()));
		sb.append(Tools.toXMLTag("gender", String.valueOf(getGender())));
		sb.append(Tools.toXMLTag("hasOscar", String.valueOf(isHasOscar())));
		sb.append(Tools.toXMLTag("hasGoldenGlobe", String.valueOf(isHasGoldenGlobe())));
		sb.append("</person>");
		return sb.toString();
	}

	private char[] isHasGoldenGlobe() {
		return null;
	}

	private char[] isHasOscar() {
		return null;
	}

	private char[] getGender() {
		return null;
	}

	private String getLastName() {
		return null;
	}

	private String getFirstName() {
		return null;
	}

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
		for (Movie movie : movies) {
			for (Person person : movie.getCast()) {
				if (!countMap.containsKey(person)) {
					countMap.put(person, new Integer(0));
				}
				countMap.put(person, countMap.get(person) + 1);
			}
		}
		return countMap;
	}

	public static Object toXMLTag(String string, String firstName) {
		return null;
	}

}
