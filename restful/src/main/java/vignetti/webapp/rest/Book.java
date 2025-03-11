package vignetti.webapp.rest;

import java.util.List;

public class Book {
	private long id;
	private String title;
	private String language;
	private List<Author> authors;

    public Book(long id, String title, String language, List<Author> authors){
        this.id = id;
        this.title = title;
        this.language = language;
		this.authors = authors;
    }

	public Book() {}

	public long getId() { return id; }
	public String getTitle() { return title; }
	public String getLanguage() { return language; }
	public List<Author> getAuthors() { return authors; }

	public void setId(long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setLanguage(String language) { this.language = language; }
    public void setAuthors(List<Author> authors) { this.authors = authors; }
}

