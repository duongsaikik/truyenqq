package truyenQQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import truyenQQ.modem.catogoryDTO;
import truyenQQ.modem.storyDTO;
import truyenQQ.service.impl.INewCategory;
import truyenQQ.service.impl.INewStory;

@RestController
public class apiCatogoryCT {

	@Autowired
	private INewCategory service;
	
	@Autowired
	private INewStory serviceStory;
	
	@PostMapping("/category")
	public catogoryDTO createCategory(@RequestBody catogoryDTO category) {	
		return service.save(category);
	}
	@PostMapping("/truyen")
	public storyDTO getAllStory(@RequestBody storyDTO story) {
		return serviceStory.save(story);
		
	}
}
