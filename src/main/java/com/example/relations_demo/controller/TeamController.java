package com.example.relations_demo.controller;

import com.example.relations_demo.dto.DtoTeam;
import com.example.relations_demo.dto.DtoTeamIU;
import com.example.relations_demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relations-demo/team")
public class TeamController {
    @Autowired
    private TeamService teamService;
    @PostMapping("/addTeam")
    public DtoTeam addTeam(@RequestBody DtoTeamIU newTeam){
        return teamService.addTeam(newTeam);
    }
    @GetMapping("/getAllTeams")
    public List<DtoTeam> getAllTeams(){
        return teamService.getAllTeams();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteTeamById(@PathVariable(name = "id") Long team_id){
        return teamService.deleteTeamById(team_id);
    }
    @PutMapping("/update/{id}")
    public DtoTeam updateTeam(@RequestBody DtoTeamIU updateTeam,@PathVariable(name = "id") Long team_id){
        return teamService.updateTeam(updateTeam,team_id);
    }
}
