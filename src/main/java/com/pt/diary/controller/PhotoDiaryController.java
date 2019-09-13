package com.pt.diary.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pt.diary.service.PhotoDiaryService;
import com.pt.diary.vo.PhotoDiaryVO;

@CrossOrigin("*")
@RestController
public class PhotoDiaryController {
	
	@Resource
	private PhotoDiaryService pds;

	@GetMapping("/list")
	public List<PhotoDiaryVO> getPhotoDiaryList(){
		return pds.selectPhotoDiaryList();
	}
	
	@GetMapping("/view/{pdNum}")
	public PhotoDiaryVO getPhotoDiary(@PathVariable("pdNum") int pdNum) {
		return pds.selectPhotoDiary(pdNum);
	}
	
	@PostMapping("/write")
	public int addPhotoDiary(@RequestBody PhotoDiaryVO pdvo) {
		return pds.insertPhotoDiary(pdvo);
	}
	
	@PutMapping("/up")
	public int modifyPhotoDiary(@RequestBody PhotoDiaryVO pdvo) {
		return pds.updatePhotoDiary(pdvo);
	}
	
	@DeleteMapping("/del/{pdNum}")
	public int deletePhotoDiary(@PathVariable("pdNum") int pdNum) {
		return pds.deletePhotoDiary(pdNum);
	}
}
