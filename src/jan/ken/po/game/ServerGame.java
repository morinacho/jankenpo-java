package jan.ken.po.game;

import java.io.*;
import java.net.*;

public class ServerGame {
    private ServerSocket server;
    private Socket socket;
    private DataOutputStream output;
    private DataInputStream input;
    
    public void serverConect(int port){
        try{
            server = new ServerSocket(port);
            socket = new Socket();
            socket = server.accept();
            
            this.output = new DataOutputStream(socket.getOutputStream());
            this.input  = new DataInputStream(socket.getInputStream());
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
    
    public void serverClose() throws IOException{
        input.close();
        output.close();
        server.close();
        socket.close();
    } 
}