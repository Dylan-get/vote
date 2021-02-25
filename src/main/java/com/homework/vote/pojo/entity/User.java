package com.homework.vote.pojo.entity;



import lombok.Data;

import java.io.Serializable;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer userid;

    private String username;

    private String passwd;

    private static final long serialVersionUID = 1L;


}