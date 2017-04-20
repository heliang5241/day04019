package pack0419;

public class Mail2 {
public static void main(String args[]){
	String mail = "heliang520cn@163.com.cn";
	String del = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
	boolean a = mail.matches(del);
	System.out.println(a);
}
}
