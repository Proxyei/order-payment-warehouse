package com.xywei.test;

import com.xywei.springcloud.OrderApplication11001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author future
 * @DateTime 2021/2/26 16:51
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication11001.class)
public class DBTest {


    @Autowired
    private DataSource dataSource;

    @Test
    public void testDBConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            System.out.println(connection == null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
