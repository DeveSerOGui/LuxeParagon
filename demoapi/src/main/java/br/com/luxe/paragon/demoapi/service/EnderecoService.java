package br.com.luxe.paragon.demoapi.service;

import br.com.luxe.paragon.demoapi.model.Endereco;
import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import br.com.luxe.paragon.demoapi.repository.EnderecoRepository;
import br.com.luxe.paragon.demoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioService usuarioService;


    public List<Endereco> findAll() {
        return this.enderecoRepository.findAll();
    }

    public Endereco create(Endereco endereco) {
        return this.enderecoRepository.save(endereco);
    }

    public Endereco save(String idUsuario, Endereco item){
        Optional<UsuarioModel> opUsuario = this.usuarioService.findById(idUsuario);

        UsuarioModel usuarioModel = opUsuario.get();
        usuarioModel.getEnderecos().add(item);
        this.usuarioRepository.save(usuarioModel);

        return item;
    }
}
