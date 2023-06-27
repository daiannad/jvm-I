import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(150);
        numbers.add(200);
        numbers.add(250);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        numbers.forEach(s -> {
            System.out.println(s);
        });

        Consumer<Integer> ref = (s) -> System.out.println(s);
        numbers.forEach(ref);

        StringFormat stringFormat = (s) -> s+"!";
        printFormattedString("name", stringFormat);

    }

    private static void printFormattedString(String str, StringFormat format){
        String result = format.run(str);
        System.out.println(result);
    }


}