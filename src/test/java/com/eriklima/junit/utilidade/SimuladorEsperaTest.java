package com.eriklima.junit.utilidade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Duration;

class SimuladorEsperaTest {

    @Test
    public void DeveEsperarENaoDarTimeout() {

        //Verifico se o metodo que chamei vai ser executado em até o valor que passo como primeiro parametro.
        Assertions.assertTimeout( Duration.ofSeconds(10),() -> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

        Assertions.assertTimeoutPreemptively( Duration.ofSeconds(6), ()-> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

    }
}