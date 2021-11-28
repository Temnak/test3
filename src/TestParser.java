import com.google.gson.Gson;
import model.Tests;

import java.io.FileReader;

public class TestParser {
    public Tests parse() {

        Gson gson = new Gson();
        Tests tests = new Tests();
        try (FileReader reader = new FileReader("tests.json")) {
            tests = gson.fromJson(reader,tests.getClass());
        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }


        return tests;
    }
}
