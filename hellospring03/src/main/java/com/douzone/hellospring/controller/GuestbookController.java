package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RequestMapping
 * 클래스(타입) 단독매핑
 * @author jeongin
 *
 */

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:list";
	}
		
	@ResponseBody //바로 브러우저에 찍을 수 있음
	@RequestMapping
	public String delete() {
		return "BoardController:delete";
	}

}
