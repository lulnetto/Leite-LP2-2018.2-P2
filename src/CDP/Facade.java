package CDP;

public class Facade {

    private CaixaController caixaController;

    public Facade(){
        this.caixaController = new CaixaController();
    }

    public void cadastrarCaixa(String descricao, String personalizacao, String formato, String dimensoes){
        this.caixaController.cadastrarCaixa(descricao, personalizacao, formato, dimensoes);
    }

}
