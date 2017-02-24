package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

/**
 * Задача в классе Main
 * Класс Партнер (Участник сделки)
 * Created by User on 31.01.2017.
 */
public class Party {
    private String name;
    private String address;
    private String[] keys;
    private String[] values;

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

    public void setKeys(String[] keys) {
        this.keys = keys;
    }
    public String[] getKeys() {
        return keys;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
    public String[] getValues() {
        return values;
    }
}
