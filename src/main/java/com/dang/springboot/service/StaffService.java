package com.dang.springboot.service;

import com.dang.springboot.pojo.StaffInfo;

public interface StaffService {

	StaffInfo selectByIdAndPwd(String userId, String passWord);

}
