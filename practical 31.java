import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist: " + playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("Playing: " + firstSong);
        System.out.println("Playlist after playing first song: " + playlist);

        String lastSong = playlist.removeLast();
        System.out.println("Skipped: " + lastSong);
        System.out.println("Playlist after skipping last song: " + playlist);
    }
}