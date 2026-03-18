package br.com.camila.front_gestao_vagas.modules.company.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CreateJobsDTO {

    private UUID id;
    private String benefits;
    private String description;
    private String level;
    private Date createdAt;
}
