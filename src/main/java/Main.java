import edu.ml.tensorflow.ObjectDetector;

public class Main {
    private final static String IMAGE = "/image/tesla.jpg";

    public static void main(String[] args) {
        ObjectDetector objectDetector = new ObjectDetector();
        objectDetector.detect(IMAGE);
    }
}
