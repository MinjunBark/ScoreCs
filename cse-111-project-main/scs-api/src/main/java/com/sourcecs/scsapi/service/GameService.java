package com.sourcecs.scsapi.service;

import com.sourcecs.scsapi.model.Game;
import com.sourcecs.scsapi.model.request.GameRequest;
import com.sourcecs.scsapi.model.response.GameResponse;
import com.sourcecs.scsapi.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    private final DataSource source;

    public List<GameResponse> getGamesPaginated(int pageSize, int pageNumber) {
        List<GameResponse> gameResponses = new ArrayList<>();

        // Calculate the offset (i.e. the number of rows to skip before starting to return rows)
        int offset = (pageNumber - 1) * pageSize;

        try {
            String sql = "SELECT * FROM game ORDER BY id LIMIT ? OFFSET ?";
            ResultSet rs;
            try (PreparedStatement ps = source.getConnection().prepareStatement(sql)) {

                ps.setInt(1, pageSize);
                ps.setInt(2, offset);

                rs = ps.executeQuery();

                // Process the results
                while (rs.next()) {
                    // Retrieve the values of the columns
                    int id = rs.getInt("id");
                    String status = rs.getString("status");

                    GameResponse gameResponse = GameResponse.builder()
                            .id(id)
                            .status(status)
                            .build();
                    gameResponses.add(gameResponse);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return gameResponses;
    }

    public Game createGame(GameRequest gameRequest) {
        Game game = Game.builder()
                .startedAt(LocalDateTime.now())
                .status(gameRequest.getStatus())
                .build();

        return gameRepository.save(game);
    }

    public int createGameNative(GameRequest gameRequest) {
        try {
            try (PreparedStatement preparedStatement = source.getConnection()
                    .prepareStatement("INSERT INTO game(started_at) VALUES (?);")) {
                preparedStatement.setTimestamp(1, Timestamp.valueOf(gameRequest.getStartTime()));
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public GameResponse getGameResponseById(long id) {
        try (PreparedStatement preparedStatement = source.getConnection()
                    .prepareStatement("SELECT * FROM game WHERE id = ?;")) {
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                long recordId = rs.getLong("id");
                String status = rs.getString("status");

                return GameResponse.builder()
                        .id(recordId)
                        .status(status)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
