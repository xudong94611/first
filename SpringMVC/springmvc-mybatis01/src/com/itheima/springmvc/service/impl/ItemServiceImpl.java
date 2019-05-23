package com.itheima.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.mapper.ItemsMapper;
import com.itheima.springmvc.pojo.Items;
import com.itheima.springmvc.pojo.ItemsExample;
import com.itheima.springmvc.pojo.ItemsExample.Criteria;
import com.itheima.springmvc.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemsMapper itemsMapper;

	public List<Items> selectItemList() {
		List<Items> list = itemsMapper.selectByExampleWithBLOBs(null);
		return list;
	}

	public Items selectItemById(Integer id) {
		Items item = itemsMapper.selectByPrimaryKey(id);
		return item;
	}

	public void updateItem(Items item) {
		Items record = itemsMapper.selectByPrimaryKey(item.getId());
		item.setCreatetime(record.getCreatetime());
		itemsMapper.updateByPrimaryKeyWithBLOBs(item);
	}

}
