package com.sourcecs.scsapi.service;

import com.sourcecs.scsapi.model.request.TopicRequest;
import com.sourcecs.scsapi.model.response.TopicResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
@AllArgsConstructor
public class TopicService {

    private final DataSource dataSource;

    public long createTopicNative(TopicRequest topicRequest) {
        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("INSERT INTO topic(name) VALUES (?);")) {

                ps.setString(1, topicRequest.getName());
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public long deleteTopicByIdNative(long id) {
        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("DELETE FROM topic WHERE id = ?;")) {
                ps.setLong(1, id);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public TopicResponse findTopicByIdNative(long id){
        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM topic WHERE id = ?;")) {
                ps.setLong(1, id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                    long recordId = rs.getLong("id");
                    String name = rs.getString("name");

                    return TopicResponse.builder()
                            .id(recordId)
                            .name(name)
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
}
