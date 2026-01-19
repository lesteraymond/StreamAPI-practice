import java.util.List;

public class Map extends StreamAPI {

    public Map(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        list
                .stream()
                .map(e -> ((String) e).toUpperCase())
                .forEach(System.out::println);

    }
}