package com.ming.mingoj.model.dto.question;

import lombok.Data;

/**
 * @description 题目用例
 * @author clownMing
 * @date 2023/9/6 13:29
 * @version 1.0
*/
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;

}
