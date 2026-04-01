package com.eriklima.junit.utilidade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada(){

        Pessoa pessoa = new Pessoa( "Erik", "Lima");

        assertAll("Asserções de pessoa",
                ()-> assertEquals( "Erik", pessoa.getNome() ),
                ()-> assertEquals( "Lima", pessoa.getSobrenome() ) );
    }

}