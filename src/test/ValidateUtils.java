package test;

import org.apache.commons.lang.StringUtils;
/**
 * 页面传来的值验证
 * @author zxs
 *
 */
public class ValidateUtils {
	public static boolean isNumber(String str,int defaultLength){
		boolean f=true;
		if(StringUtils.isNotBlank(str)&&str.length()>defaultLength){
			f=false;
		}else{
			try {
				Integer.parseInt(str);
			} catch (Exception e) {
				f=false;
			}
		}
		
		return f ;
	}
	public static void main(String[] args) {
		System.out.println(isNumber("12123", 2));
	}
}
