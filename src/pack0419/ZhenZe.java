package pack0419;

public class ZhenZe {
public static void main(String args[]){
	String str = "[1-9][0-9]{4,15}";
	String qq = "2313131111111";
	//System.out.println(qq.length());
	if(qq.matches(str)){
		System.out.println("ok");
	}else{
		System.out.println("bad");
	}
}
}
