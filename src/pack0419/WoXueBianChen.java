package pack0419;

public class WoXueBianChen {
 public static void main(String args[]){
	 
	 String str ="��.....��...��..��.....ҪҪҪ...Ҫ..ҪҪҪҪҪ..Ҫ....ѧѧ....ѧѧ....ѧѧѧѧѧѧ...��...����.....�̳̳̳�.��..�̳�..�̳̳�..";
	 str =str.replaceAll("\\.", "");
	 System.out.println(str);
	 str =str.replaceAll("(.)\\1+", "$1");
	 System.out.println(str);
 }
}
;