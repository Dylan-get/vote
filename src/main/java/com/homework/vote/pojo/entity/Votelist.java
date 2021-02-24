package com.homework.vote.pojo.entity;

import java.io.Serializable;

/**
 * voteList
 * @author 
 */
public class Votelist implements Serializable {
    private Integer voteid;

    private String votename;

    private Integer userid;

    private static final long serialVersionUID = 1L;

    public Integer getVoteid() {
        return voteid;
    }

    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }

    public String getVotename() {
        return votename;
    }

    public void setVotename(String votename) {
        this.votename = votename;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}