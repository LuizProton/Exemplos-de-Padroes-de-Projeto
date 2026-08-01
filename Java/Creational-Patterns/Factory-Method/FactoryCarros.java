public class FactoryCarros {
  public static Carro criarCarro(ModeloCarro modelo) {
    if (modelo == null){
      throw new IllegalArgumentException("O modelo do carro não pode ser nulo.");
    }

    switch (modelo) {
      case TOYOTA_COROLLA:
        return new ToyotaCorolla();
      case TOYOTA_HILUX:
        return new ToyotaHilux();
      case VW_GOLF:
        return new VolkswagenGolf();
      case VW_NIVUS:
        return new VolkswagenNivus();
      case FORD_MUSTANG:
        return new FordMustang();
      case FORD_RANGER:
        return new FordRanger();
      default:
        throw new IllegalArgumentException(modelo + ": Modelo de carro desconlhecido.");
    }
  }
}
