package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
           ServerSocket server = new ServerSocket(3000);

           System.out.println("il server è in ascolto");
           Socket s = server.accept();

            
           BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
           DataOutputStream out = new DataOutputStream(s.getOutputStream());

           String frase = in.readLine();
           frase = frase.toUpperCase();
           System.out.println("li server invia: "+frase);
           out.writeBytes(frase + "\n");

            s.close();
            server.close();

        server.accept();  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

    }
}
