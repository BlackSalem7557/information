package com.microservice.information.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {
    private Integer id;
    private String idType;
    private String firstName;
    private String secondName;
    private String surname;
    private String secondSurname;
    private String phone;
    private String address;
    private String residenceCity;
}
