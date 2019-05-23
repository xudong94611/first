package com.itheima.springmvc.service;

import java.util.List;

import com.itheima.springmvc.pojo.Items;

public interface ItemService {
	List<Items> selectItemList();

	Items selectItemById(Integer id);

	void updateItem(Items item);
}
