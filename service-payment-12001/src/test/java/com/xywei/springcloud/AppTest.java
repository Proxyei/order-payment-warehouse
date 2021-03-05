package com.xywei.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @Author future
 * @DateTime 2021/2/27 22:41
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PaymentApplication12001.class)
public class AppTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testDB() throws  Exception{
        Connection connection = dataSource.getConnection();
        System.out.println(connection==null);
    }
}
