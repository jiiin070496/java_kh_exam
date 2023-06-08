package com.kh.practice.list.music.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	@SuppressWarnings("unchecked")
	public MusicController() {
		//music.txt 파일에서 읽어서 list에 추가하여 초기화 끝
		String filePath = "Music.txt";
		try(ObjectInputStream ois 
				= new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
		) {
			list = (List<Music>) ois.readObject();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
		//list에 초기 곡 10곡 미리 입력
//		list.add(new Music("aa", "aaa"));
//		list.add(new Music("bb", "aab"));
//		list.add(new Music("cc", "aac"));
//		list.add(new Music("dd", "aad"));
//		list.add(new Music("ee", "aae"));
//		list.add(new Music("ff", "aaf"));
//		list.add(new Music("gg", "aag"));
//		list.add(new Music("as", "aas"));
//		list.add(new Music("ax", "aax"));
//		list.add(new Music("az", "aaz"));
	
	
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
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {//리스트안에 있는 타이틀과 내가 입력한 타이틀이 같을때
				result = vo; //곡 찾음
				break; // 찾은 Music객체 vo를 return하면 됨
			}
		}
		return result;
	}

	public Music removeMusic(String title) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {//타이틀이 같은것을 찾아
				list.remove(vo); //삭제
				result = vo ;
				break;
			}
		}
		return result;
	}

	public Music setMusic(String title, Music music) {
		Music result = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				break;
			}
		}
//		for(Music vo : list) { //vo라는 새로운방(지역변수)을 만듬, list에서 하나를 꺼내서 vo에 넣어줌 ex)aa
//			// vo에 aa가 들어감
//			if(vo.getTitle().equals(title)) {//리스트안에 있는 타이틀과 내가 입력한 타이틀이 같을때
//				//result라는 방에 aa가 들어감
//				result = vo; //곡 찾음
//				vo = music;
//				//향상된 for 불가, vo = music; // vo는 for문의 새로운 지역변수로 list와는 무관한 공간임
//				int findIdx = list.indexOf(vo);
//				list.set(findIdx, music);
//				break; // 찾은 Music객체 vo를 return하면 됨
//			}
//		}
		return result;
	}

	public int ascTitle() {
		int result = 0;
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = 0; j < list.size()-1 - i; j++) {
				if(list.get(j).getTitle().compareTo(list.get(j+1).getTitle()) > 0) {  //오름차순
					Music tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
			
			}
		}
		return result;
	}
	public int descSinger() {
		
		//list에 singer는 없고 list의 1개 객체에 singer가 있다.
		//list.getSinger(); X
		//list.get(0).getSinger(); O
		
		int result = 0;
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = 0; j < list.size()-1 - i; j++) {
				if(list.get(j).getSinger().compareTo(list.get(j+1).getSinger()) < 0) {
				//정렬기준은 list의 Music형태의 객체 중 singer값으로 비교함
				//SWAP //list에 있는 Music 형태의 객체를 swap
					Music tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
			
			}
		}
		return result;
	}
	
	public int ascTitle2() {
		int result = 0;
//		ArrayList al = new ArrayList<Music>();
//		al.add("a", "ab");
//		list.removeAll(al);
		Collections.sort(list, new AscTitle());
		return result;
	}
	
	public int descSinger2() {
		int result = 0;
		Collections.sort(list);
		return result;

	}
	public int saveFile(String filePath) {
		int result = 0; // 0: 저장실패, 1: 저장성공

		//filepath에 list의 Music 객체를 저장함.
		
		
		
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
		){
			oos.writeObject(list);
			oos.flush();
			result = 1;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}



















