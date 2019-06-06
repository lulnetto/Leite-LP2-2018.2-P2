package CDP;

public class caixaCircular extends CaixaAbstract {


    public caixaCircular(String descricao, String personalizacao, String formato, String dimensoes)
    {
        super(descricao, personalizacao, formato, dimensoes);
        this.preco = calculaPreco();
    }

    @Override
    public double calculaPreco()
    {
        double raio = Double.parseDouble(this.dimensoes);
        double areaTotal = 3.14*(raio*raio);
        double precoTotal = (0.1 * areaTotal);
        return precoTotal;
    }

}
