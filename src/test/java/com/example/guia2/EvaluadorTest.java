package com.example.guia2;

import org.junit.jupiter.api.Test;

public class EvaluadorTest {

    @Test
    void testTrue() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("verdadero");
    }

    @Test
    void testFalse() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert !evaluador.eval("falso");
    }

    @Test
    void testParentesis() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("(verdadero)");
        assert !evaluador.eval("(false)");
    }

    @Test
    void testEspacios() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval(" verdadero  ");
        assert !evaluador.eval(" falso    ");
        assert evaluador.eval(" ( verdadero   )     ");
        assert !evaluador.eval(" ( falso   )     ");
    }

    @Test
    void testY() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("verdadero y verdadero");
        assert !evaluador.eval("verdadero y falso");
    }

    @Test
    void testYConParentesis() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("(verdadero ) y verdadero");
        assert !evaluador.eval("( falso ) y verdadero");
        assert evaluador.eval("(verdadero ) y ( verdadero )");
        assert !evaluador.eval("(verdadero ) y ( falso )");
    }

    @Test
    public void testO(){
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("verdadero o verdadero");
        assert evaluador.eval("falso o verdadero");
    }

}
