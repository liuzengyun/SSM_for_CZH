package cn.edu.upc.csn.service.impl;

import cn.edu.upc.csn.dao.CsnuserMapper;
import cn.edu.upc.csn.model.Csnuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CsnuserServiceImpl implements cn.edu.upc.csn.service.CsnuserService {
    @Autowired
    @Resource
    private CsnuserMapper csnuserMapper;



    @Override
    public int insert(Csnuser record){
        csnuserMapper.insert(record);
        return 0;
    }

    @Override
    public List<Csnuser> denglu(Csnuser record)
    {
        return csnuserMapper.denglu(record);
    }
}

