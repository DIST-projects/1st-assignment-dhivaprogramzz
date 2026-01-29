import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Simple server messages, no real IP
            System.out.println("RMI Server running...");
            System.out.println("Performing addition of 10, 20...");

            AdderImpl obj = new AdderImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("AdderService", obj);

            System.out.println("Server ready to accept client requests...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
