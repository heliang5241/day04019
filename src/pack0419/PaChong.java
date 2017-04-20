package pack0419;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChong {
public static void main(String args[]) throws Exception {
	List<String> list =getMails();
	for(String mail:list){
		System.out.println(mail);
	}
	
}
	public static List<String> getMails() throws Exception{
	String exp ="\\w+@\\w+(\\.\\w+)+"; 
	List<String> list = new ArrayList<String>();
	BufferedReader bu = new BufferedReader(new FileReader("c:\\天喻简介 — 天喻信息.html"));
	Pattern p = Pattern.compile(exp);
	String line =null;
	while((line=bu.readLine())!=null){
		Matcher m =p.matcher(line);
		while(m.find()){
			list.add(m.group());
		}
	}
	return list;
}
	
	public static List<String> getMails2() throws Exception{
	String exp ="\\w+@\\w+(\\.\\w+)+"; 
	List<String> list = new ArrayList<String>();
	URL url = new URL("http://www.weather.com.cn/weather/101020100.shtml");
	BufferedReader bufIn = new BufferedReader(new InputStreamReader(url.openStream()));
	Pattern p = Pattern.compile(exp);
	String line =null;
	while((line=bufIn.readLine())!=null){
		Matcher m =p.matcher(line);
		while(m.find()){
			list.add(m.group());
		}
	}
	
	return list;
}
}