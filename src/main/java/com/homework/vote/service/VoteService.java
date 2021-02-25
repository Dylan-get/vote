package com.homework.vote.service;

import com.homework.vote.pojo.entity.Choicelist;
import com.homework.vote.pojo.entity.Votelist;

public interface VoteService {

    Integer voteAddService(Votelist votelist);
    Integer voteChoiceAddService(Choicelist choicelist);
}
