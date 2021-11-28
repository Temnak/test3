import com.google.gson.Gson;
import model.Test;
import model.Tests;
import model.Values;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //парсим test.json
        Tests tests = new Tests();
        TestParser parser = new TestParser();
        tests = parser.parse();

        //парсим values.json
        Values values = new Values();
        ValuesParser valuesParser = new ValuesParser();
        values = valuesParser.parse();


        Map<Long, String> valuesMap = values.getValuesMap();
        //запонляем поля value
        ArrayList<Test> arrayTest = tests.getTests();
        fillValue(valuesMap, arrayTest);
        tests.setTests(arrayTest);

        //создаем report.json и заполняем его
        try {
            File file = new File("report.json");
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
            bw.write(new Gson().toJson(tests));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void fillValue(Map<Long, String> valuesMap, ArrayList<Test> arrayTest) {
        for (Test item : arrayTest) {
            item.setValue(valuesMap.get(item.getId()));
            if (item.getValues() != null) {
                fillValue(valuesMap, item.getValues());
            }
        }
    }
}
