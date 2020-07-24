package ApaSolidExercicio2;

public class ISS implements Imposto
{
    public double aliquota;
    
    @Override
    public double obterValorImposto(){
        return aliquota = 0.02;
    }
}