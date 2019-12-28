package com.dang.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dang.springboot.mapper.StaffInfoMapper;
import com.dang.springboot.pojo.StaffInfo;
import com.dang.springboot.pojo.StaffInfoExample;
import com.dang.springboot.service.StaffService;
import com.dang.springboot.utils.LoginException;

@Service
public class StaffServiceImp implements StaffService{

	@Autowired
	private StaffInfoMapper staffInfoMapper;
	
	@Override
	public StaffInfo selectByIdAndPwd(String userId, String passWord) {
		
		StaffInfoExample example = new StaffInfoExample();
		
		example.createCriteria().andStaffNumberEqualTo(userId).andStaffPasswordEqualTo(passWord);
		
		List<StaffInfo> list = staffInfoMapper.selectByExample(example);
		
		if(list != null && list.size() > 0 ) {
			return list.get(0);
		}else {
			throw new LoginException("用户名/密码错误！");
		}
		
	}

}
