from abc import ABC, abstractmethod

class Carro(ABC):
  @abstractmethod
  def descricao(self):
    pass
  
class ToyotaCorolla(Carro):
  def descricao(self):
    print("Toyota Corolla - Sedan médio, famoso pela confiabilidade e conforto.")

class ToyotaHilux(Carro):
  def descricao(self):
    print("Toyota Hilux - Picape robusta, ideal para terrenos off-road.")

class VolkswagenGolf(Carro):
  def descricao(self):
    print("Volkswagen Golf - Hatchback esportivo com ótimo desempenho dinâmico.")

class VolkswagenNivus(Carro):
  def descricao(self):
    print("Volkswagen Nivus - SUV Cumpê urbano com design moderno e conectividade.")

class FordMustang(Carro):
  def descricao(self):
    print("Ford Mustang - Muscle car lendário com motor V8 potente.")

class FordRanger(Carro):
  def descricao(self):
    print("Ford Ranger - Picape média com alta capacidade de carga e tecnologia.")
