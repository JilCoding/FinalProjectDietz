package main;

import java.util.*;
import main.QueueEmptyException;
import main.Artist;

	public class Queue {
	   private LinkedList<Client> clientQueue;

		public Queue() { 
			this.clientQueue = new LinkedList<Client>(); //default constructor for the linked list queue
		}
		public boolean isEmpty() {
			return clientQueue.size() == 0; //is empty if the size equals 0
		}
		public int size() {
			return clientQueue.size(); //returns the size of the list using the built in library 
		}
		public Client peek() throws QueueEmptyException {
			if(clientQueue.isEmpty()) {
			throw new QueueEmptyException(); //checking to ensure it's not empty and throwing exception if is
			}
			return clientQueue.peek(); //retrieves first element in the queue
		}
		public Client dequeue() throws QueueEmptyException {
			if (this.isEmpty()) { //compares the queue to the empty method to assure that the queue isn't empty
				throw new QueueEmptyException(); //throws queue empty exception
				}
			return clientQueue.pollFirst(); //retrieves and removes the first element of the queue
		}
		public void enqueue(Client client) {
			clientQueue.add(client); //uses add from the built in library to add it to the end of the queue
		}

		public String printQueue() throws QueueEmptyException {
			String queueString = new String(); //checking to ensure it's not empty and throwing exception if is
			if (clientQueue.isEmpty()) {
				throw new QueueEmptyException();
			}
				for(Client person : clientQueue) { //appending the item as a string to the string output and storing it in the queue string variable
					queueString += person + "\n";
				}
			return queueString; //returning the string
		}
	}
