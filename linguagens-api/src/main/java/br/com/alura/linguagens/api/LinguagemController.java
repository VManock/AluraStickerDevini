package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    
    private List<Linguagem> linguagens = 
        List.of(
            new Linguagem(title:"Java", image:"https://raw.githubusercontent.com/abrahamcalf/languages.abranhe.com/master/languages/java.png", ranking:1),
            new Linguagem(title:"PHP", image:"https://raw.githubusercontent.com/abrahamcalf/languages.abranhe.com/master/languages/php.png", ranking:2),
        );


    @GetMapping(value="/linguagem-preferida")
    public String processaLinguagemPreferia (){
        return "Oi, Java!";

    }

    @GetMapping
    public List<Linguagem> obterLinguagens () {
        return linguagens;

    }

}
