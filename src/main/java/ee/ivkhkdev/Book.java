package ee.ivkhkdev;

import ee.ivkhkdev.Author;

public class Book {
    private String title;
    private Author[] authors;

    public Book(String title, Author[] authors) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("заголовок");
        }
        if (authors == null || authors.length == 0) {
            throw new IllegalArgumentException("Должен быть 1 автор");
        }
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("заголовок");
        }
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        if (authors == null || authors.length == 0) {
            throw new IllegalArgumentException("Должен быть 1 автор");
        }
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(" кем ");
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].getName());
            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
