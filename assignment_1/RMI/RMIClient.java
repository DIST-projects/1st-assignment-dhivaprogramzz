import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Replace with ngrok forwarding host and port
            Registry registry = LocateRegistry.getRegistry("0.tcp.ngrok.io", 12345);
            Adder stub = (Adder) registry.lookup("AdderService");
            System.out.println("Result: " + stub.add(10, 20));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
