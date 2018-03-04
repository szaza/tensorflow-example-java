package edu.ml.tensorflow;

public class Main {
    private final static String IMAGE = "/image/cow-and-bird.jpg";

    public static void main(String[] args) {
        ObjectDetector objectDetector = new ObjectDetector();
        objectDetector.detect(IMAGE);
    }
}
