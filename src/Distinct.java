import java.util.List;

public class Distinct extends StreamAPI {

    protected Distinct(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {

        list
                .stream()
                .distinct()
                .forEach(e -> System.out.println(e));
    }

}
