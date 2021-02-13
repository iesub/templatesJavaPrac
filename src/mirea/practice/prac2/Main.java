package mirea.practice.prac2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Comparator<Human> sortNameReverse = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return -o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
        };

        List<Human> arr = new ArrayList<>();
        arr.add(new Human(19, "Александр", "Невский", LocalDate.of(1978, 8, 13), 76));
        arr.add(new Human(27, "Петр", "Романов", LocalDate.of(2003, 4, 24), 66));
        arr.add(new Human(56, "Фродо", "Беггинс", LocalDate.of(1933, 12, 6), 71));
        arr.add(new Human(34, "Перегрин", "Тук", LocalDate.of(1941, 3, 26), 54));

        Stream<Human> stream = arr.stream();
        System.out.println("СОРТИРОВКА ПО ИМЕНИ В ОБРАТНОМ ПОРЯДКЕ");
        stream.sorted(sortNameReverse).forEach(x->System.out.println(x.toString()));

        Predicate<Human> filterByAge = x -> x.getAge() > 20;
        stream = arr.stream();
        System.out.println("ФИЛЬТРАЦИЯ ПО ВОЗРАСТУ БОЛЬШЕ, ЧЕМ 20");
        stream.filter(filterByAge).forEach(x->System.out.println(x.toString()));

        stream = arr.stream();
        System.out.println("ПЕРВЫЕ 3 ЭЛЕМЕНТА СПИСКА");
        stream.limit(3).forEach(x->System.out.println(x.toString()));

        stream = arr.stream();
        System.out.println("КОНКАТЕНАЦИЯ ИМЕН В СТРОКУ ЧЕРЕЗ ПРОБЕЛ");
        String line = stream.map(x-> x.getFirstName()).collect(Collectors.joining(" "));
        System.out.println(line);
    }

}
