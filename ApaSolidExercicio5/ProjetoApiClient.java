package ApaSolidExercicio5;

public class ProjetoApiClient {

    private final BackEndDeveloper backEndDeveloper;
    private final FrontEndDeveloper frontEndDeveloper;
    
    public ProjetoApiClient (BackEndDeveloper backEndDeveloper, FrontEndDeveloper frontEndDeveloper)
    {
        this.backEndDeveloper = backEndDeveloper;
        this.frontEndDeveloper = frontEndDeveloper;
    }

    public void implementar() {
        this.backEndDeveloper.writeAPI();
        this.frontEndDeveloper.writeClientConsumer();
    }

}
