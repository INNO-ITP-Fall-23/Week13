package ru.makhmutov.lab.task1;

import ru.makhmutov.lab.task1.media.Media;

public class Library<T extends Media> {

    T obj;

    public Library(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
