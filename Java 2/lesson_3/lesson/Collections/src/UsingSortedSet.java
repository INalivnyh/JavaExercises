package lesson_3.lesson.Collections.src;

import java.util.*;

public class UsingSortedSet
{
    public static void main(String[] args)
    {
        List<Person> persons = Arrays.asList(
            new Person("Ted", "Neward", 39),
            new Person("Ron", "Reynolds", 39),
            new Person("Charlotte", "Neward", 38),
            new Person("Matthew", "McCullough", 18)
        );
        SortedSet ss = new TreeSet(new Comparator<Person>() {
            public int compare(Person lhs, Person rhs) {
                return lhs.getLastName().compareTo(rhs.getLastName());
            }
        });
    }
}