package SSouza.com.br;

public class FabricaToyota implements FabricaDeCarro {

    @Override
    public Sedan criarSedan() {
        return new ToyotaSedan();
}

    @Override
    public SUV criarSUV() {
        return new ToyotaSUV();
    }
}



