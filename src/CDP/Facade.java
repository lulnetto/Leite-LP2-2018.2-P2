package CDP;

public class Facade {

    private CaixaController caixaController;

    public Facade(){
        this.caixaController = new CaixaController();
    }

    public void cadastrarCaixa(String descricao, String personalizacao, String formato, String dimensoes){
        this.caixaController.cadastrarCaixa(descricao, personalizacao, formato, dimensoes);
    }

    public void alteraPersonalizacao(String descricao, String novaPersonalizacao){
        this.caixaController.alteraPersonalizacao(descricao,novaPersonalizacao);
    }

    public boolean removeCaixa(String descricao){
        return this.caixaController.removeCaixa(descricao);
    }

    public int quantidadeEstoque(){
        return this.caixaController.quantidadeEstoque();
    }

    public boolean avaliaCaixa(String personalizacao, String formato){
        return this.caixaController.avaliaCaixa(personalizacao,formato);
    }

    public String avaliaCaixaPersonalizacao(String personalizacao){
        return this.caixaController.avaliaCaixaPersonalizacao(personalizacao);
    }
    public String avaliaCaixaFormato(String Formato){
        return this.caixaController.avaliaCaixaFormato(Formato);
    }
    public String rendimentoVendas(){
        return this.caixaController.rendimentoVendas();
    }

}
