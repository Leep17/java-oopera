import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printActors(){
        for(Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
        } else {
            System.out.println("Таких актеров нет!");
        }
    }

    public void addNewActor(Actor actor){
        listOfActors.add(actor);
    }
}
