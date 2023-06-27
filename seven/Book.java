package main.java;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private Long id;
    private String title;
    private Integer price;
}
