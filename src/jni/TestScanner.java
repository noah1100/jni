package jni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc=new Scanner(new FileReader(new File("d:/tmp/2.txt" )));
			System.out.println(sc.hasNextLine());
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sc.close();
		}
		
	}
}
