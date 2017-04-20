package pack0419;

public class Zu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str1 = "a11f222d444awedf99ok";
       String[] str2 = str1.split("(.)\\1");
       
    for(String name:str2)
       System.out.println(name);
	}

}
