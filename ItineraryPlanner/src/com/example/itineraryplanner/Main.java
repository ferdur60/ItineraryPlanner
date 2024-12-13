package com.example.itineraryplanner;

import java.util.Scanner;

/**
 * Clase principal para ejecutar el planificador de itinerarios y el foro.
 */
public class Main {
    public static void main(String[] args) {
        ItineraryPlanner planner = new ItineraryPlanner();
        Forum forum = new Forum();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- ExploreEasy: Planificador y Foro ---");
            System.out.println("1. Planificador: Añadir parada");
            System.out.println("2. Planificador: Eliminar parada");
            System.out.println("3. Planificador: Mostrar itinerario");
            System.out.println("4. Foro: Añadir publicación");
            System.out.println("5. Foro: Ver publicaciones");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir línea pendiente

            switch (option) {
                case 1:
                    System.out.print("Ingrese la ubicación: ");
                    String location = scanner.nextLine();
                    System.out.print("Ingrese la hora (e.g., 10:00 AM): ");
                    String time = scanner.nextLine();
                    planner.addStop(location, time);
                    break;
                case 2:
                    System.out.print("Ingrese la ubicación a eliminar: ");
                    location = scanner.nextLine();
                    planner.removeStop(location);
                    break;
                case 3:
                    planner.displayItinerary();
                    break;
                case 4:
                    System.out.print("Ingrese su nombre: ");
                    String author = scanner.nextLine();
                    System.out.print("Ingrese el contenido de la publicación: ");
                    String content = scanner.nextLine();
                    Post newPost = new Post(author, content);

                    System.out.print("¿Desea añadir fotos? (sí/no): ");
                    String addPhotos = scanner.nextLine();
                    while (addPhotos.equalsIgnoreCase("sí")) {
                        System.out.print("Ingrese el nombre de la foto: ");
                        String photoName = scanner.nextLine();
                        newPost.addPhoto(photoName);
                        System.out.print("¿Desea añadir otra foto? (sí/no): ");
                        addPhotos = scanner.nextLine();
                    }
                    forum.addPost(newPost);
                    break;
                case 5:
                    forum.displayPosts();
                    break;
                case 6:
                    System.out.println("Saliendo de ExploreEasy. ¡Buen viaje!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 6);

        scanner.close();
    }
}

