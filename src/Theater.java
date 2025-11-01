import person.Actor;
import person.Director;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;
import util.Gender;

import java.util.ArrayList;

public class Theater {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        String OperaLibrettoText = "Оперный текст либретто";
        String BalletLibrettoText = "Балетный текст либретто";

        // Создаем актеров и режиссеров
        Actor actor1 = new Actor("Джонни", "Депп", Gender.MALE, 178);
        Actor actor2 = new Actor("Хью", "Лори", Gender.MALE, 188);
        Actor actor3 = new Actor("Стивен", "Фрай", Gender.MALE, 196);
        Director director1 = new Director("Ларс", "Фон Триер", Gender.MALE, 3);
        Director director2 = new Director("Квентин", "Тарантино", Gender.MALE, 8);

        Person musicAuthor = new Person("Музыкальный", "Человек", Gender.FEMALE);
        Person choreographer = new Person("Танцевальный", "Человек", Gender.FEMALE);

        ArrayList<Actor> showListOfActors = new ArrayList<Actor>();
        ArrayList<Actor> operaListOfActors = new ArrayList<Actor>();
        ArrayList<Actor> BalletListOfActors = new ArrayList<Actor>();

        // Создаем спектакли
        Show show = new Show("Обычный спектакль", 2, director1, showListOfActors);
        Opera opera = new Opera("Опера", 3, director1, operaListOfActors, musicAuthor, OperaLibrettoText, 12);
        Ballet ballet = new Ballet("Балет", 4, director2, BalletListOfActors, musicAuthor, BalletLibrettoText, choreographer);

        // Распределяем актеров по спектаклям
        show.addNewActor(actor1);
        show.addNewActor(actor2);
        opera.addNewActor(actor1);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor3);

        // Выводим актерский состав спектаклей
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        // Меняем актера и делаем вывод обновленного актерского состава
        ballet.replaceActor(actor1, "Фрай");
        ballet.printListOfActors();

        // Пробуем заменить в спектакле несуществующего актера
        ballet.replaceActor(actor1, "Фрай");

        // Выводим текст либретто для оперы и балета
        opera.printLibrettoText();
        ballet.printLibrettoText();

        System.out.println(director1);
    }
}
