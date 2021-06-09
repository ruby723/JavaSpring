package com.douzone.fileupload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadController {

	@RequestMapping({"","/form"})
	public String form() {
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping(value = "/upload",method=RequestMethod.POST)
	public String upload(
			@RequestParam("file1") MultipartFile file) {
		return "/WEB-INF/views/result.jsp";
	}
}
