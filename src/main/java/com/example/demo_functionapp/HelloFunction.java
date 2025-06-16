@Component
public class HelloFunction implements Function<String, String> {
    @Override
    public String apply(String input) {
        return "Hello " + input;
    }
}

