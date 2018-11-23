package com.pf.org.cms;

import com.pf.org.cms.hcg.system.bean.MapperDO;
import com.pf.org.cms.hcg.system.service.MapperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Common {
    @Autowired
    MapperService mapperService;

    @Test
    public void addUserInfos() throws Exception {
        MapperDO mapperDO = new MapperDO();
        //不用设置ID，因为我们数据库自增了
        mapperDO.setName("小22米");
        mapperDO.setSex(2);
        //虽然我们数据库sex字段默认为0，但是这里如果不设置的话会报错，问题暂时没有解决
        mapperService.add(mapperDO);
    }


}
