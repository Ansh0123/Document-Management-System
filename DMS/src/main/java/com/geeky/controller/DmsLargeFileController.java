package com.geeky.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class DmsLargeFileController {

	@RequestMapping(method = RequestMethod.POST, value = "/videos/add")
	public String addVideo(@RequestParam("title") String title, @RequestParam("file") MultipartFile file, Model model)
			throws IOException {
		return "redirect:/videos/";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/videos/{id}")
	public String getVideo(@PathVariable String id, Model model) throws Exception {
		return "videos";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/videos/stream/{id}")
	public void streamVideo(@PathVariable String id, HttpServletResponse response) throws Exception {
	}
}
