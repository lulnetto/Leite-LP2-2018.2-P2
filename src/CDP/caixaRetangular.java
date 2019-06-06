package CDP;

public class caixaRetangular extends CaixaAbstract {

    private double lado1;
    private double lado2;

    public caixaRetangular(String descricao, String personalizacao, String formato, String dimensoes)
    {
        super(descricao, personalizacao, formato, dimensoes);
        this.preco = calculaPreco();
        String[] lado = this.dimensoes.split(", ");
        this.lado1 = Double.parseDouble(lado[0]);
        this.lado2 = Double.parseDouble(lado[1]);
    }

    @Override
    public double calculaPreco()
    {
        double areaTotal = lado1*lado2;
        double precoTotal = (0.1*areaTotal);
        return precoTotal;
    }
}
