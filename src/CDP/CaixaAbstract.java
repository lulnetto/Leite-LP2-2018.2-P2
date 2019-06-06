package CDP;

public abstract class CaixaAbstract implements Caixa {

    private String descricao;
    private String personalizacao;
    private String formato;
    protected double preco;
    protected String dimensoes;

    public CaixaAbstract(String descricao, String personalizacao, String formato, String dimensoes){
        this.descricao = descricao;
        this.personalizacao = personalizacao;
        this.formato = formato;
        this.dimensoes = dimensoes;
        this.preco = 0;
    }

    public abstract double calculaPreco();

    public String toString(){
        return "Caixa com " + this.personalizacao + " custa R$ " + this.preco + ". Formato " + this.formato;
    }

    @Override
    public void setPersonalizacao(String personalizacao) {
        this.personalizacao = personalizacao;
    }

    public String getPersonalizacao() {
        return personalizacao;
    }

    public String getFormato() {
        return formato;
    }
}
