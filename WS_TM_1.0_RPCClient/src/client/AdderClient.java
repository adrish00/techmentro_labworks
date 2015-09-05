package client;

import java.util.Vector;

import org.apache.xmlrpc.XmlRpcClient;

public class AdderClient {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			 for(int j=0;j<10;j++){
			     XmlRpcClient server = new XmlRpcClient("http://localhost:5050"); 
			     Vector params = new Vector();
			     params.addElement(new Integer(5));
			     params.addElement(new Integer(10));
			     for(int i = 0 ;i<10;i++){
				     Object result = server.execute("adder.add", params);
				     int sum = ((Integer) result).intValue();
				     System.out.println("Client "+(j+1)+ " Request "+(i+1));
				     System.out.println("The sum is: "+ sum);
			     }
			 }

		   } catch (Exception exception) {
		     System.err.println(exception);
		   }

	}

}
