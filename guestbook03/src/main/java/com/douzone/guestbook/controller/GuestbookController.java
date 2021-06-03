package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestbookRepository;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller 
public class GuestbookController {

	@Autowired
	private GuestbookRepository guestbookRepository;
	private int count=1;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);
		model.addAttribute("count",count);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value = "/deleteform/{no}",method = RequestMethod.GET)
	public String deleteform(@PathVariable(name="no") Long no,Model model) {
		
		model.addAttribute("no",no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(Long no,String password) {
		guestbookRepository.delete(no, password);
		return "redirect:/";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo vo) {
		guestbookRepository.insert(vo);
		return "redirect:/";
	}
}
