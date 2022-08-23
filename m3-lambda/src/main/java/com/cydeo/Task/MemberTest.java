package com.cydeo.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1 = new Person("mike", 35, Gender.Male, "milke@gmail.com");
        Person p2 = new Person("Ozzy", 35, Gender.Male, "milke@gmail.com");
        Person p3 = new Person("Tom", 35, Gender.Male, "milke@gmail.com");
        Person p4 = new Person("Ally", 35, Gender.Femail, "milke@gmail.com");

        List<Person> personList = Arrays.asList(p1, p2, p3, p4);

        CheckMember checkMember = p -> p.getGender() == Gender.Male && p.getAge() >= 18 && p.getAge() <= 25;
        print(personList, checkMember);

        print(personList, p -> p.getGender() == Gender.Male && p.getAge() >= 18 && p.getAge() <= 25);

    }

    private static void print(List<Person> personList, CheckMember checkMember) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (checkMember.test(person)) {
                result.add(person);
            }

        }
        System.out.println(result);


    }
}