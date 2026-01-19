import java.util.List;

public class ForEach extends StreamAPI {

    public ForEach(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {
        list
                .stream()
                .forEach(System.out::println);
    }
}
