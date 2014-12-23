package com.freedom.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
	/*
	 * 用户的基本信息
	 */
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "zhangsan");
		baseInfoMap.put("mobileNumber", "13821243123");
		return baseInfoMap;
	}

	/*
	 * 员工的家庭信息
	 */
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumbner", "2143143");
		homeInfo.put("homeAddress", "天河");
		return homeInfo;
	}

	/*
	 * 员工的工作信息，比如职位了等
	 */
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "CEO");
		officeInfo.put("officeTelNumber", "3243212");
		return officeInfo;
	}
}
