
public class Chair {

    private String operations = "";
    private final String name;

    public Chair(String name) {
        this.name = name;
    }

    public void setOperations(String operation) {
        this.operations = this.operations + " -> " + operation;
    }

    @Override
    public String toString() {
        return name +  " == " + operations;
    }

}
