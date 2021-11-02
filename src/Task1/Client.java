package Task1;

public class Client {
    int priority;
    String clientName;

    public Client(int priority, String clientName) {
        this.priority = priority;
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return clientName + " ";
    }
}
