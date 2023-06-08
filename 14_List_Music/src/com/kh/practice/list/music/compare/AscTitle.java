package com.kh.practice.list.music.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o, Music o2) {
		int result = 0;
		o.getTitle().compareTo(o2.getTitle());
		return 0;
	}
//	@Override
//	public int compare(Object o, Object o1) {
//		int result = 0;
//		//TODO
//		return result;
//	}

}
