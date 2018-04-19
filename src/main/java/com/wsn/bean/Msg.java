package com.wsn.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	// 状态码
	private int MsgCode;
	// 状态信息
	private String Msg;
	// 用户要返回给浏览器的数据
	private Map<String, Object> info = new HashMap<String, Object>();

	public Map<String, Object> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}

	public int getMsgCode() {
		return MsgCode;
	}

	public void setMsgCode(int msgCode) {
		MsgCode = msgCode;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public static Msg success() {
		Msg result = new Msg();
		result.setMsg("success");
		result.setMsgCode(200);
		return result;
	}

	public static Msg fail() {
		Msg result = new Msg();
		result.setMsg("fail");
		result.setMsgCode(100);
		return result;
	}

	public Msg add(String key, Object value) {
		this.getInfo().put(key, value);
		return this;
	}

	@Override
	public String toString() {
		return "Msg [MsgCode=" + MsgCode + ", Msg=" + Msg + "]";
	}

}
