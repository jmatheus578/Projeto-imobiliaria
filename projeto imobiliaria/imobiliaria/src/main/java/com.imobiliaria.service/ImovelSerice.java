package imobiliaria.src.main.java.com.imobiliaria.service;

import com.imobiliaria.model.Imovel;
import com.imobiliaria.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> listarTodos() {
        return imovelRepository.findAll();
    }

    public Imovel criarImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public void deletarImovel(Long id) {
        imovelRepository.deleteById(id);
}
}