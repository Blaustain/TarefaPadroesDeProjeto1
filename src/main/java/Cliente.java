import SSouza.com.br.*;

public class Cliente {
    public static void main(String[] args) {
        FabricaDeCarro fabricaToyota = new FabricaToyota();
        Sedan sedanToyota = fabricaToyota.criarSedan();
        SUV suvToyota = fabricaToyota.criarSUV();

        sedanToyota.exibirInfoSedan();
        suvToyota.exibirInfoSUV();

        System.out.println("----------");

        FabricaDeCarro fabricaFord = new FabricaFord();
        Sedan sedanFord = fabricaFord.criarSedan();
        SUV suvFord = fabricaFord.criarSUV();

        sedanFord.exibirInfoSedan();
        suvFord.exibirInfoSUV();
    }
}
