package com.dev.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CodigoRecuperaSenhaRequestDTO {
    @Email(message = "E-mail inválido")
    @Size(min = 6, max = 120)
    private String email;
}
