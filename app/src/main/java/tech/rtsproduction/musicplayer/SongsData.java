package tech.rtsproduction.musicplayer;

public class SongsData {

    private String Name;
    private String Artist;
    private String Date;

    public SongsData(String name, String artist, String date) {
        Name = name;
        Artist = artist;
        Date = date;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public String getArtist() {
        return Artist;
    }

    public String getDate() {
        return Date;
    }
}
