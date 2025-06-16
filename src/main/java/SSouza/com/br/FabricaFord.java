package SSouza.com.br;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public Sedan criarSedan() {
        return new FordSedan();
    }

    @Override
    public SUV criarSUV() {
        return new FordSUV();
    }
}
