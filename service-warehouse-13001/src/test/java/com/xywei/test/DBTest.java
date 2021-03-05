package com.xywei.test;

import com.xywei.springcloud.WarehouseApplication13001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @Author future
 * @DateTime 2021/2/27 23:47
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WarehouseApplication13001.class)
public class DBTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDB() throws  Exception{
        Connection connection = dataSource.getConnection();
        System.out.println(connection==null);
    }
}
