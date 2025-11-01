package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        System.out.println("Актерский состав спектакля " + title + ": ");
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
        System.out.println(" ");
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Данный актер уже есть в списке");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        boolean isSurnameInActorsList = false;

        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surnameToReplace)) {
                isSurnameInActorsList = true;
                listOfActors.remove(actor);
                addNewActor(newActor);
                break;
            }
        }

        if (!isSurnameInActorsList) {
            System.out.println("Такого актёра в списке нет");
        }
    }
}
