import java.util.List;

public class Filter extends StreamAPI {

    protected Filter(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        list
                .stream()
                .filter(e -> ((int) e) % 2 == 0)
                .forEach(System.out::println);
    }
}
