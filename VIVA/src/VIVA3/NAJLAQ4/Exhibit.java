package VIVA3.NAJLAQ4;

public class Exhibit {
    private String title;
    private String artist;
    private int year;
    private String type;
    private String description;
    // Constructor
    public Exhibit(String title, String artist, int year, String type, String description) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.description = description;
    }
    public String getDetails() {// Method to get details of the exhibit
        return String.format("Title: %s\nArtist: %s\nYear: %d\nType: %s\nDescription: %s\n",
                title, artist, year, type, description);
    }
    // Getters for exhibit attributes
    public String getArtist() {
        return artist;
    }
    public String getType() {
        return type;
    }
    public int getYear() {
        return year;
    }
}
