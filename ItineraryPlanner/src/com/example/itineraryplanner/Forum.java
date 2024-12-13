package com.example.itineraryplanner;

import java.util.ArrayList;

/**
 * Gestiona las publicaciones del foro.
 */
public class Forum {
    private ArrayList<Post> posts;

    public Forum() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
        System.out.println("Publicación añadida con éxito.");
    }

    public void displayPosts() {
        if (posts.isEmpty()) {
            System.out.println("No hay publicaciones en el foro.");
            return;
        }

        System.out.println("\n--- Publicaciones en el Foro ---");
        for (int i = 0; i < posts.size(); i++) {
            System.out.println("Publicación #" + (i + 1));
            System.out.println(posts.get(i));
        }
    }
}
