package pack0419;

public class Zenze02 {
public static void main(String args[]){
	
	//String s1 = "420704198510125793";
	//  \\d{3}\\d{4}\\d{4}  
	//String s2 = s1.replaceAll("(\\d{6})\\d{8}(\\d{4})", "$1******$2");
	//System.out.println(s2);
	String str = "zhangsanttttttttxiaoqiangmmmmmmmzhaoliuddddjkok";
	String[] str2 = str.split("(.)\\1+");
	String str3 = str.replaceAll("(.)\\1+","$1");
	String tel = "15897775722";
	//for(int i=0;i<str.length();i++){
		// System.out.println(str2[i]);
	//}
//	for(String name: str2){
//	System.out.println(name);
//	}
    String tel2 =tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    System.out.println(tel2);
	
 	
}
}
