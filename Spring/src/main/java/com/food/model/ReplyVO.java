package com.food.model;

public class ReplyVO {
    private int rno;
    private String reply;
    private String id;
    private String replydate;
    private int bno;

    @Override
    public String toString() {
        return "ReplyVO{" +
                "rno=" + rno +
                ", reply='" + reply + '\'' +
                ", id='" + id + '\'' +
                ", replydate='" + replydate + '\'' +
                ", bno=" + bno +
                '}';
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReplydate() {
        return replydate;
    }

    public void setReplydate(String replydate) {
        this.replydate = replydate;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }
}
