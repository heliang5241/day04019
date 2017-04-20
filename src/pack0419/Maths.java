package pack0419;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maths {
    public static void main(String args[]){
    	String str = "da jia hao,ming tian bu fang jia!";
    	String regex = "\\b[a-z]{3}\\b";
    	
    	Pattern p = Pattern.compile(regex);
    	Matcher m = p.matcher(str);
    	while(m.find()){
    		System.out.println(m.group());	
    		System.out.println(m.start() + ":" + m.end());
    	}
    	
    	
    	
    }
}
