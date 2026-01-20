# Encapsulation

# Modify the Car class to encapsulate the brand attribute, making it private and provite a getter method for it.

class Car():
    def __init__(self,userbrand,usermodel):
          self.__brand=userbrand
          self.model=usermodel

    def get_brand(self):
         return self.brand
    
    def full_name(self):
         return f"{self.brand}-{self.model}"

class ElectricCar(Car):
     def __init__(self,brand,model,battery_size):
          super().__init__(brand,model)
          self.battery_size=battery_size

Ev_Car=ElectricCar("Tata","Nano","80khw")

print(Ev_Car.__brand) 



          