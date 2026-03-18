package br.com.camila.front_gestao_vagas.modules.company.dto;

import lombok.Data;

@Data
public class CreateCompanyDTO {
    private String name;
    private String username;
    private String website;
    private String password;
    private String description;
    private String email;

}
