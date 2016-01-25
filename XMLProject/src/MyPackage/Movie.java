package MyPackage;

import java.util.ArrayList;

public class Movie {

	private String title;
	private Genre genre;
	private long duration = 154;
	private double rate = 5.4;
	private ArrayList<Person> cast;

	public static void main(String[] args) {
	}
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public ArrayList<Person> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<movie>");
		sb.append(Tools.toXMLTag("Title", getTitle()));
		sb.append(Tools.toXMLTag("Genre", String.valueOf(getGenre())));
		sb.append(Tools.toXMLTag("Duration", String.valueOf(getDuration())));
		sb.append(Tools.toXMLTag("Rate", String.valueOf(getRate())));
		sb.append("</movie>");
		return sb.toString();
	}
}