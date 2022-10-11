package MVC;

public class cinemaMovieView {
    public void printMovieDetails(String title, int length, String[] schedule) {
        System.out.println("Title: "+title);
        System.out.println("Length: " + Integer.toString(length)+" min");
        System.out.println("Schedule: ");
        for (String s : schedule) {System.out.println(s);}
    }

    public void printMovieLength(int length) {System.out.println("Length: " + Integer.toString(length)+" min");}
    public void printSchedule(String[] schedule) {
        System.out.println("Schedule: ");
        for (String s : schedule) {System.out.println(s);}
    }

}
