package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Values {
        ArrayList<Value> values;

    public Map<Long, String> getValuesMap() {
        Map<Long, String> valuesMap = new HashMap<>();
        for (Value value : values) {
            valuesMap.put(value.id, value.value);
        }
        return valuesMap;
    }

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }
}
