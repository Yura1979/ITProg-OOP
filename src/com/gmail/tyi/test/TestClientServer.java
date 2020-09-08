package com.gmail.tyi.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TestClientServer {
	
	public static void main(String[] args) {
		//Server
				new Thread(new Runnable() {
					
					@Override
					public void run() {

						try {
							while (true) {
								ServerSocket server = new ServerSocket(8888);
								Socket s = server.accept();
								ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
								String str = (String) ois.readObject();
								System.out.println("Server: " + str);
								ois.close();
								server.close();
								if ("exit".equals(str)) {
									break;
								}
							}
						} catch (IOException | ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}).start();
				
				
				try {
					while (true) {
						Socket socket = new Socket("localhost", 8888);
						System.out.println("Enter your message: ");
						String message = new Scanner(System.in).nextLine();
						ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
						oos.writeObject(message);
						
						oos.close();
						socket.close();
						
						if ("exit".equals(message)) {
							break;
						}
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
