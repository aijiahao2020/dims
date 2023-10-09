package com.aijiahao.service;

import com.aijiahao.bean.Apartment;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/25 - 9:51
 */
public interface ApartmentService {


    //添加楼栋
    int addApartment(Apartment apartment);

    long countApartmentByAptId(String aptId);

    //模糊查询
    List<Apartment> getApartmentsByCriteria(Apartment apartment);

    List<Apartment> getApartments();

    //根据楼栋号查询楼栋信息
    Apartment getApartmentByAptId(String aptId);

    //更新楼栋信息
    int updateApartment(Apartment apartment);

    //更新楼栋信息
    int deleteApartmentByAptId(String aptId);

}
