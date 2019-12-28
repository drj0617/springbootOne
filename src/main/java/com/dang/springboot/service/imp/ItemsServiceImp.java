package com.dang.springboot.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dang.springboot.mapper.ItemsMapper;
import com.dang.springboot.pojo.Items;
import com.dang.springboot.service.ItemsService;
@Service
public class ItemsServiceImp implements ItemsService{

	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public Items selectById(int id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

}
