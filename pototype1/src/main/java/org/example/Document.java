package org.example;

import java.util.ArrayList;
import java.util.List;

public class Document implements Copyable {
    private Integer id;
    private String title;
    private String content;
    private String author;
    private List<String> tags;

    public Document(Integer id, String title, String content, String author, List<String> tags) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.tags = new ArrayList<>(tags);
    }

    public Document(Document other) {
        this.id = other.id;
        this.title = other.title;
        this.content = other.content;
        this.author = other.author;
        this.tags = new ArrayList<>(other.tags);
    }

    @Override
    public Document clone() {
        return new Document(this);
    }

    @Override
    public String toString() {
        return String.format(
                "Document [ id=%-3d | title=%-12s | author=%-8s | tags=%-20s | content=%s ]",
                id, title, author, tags, content
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = new ArrayList<>(tags);
    }
}
