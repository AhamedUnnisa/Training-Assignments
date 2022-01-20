package LambdaDemo;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToString {
    public static void main(String[] cmd_lineParams) {
        Map<String, String> map = new HashMap<>(5);
        map.put("Rahima", "1234");
        map.put("Shaima", "2345");
        map.put("Gousia", "3456");
        map.put("Jani", "4567");
        map.put("Aslam", "5678");
        String s = map.entrySet().stream().map((entry) ->
                        "" + entry.getKey() + " \"" + entry.getValue().replaceAll("\"", "\\\\\"") + "\"")
                .collect(Collectors.joining(" "));
        System.out.println(s);

    }
}
