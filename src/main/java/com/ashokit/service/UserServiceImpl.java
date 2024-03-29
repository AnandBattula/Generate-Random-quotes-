package com.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.Entity.User;
import com.ashokit.binding.LoginForm;
import com.ashokit.binding.RegisterForm;
import com.ashokit.binding.ResetPwdForm;
import com.ashokit.repository.CountryRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private CountryRepo countryRepo;
	@Override
	public Map<Integer, String> getCountries() {
		return null;

		
	}

	@Override
	public Map<Integer, String> getStates(Integer counterId) {
		
		
		return null;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(RegisterForm formObj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User login(LoginForm formObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetPwd(ResetPwdForm formObj) {
		// TODO Auto-generated method stub
		return false;
	}

}
