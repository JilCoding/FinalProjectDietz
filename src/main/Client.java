package main;

public class Client {

	private String name;
	private String email;
	private String request;
	//private int priority;
	public Client() {
		
	}
	public Client(String name, String email, String request) {
		this.name = name;
		this.email = email;
		this.request = request;
		//p = priority;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getRequest() {
		return request;
	}
	public static Queue setupClient(){
		Queue currentClients =  new Queue();
		currentClients.enqueue(new Client("Roberto Frances", "RobbieFran@email.com", "Paintings"));
		currentClients.enqueue(new Client("Risa Korgin", "RiKorg@email.com", "sketching"));
		currentClients.enqueue(new Client("Jennifer Riecs", "JRiCs@email.com", "Portraits"));
		return currentClients;
	}
	public String toString() {
		return "Name: " + name + " Email: " + email + " Request: " + request;
	}
}
