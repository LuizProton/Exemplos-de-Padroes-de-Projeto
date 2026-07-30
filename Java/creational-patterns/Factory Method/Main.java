public class Main {
    public static void main(String[] args){
        
        Carro carro1 = FactoryCarros.criarCarro(ModeloCarro.TOYOTA_COROLLA);
        Carro carro2 = FactoryCarros.criarCarro(ModeloCarro.VW_GOLF);
        Carro carro3 = FactoryCarros.criarCarro(ModeloCarro.FORD_MUSTANG);
        Carro carro4 = FactoryCarros.criarCarro(ModeloCarro.FORD_RANGER);
        Carro carro5 = FactoryCarros.criarCarro(ModeloCarro.VW_NIVUS);
        Carro carro6 = FactoryCarros.criarCarro(ModeloCarro.TOYOTA_HILUX);
        
        System.out.println(carro1.descricao());
        System.out.println(carro2.descricao());
        System.out.println(carro3.descricao());
        System.out.println(carro4.descricao());
        System.out.println(carro5.descricao());
        System.out.println(carro6.descricao());

        System.out.println("OK!");
    }
}
