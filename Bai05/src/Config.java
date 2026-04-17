import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Config implements Cloneable{
    private String name;
    private List<String> logHistory;
    public Config(String name, List<String> logHistory){
        this.name = name;
        this.logHistory = new ArrayList<>(logHistory);
    }
    @Override
    public Config clone() {
        try {
            Config cloned = (Config) super.clone();
            cloned.logHistory = new ArrayList<>(this.logHistory);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Class does not cloneable");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLogHistory(String log) {
        this.logHistory.add(log);
    }

    @Override
    public String toString() {
        return "Name: " + name + " | LogHistory: " +logHistory;
    }
}
