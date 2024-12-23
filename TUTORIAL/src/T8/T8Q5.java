package T8;

public class T8Q5 {
    public static void main(String[] args) {
        // Create Connection objects to establish connections
        Connection conn1 = new Connection();
        Connection conn2 = new Connection();
        Connection conn3 = new Connection();

        // Display the number of active connections
        conn1.displayConnections();

        // Disconnect one connection
        conn1.disconnect();
        conn1.displayConnections();

        // Disconnect another connection
        conn2.disconnect();
        conn3.displayConnections();
    }
}

class Connection {
    // Static variable to keep track of the number of connections
    private static int connectionCount = 0;

    // Constructor: Increments the connection count when a new object is created
    public Connection() {
        connectionCount++;
    }

    // Method to disconnect: Decrements the connection count
    public void disconnect() {
        if (connectionCount > 0) {
            connectionCount--;
            System.out.println("Connection disconnected.");
        } else {
            System.out.println("No active connections to disconnect.");
        }
    }

    // Method to display the current number of connections
    public void displayConnections() {
        System.out.println("Active Connections: " + connectionCount);
    }
}
