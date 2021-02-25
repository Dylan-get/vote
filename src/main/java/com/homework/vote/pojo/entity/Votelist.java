package com.homework.vote.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * voteList
 * @author 
 */
@Data
public class Votelist implements Serializable {
    private Integer voteid;

    private String votename;

    private Integer userid;

    private static final long serialVersionUID = 1L;


}