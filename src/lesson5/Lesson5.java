package lesson5;

import lesson3.Lesson3;

import java.util.Random;

public class Lesson5 {
    public Lesson5() {
    }

    public void main() {
//        printLinksOfObjects();

        Person[] persons = new Person[1000];
        Lesson3 lesson3 = new Lesson3();
        Random r = new Random();
        for (int j = 0; j < persons.length; j++) {
            persons[j] = new Person(j, lesson3.rndNameConstructor(5), lesson3.rndNameConstructor(10), r.nextInt(100) + 1);
        }
        persons=lastNameSort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    public void printLinksOfObjects() {
        XXX[] objects = new XXX[10];
        int i = 0;
        for (int j = 0; j < 10; j++) {
            objects[j] = new XXX(j);
        }
        while (i < 10) {
            objects[i].print();
            i++;
        }
        for (int j = 0; j < 10; j++) {
            objects[j] = null;
        }
    }

    public Person[] lastNameSort(Person[] people) {
        String temp;
        for (int j = 0; j < people.length; j++) {
            for (int i = j+1; i < people.length; i++) {
                if (people[i].getLastName().compareTo(people[j].getLastName()) < 0)
                {
                    temp = people[j].getLastName();
                    people[j].setLastName(people[i].getLastName());
                    people[i].setLastName(temp);
                }
            }
        }
        return people;
    }
}