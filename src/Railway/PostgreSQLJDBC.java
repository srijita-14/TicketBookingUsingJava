package Railway;

import Railway.PostgresManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        try {
            //Map<String,String> newMap= new HashMap<>();
            c = PostgresManager.getConnection();
            //c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin123");
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from train"); //3

            while (resultSet.next()) {
                //newMap.put("TRAIN NO ",resultSet.getString("train_no"));
                System.out.println("TRAIN NO:  "+resultSet.getString("train_no"));
                System.out.println("START CITY:  "+resultSet.getString("start_city"));
                System.out.println("END CITY:  "+resultSet.getString("end_city"));
                System.out.println("TOTAL SEATS:  "+resultSet.getInt("total_seats"));
                //  System.out.println("Date: "+resultSet.getDate("date"));
                System.out.println("==========================");
                //System.out.println(newMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}