package com.eriklima.junit.utilidade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar(){

        String saudacao = SaudacaoUtil.saudar(9);

        System.out.println( saudacao );

        assertEquals("Bom dia", saudacao,"Saudação incorreta!");
    }

    @Test
    public void deveLancarException(){

        //Verifica se ao chamar o metodo "SaudacaoUtil.saudar(-10)" vai ocorrer uma exception do tipo "IllegalArgumentException"
        IllegalArgumentException illegalArgumentException = assertThrows( IllegalArgumentException.class, ()-> SaudacaoUtil.saudar(-10) );

        assertEquals("Hora inválida", illegalArgumentException.getMessage() );
    }

    @Test
    public void naoDeveLancarException(){

        //Verifica se ao chamar o metodo  "SaudacaoUtil.saudar(0)" nenhuma exception vai ocorrer.
        assertDoesNotThrow( () -> SaudacaoUtil.saudar(0) );
    }
}