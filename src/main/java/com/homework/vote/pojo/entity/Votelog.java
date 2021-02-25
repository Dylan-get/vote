package com.homework.vote.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * voteLog
 * @author 
 */
@Data
public class Votelog implements Serializable {
    private Integer logid;

    private Integer userid;

    private Integer voteid;

    private String choicename;

    private static final long serialVersionUID = 1L;


}