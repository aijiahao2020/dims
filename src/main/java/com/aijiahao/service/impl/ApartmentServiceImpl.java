package com.aijiahao.service.impl;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.ApartmentExample;
import com.aijiahao.bean.Dormitory;
import com.aijiahao.dao.ApartmentMapper;
import com.aijiahao.dao.DormitoryMapper;
import com.aijiahao.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/25 - 9:52
 */
@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    ApartmentMapper apartmentMapper;

    @Autowired
    DormitoryMapper dormitoryMapper;

    @Override
    public int addApartment(Apartment apartment) {
        int aptLayer = apartment.getAptLayer();
        int aptClass = apartment.getAptClass();
        int maxp = aptLayer*aptClass*10;
        apartment.setAptMaxp(maxp);
        apartment.setAptRealp(0);
        String aptId = apartment.getAptId();
        int i = apartmentMapper.insert(apartment);
        //自动生成对应寝室
        if(i != 0){

            for(Integer newLayer = 1; newLayer <= aptLayer; newLayer++){
                for(Integer dornum = 1; dornum < 10; dornum++){
                    String drmyId = newLayer.toString()+ "0" + dornum.toString();
                    Dormitory dormitory = new Dormitory();
                    dormitory.setAptId(aptId);
                    dormitory.setDrmyId(drmyId);
                    dormitory.setDrmyNum(0);
                    dormitory.setDrmyElebill(0.0);
                    dormitory.setDrmyElenum(0.0);
                    dormitoryMapper.insert(dormitory);
                }
                String drmyId = newLayer.toString() + "10";
                dormitoryMapper.insert(new Dormitory(drmyId, aptId, 0, 0.0, 0.0, null));

            }

        }
        return i;
    }

    @Override
    public long countApartmentByAptId(String aptId) {
        ApartmentExample example = new ApartmentExample();
        ApartmentExample.Criteria criteria = example.createCriteria();
        criteria.andAptIdEqualTo(aptId);
        return apartmentMapper.countByExample(example);
    }


    @Override
    public List<Apartment> getApartments() {
        return apartmentMapper.selectByExample(null);
    }

    @Override
    public Apartment getApartmentByAptId(String aptId) {
        return apartmentMapper.selectByPrimaryKey(aptId);
    }

    @Override
    public int updateApartment(Apartment apartment) {
//        int aptLayer = apartment.getAptLayer();
//        int aptClass = apartment.getAptClass();
//        int maxp = aptLayer*aptClass*10;
//        apartment.setAptMaxp(maxp);
        Apartment oldApt = apartmentMapper.selectByPrimaryKey(apartment.getAptId());
        Integer aptRealp = oldApt.getAptRealp();
        String aptSex = oldApt.getAptSex();
        if(aptRealp > 0 && !aptSex.equals(apartment.getAptSex())) {
            return -1;
        }
        return apartmentMapper.updateByPrimaryKeySelective(apartment);
    }

    @Override
    public int deleteApartmentByAptId(String aptId) {
        return apartmentMapper.deleteByPrimaryKey(aptId);
    }

    @Override
    public List<Apartment> getApartmentsByCriteria(Apartment apartment) {
        if(apartment == null){
            return getApartments();
        }
        ApartmentExample example = new ApartmentExample();
        ApartmentExample.Criteria criteria = example.createCriteria();
        if(!"".equals(apartment.getAptId()) && apartment.getAptId() != null)criteria.andAptIdLike("%" + apartment.getAptId() + "%");
        if(!"".equals(apartment.getAptSex()) && apartment.getAptSex() != null) criteria.andAptSexEqualTo(apartment.getAptSex());
        if(apartment.getAptLayer() != null) criteria.andAptLayerEqualTo(apartment.getAptLayer());
        if(apartment.getAptRealp() != null) criteria.andAptRealpBetween(0, apartment.getAptRealp());
        if(apartment.getAptMaxp() != null) criteria.andAptMaxpBetween(0, apartment.getAptMaxp());
        if(apartment.getAptClass() != null) criteria.andAptClassEqualTo(apartment.getAptClass());
        return apartmentMapper.selectByExample(example);
    }
}
