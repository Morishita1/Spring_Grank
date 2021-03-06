package com.biz.grank.service;

import java.util.Map;

import com.biz.grank.domain.LikeDto;

public interface LikeService {
	public LikeDto likeRead(Map<String, Object> map);
	public int countByLike(Map<String, Object> map);
	public void createLike(Map<String, Object> map);
	public void like_check(Map<String, Object> map);
	public void like_check_cansel(Map<String, Object> map);
}
