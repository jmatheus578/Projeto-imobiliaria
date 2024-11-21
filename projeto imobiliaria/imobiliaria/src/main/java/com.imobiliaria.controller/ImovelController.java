package imobiliaria.src.main.java.com.imobiliaria.controller;


import com.imobiliaria.model.Imovel;
import com.imobiliaria.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imoveis")
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @GetMapping
    public List<Imovel> listarImoveis() {
        return imovelService.listarTodos();
    }

    @PostMapping
    public Imovel criarImovel(@RequestBody Imovel imovel) {
        return imovelService.criarImovel(imovel);
    }

    @DeleteMapping("/{id}")
    public void deletarImovel(@PathVariable Long id) {
        imovelService.deletarImovel(id);
    }
}