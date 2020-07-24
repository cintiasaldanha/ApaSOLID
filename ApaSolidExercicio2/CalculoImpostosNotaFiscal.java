package ApaSolidExercicio2;

public class CalculoImpostosNotaFiscal {
    
    public double obterValorImpostos(Imposto[] impostos) {
        double valor = 0;
        for(var imposto : impostos) {
            valor += imposto.obterValorImposto();
        }

        return valor;
    }
}