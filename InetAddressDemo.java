//获取ip

package com.wsy5;
import java.net.*;

public class InetAddressDemo {
	public static void main(String[] args) {
		InetAddress intAddress;			//创建InetAddress对象
	
	try {											//try语句块捕捉可能出现的异常
		intAddress=InetAddress.getLocalHost();		//实例化对象
		String localname= intAddress.getHostName();	//获取本机名
		String localip= intAddress.getHostAddress();	//获取本机ip
		System.out.println("本机名："+localname);		//将本机名输出
		System.out.println("本机IP地址："+localip);		//将本机IP地址输出
		
	}catch(UnknownHostException e) {
		e.printStackTrace(); 		//输出异常信息
	}
 }

}
