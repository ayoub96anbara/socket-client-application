package com.step1;

import com.dao.Client;
import com.dao.Compte;

import java.io.*;
import java.net.Socket;

public class ClientProgram {

    private Socket socketEnd2;
    private static final int PORT = 3333;
    private InputStream input;
    private OutputStream output;

    public ClientProgram() {
        try {
            socketEnd2 = new Socket("127.0.0.1", PORT);
            // preparation du 2 flues
            input = socketEnd2.getInputStream();
            output = socketEnd2.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void getInfosCompte() {
        int num = 2;

        try {
            output.write(num);
           /* BufferedReader reader=new BufferedReader(new InputStreamReader(input));
            String msg=reader.readLine();
            System.out.println(msg);*/

            ObjectInputStream oi=new ObjectInputStream(input);
           Client client= (Client) oi.readObject();
            System.out.println(client.getNom()+" "+client.getPrenom());
            Compte compte=client.getCompte();
            System.out.println("compte: num: "+compte.getNumCompte()+" solde: "+compte.getSolde());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientProgram client = new ClientProgram();
        client.getInfosCompte();
    }
}
