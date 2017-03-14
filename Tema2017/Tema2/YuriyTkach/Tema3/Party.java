package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача в классе Main
 * Класс Партнер (Участник сделки)
 * Created by User on 31.01.2017.
 */
public class Party {
    private String name;
    private String address;
    // к задаче 4
    //private String[] keys;
    //private String[] values;
    // к задаче 5
    private final Map <String, String> properties = new HashMap<String, String>();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    // к задаче 4
    /*
    public void setKeys(String[] keys) {
        this.keys = keys;
    }
    public String[] getKeys() {
        return keys;
    }

    public void setVal1ues(String[] values) {
        this.values = values;
    }
    public String[] getValues() {
        return values;
    }
    */

   // К задаче 5
    public Map<String, String> getProperties() {
        return properties;
    }
}
