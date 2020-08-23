package cn.edu.upc.csn.service;


import cn.edu.upc.csn.model.Csnuser;

import java.util.List;

public interface CsnuserService {

    int insert(Csnuser record);
    List<Csnuser> denglu(Csnuser record);
}
