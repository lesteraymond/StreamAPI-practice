import java.util.List;
import java.util.stream.Collectors;

public class Collect extends StreamAPI {

    protected Collect(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        List<Integer> oddList = (List<Integer>) list
                .stream()
                .filter(e -> ((int) e) % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(oddList);
    }
}
