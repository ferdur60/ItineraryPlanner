package com.example.itineraryplanner;

import java.util.ArrayList;

/**
 * Representa una publicación en el foro.
 */
public class Post {
    private String author;
    private String content;
    private ArrayList<String> photos;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.photos = new ArrayList<>();
    }

    public void addPhoto(String photoName) {
        photos.add(photoName);
    }

    @Override
    public String toString() {
        StringBuilder postDetails = new StringBuilder();
        postDetails.append("Autor: ").append(author).append("\n");
        postDetails.append("Contenido: ").append(content).append("\n");
        if (!photos.isEmpty()) {
            postDetails.append("Fotos: ").append(String.join(", ", photos)).append("\n");
        }
        return postDetails.toString();
    }
}
