package moonlit.springbootvalidacao.controller;

import moonlit.springbootvalidacao.model.ClienteModel;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @PostMapping("/salvar")
    private ResponseEntity<String> salvar(@RequestBody @Valid ClienteModel cliente) {
        return ResponseEntity.ok("");
    }

}
