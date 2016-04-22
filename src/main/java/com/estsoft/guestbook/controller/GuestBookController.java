package com.estsoft.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.estsoft.guestbook.dao.GuestBookDao;
import com.estsoft.guestbook.vo.GuestBookVo;
@Controller
public class GuestBookController {
	
	@Autowired
	private GuestBookDao dao;
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<GuestBookVo> list = dao.getList();
/*		for (GuestBookVo vo : list) {
			System.out.println(vo);
		}*/

		model.addAttribute("list", list);

		return "/WEB-INF/views/index.jsp";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute GuestBookVo vo) {
		dao.insert(vo);	
		System.out.println("new add!!!!!!");
		return "redirect:/index";
	}
	
	@RequestMapping("/deleteform")
	public String deleteform() {
	//	model.addAttribute("id",no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@ModelAttribute GuestBookVo vo) {
		dao.delete(vo);	
		return "redirect:/index";
	}

}



/*




*/