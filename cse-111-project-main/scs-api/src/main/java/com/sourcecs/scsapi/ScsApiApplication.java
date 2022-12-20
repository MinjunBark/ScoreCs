package com.sourcecs.scsapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScsApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScsApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        try {
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scorecs?characterEncoding=utf8&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
//                    "root", "root6Beer");
//
//            try (Statement statement = con.createStatement()) {
//                ResultSet resultSet = statement.executeQuery("SELECT * FROM game;");
//                while (resultSet.next()) {
//                    System.out.print(resultSet.getInt("id"));
//                    System.out.print(resultSet.getTimestamp("started_at"));
//                    System.out.print(resultSet.getTimestamp("ended_at"));
//                    System.out.println(resultSet.getString("status"));
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }



    }
}
