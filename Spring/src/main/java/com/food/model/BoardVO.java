package com.food.model;

import java.util.ArrayList;

public class BoardVO {

    private String title;
    private String content;
    private String id;
    private int bno;
    private String regdate;
    private int cnt;
    private ArrayList<AttachFileVO> attachFileVO;

    @Override
    public String toString() {
        return "BoardVO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", bno=" + bno +
                ", regdate='" + regdate + '\'' +
                ", cnt=" + cnt +
                ", attachFileVO=" + attachFileVO +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<AttachFileVO> getAttachFileVO() {
        return attachFileVO;
    }

    public void setAttachFileVO(ArrayList<AttachFileVO> attachFileVO) {
        this.attachFileVO = attachFileVO;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
