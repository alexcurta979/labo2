package MVC;

public class cinemaMovieController {
    private cinemaMovie model;
    private cinemaMovieView view;

    public cinemaMovieController (cinemaMovie model, cinemaMovieView view) {
        this.model = model;
        this.view = view;
    }

    public void setMovieTitle (String newTitle) {this.model.setTitle(newTitle);}
    public String getMovieTitle () {return this.model.getTitle();}
    public void setMovieLength (int newLength) {this.model.setLength(newLength);}
    public int getMovieLength () {return this.model.getLength();}
    public void setMovieSchedule (String[] newSchedule) {this.model.setSchedule(newSchedule);}
    public String[] getMovieSchedule () {return this.model.getSchedule();}
    public void updateView () {this.view.printMovieDetails(model.getTitle(), model.getLength(), model.getSchedule());}
    public void updateLength () {this.view.printMovieLength(model.getLength());}
    public void updateSchedule () {this.view.printSchedule(model.getSchedule());}
}
