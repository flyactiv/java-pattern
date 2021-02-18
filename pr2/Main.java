package pr2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human(
                "Rubius",
                "Wunder",
                19,
                77,
                new GregorianCalendar(2002, Calendar.JANUARY, 15).getTime())
        );

        humans.add(new Human(
                "Andrew",
                "Park",
                31,
                66,
                new GregorianCalendar(1990, Calendar.FEBRUARY, 25).getTime())
        );

        humans.add(new Human(
                "Anastasia",
                "Monta",
                69,
                63,
                new GregorianCalendar(1952, Calendar.APRIL, 9).getTime())
        );

        humans.add(new Human(
                "Karl",
                "Monte",
                17,
                55,
                new GregorianCalendar(2004, Calendar.APRIL, 9).getTime())
        );

        ArrayList<Human> weightMoreThanAge = (ArrayList<Human>) humans
                .stream()
                .filter(person -> person.getWeight() > person.getAge())
                .collect(Collectors.toList());


        ArrayList<Human> sortedByLastName = (ArrayList<Human>) humans
                .stream()
                .sorted(Comparator.comparing(Human::getSecondName).reversed())
                .collect(Collectors.toList());


        int weightAddition = humans
                .stream()
                .reduce(1, (bufferResult, person) -> bufferResult + person.getWeight(), Integer::sum);

        System.out.println("\nФильтрация (отображается, если вес больше возраста): " + weightMoreThanAge.toString());
        System.out.println("\nСортировка по фамилии в обратном порядке: " + sortedByLastName.toString());
        System.out.println("\nСумма всех весов: " + weightAddition);

    }
}
