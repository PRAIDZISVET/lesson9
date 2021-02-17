package com.itacademy.lesson9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActorDemo {
    public static void main(String[] args) {
        List<Actor> actors = Arrays.asList(
                new Actor("Брюс", "Ли", 5000),
                new Actor("Брюс", "Ааа", 5000),
                new Actor("Джонни", "Ли", 5000),
                new Actor("Вандам", "Жан Клод", 2500),
                new Actor("Арнольд", "Шварцнегер", 5500)
        );
        print(actors);

        Collections.sort(actors);
        print(actors);

        actors.sort(new FeeComparator().reversed());
        print(actors);

       // actors.sort(new ActorComplexComparator());
        actors.sort(Comparator.comparing(Actor::getFee)
                .thenComparing(Comparator.comparing(Actor::getLastName).reversed())
                .thenComparing(Actor::getFirstName)
                .reversed());
        print(actors);
    }

    private static void print(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor);
        }
        System.out.println();
    }
}
