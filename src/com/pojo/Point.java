package com.pojo;

public class Point {
	private int kpid;
	private int sid;
	private String pointNo;
	private String pointName;
	
	
	private int cid;
	private String sectionNo;
	private String sectionName;
	
	private String chapterNo;
	private String chapterName;
	
	private Chapter chapter;
	
	private Section section;
	
	public int getKpid() {
		return kpid;
	}
	public void setKpid(int kpid) {
		this.kpid = kpid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getPointNo() {
		return pointNo;
	}
	public void setPointNo(String pointNo) {
		this.pointNo = pointNo;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public String getChapterNo() {
		return chapterNo;
	}
	public void setChapterNo(String chapterNo) {
		this.chapterNo = chapterNo;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	public Chapter getChapter() {
		return chapter;
	}
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
	
}
