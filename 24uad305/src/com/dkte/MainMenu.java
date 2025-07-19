package com.dkte;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            MusicManager manager = new MusicManager();
            int choice;

            do {
                System.out.println("\n=== MUSIC MANAGEMENT MENU ===");
                System.out.println("1. Add Artist");
                System.out.println("2. Add Album");
                System.out.println("3. Add Track to Album");
                System.out.println("4. Display All Artists");
                System.out.println("5. Display All Albums");
                System.out.println("6. View Tracks by Artist");
                System.out.println("7. View All Tracks");
                System.out.println("8. View Tracks by Album");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter artist ID: ");
                        int artistId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter artist name: ");
                        String artistName = sc.nextLine();
                        manager.addArtist(artistId, artistName);
                        break;
                    case 2:
                        System.out.print("Enter album ID: ");
                        int albumId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter album title: ");
                        String albumTitle = sc.nextLine();
                        manager.addAlbum(albumId, albumTitle);
                        break;
                    case 3:
                        System.out.print("Enter track ID: ");
                        int trackId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter track title: ");
                        String trackTitle = sc.nextLine();
                        System.out.print("Enter album ID: ");
                        int trackAlbumId = sc.nextInt();
                        System.out.print("Enter artist ID: ");
                        int trackArtistId = sc.nextInt();
                        manager.addTrack(trackId, trackTitle, trackAlbumId, trackArtistId);
                        break;
                    case 4:
                        manager.displayAll("Artist");
                        break;
                    case 5:
                        manager.displayAll("Album");
                        break;
                    case 6:
                        System.out.print("Enter artist ID: ");
                        int searchArtistId = sc.nextInt();
                        manager.displayTracksByArtist(searchArtistId);
                        break;
                    case 7:
                        manager.displayAll("Track");
                        break;
                    case 8:
                        System.out.print("Enter album ID: ");
                        int searchAlbumId = sc.nextInt();
                        manager.displayTracksByAlbum(searchAlbumId);
                        break;
                    case 0:
                        System.out.println(" Exiting the program...");
                        break;
                    default:
                        System.out.println(" Invalid choice. Try again.");
                }
            } while (choice != 0);

            manager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
