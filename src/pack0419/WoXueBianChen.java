package pack0419;

public class WoXueBianChen {
 public static void main(String args[]){
	 
	 String str ="我.....我...我..我.....要要要...要..要要要要要..要....学学....学学....学学学学学学...编...编编编.....程程程程.程..程程..程程程..";
	 str =str.replaceAll("\\.", "");
	 System.out.println(str);
	 str =str.replaceAll("(.)\\1+", "$1");
	 System.out.println(str);
 }
}
;