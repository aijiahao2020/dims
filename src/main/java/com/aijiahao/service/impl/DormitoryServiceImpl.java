package com.aijiahao.service.impl;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Dormitory;
import com.aijiahao.bean.DormitoryExample;
import com.aijiahao.bean.DrmyStu;
import com.aijiahao.dao.ApartmentMapper;
import com.aijiahao.dao.DormitoryMapper;
import com.aijiahao.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/26 - 13:47
 */
@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    DormitoryMapper dormitoryMapper;

    @Autowired
    ApartmentMapper apartmentMapper;

    @Override
    public List<Dormitory> getDrmyByCriteria(Dormitory dormitory) {
        if (dormitory == null) {
            List<Dormitory> dormitories = dormitoryMapper.selectByExample(null);
            for (Dormitory dorm : dormitories) {
                List<DrmyStu> drmyStus = dormitoryMapper.selectStuByDrmy(dorm);

                List<DrmyStu> sortedDrmyStudBedId = getSortedDrmyStudBedId(drmyStus, dorm);
                dorm.setDrmyStus(sortedDrmyStudBedId);
            }
            return dormitories;
        }
        DormitoryExample example = new DormitoryExample();
        DormitoryExample.Criteria criteria = example.createCriteria();
        if (!"".equals(dormitory.getAptId())) criteria.andAptIdLike("%" + dormitory.getAptId() + "%");
        if (!"".equals(dormitory.getDrmyId())) criteria.andDrmyIdLike("%" + dormitory.getDrmyId() + "%");
        List<Dormitory> dormitories = dormitoryMapper.selectByExample(example);

        for (Dormitory dorm : dormitories) {
            List<DrmyStu> drmyStus = dormitoryMapper.selectStuByDrmy(dorm);
            List<DrmyStu> sortedDrmyStudBedId = getSortedDrmyStudBedId(drmyStus, dorm);
            dorm.setDrmyStus(sortedDrmyStudBedId);
        }
        return dormitories;
    }

    public List<DrmyStu> getSortedDrmyStudBedId(List<DrmyStu> drmyStus, Dormitory dormitory) {
        Apartment apartment = apartmentMapper.selectByPrimaryKey(dormitory.getAptId());
        int[] bedIds = new int[apartment.getAptClass() + 1];
        for (int i = 0; i < apartment.getAptClass() + 1; i++) bedIds[i] = 0;
        for (DrmyStu drmyStu : drmyStus) {
            int bedId = Integer.parseInt(drmyStu.getBedId());
            bedIds[bedId] = bedId;
        }

        if (drmyStus.size() < apartment.getAptClass()) {
            for (Integer j = 1; j < apartment.getAptClass() + 1; j++) {
                if (bedIds[j] == 0) {
                    DrmyStu drmyStu = new DrmyStu();
                    drmyStu.setBedId(j.toString());
                    drmyStus.add(drmyStu);
                }
            }
        }

        Collections.sort(drmyStus, new Comparator<DrmyStu>() {
            @Override
            public int compare(DrmyStu o1, DrmyStu o2) {
                return Integer.parseInt(o1.getBedId()) - Integer.parseInt(o2.getBedId());
            }
        });

        return drmyStus;
    }
}
