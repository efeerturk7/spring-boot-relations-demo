package com.example.relations_demo.service;

import com.example.relations_demo.dto.DtoPlayer;
import com.example.relations_demo.dto.DtoTeam;
import com.example.relations_demo.dto.DtoTeamIU;
import com.example.relations_demo.entity.Player;
import com.example.relations_demo.entity.Team;
import com.example.relations_demo.repository.ITeamRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private ITeamRepository teamRepository;
    public DtoTeam addTeam(DtoTeamIU newTeam){
        Team team = new Team();
        BeanUtils.copyProperties(newTeam,team);
        Team savedTeam=teamRepository.save(team);
        DtoTeam dtoTeam = new DtoTeam();
        BeanUtils.copyProperties(savedTeam,dtoTeam);
        return dtoTeam;
    }
    public List<DtoTeam> getAllTeams() {
        List<Team> teamList = teamRepository.findAll();
        List<DtoTeam> dtoTeamList = new ArrayList<>();

        for (Team team : teamList) {
            DtoTeam dtoTeam = new DtoTeam();
            BeanUtils.copyProperties(team, dtoTeam);
            if (team.getPlayers() != null && !team.getPlayers().isEmpty()) {
                List<DtoPlayer> dtoPlayerList = new ArrayList<>();

                for (Player player : team.getPlayers()) {
                    DtoPlayer dtoPlayer = new DtoPlayer();
                    BeanUtils.copyProperties(player, dtoPlayer);
                    dtoPlayerList.add(dtoPlayer);
                }
                dtoTeam.setPlayers(dtoPlayerList);
            }
            dtoTeamList.add(dtoTeam);
        }
        return dtoTeamList;
    }
    public String deleteTeamById(Long team_id){
        Optional<Team>optional=teamRepository.findById(team_id);
        Team team=optional.get();
        if (team.getPlayers().isEmpty()||team.getPlayers()==null){
            teamRepository.delete(team);
        }else {
            return "Bu takım oyunculara sahip bu takımı silemezsiniz";
        }
        return team.getName()+" başarıyla silindi";
    }
    public DtoTeam updateTeam(DtoTeamIU updateTeam,Long team_id){
            Optional<Team>optional=teamRepository.findById(team_id);
            Team team = optional.get();
            List<DtoPlayer>dtoPlayerList=new ArrayList<>();
        if (team.getPlayers()!=null||!team.getPlayers().isEmpty()){
            for (Player player : team.getPlayers()){
                DtoPlayer dtoPlayer = new DtoPlayer();
                BeanUtils.copyProperties(player,dtoPlayer);
                dtoPlayerList.add(dtoPlayer);
            }
            DtoTeam dtoTeam =new DtoTeam();
            BeanUtils.copyProperties(updateTeam,team);
            Team updatedTeam=teamRepository.save(team);
            BeanUtils.copyProperties(updatedTeam,dtoTeam);
            dtoTeam.setPlayers(dtoPlayerList);
            return dtoTeam;
        }else {
            DtoTeam dtoTeam =new DtoTeam();
            Team updatedTeam=teamRepository.save(team);
            BeanUtils.copyProperties(updatedTeam,dtoTeam);
            return dtoTeam;
        }

    }
}
