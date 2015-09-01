package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
public static void main(String[] args) {
	try {
		Socket s=new Socket("127.0.0.1",12345);
		BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os=new PrintWriter(s.getOutputStream());
		BufferedReader is=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String readline;
		readline=sin.readLine();
		while(!readline.equals("bye")){
			os.println(readline);
			os.flush();
			System.out.println("Client:"+readline);
			System.out.println("Server:"+is.readLine());
			readline=sin.readLine();
			
		}
		os.close(); //关闭Socket输出流

		is.close(); //关闭Socket输入流

		s.close(); //关闭Socket
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
