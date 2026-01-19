import java.util.List;

public class Peek extends StreamAPI {

    protected Peek(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {

        list
                .stream()
                .map(e -> (int) e)
                .filter(e -> e % 2 == 0)
                .peek(e -> System.out.println("Even number: " + e))
                .forEach(System.out::println);

    }

}
