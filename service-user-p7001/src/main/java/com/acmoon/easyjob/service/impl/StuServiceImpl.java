package com.acmoon.easyjob.service.impl;

import com.acmoon.easyjob.pojo.Stu;
import com.acmoon.easyjob.mapper.StuMapper;
import com.acmoon.easyjob.service.StuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Acmoon
 * @since 2023-12-09
 */
@Service
public class StuServiceImpl implements StuService {
    
    @Autowired
    private StuMapper stuMapper;

    @Transactional
    @Override
    public void save(Stu stu) {
        stuMapper.insert(stu);
    }

}
