package main.java;

import main.java.Book;

import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {

        Book book2 = new Book(
                2L,
                "1984",
                700
        );
        Book book3 = new Book(
                3L,
                "Romeo & Juliet",
                600
        );
        Book book4 = new Book(
                4L,
                "Davitiani",
                800
        );
        List<Book> books = Arrays.asList(book2, book3, book4);

        /* List<Book> books1 = books.stream()
                .filter(b -> b.getPrice() > 600)
                .collect(Collectors.toList());

        Map<Long, String> books2 = books.stream()
                .filter(b -> b.getPrice() > 600)
                .limit(3)
                .collect(Collectors.toMap(s -> s.getId(), t -> t.getTitle()));

        System.out.println(books2);


        books.stream()
                .map(s -> s.getPrice())
                .filter(s -> s > 600)
                .map(s -> s * 2)
                .collect(Collectors.toList());

        Long count = books.stream()
                .map(s -> s.getPrice())
                .filter(s -> s > 600)
                .map(s -> s * 2)
                .count();
        System.out.println(count);

        List<Integer> titles = books.stream()
                .sorted(Comparator.comparingInt(s -> s.getPrice()))
                .map(s -> s.getPrice())
                        .collect(Collectors.toList());

        Boolean bool = books.stream()
                        .map(s -> s.getPrice())
                        .sorted(Comparator.reverseOrder())
                        .allMatch(s -> s % 9 == 0);


        System.out.println(bool); */
        List<Integer> titles = books.stream()
                .map(s -> s.getPrice())
                .distinct()
                .collect(Collectors.toList());

        
    }
}