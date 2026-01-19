import java.util.List;

public class Sorted extends StreamAPI {

    protected Sorted(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        list
                .stream()
                .sorted((a, b) -> ((int) b - (int) a))
                .forEach(System.out::println);
    }

}
