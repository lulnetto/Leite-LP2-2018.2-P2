package CDP;


public class caixaPentagonal extends CaixaAbstract {

    public caixaPentagonal(String descricao, String personalizacao, String formato, String dimensoes)
    {
        super(descricao, personalizacao, formato, dimensoes);
        this.preco = calculaPreco();
    }

    @Override
    public double calculaPreco()
    {
        double lado = Double.parseDouble(this.dimensoes);
        double altura = (lado/2 * Math.sqrt(5) + (2 * Math.sqrt(5))) / 2;
        double areaTotal = 5.0 *(lado*altura)/2.0;
        double precoTotal = (0.1 * areaTotal);
        return precoTotal;
    }
}
