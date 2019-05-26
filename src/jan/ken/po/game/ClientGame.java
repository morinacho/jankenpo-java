package jan.ken.po.game;

import java.io.*;
import java.net.*; 

public class ClientGame {
    private Socket client;
    private DataOutputStream output;
    private DataInputStream input;
    
    
    public void clientConect(String ip, int port){
        try{
            client   = new Socket(ip, port);
            input    = new DataInputStream(client.getInputStream());
            output   = new DataOutputStream(client.getOutputStream());
        }
        catch(Exception e){}
    }
    
    public void sendMessage(int message){
        try{
            output.writeInt(message);
        } 
        catch(IOException e){}
    }
    
    public int readMessage(){
        try{
            return input.readInt();
        }
        catch(IOException e){}
        return -1;
    }
    
    public void clientClose() throws IOException{
        input.close();
        output.close();   
        client.close();
    }            
}