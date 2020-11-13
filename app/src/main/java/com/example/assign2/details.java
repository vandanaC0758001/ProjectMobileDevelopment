package com.example.assign2;

public class details {
    int Image;
    String title;
    String genre;

    public details(int image, String title, String genre) {
        Image = image;
        this.title = title;
        this.genre = genre;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
