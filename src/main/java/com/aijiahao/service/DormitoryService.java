package com.aijiahao.service;

import com.aijiahao.bean.Dormitory;
import com.aijiahao.bean.DrmyStu;
import com.aijiahao.bean.Student;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/26 - 13:47
 */
public interface DormitoryService {

    //通过模糊查询获取公寓信息
    public List<Dormitory> getDrmyByCriteria(Dormitory dormitory);


    public List<DrmyStu> getSortedDrmyStudBedId(List<DrmyStu> drmyStus, Dormitory dormitory);

}
