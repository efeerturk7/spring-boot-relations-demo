package com.example.relations_demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoTeam {
    private String name;
    private List<DtoPlayer> players=new ArrayList<>();
}
