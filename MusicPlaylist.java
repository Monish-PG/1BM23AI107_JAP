import java.util.Vector;
class Music{
    String title;
    String artist;
    String genre;
    public Music(String title,String artist,String genre){
        this.title=title;
        this.artist=artist;
        this.genre=genre;
    }
}

public class MusicPlaylist{
    private Vector<Music> playlist;
    public MusicPlaylist() {
        playlist = new Vector<>();
    }

    public void addSong(String title,String artist,String genre){
        Music song = new Music(title,artist,genre);
        playlist.add(song);
    }

    public void removeSong(String title){
        for (int i =0 ; i<playlist.size(); i++){
            if(playlist.get(i).title.equalsIgnoreCase(title)){
                playlist.remove(i);
                break;
            }
        }
    }

    public void displayPlaylist(){
        System.out.println("Music Playlist:");
        for (Music song : playlist){
            System.out.println("Title:"+song.title+",Artist:"+song.artist+",Genre:"+song.genre);
        }
    }

    public static void main(String[] args){
        MusicPlaylist abc = new MusicPlaylist();
        System.out.println("Adding Songs:");
        abc.addSong("Brooklyn Baby","Lana del Ray","Comedy");
        abc.addSong("Yayo","Lana del Ray","Love");
        System.out.println();
        abc.displayPlaylist();
        System.out.println();
        abc.removeSong("Brooklyn Baby");
        System.out.println("After removing Brooklyn Baby:");
        abc.displayPlaylist();
    }
}