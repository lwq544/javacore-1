package com.wpx.demo16;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo02Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//����tcp�ķ���
		Socket s=new Socket("127.0.0.1",8888);
		//��ȡ��Socket�����������
		OutputStream outputStream = s.getOutputStream();
		//��ͻ��˷�����Ϣ
		outputStream.write("��ÿͻ���".getBytes());
		outputStream.flush();
		outputStream.close();
		s.close();
	}
}