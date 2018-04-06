javac -d bin src/shared/*.java
javac -d bin src/client/*.java
cd bin
java -classpath . client.MainWindow
Pause