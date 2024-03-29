package com.ashokit.service;

import java.util.Map;

import com.ashokit.Entity.User;
import com.ashokit.binding.LoginForm;
import com.ashokit.binding.RegisterForm;
import com.ashokit.binding.ResetPwdForm;

public interface UserService {
	
	public Map<Integer, String> getCountries();
	
	public Map<Integer, String> getStates(Integer counterId);
	
	public Map<Integer, String> getCities(Integer stateId);
	
	public User getUser(String email);
	
	public boolean saveUser(RegisterForm formObj);
	
	public User login(LoginForm formObj);
	
	public boolean resetPwd(ResetPwdForm formObj);
	
	private String generatePwd() {
		return null;
	}

}
