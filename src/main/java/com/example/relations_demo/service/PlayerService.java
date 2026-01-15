package com.example.relations_demo.service;

import com.example.relations_demo.dto.DtoPlayer;
import com.example.relations_demo.dto.DtoPlayerIU;
import com.example.relations_demo.entity.Player;
import com.example.relations_demo.entity.Team;
import com.example.relations_demo.repository.IPlayerRepository;
import com.example.relations_demo.repository.ITeamRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PlayerService {
    @Autowired
    private ITeamRepository teamRepository;
    @Autowired
    private IPlayerRepository playerRepository;

    public DtoPlayer addPlayer(DtoPlayerIU newPlayer) {
        Player player = new Player();
        Optional<Team> optional = teamRepository.findById(player.getId());
        Team team = optional.get();
        player.setName(newPlayer.getName());
        player.setTeam(team);
        Player savedPlayer=playerRepository.save(player);
        DtoPlayer dtoPlayer=new DtoPlayer();
        BeanUtils.copyProperties(savedPlayer,dtoPlayer);
        return dtoPlayer;
    }
    public String deletePlayer(Long id){
        if (playerRepository.existsById(id)){
            Optional<Player>optional=playerRepository.findById(id);
            Player player=optional.get();
            playerRepository.delete(player);
            return player.getName()+" başarıyla silindi";
        }else {
            return id+" idli oyuncu bulunamadı";
        }
    }
    public DtoPlayer updatePlayer(DtoPlayerIU updatePlayer,Long id){
        Optional<Player>optional=playerRepository.findById(id);
        Player player=optional.get();
        BeanUtils.copyProperties(updatePlayer,player);
        Player updatedPlayer = playerRepository.save(player);

        DtoPlayer dtoPlayer = new DtoPlayer();
        BeanUtils.copyProperties(updatedPlayer,dtoPlayer);
        return dtoPlayer;
    }
}
