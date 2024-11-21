package imobiliaria.src.main.java.com.imobiliaria.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String endereco;
    private Double preco;
    private String tipo; // "venda" ou "aluguel"

    @ManyToOne
    private Usuario proprietario;

}
