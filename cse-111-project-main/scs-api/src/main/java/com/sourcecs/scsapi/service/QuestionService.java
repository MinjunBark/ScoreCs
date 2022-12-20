package com.sourcecs.scsapi.service;

import com.sourcecs.scsapi.model.request.QuestionRequest;
import com.sourcecs.scsapi.model.response.QuestionResponse;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

@Service
@AllArgsConstructor
public class QuestionService {

    private final DataSource dataSource;

    public long createQuestionNative(QuestionRequest questionRequest){

        try{
            Connection connection = dataSource.getConnection();
            try(PreparedStatement ps = connection.prepareStatement("INSERT INTO question(text, difficulty) VALUES (?,?);")){
                ps.setString(1, questionRequest.getText());
                ps.setString(2,questionRequest.getDifficulty());
            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return 0;
    }

    public long deleteQuestionNative(long id){
        try{
            Connection connection = dataSource.getConnection();
            try(PreparedStatement ps = connection.prepareStatement("DELETE FROM question WHERE id = ?;")){
                ps.setLong(1, id);

            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return 0;
    }

    public long updateQuestionByIdNative(QuestionRequest questionRequest){

        try{
            Connection connection = dataSource.getConnection();
            try(PreparedStatement ps = connection.prepareStatement("UPDATE question SET text = ?, difficulty= ? Where id = ?")){
                ps.setString(1, questionRequest.getText());
                ps.setString(2,questionRequest.getDifficulty());
            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return 0;
    }

    public QuestionResponse findQuestionByIdNative(long id) {
        try {
            Connection connection = dataSource.getConnection();
            try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM question Where id = ?")) {
                ps.setLong(1, id);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    long recordId = rs.getLong("id");
                    String text = rs.getString("text");
                    String difficulty = rs.getString("difficulty");

                    return QuestionResponse.builder()
                            .id(recordId)
                            .text(text)
                            .difficulty(difficulty)
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
