package org.example.tacks;

import org.example.amigoscode.main;

import java.util.List;
import java.util.stream.Collectors;

public class personMain {
    public static void main(String[] args) {

        List<Person> people = List.of(new Person(1,"aaqib","khan","aaqibkhan1984@gmail.com","male",19),
                new Person(1,"aaqib","khan","aaqibkhan1984@gmail.com","male",17),
                new Person(1,"aaqib","khan","aaqibkhan1984@gmail.com","male",16),
                new Person(1,"aaqib","khan","aaqibkhan1984@gmail.com","male",15)

        );

        people.stream().filter(person -> person.age<18).collect(Collectors.toList()).forEach(System.out::println);

    }
}
