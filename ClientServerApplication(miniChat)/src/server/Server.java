/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author mcamock
 */
public class Server {
  public Server()
  {
    try   
    {
        ServerSocket ss = new ServerSocket(3000); //Create a server socket
        Socket s = ss.accept(); //Create a simple socket
        System.out.println("Server is listening...");
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String str2;
        do
        {
            str2 = sc.nextLine(); //Accepting a string from the client
            dout.writeUTF(str2); //This line convert string into
            System.out.println("Client says: "+din.readUTF());
        } while(!str2.equals("exit"));
        ss.close(); //closing server socket
    }
  catch(Exception ex)  
  {
      ex.printStackTrace();
  }
}
    public static void main(String[] args)
    {
        Server myServer = new Server();
    }
}
