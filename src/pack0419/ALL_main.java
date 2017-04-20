package pack0419;
public class ALL_main {
public static void main(String args[]){
	Tel z = new Tel();
	Check_qq qq = new Check_qq();
	qq.main();
	z.dayin();
}
}
class Check_qq{
	public void main(){
		String ss = "0123123sd";
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
class Tel{
	String tel = "15897775722"; 	
	String s2 = tel.replaceAll("(\\d{3})\\d{4}(\\d{3})", "$1****$2");
	public void dayin(){
		System.out.println(s2);
	}	
}
