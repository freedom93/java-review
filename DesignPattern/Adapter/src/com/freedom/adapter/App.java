package com.freedom.adapter;

public class App {
	public static void main(String[] args) {
		// 没有与外系统连接的时候，是这样写的
		//IUserInfo user = new UserInfo();
		//与外系统连接的时候，只修改了这一句
		IUserInfo user = new OuterUserInfo(); 
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			user.getMobileNumber();
		}
	}
}
