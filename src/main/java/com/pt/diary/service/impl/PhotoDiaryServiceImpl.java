package com.pt.diary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pt.diary.mapper.PhotoDiaryMapper;
import com.pt.diary.service.PhotoDiaryService;
import com.pt.diary.vo.PhotoDiaryVO;

@Service
public class PhotoDiaryServiceImpl implements PhotoDiaryService {

	@Resource
	private PhotoDiaryMapper pdm;
	
	@Override
	public List<PhotoDiaryVO> selectPhotoDiaryList() {
		return pdm.selectPhotoDiaryList();
	}

	@Override
	public PhotoDiaryVO selectPhotoDiary(int pdNum) {
		return pdm.selectPhotoDiary(pdNum);
	}

	@Override
	public int insertPhotoDiary(PhotoDiaryVO pdvo) {
		return pdm.insertPhotoDiary(pdvo);
	}

	@Override
	public int updatePhotoDiary(PhotoDiaryVO pdvo) {
		return pdm.updatePhotoDiary(pdvo);
	}

	@Override
	public int deletePhotoDiary(int pdNum) {
		return pdm.deletePhotoDiary(pdNum);
	}

}
