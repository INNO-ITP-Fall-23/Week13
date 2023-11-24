package ru.makhmutov.lab.task1.media;

public class Video extends Media {
    private String recorder;

    public Video(String recorder, String name) {
        super(name);
        this.recorder = recorder;
    }


    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    @Override
    public String toString() {
        return "Video{" +
                "recorder='" + recorder + '\'' +
                ", name='" + super.getName() + '\'' +
                '}';
    }
}
