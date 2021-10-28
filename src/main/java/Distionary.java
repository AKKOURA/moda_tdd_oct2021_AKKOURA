import java.util.Map;

public class Distionary {
   private String name;
    Map<String, String> translations;

    public Distionary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return name.isEmpty() ? true :false;
    }

    public String getTranslation(String contre) {
        return "";
    }

    public void addTranslation(String contre, String against) {
    }
}
