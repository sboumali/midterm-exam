package databases;


import com.mysql.cj.jdbc.ConnectionImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class UnitTestConnectDB {
    public static void main(String[] args) {


    }

    @Test
    public void testConnectToSqlDatabase() throws SQLException, IOException, ClassNotFoundException {
        Connection actualReult = ConnectToSqlDB.connectToSqlDatabase();
        Assert.assertNotEquals("Test Fail",false, actualReult);
    }




}