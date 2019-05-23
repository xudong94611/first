package com.itheima.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.pojo.Items;
import com.itheima.springmvc.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	ItemService itemService;

	@RequestMapping("/item/itemlist.action")
	public ModelAndView itemList() {
		ModelAndView modelAndView = new ModelAndView();
		List<Items> list = itemService.selectItemList();
		modelAndView.addObject("itemList", list);
		modelAndView.setViewName("itemList");
		return modelAndView;
	}

	/*
	 * @RequestMapping("/itemEdit.action") public ModelAndView
	 * editItem(HttpServletRequest request, HttpServletResponse response,
	 * HttpSession session, Model model) { ModelAndView modelAndView = new
	 * ModelAndView(); String id = request.getParameter("id"); Items item =
	 * itemService.selectItemById(Integer.valueOf(id));
	 * modelAndView.addObject("item", item); modelAndView.setViewName("editItem");
	 * return modelAndView; }
	 */

	@RequestMapping("/itemEdit.action")
	public ModelAndView editItem(Integer id) { // 可以自动完成类型转换。@RequestParam可以不写，在参数名和形参名不一样时可以写这个标签来表面。
		ModelAndView modelAndView = new ModelAndView();
		Items item = itemService.selectItemById(id);
		modelAndView.addObject("item", item);
		modelAndView.setViewName("editItem");
		return modelAndView;
	}

	@RequestMapping("/updateitem.action")
	public String updateItem(Items item) {
		itemService.updateItem(item);
		return "redirect:/item/itemlist.action";
		// return "forward:/item/itemlist.action";
	}

}
