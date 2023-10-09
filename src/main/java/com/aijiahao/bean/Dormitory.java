package com.aijiahao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dormitory {
    private String drmyId;

    private String aptId;

    private Integer drmyNum;

    private Double drmyElebill;

    private Double drmyElenum;

    List<DrmyStu> drmyStus;
}
