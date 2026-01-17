package com.example.relations_demo.dto;

import com.example.relations_demo.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoPlayer {
    private String name;
    private DtoTeam team;
}
