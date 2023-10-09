package com.aijiahao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bulletin {
    private Integer bltId;

    private String adminId;

    private String aptId;

    private String bltTitle;

    private String bltContent;

    private Date bltTime;

}
