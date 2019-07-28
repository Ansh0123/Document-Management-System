package com.geeky.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.geeky.service.SmallFileService;

/**
 * 
 * @author geeky
 * For files up-to 15MB
 *
 */

@RestController
@RequestMapping("/geeky")
public class DmsSmallFileController {
	private static final String GREETING = "Hello Welcome to Geek World of DMS!!";

	@Autowired
	private SmallFileService photoService;
	
	@GetMapping("/greeting")
	public String greetingUrl() {
		return GREETING;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/photos/add")
	public String addPhoto(@RequestParam("title") String title, @RequestParam("image") MultipartFile image, Model model)
			throws IOException {
		String id = photoService.addPhoto(title, image);
		return id;
	}

	@GetMapping("/photos/upload")
    public String uploadPhoto(Model model) {
        model.addAttribute("message", "hello");
        return "photoUpload";
    }
	
	@RequestMapping(method = RequestMethod.POST, value = "/photos/{id}")
	public String getPhoto(@PathVariable String id, Model model) {
		photoService.getPhoto(id);
		return "photos";
	}

}
