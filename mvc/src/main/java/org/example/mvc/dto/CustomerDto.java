package org.example.mvc.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class CustomerDto {

    @NonNull
    private String name;

    @NonNull
    private String mail;

    @NonNull
    private String gender;
}
