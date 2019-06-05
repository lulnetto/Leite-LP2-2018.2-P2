package CDP;

public class caixaRetangular extends CaixaAbstract {

    public caixaRetangular(String descricao, String personalizacao, String formato, String dimensoes)
    {
        super(descricao, personalizacao, formato, dimensoes);
        this.preco = calculaPreco();
    }

    @Override
    public double calculaPreco()
    {
        String[] lado = this.dimensoes.split(", ");
        double lado1 = Double.parseDouble(lado[0]);
        double lado2 = Double.parseDouble(lado[1]);
        double areaTotal = lado1*lado2;
        double precoTotal = (0.1*areaTotal);
        return precoTotal;
    }
}
