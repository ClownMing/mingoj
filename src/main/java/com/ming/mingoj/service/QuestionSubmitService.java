package com.ming.mingoj.service;

import com.ming.mingoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.ming.mingoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ming.mingoj.model.entity.User;

/**
 * @author clownMing
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {


    /**
     * 用户提交题目
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

}
