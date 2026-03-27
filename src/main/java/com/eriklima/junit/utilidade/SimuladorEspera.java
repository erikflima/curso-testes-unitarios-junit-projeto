package com.eriklima.junit.utilidade;
import java.time.Duration;

public class SimuladorEspera {

    private SimuladorEspera() {

    }

    public static void esperar( Duration duration ) {

        try {

            System.out.println( "\n Metodo aguardando...." );
            Thread.sleep( duration.toMillis() );

        } catch (Exception ignored) {

        }
    }

}
