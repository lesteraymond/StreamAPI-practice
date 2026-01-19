import java.util.List;
import java.util.stream.Collectors;

public class FlatMap extends StreamAPI {

    protected FlatMap(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        List<String> flat = list
                .stream()
                .flatMap(li -> ((List<String>) li).stream())
                .collect(Collectors.toList());
        System.out.println(flat);
    }
}
