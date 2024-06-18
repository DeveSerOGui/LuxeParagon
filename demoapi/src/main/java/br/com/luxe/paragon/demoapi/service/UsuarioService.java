package br.com.luxe.paragon.demoapi.service;

import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import br.com.luxe.paragon.demoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<UsuarioModel> findById(String id) {
        return this.usuarioRepository.findById(id);
    }

    public List<UsuarioModel> findAll() {
        return this.usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> getById(String id) {
        return this.usuarioRepository.findById(id);
    }

    public UsuarioModel create(UsuarioModel usuario) {
        return this.usuarioRepository.save(usuario);
    }

    public UsuarioModel update(String id, UsuarioModel newData) throws Exception {
        Optional<UsuarioModel> result = this.usuarioRepository.findById(id);

        UsuarioModel usuarioASerAtualizada = result.get();
        usuarioASerAtualizada.setNome(newData.getNome());
        usuarioASerAtualizada.setEmail(newData.getEmail());
        usuarioASerAtualizada.setSenha(newData.getSenha());
        usuarioASerAtualizada.setEnderecos(newData.getEnderecos());
        this.usuarioRepository.save(usuarioASerAtualizada);
        return usuarioASerAtualizada;
    }

    public void delete(String id) throws Exception {
        Optional<UsuarioModel> usuarioASerExcluida = this.usuarioRepository.findById(id);
        this.usuarioRepository.delete(usuarioASerExcluida.get());
    }


}
