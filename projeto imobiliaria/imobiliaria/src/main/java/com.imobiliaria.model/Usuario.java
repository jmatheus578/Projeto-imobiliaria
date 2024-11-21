package imobiliaria.src.main.java.com.imobiliaria.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

}
