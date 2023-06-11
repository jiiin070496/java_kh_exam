package com.kh.practice.list.music.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Comparable<Object>, Serializable{

	private static final long serialVersionUID = -231725129446354999L;
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	@Override
	public int hashCode() {
		//TODO
		return Objects.hash(singer, title);//singer와 title로 해쉬를 하나 만듬
	}

	@Override
	public boolean equals(Object obj) {
		//TODO
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
		//super(Object).equals ==  Objects.equals
	}

	@Override
	public int compareTo(Object o) {
		int result = this.singer.compareTo(((Music)o).getSinger());//Controller의 sort
		return result * -1;
	}
	
	
	
}
