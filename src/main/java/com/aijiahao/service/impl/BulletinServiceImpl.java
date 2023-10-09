package com.aijiahao.service.impl;

import com.aijiahao.bean.Bulletin;
import com.aijiahao.bean.BulletinExample;
import com.aijiahao.bean.SystemAdministrator;
import com.aijiahao.dao.BulletinMapper;
import com.aijiahao.dao.SystemAdministratorMapper;
import com.aijiahao.service.BulletinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author aijiahao
 * @create 2021/5/6 - 21:39
 */
@Service
public class BulletinServiceImpl implements BulletinService {

    @Autowired
    BulletinMapper bulletinMapper;

    @Autowired
    SystemAdministratorMapper administratorMapper;

    @Override
    public int addBulletin(Bulletin bulletin) {

        SystemAdministrator systemAdministrator = administratorMapper.selectByPrimaryKey(bulletin.getAdminId());
        if(systemAdministrator != null){
            bulletin.setAdminId(systemAdministrator.getAdminId());
            bulletin.setBltTime(new Date());
            String aptId = systemAdministrator.getAptId();
            if(aptId != null && !"".equals(aptId)){
                bulletin.setAptId(aptId);
                return bulletinMapper.insert(bulletin);
            }
        }
        //返回0则表示失败
        return 0;

    }

    @Override
    public List<Bulletin> getBltByCriteria(Bulletin bulletin) {
        if(bulletin == null){
            return bulletinMapper.selectByExample(null);
        }
        BulletinExample example = new BulletinExample();
        BulletinExample.Criteria criteria = example.createCriteria();
        if(bulletin.getBltTitle() != null && !"".equals(bulletin.getBltTitle())) criteria.andAptIdLike(bulletin.getBltTitle());
        return bulletinMapper.selectByExample(example);
    }
}
