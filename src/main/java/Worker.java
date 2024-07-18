import java.util.ArrayList;
import java.util.List;

class Worker {
    private String name;
    private List<Worker> subordinates;

    public Worker(String name) {
        this.name = name;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Worker subordinate) {
        subordinates.add(subordinate);
    }

    public String getName() {
        return name;
    }

    public List<Worker> getSubordinates() {
        return subordinates;
    }
}
