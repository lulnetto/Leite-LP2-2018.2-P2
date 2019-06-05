package CDP;

import java.util.Map;
import java.util.TreeMap;

public class CaixaController {

    private Map<String, Caixa> caixaMap;

    public CaixaController(){
        this.caixaMap = new TreeMap<>();
    }

    public void cadastrarCaixa(String descricao, String personalizacao, String formato, String dimensoes){
        if (formato.toLowerCase().equals("pentagonal")){
            Caixa caixa = new caixaPentagonal(descricao, personalizacao, formato, dimensoes);
        } else if (formato.toLowerCase().equals("retangular")){
            Caixa caixa = new caixaRetangular(descricao, personalizacao, formato, dimensoes);
        } else if (formato.toLowerCase().equals("circular")){
            Caixa caixa = new caixaCircular(descricao, personalizacao, formato, dimensoes);
        }
    }
}
