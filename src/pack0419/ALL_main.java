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
					 System.out.println("QQ" +l+ "��ȷ");
				 }catch(NumberFormatException e){
					 System.out.println("�Ƿ��ַ�");
				 }
			  }		  
			  else{
				  System.out.println("��λ����Ϊ0");
			  }
		}
		else{	
			System.out.println("���Ȳ���ȷ");
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
