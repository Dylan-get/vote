package com.homework.vote.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * choiceList
 * @author 
 */
@Data
public class Choicelist implements Serializable {
    private Integer id;

    private Integer voteid;

    private String choicename;

    private Integer num;

    private static final long serialVersionUID = 1L;


}