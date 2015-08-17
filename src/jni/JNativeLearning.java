package jni;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.misc.basicStructures.HWND;
import org.xvolks.jnative.misc.basicStructures.LPARAM;
import org.xvolks.jnative.misc.basicStructures.UINT;
import org.xvolks.jnative.misc.basicStructures.WPARAM;
import org.xvolks.jnative.util.User32;

public class JNativeLearning {
	public static void main(String[] args) throws IllegalAccessException, NativeException, ParseException {
		Date date=null;
		DateFormat f = new SimpleDateFormat("yy年MM月dd日");    
		date=f.parse("05年11月05日");
		System.out.println(date);
		HWND hwnd=User32.FindWindow("Skype", "");
		 if(hwnd.getValue()>0){  
	            System.out.println("window exists");  
	            User32.SendMessage(hwnd, new UINT(0x10), new WPARAM(0), new LPARAM(0));  
	        }else{  
	            System.out.println("window doesn't exists");  
	        }  
	}
}
