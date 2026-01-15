package com.example.relations_demo.controller;

import com.example.relations_demo.dto.DtoPlayer;
import com.example.relations_demo.dto.DtoPlayerIU;
import com.example.relations_demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/relations-demo/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @PostMapping("/addPlayer")
    public DtoPlayer addPlayer(@RequestBody DtoPlayerIU newPlayer){
        return playerService.addPlayer(newPlayer);
    }
    @DeleteMapping("/delete/{id}")
    public String deletePlayer(@PathVariable(name = "id") Long id){
        return playerService.deletePlayer(id);
    }
    @PutMapping("/update/{id}")
    public DtoPlayer updatePlayer(@RequestBody DtoPlayerIU updatePlayer,@PathVariable(name = "id") Long id){
        return playerService.updatePlayer(updatePlayer,id);
    }
}
