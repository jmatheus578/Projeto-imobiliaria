package imobiliaria.src.main.java.com.imobiliaria.dto;

import lombok.Data;

@Data

public class ImovelDTO {
    private String titulo;
    private String descricao;
    private String endereco;
    private Double preco;
    private String tipo;
    private Long proprietarioId;

}
