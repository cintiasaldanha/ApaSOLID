package ApaSolidExercicio2;

public class ICMS_MinasGerais implements Imposto
{
    public double aliquota;
    
    @Override
    public double obterValorImposto(){
        return aliquota = 0.18;
    }
}