package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {

	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private Map<String, Object> session;
	private UserListDAO dao = new UserListDAO();


	public String execute(){

		String ret = ERROR;

		userList = dao.select();

		if(userList.size() > 0){

			session.put("userList", userList);
			ret = SUCCESS;

		} else {

			ret = ERROR;
		}
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
