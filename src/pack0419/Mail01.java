package pack0419;

public class Mail01 {
public static void main(String args[]){
	String mail = "asdc@sina.com.cn.cn";
	String str = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
  //String del = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
	boolean b = mail.matches(str);
	System.out.println(b);
}
}
