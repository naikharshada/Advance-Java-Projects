/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author mcamock
 */
public class Client {
    public Client()
    {
        try
        {
            Socket cSocket = new Socket("127.0.0.1", 3000); //first parameter is ip address and second 
             // is server packet
            DataInputStream din = new DataInputStream(cSocket.getInputStream());
            DataOutputStream dout = new DataOutputStream(cSocket.getOutputStream());
            String str1 ="";
            Scanner sc = new Scanner(System.in);
            while(!str1.equals("exit"))
            {
                System.out.println("Server says: "+din.readUTF());        
                str1 = sc.nextLine();
                dout.writeUTF(str1);
            }
            cSocket.close(); //closing the socket
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        Client myClient = new Client();
    }
}
