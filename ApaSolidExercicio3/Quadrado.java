package ApaSolidExercicio3;

public class Quadrado  implements Shape{

    public double altura;
    public double largura;

    @Override
    public  void inserirAltura(double altura)
    {
        this.altura = altura;
    }
    
    @Override
    public  void inserirLargura(double largura)
    {
        this.largura = largura;
    }    
}