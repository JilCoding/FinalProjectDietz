
/**
 * Class that creates an queue that the clients can be added to. This can return values from the queue
 * and prints the values out 
 * @author Jil Dietz
 * @version 1
 */
package main;

import java.util.*;
import main.QueueEmptyException;
import main.Artist;

	public class Queue {
	    private LinkedList<Client> clientQueue;
	    //default constructor for the linked list queue
		public Queue() { 
			this.clientQueue = new LinkedList<Client>(); 
		}
		//is empty if the size equals 0
		public boolean isEmpty() {
			return clientQueue.size() == 0;
		}
		//returns the size of the list using the built in library 
		public int size() {
			return clientQueue.size(); 
		}
		//checking to ensure it's not empty and throwing exception if is
		//retrieves first element in the queue
		public Client peek() throws QueueEmptyException {
			if(clientQueue.isEmpty()) {
			throw new QueueEmptyException(); 
			}
			return clientQueue.peek();
		}
		public Client dequeue() throws QueueEmptyException {
			 //compares the queue to the empty method to assure that the queue isn't empty
			if (this.isEmpty()) {
				//throws queue empty exception
				throw new QueueEmptyException(); 
				}
			//retrieves and removes the first element of the queue
			return clientQueue.pollFirst(); 
		}
		public void enqueue(Client client) {
			//uses add from the built in library to add it to the end of the queue
			clientQueue.add(client);
		}

		public String printQueue() throws QueueEmptyException {
			//checking to ensure it's not empty and throwing exception if is
			String queueString = new String(); 
			if (clientQueue.isEmpty()) {
				throw new QueueEmptyException();
			}
			//appending the item as a string to the string output and storing it in the queue string variable
				for(Client person : clientQueue) { 
					queueString += person + "\n";
				}
			//returning the string
			return queueString;
		}
	}
