//客户端运行
package com.wsy5;

import java.io.*;
import java.net.*;

public class SocketDemo {
	public static void main(String[] args) {
		String str=null;
		Socket clientSocket;			//创建客户端套接字
		DataInputStream in=null;
		DataOutputStream out=null;
		try {
			clientSocket=new Socket("192.168.1.100",10);
			in=new DataInputStream(clientSocket.getInputStream());		//实例化DataInputStream对象
			out=new DataOutputStream(clientSocket.getOutputStream());
			out.writeUTF("我是客户机!!");
			int i=0;
			while(true) {
				str=in.readUTF();		//读取流中数据
				out.writeUTF(i+++""); 	//向流中写入数字
				System.out.println("客户端收到："+str); //输出信息
				Thread.sleep(1000); 		//线程休眠
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
