package MVC;

public class cinemaMovie {
    private String title;
    private int length; //in minutes
    private String[] schedule;
    public cinemaMovie(String title, int length, String[] schedule) {
        this.length = length;
        this.title = title;
        this.schedule = schedule;
    }

    public String getTitle() {return title;}
    public void setTitle(String newTitle) {this.title = newTitle;}
    public int getLength() {return length;}
    public void setLength(int newLength) {this.length = newLength;}
    public String[] getSchedule() {return schedule;}
    public void setSchedule(String[] newSchedule) {this.schedule = newSchedule;}
}
