import java.util.List;
import java.util.stream.Collectors;

public class Reducing extends StreamAPI {

    protected Reducing(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {

        int sum = (int) list
                .stream()
                .collect(Collectors.reducing(0, (base, currentElement) -> (int) base + (int) currentElement));

        System.out.println(sum);
    }

}
