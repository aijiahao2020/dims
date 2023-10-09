package com.aijiahao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author aijiahao
 * @create 2021/4/26 - 14:36
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrmyStu {
    private String stuId;

    private String drmyId;

    private String aptId;


    private String bedId;

    private String stuName;

    private String stuSex;

}
