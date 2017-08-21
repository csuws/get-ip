//服务器端运行
package com.wsy5;

import java.io.*;
import java.net.*;

public class ServerSocketDemo {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket=null;		//创建服务器端套字
			Socket clientSocket=null;			//创建客户端套字
			String str=null;
			DataOutputStream out=null;			//创建DataOutputStream类对象
			DataInputStream in=null;			//创建DataInputStream类对象
			serverSocket=new ServerSocket(10);	//实例化套接字对象
			System.out.println("等待与客户机的连接！！");	
			clientSocket=serverSocket.accept();//接受客户连接呼叫
			in=new DataInputStream(clientSocket.getInputStream());		//实例化DataInputStream对象
			out=new DataOutputStream(clientSocket.getOutputStream());	
			while(true) {
				str=in.readUTF();			//读取客户放入连接中的信息
				out.writeUTF(str); 
				System.out.println("服务器收到："+str);
				Thread.sleep(1000); 		//线程休眠
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
