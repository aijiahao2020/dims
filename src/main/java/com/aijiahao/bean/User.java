package com.aijiahao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author aijiahao
 * @create 2021/5/7 - 19:11
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;

    private String password;

    private String type;

}
