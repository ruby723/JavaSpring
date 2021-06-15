package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping
 * 메소드 단독 매핑
 * 
 * @author jeongin
 *
 */

@Controller
public class Boradcontroller {

	@ResponseBody //바로 브러우저에 찍을 수 있음
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController:write";
	}
	
	@ResponseBody //바로 브러우저에 찍을 수 있음
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable("no") Long boardNo) {
		return "BoardController:view(" + boardNo + ")";
	}
}
