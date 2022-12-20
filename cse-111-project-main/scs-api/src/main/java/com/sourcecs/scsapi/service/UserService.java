package com.sourcecs.scsapi.service;

import com.sourcecs.scsapi.model.request.UserRequest;
import com.sourcecs.scsapi.model.response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
@AllArgsConstructor
public class UserService {

    private final DataSource dataSource;

    public long createUserNative(UserRequest userRequest) {

        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("INSERT INTO user(email, ign, password, college_id, avatar_url) " +
                    "VALUES (?, ?, ?, ?, ?);")) {

                ps.setString(1, userRequest.getEmail());
                ps.setString(2, userRequest.getIgn());
                ps.setString(3, userRequest.getPassword());
                ps.setLong(4, userRequest.getCollegeId());

                String avatarUrl = "https://api.multiavatar.com/" + userRequest.getIgn() +".svg";
                ps.setString(5, avatarUrl);

                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public UserResponse findUserInfoByIdNative(long id) {

        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("Select * From user WHERE id = ? ;")) {
                ps.setLong(1, id);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    long recordId = rs.getLong("id");
                    String email = rs.getString("email");
                    String ign = rs.getString("ign");
                    long collegeId = rs.getLong("collegeId");
                    long wins = rs.getLong("wins");
                    long loses = rs.getLong("loses");

                    // I removed the password field from response.. we never want to send that lol
                    return UserResponse.builder()
                            .id(recordId)
                            .email(email)
                            .ign(ign)
                            .collegeId(collegeId)
                            .wins(wins)
                            .loses(loses)
                            .build();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public long changeUserIgnNative(UserRequest userRequest) {

        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("UPDATE user SET ign = ?;")) {

                ps.setString(2, userRequest.getIgn());

                String avatarUrl = "https://api.multiavatar.com/" + userRequest.getIgn() +".svg";
                ps.setString(5, avatarUrl);

                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

}
