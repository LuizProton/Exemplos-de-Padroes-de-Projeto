public class Main {
    public static void main(String[] args){

        Carro carro1 = new ToyotaCorolla();
        Carro carro2 = new ToyotaHilux();
        Carro carro3 = new VolkswagenGolf();
        Carro carro4 = new VolkswagenNivus();
        Carro carro5 = new FordMustang();
        Carro carro6 = new FordRanger();

        System.out.println(carro1.descricao());
        System.out.println(carro2.descricao());
        System.out.println(carro3.descricao());
        System.out.println(carro4.descricao());
        System.out.println(carro5.descricao());
        System.out.println(carro6.descricao());

        System.out.println("OK!");
    }
}
