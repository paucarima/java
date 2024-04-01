package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class testRestar {
/*1. Mostrar el pom e indicar donde está la información de su proyecto, es decir groupId, artifactId y versión.
2. Mostrar el pom e indicar donde están configuradas las dependencias a junit
3. Explicar el código de su método testRestar
4. Ejecutar los tests y explicar los resultados*/
    @Test
    public void testSumar() {
    	Calculadora c=new Calculadora();
    	int resultado=c.resta(10, 5);
        assertTrue(resultado==5);
    }

}
