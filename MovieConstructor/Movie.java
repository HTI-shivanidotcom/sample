package MovieConstructor;

public class Movie {
	String movieName;
	String producedBy;
	String directedBy;
	int duration;
	int year;
	String category;
	
	
	// a-> Movie name and produced by are mandatory fields in constructor
	public Movie(String movieName, String producedBy) {
		this.movieName = movieName;
		this.producedBy = producedBy;
	}
	
	
	// c-> creating using all fields in constructor
	
	public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
		this(movieName,producedBy);
		//this.movieName = movieName;
		//this.producedBy = producedBy;
		this.directedBy = directedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;
	}
	
	// displaying the info
	

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", producedBy=" + producedBy + ", directedBy=" + directedBy
				+ ", duration=" + duration + ", year=" + year + ", category=" + category + "]";
	}
	
	
	
}
