package com.microservice.information.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    @NonNull
    private Integer id;
    @NonNull
    @Pattern(regexp = "(C|P)", message = "Possible values C or P")
    @Size(min = 1, max = 1, message = "Only length value is 1")
    private String idType;
}
