package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.controller.UserVo;

/**
 * @RequestMapping
 * 클래스 + 핸들러(메소드)
 * @author jeongin
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/join", method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/join.jsp";
	}
	

	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		// 만약 n이라는 이름의 파라미터가 없는경우, 400 error발생
		System.out.println(name);
		return "UserController.update()";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value = "n", required=false) String name) { //required==false = n값이 없어도 에러안남

		System.out.println(name);
		return "UserController.update2()";
	}
	
	@ResponseBody
	@RequestMapping("/update3")
	public String update3(
			@RequestParam(value = "n", required=true, defaultValue="") String name,
			@RequestParam(value = "a", required=true, defaultValue="0") int age){

		System.out.println("---" + name + ":" + age);
		return "UserController.update3()";
	}
	
}
