package com.Basic;

public class Message {
 private void printer(String message, String sender) {
	System.out.println(message+ sender);
	}
 private void printer(String message1) {
	System.out.println("Broadcast message :"+message1);
}
public static void main (String[] args) {
	Message a= new Message();
	a.printer("Room-mate","Bring me two of eggs");
	a.printer("Good Morning India.");
}

}
