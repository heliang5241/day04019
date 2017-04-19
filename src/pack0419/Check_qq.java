package pack0419;

public class Check_qq {
	/*长度5-15
	 * 必须是纯数字
	 * 首位不能为0
	 */
public static void main(String args[]){
	String ss = "123123sd";
	if(ss.length() >=5 && ss.length() <=15){
		  if(!ss.startsWith("0")){
			 
			 try{
				 long l = Long.parseLong(ss);
				 System.out.println("QQ" +l+ "正确");
			 }catch(NumberFormatException e){
				 System.out.println("非法字符");
			 }
		  }
		  
		  else{
			  System.out.println("首位不能为0");
		  }
	}
	else{
		
		System.out.println("长度不正确");
	}
}
}
