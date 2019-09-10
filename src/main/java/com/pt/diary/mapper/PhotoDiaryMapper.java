package com.pt.diary.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.pt.diary.vo.PhotoDiaryVO;

@MapperScan
public interface PhotoDiaryMapper {
	public List<PhotoDiaryVO> selectPhotoDiaryList();
	public PhotoDiaryVO selectPhotoDiary(int pdNum);
	public int insertPhotoDiary(PhotoDiaryVO pdvo);
	public int updatePhotoDiary(PhotoDiaryVO pdvo);
	public int deletePhotoDiary(int pdNum);
}
