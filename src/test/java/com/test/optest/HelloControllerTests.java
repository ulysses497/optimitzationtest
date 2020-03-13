package com.test.optest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.optest.entity.QinghuanTable;
import com.test.optest.mapper.QinghuanTableMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTests {
    @Autowired
    QinghuanTableMapper qinghuanTableMapper;
    @Autowired
    DataSource dataSource;
    @Test
    public void sss1(){
//        PageHelper.startPage(1,5);
        System.out.println(dataSource);
    }
}
