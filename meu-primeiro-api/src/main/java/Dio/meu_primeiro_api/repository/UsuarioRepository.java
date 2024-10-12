package Dio.meu_primeiro_api.repository;

import Dio.meu_primeiro_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save (Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo usuário na camada de repository");
        }
        else {
            System.out.println("UPDATE - Recebendo usuário na camada de repository");
            System.out.println(usuario);
        }
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - recebendo id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Maria", "senha"));
        usuarios.add(new Usuario("Jose", "mastersenha"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Rece endo o id: %d para localizar o usuário.", id));
        return new Usuario("Maria", "senha");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo username: %s para localizar um usuário.", username));
        return new Usuario("Maria", "senha");
    }

}
