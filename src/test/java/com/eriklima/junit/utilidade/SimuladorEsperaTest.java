package com.eriklima.junit.utilidade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.Duration;

class SimuladorEsperaTest {

    @Test
    public void DeveEsperarENaoDarTimeout() {

        //Verifico se o metodo que chamei vai ser executado em até o valor que passo como primeiro parametro.
        Assertions.assertTimeout( Duration.ofSeconds(10),() -> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

        Assertions.assertTimeoutPreemptively( Duration.ofSeconds(6), ()-> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

    }

    @Test
    @Disabled("Esse teste não é mais aplicavel!")
    public void DeveEsperarENaoDarTimeout2() {

        //Verifico se o metodo que chamei vai ser executado em até o valor que passo como primeiro parametro.
        Assertions.assertTimeout( Duration.ofSeconds(10),() -> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

        Assertions.assertTimeoutPreemptively( Duration.ofSeconds(6), ()-> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

    }

    @Test
    public void DeveEsperarENaoDarTimeout3() {

        //Verifica se existe a variavel de ambiente "ENV" e se ela tem o valor 'PROD'. Se a variavel nao existir e/ou se o valor não for o esperado, então o JUnit ignora o teste/
        Assumptions.assumeTrue( "PROD".equals(System.getenv( "ENV") ), () -> "Abortando teste: Não deve ser executado em PROD");

        //Verifico se o metodo que chamei vai ser executado em até o valor que passo como primeiro parametro.
        Assertions.assertTimeout( Duration.ofSeconds(10),() -> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

        Assertions.assertTimeoutPreemptively( Duration.ofSeconds(6), ()-> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

    }

    //Anotacao que verifica se existe a variavel de ambiente "ENV" e se ela tem o valor 'DEV'. Se a variavel nao existir e/ou se o valor não for o esperado, então o JUnit ignora o teste/.
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    @Test
    public void DeveEsperarENaoDarTimeout4() {

        //Verifico se o metodo que chamei vai ser executado em até o valor que passo como primeiro parametro.
        Assertions.assertTimeout( Duration.ofSeconds(10),() -> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

        Assertions.assertTimeoutPreemptively( Duration.ofSeconds(6), ()-> SimuladorEspera.esperar( Duration.ofSeconds(5) ) );

    }
}