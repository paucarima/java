package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSumar() {
    	Calculadora c=new Calculadora();
    	int resultado=c.suma(10, 5);
        assertTrue(resultado==15);
    }

}
