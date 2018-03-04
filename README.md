# TensorFlow Java API sample program with YOLOv2 built by Gradle
TensorFlow Java API is a new possibility to use TensorFlow from Java applications. 
On the [official TensorFlow site](https://www.tensorflow.org/install/install_java) you can find a description about the
Java API usage with Maven using an Inception model. This sample shows you how to use TensorFlow from Java programs using Gradle as build and 
dependency management tool. In my sample code I used the YOLO vesion 2 to detect and classify objects. For this reason I 
implemented a YOLOClassifier in java.

### Compile and run

#####Download frozen graphs
Before compiling the application you have to create/download some graph definition files. To try out the application you
can use my frozen graphs, which are trained to the Pascal VOC data set with 20 classes. You can download them from my
google drive [here](https://drive.google.com/open?id=1GfS1Yle7Xari1tRUEi2EDYedFteAOaoN). Place these files under the
`src/main/resources/YOLO` directory.

Please make sure that you've set properly the *GRAPH_FILE* and *LABEL_FILE* variables in the [Configuration](https://github.com/szaza/tensorflow-java-yolo/blob/master/src/main/java/edu/ml/tensorflow/Config.java) file.

##### Compile the source by using Gradle
By default it runs on CPU. If you want to run this program with GPU support please change this line in the `build.gradle` file: <br/>
`compile group: 'org.tensorflow', name: 'libtensorflow_jni', version: '1.6.0'` to <br/> 
`compile group: 'org.tensorflow', name: 'libtensorflow_jni-gpu', version: '1.6.0'`

Specify the path for the image in the [Main](https://github.com/szaza/tensorflow-java-yolo/blob/master/src/main/java/edu/ml/tensorflow/Main.java) class (for sure it can be modified to read from the command line arguments).<br/>
Compile the code with the following command: `./gradlew clean build`

##### Run the application
Type the `./gradlew run` command in the command line window and hit enter. You are done!
The output is printed out with the LogBack logging framework so, it should looks like:

`INFO  edu.ml.tensorflow.ObjectDetector - Object: car - confidence: 0.8876258` <br/>
`INFO  edu.ml.tensorflow.ObjectDetector - Object: person - confidence: 0.82162035`
