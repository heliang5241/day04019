package pack0419;

import java.util.TreeSet;

public class IP {
public static void main(String args[]){
	
	// 192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55
	String str = "192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55";
	
	 str = str.replaceAll("(\\d+)", "00$1");
	 str = str.replaceAll("0*(\\d{3})","$1");
	
	
	String[] ips = str.split(" +");
	TreeSet<String> ts = new TreeSet<String>();
	for(String ip:ips){
//		System.out.println(ip);
		ts.add(ip);
	}
	for(String ip:ts){
		System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
	}
}
}
