package pack0419;

public class Check_qq {
	/*����5-15
	 * �����Ǵ�����
	 * ��λ����Ϊ0
	 */
public static void main(String args[]){
	String ss = "123123sd";
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
