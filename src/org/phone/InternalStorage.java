package org.phone;

public class InternalStorage {
	public void processorName() {
		// TODO Auto-generated method stub
System.out.println("i7");
	}
	public void ramSize() {
		// TODO Auto-generated method stub
System.out.println("8");
	} 
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		i.processorName();
		i.ramSize();
		
		ExternalStorage e =  new ExternalStorage();
		e.size();
	
	}
}