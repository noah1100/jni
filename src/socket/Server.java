package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[] args) throws  Exception {
		ServerSocket server=new ServerSocket(12345 );
		Socket socket=server.accept();
		String line;
		BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter os=new PrintWriter(socket.getOutputStream());
		BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Client:"+is.readLine());
		line=sin.readLine();
		while(!line.equals("bye")){
			os.println(line);
			os.flush();
			System.out.println("Server:"+line);
			System.out.println("Client:"+is.readLine());
			line=sin.readLine();
		}
		os.close(); //关闭Socket输出流
		is.close(); //关闭Socket输入流
		socket.close(); //关闭Socket
		server.close(); //关闭ServerSocket
	}
}
