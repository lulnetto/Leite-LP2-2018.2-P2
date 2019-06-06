package CDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaControllerTest {

    private CaixaController cc = new CaixaController();

    @Test
    void cadastrarCaixaPentagonal() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");
    }
    @Test
    void cadastrarCaixaRetangular() {
        cc.cadastrarCaixa("caixa retangular linda","vermelho","retangular","5, 5");
    }
    @Test
    void cadastrarCaixaCircular() {
        cc.cadastrarCaixa("caixa circular linda","vermelho","circular","5");
    }

    @Test
    void alteraPersonalizacao() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");
        cc.alteraPersonalizacao("caixa pentagonal linda","azul");
    }

    @Test
    void removeCaixa() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");
        assertTrue(cc.removeCaixa("caixa pentagonal linda"));
    }

    @Test
    void quantidadeEstoque() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");
        cc.cadastrarCaixa("caixa circular linda","vermelho","pentagonal","5");
        cc.cadastrarCaixa("caixa retangular linda","vermelho","pentagonal","5");
        assertEquals(3,cc.quantidadeEstoque());
    }

    @Test
    void avaliaCaixa() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");
        assertTrue(cc.avaliaCaixa("vermelho","pentagonal"));
    }

    @Test
    void avaliaCaixaPersonalizacao() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");

    }

    @Test
    void avaliaCaixaFormato() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");

    }

    @Test
    void rendimentoVendas() {
        cc.cadastrarCaixa("caixa pentagonal linda","vermelho","pentagonal","5");
        assertEquals("6,29",cc.rendimentoVendas());

    }
}