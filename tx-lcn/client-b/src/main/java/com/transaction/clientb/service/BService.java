package com.transaction.clientb.service;

import com.transaction.clientb.mapper.BMapper;
import com.transaction.clientb.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Mr.Kong
 * @Date: 2020/3/20 15:51
 * @Description:
 */
@Service
public class BService {

    @Autowired
    private BMapper bMapper;

    public void save(Demo demo) {
        // 这里抛出异常，可以发现a服务数据不会入库
        int i = 1 / 0;
        bMapper.save(demo);
    }
}