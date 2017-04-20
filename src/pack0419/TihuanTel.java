package pack0419;

public class TihuanTel {
public static void main(String args[]){
	String ss = "15897775722";
    String s1 =ss.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
    System.out.println(s1);
    
}
}
