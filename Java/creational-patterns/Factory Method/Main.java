public class Main {
    public static void main(String[] args){

        Carro carro1 = new ToyotaCorolla();
        Carro carro2 = new ToyotaHilux();

        System.out.println(carro1.descricao());
        System.out.println(carro2.descricao());

        System.out.println("OK!");
    }
}
