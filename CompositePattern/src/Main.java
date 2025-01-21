public class Main {
    public static void main(String[] args) {
        // Composite pattern is a structural design pattern that lets you compose objects into tree structures and
        // work with these structures as they were individual objects
        Directory root = new Directory("root");
        Directory music = new Directory("music");
        Directory documents = new Directory("documents");

        File song1 = new File("song1.mp3");
        File song2 = new File("song2.mp3");
        File doc1 = new File("doc1.txt");

        // Build the structure
        root.add(music);
        root.add(documents);
        music.add(song1);
        music.add(song2);
        documents.add(doc1);




    }
}