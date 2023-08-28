package moonlit.springbootvalidacao.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

// Esta anotação do lombok já cria os getters, setters, toString(), etc.
@Data
public class ClienteModel {

    private Integer id;
    @NotBlank
    private String nome;
    @Email
    private String email;
    @CPF
    private String cpf;
    @NotBlank
    private String placaCarro;

}
