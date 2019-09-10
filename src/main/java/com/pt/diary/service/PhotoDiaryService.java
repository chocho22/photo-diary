package com.pt.diary.service;

import java.util.List;

import com.pt.diary.vo.PhotoDiaryVO;

public interface PhotoDiaryService {
	public List<PhotoDiaryVO> selectPhotoDiaryList();
	public PhotoDiaryVO selectPhotoDiary(int pdNum);
	public int insertPhotoDiary(PhotoDiaryVO pdvo);
	public int updatePhotoDiary(PhotoDiaryVO pdvo);
	public int deletePhotoDiary(int pdNum);
}
