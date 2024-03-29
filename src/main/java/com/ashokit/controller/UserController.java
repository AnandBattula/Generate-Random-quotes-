package com.ashokit.controller;

import java.util.Map;

import org.springframework.ui.Model;

import com.ashokit.binding.LoginForm;
import com.ashokit.binding.RegisterForm;
import com.ashokit.binding.ResetPwdForm;

public class UserController {

	public String index(Model model) {
		return null;
		
	}
	
	public String login(LoginForm form, Model model) {
		return null;
		
	}
	
	public String register(Model model) {
		return null;
		
	}
	
	public String resetPwd(Model model) {
		return null;
		
	}
	
	public Map<Integer, String> loadStates(Integer cid){
		return null;
		
	}
	
	public Map<Integer, String> loadCities(Integer sid){
		return null;
		
	}
	
	public String userRegister(RegisterForm form, Model model) {
		return null;
		
	}
	
	public String updatePwd(ResetPwdForm form, Model model) {
		return null;
		
	}
	
	public String logout(Model model) {
		return null;
		
	}
}
