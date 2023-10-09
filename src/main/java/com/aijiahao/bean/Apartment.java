package com.aijiahao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apartment {
    private String aptId;

    private String aptDescribe;

    private Integer aptLayer;

    private Integer aptClass;

    private Integer aptMaxp;

    private Integer aptRealp;

    private String aptSex;

    private String aptAddress;

    private String aptImg;

}
