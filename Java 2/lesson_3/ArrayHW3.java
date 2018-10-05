package lesson_3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * GeekBrains. Java. Level 2. Lesson 3. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 29.09.2018
 */

public class ArrayHW3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Ivanov");
        words.add("Ivanova");
        words.add("Ivanokov");
        words.add("Ivkova");
        words.add("Petrov");
        words.add("Sidorova");
        words.add("Trump");
        words.add("Igor");
        words.add("Lao");
        words.add("Popkin");
        words.add("Petrov");
        words.add("Sidorova");
        words.add("Trump");
        words.add("Clinton");
        words.add("Pupkin");
        words.add("Popkin");
        words.add("Ivanova");
        words.add("Ivanokov");
        words.add("Ivkova");
        words.add("Petrov");

        for (String w : words)
            System.out.print(w + " ");

        System.out.println();
        System.out.println();

        // копирую имеющийся Лист
        List<String> list = new ArrayList<String>(words);

        // Фамилии в строчку
        for (String v : list)
            System.out.print(v + " ");

        // Так как фамилии надо посчитать, то проще использовать HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // Инициализирую счетчик
        Integer item;
        // прогоняю по циклу ArrayList и
        // закидываю фамилии в HashMap как ключ, а значение(Value) создаю или увеличиваю на 1
        for (String wrd : list) {

            //System.out.println("++++++"+hm.get(wrd));
            item = hm.get(wrd);
            if (item == null) hm.put(wrd, 1); // если нет в списке то добавить со значением 1
            else hm.put(wrd, item + 1); // если есть такая фамилия(Key), то +1
        }

        // Вывод результатов
        System.out.println();
        System.out.println();

        System.out.println("Всего фамилий в списке: " + words.size());
        System.out.println("Всего уникальных фамилий в списке: " + hm.size());
        System.out.println("Фамилии и колличество раз их упоминания:");
        System.out.println(hm);
        System.out.println(hm.values());


    }

}
