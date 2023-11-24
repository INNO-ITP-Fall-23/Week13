package ru.makhmutov.lab.task1.media;

public class Media {

    private String name;

    public Media(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                '}';
    }
}
