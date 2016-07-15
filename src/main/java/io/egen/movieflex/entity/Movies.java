package io.egen.movieflex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({@NamedQuery(name = "getById", query = "SELECT OBJECT(m) FROM Movies m WHERE m.imdbID = :id"),
	@NamedQuery(name = "getRatingsById", query = "SELECT m.imdbRating FROM Movies m WHERE m.imdbID = :id"),
	@NamedQuery(name = "getCommentsById", query = "SELECT m.Rated FROM Movies m WHERE m.imdbID = :id")})

public class Movies {

	private String Title;
	private String Year;
	private String Rated;
	private String Released;
	private String Runtime;
	private String Genre;
	private String Director;
	@Column(length=1337)
	private String Writer;
	@Column(length=1337)
	private String Actors;
	@Column(length=1337)
	private String Plot;
	private String Language;
	private String Country;
	private String Awards;
	@Column(length=1337)
	private String Poster;
	private String Metascore;
	private String imdbRating;
	private String imdbVotes;
	@Id
	private String imdbID;
	private String Type;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getRated() {
		return Rated;
	}

	public void setRated(String rated) {
		Rated = rated;
	}

	public String getReleased() {
		return Released;
	}

	public void setReleased(String released) {
		Released = released;
	}

	public String getRuntime() {
		return Runtime;
	}

	public void setRuntime(String runtime) {
		Runtime = runtime;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		Actors = actors;
	}

	public String getPlot() {
		return Plot;
	}

	public void setPlot(String plot) {
		Plot = plot;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
	}

	public String getPoster() {
		return Poster;
	}

	public void setPoster(String poster) {
		Poster = poster;
	}

	public String getMetascore() {
		return Metascore;
	}

	public void setMetascore(String metascore) {
		Metascore = metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "Movies [Title=" + Title + ", Year=" + Year + ", Rated=" + Rated + ", Released=" + Released + ", Runtime="
				+ Runtime + ", Genre=" + Genre + ", Director=" + Director + ", Writer=" + Writer + ", Actors=" + Actors
				+ ", Plot=" + Plot + ", Language=" + Language + ", Country=" + Country + ", Awards=" + Awards
				+ ", Poster=" + Poster + ", Metascore=" + Metascore + ", imdbRating=" + imdbRating + ", imdbVotes="
				+ imdbVotes + ", imdbID=" + imdbID + ", Type=" + Type + "]";
	}

}
