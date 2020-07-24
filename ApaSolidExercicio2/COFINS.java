package ApaSolidExercicio2;

public class COFINS implements Imposto
{
    public double aliquota;
    
    @Override
    public double obterValorImposto(){
        return aliquota = 0.03; 
    }       
}