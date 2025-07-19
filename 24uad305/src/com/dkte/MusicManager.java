package com.dkte;

import java.io.IOException;
import java.sql.*;

public class MusicManager {
    private static final String URL = "jdbc:mysql://localhost:3306/music_db";
    private static final String USER = "root";
    private static final String PASS = "prathu2704"; 

    private Connection conn;

    public MusicManager() throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASS);
    }

    public void addArtist(int id, String name) throws SQLException {
        String sql = "INSERT INTO Artist VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.executeUpdate();
            System.out.println(" Artist added.");
        }
    }

    public void addAlbum(int id, String title) throws SQLException {
        String sql = "INSERT INTO Album VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, title);
            stmt.executeUpdate();
            System.out.println(" Album added.");
        }
    }

    public void addTrack(int id, String title, int albumId, int artistId) throws SQLException {
        String sql = "INSERT INTO Track VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, title);
            stmt.setInt(3, albumId);
            stmt.setInt(4, artistId);
            stmt.executeUpdate();
            System.out.println("Track added.");
        }
    }

    public void displayAll(String table) throws SQLException {
        String sql = "SELECT * FROM " + table;
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();

            System.out.println("\n--- " + table.toUpperCase() + " TABLE ---");
            while (rs.next()) {
                for (int i = 1; i <= cols; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        }
    }

    public void displayTracksByArtist(int artistId) throws SQLException {
        String sql = "SELECT * FROM Track WHERE artist_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, artistId);
            ResultSet rs = stmt.executeQuery();
            System.out.println("\n--- TRACKS BY ARTIST ID: " + artistId + " ---");
            while (rs.next()) {
                System.out.println(rs.getInt("track_id") + " " + rs.getString("title"));
            }
        }
    }

    public void displayTracksByAlbum(int albumId) throws SQLException {
        String sql = "SELECT * FROM Track WHERE album_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, albumId);
            ResultSet rs = stmt.executeQuery();
            System.out.println("\n--- TRACKS FROM ALBUM ID: " + albumId + " ---");
            while (rs.next()) {
                System.out.println(rs.getInt("track_id") + " " + rs.getString("title"));
            }
        }
    }

    public void close() throws SQLException, IOException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
