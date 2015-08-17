package jni;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		long start=new Date().getTime();
		int a= 0,b = 0,c= 0,d= 0,e= 0,f= 0,g= 0,h= 0;
		int max=12;
		OK:
		for( a=0;a<max;a ++){
			for(b=0;b<max;b++){
				for(  c=0;c<max;c++){
					for(  d=0;d<max;d++){
						for(  e=0;e<max;e++){
							for(f=1;f<=max;f++){
								for(g=0;g<max;g++){
									for( h=0;h<max;h++){
										double ad=a,cd=c,fd=f;
										if( (ad+cd/fd==4)&&(a+b-9==4)&&(b-(d*g)==4)&&(9-e-h==4)&&(c-(d*e)==4)&&(f+g-h==4)) {
											System.out.println("完成计算！");
											break OK;
										}else{
											
										}
									}
								}
							}
						}
					}
				}
			}
		}if(a==max&&b==max&&c==max&&d==max&&e==max&&f==max+1&&g==max&&h==max){
			System.out.println(max+"以内有问题，无法计算");
		}
		System.out.println(a+"+"+b+"-9=4");
		System.out.println("+ -  -");
		System.out.println(c+"-"+d+"×"+e+"=4");
		System.out.println("÷ × -");
		System.out.println(f+"+"+g+"-"+h+"=4");
		System.out.println("= = =");
		System.out.println("4 4 4");
		long end=new Date().getTime();
		System.out.println("用时："+(end-start)+"ms");
	}
}
