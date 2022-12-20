package com.sourcecs.scsapi.controller;

import com.sourcecs.scsapi.model.request.GameRequest;
import com.sourcecs.scsapi.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/game")
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    /**
     * Get all games
     * @return Game
     */
    @GetMapping
    public ResponseEntity<Object> findGames(@RequestParam(value = "pageSize", defaultValue = "25") int pageSize,
                                            @RequestParam(value = "pageNumber", defaultValue = "1") int pageNumber) {
        return new ResponseEntity<>(gameService.getGamesPaginated(pageSize, pageNumber), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Object> createGame(@RequestBody GameRequest gameRequest) {
        int gameId = gameService.createGameNative(gameRequest);
        return new ResponseEntity<>(gameId, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findGameById(@PathVariable long id) {
        return new ResponseEntity<>(gameService.getGameResponseById(id), HttpStatus.ACCEPTED);
    }

}
