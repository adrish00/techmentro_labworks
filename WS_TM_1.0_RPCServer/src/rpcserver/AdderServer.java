package rpcserver;

import org.apache.xmlrpc.*;

public class AdderServer {

	public static void main(String[] args) {
			try {
		
				// Start the server, using built-in version
				System.out.println("Attempting to start XML-RPC Server...");
				WebServer server = new WebServer(5050);
				System.out.println("Started successfully.");
				// Register our handler class as area
				server.addHandler("adder", new Adder());
				server.start();
				System.out.println("Registered Adder as a service to the Server.");
				System.out.println("Server is ready to receive request, press ctrl+c to terminate.");
			} 
			catch (Exception e) {
			System.out.println("Could not start server: " +
			e.getMessage( ));
			}
			}
			


	}


