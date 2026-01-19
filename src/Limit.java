import java.util.List;

public class Limit extends StreamAPI {

    protected Limit(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        list
                .stream()
                .limit(3)
                .forEach(System.out::println);
    }

}
