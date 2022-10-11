package MVC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MMain {

    public String[] add (String[] initial, String newElem) {
        String[] newArray = new String[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {newArray[i] = initial[i];}
        newArray[initial.length] = newElem;
        return newArray;
    }

    public void main(String[] args) throws IOException {
        boolean ok = true;

        cinemaMovie model = new cinemaMovie("See how they run", 122, new String[] {"11.10.2022 16:30", "12.10.2022 22:00"});
        cinemaMovieView view = new cinemaMovieView();
        cinemaMovieController controller = new cinemaMovieController(model, view);


        while (ok) {
            System.out.println("Choose an option: ");
            System.out.println("0: exit");
            System.out.println("1: See full information of the movie");
            System.out.println("2. Change the title of the movie");
            System.out.println("3. Change the length of the movie");
            System.out.println("4. Change the schedule of the movie");

            int a = System.in.read();
            switch(a) {
                case 0:
                    ok = false;
                    break;
                case 1:
                    controller.updateView();
                    break;
                case 2:
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(System.in));

                    String x = reader.readLine();


                    controller.setMovieTitle(x);
                    break;
                case 3:
                    int y = System.in.read();
                    controller.setMovieLength(y);
                    break;
                case 4:
                    System.out.println("How many items do you want to put in the list: ");
                    int z = System.in.read();
                    String[] x2 = new String[]{};
                    for (int i = 0; i < z; i++) {
                        BufferedReader reader1 = new BufferedReader(
                                new InputStreamReader(System.in));

                        String x1= reader1.readLine();
                        x2 = add(x2, x1);
                    }
                    controller.setMovieSchedule(x2);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }





}
