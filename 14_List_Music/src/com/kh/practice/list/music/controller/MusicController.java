package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	public MusicController() {
		//list에 초기 곡 10곡 미리 입력
		list.add(new Music("aa", "aaa"));
		list.add(new Music("bb", "aab"));
		list.add(new Music("cc", "aac"));
		list.add(new Music("dd", "aad"));
		list.add(new Music("ee", "aae"));
		list.add(new Music("ff", "aaf"));
		list.add(new Music("gg", "aag"));
		list.add(new Music("as", "aas"));
		list.add(new Music("ax", "aax"));
		list.add(new Music("az", "aaz"));
	}
	public int addList(Music music) {
		int result = 0; // 0:추가실패, 1:추가성공
		if (list.add(music)) { // 추가
			result = 1; //
		}
		return result;
	}

	public int addAtZero(Music music) {
		int result = 0; // 0:추가실패, 1이상 추가성공
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music);
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}
		return result;
	}

	public List<Music> printAll() {
		// TODO
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {//리스트안에 있는 타이틀과 내가 입력한 타이틀이 같을때
				result = vo; //곡 찾음
				break; // return
			}
		}
		return result;
	}

	public Music removeMusic(String title) {
		// TODO
		return null;
	}

	public Music setMusic(String title, Music music) {
		// TODO
		return null;
	}

	public int ascTitle() {
		int result = 0;
		// TODO
		return result;
	}

	public int descSinger() {
		int result = 0;
		// TODO
		return result;
	}

}
