package model;

import java.util.ArrayList;

public class Test {
    long id;
    String title;
    String value;
    ArrayList<Test> values;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<Test> getValues() {
        return values;
    }

    public void setValues(ArrayList<Test> values) {
        this.values = values;
    }
}
