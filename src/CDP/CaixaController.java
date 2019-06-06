package CDP;

import java.text.DecimalFormat;
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
            this.caixaMap.put(descricao,caixa);
        } else if (formato.toLowerCase().equals("retangular")){
            Caixa caixa = new caixaRetangular(descricao, personalizacao, formato, dimensoes);
            this.caixaMap.put(descricao,caixa);
        } else if (formato.toLowerCase().equals("circular")){
            Caixa caixa = new caixaCircular(descricao, personalizacao, formato, dimensoes);
            this.caixaMap.put(descricao,caixa);
        }
    }

    public void alteraPersonalizacao(String descricao, String novaPersonalizacao) {
        this.caixaMap.get(descricao).setPersonalizacao(novaPersonalizacao);
    }

    public boolean removeCaixa(String descricao){
        if (!this.caixaMap.containsKey(descricao)){
            throw new NullPointerException("Caixa não existe!");
        }
        this.caixaMap.remove(descricao);
        return true;
    }

    public int quantidadeEstoque() {
        return this.caixaMap.size();
    }

    public boolean avaliaCaixa(String personalizacao, String formato) {
        for (Caixa caixa: this.caixaMap.values()){
            if(caixa.getPersonalizacao().toLowerCase().equals(personalizacao.toLowerCase()) && caixa.getFormato().toLowerCase().equals(formato.toLowerCase())){
                return true;
            }
        } return false;
    }

    public String avaliaCaixaPersonalizacao(String personalizacao) {
        String caixas = "";
        for (Caixa caixa: this.caixaMap.values()){
            if (caixa.getPersonalizacao().toLowerCase().equals(personalizacao.toLowerCase())){
                caixas += caixa.toString() + "; ";
            }
        } if ("".equals(caixas)){
            return "Não existe tal caixa.";
        } else {
            return caixas.substring(caixas.length()-2);
        }
    }

    public String avaliaCaixaFormato(String formato) {
        String caixas = "";
        for (Caixa caixa: this.caixaMap.values()){
            if (caixa.getFormato().toLowerCase().equals(formato.toLowerCase())){
                caixas += caixa.toString() + "; ";
            }
        } if ("".equals(caixas)){
            return "Não existe tal caixa.";
        } else {
            return caixas.substring(caixas.length()-2);
        }
    }

    public String rendimentoVendas() {
        double total = 0;
        for (Caixa caixa: this.caixaMap.values()) {
            total += caixa.calculaPreco();
        }
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(total);
    }

    public String exibeCaixa(String descricao){
        return this.caixaMap.get(descricao).toString();
    }
}
