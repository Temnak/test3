import com.google.gson.Gson;
import model.Values;

import java.io.FileReader;

public class ValuesParser {
    public Values parse() {

        Gson gson = new Gson();
        Values values = new Values();
        try (FileReader reader = new FileReader("values.json")) {
            values = gson.fromJson(reader,values.getClass());
        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return values;
    }
}
