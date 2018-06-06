import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestesB {
    @Test
    public void testaQuantProduto(){
        ValidarProduto util = new ValidarProduto();
        assertFalse("Teste PASSED!",util.validarQuant("100" ,100).equals(false));
        System.out.println("Test Passed!");
    }
}
