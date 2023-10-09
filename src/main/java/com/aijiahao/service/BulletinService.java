package com.aijiahao.service;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Bulletin;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/5/6 - 21:39
 */
public interface BulletinService {

    //添加楼栋
    int addBulletin(Bulletin bulletin);

    List<Bulletin> getBltByCriteria(Bulletin bulletin);
}
