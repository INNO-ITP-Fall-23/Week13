package ru.makhmutov.lab.task1;

import ru.makhmutov.lab.task1.media.Book;
import ru.makhmutov.lab.task1.media.Media;
import ru.makhmutov.lab.task1.media.Video;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Media> mediaList = getMedia();
//        displayMedia(mediaList);

        Library<? extends Media>[] library = addMedia();

        System.out.println(library[0].getObj());
    }

    private static Library<? extends Media>[] addMedia() {
        Library<Media>[] library = new Library[3];
        library[0] = new Library<>(new Book("Pushkin", "Ruslan and Ludmilla"));
        library[1] = new Library<>(new Video("Bekmambetov", "Nochnoy dozor"));
        library[2] = new Library<>(new Video("Cameron", "Avatar"));
        return library;
    }

    private static List<Media> getMedia() {
        Book book = new Book("Pushkin", "Ruslan and Ludmilla");
        Video video = new Video("Bekmambetov", "Nochnoy dozor");
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(book);
        mediaList.add(video);
        return mediaList;
    }

    private static void displayMedia(List<Media> mediaList) {
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
