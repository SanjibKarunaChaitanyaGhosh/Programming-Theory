# Inheritance

# Create an Electric car class that inherits from the Car class and has an additional attribute battery Size

class Car():
    def __init__(self,userbrand,usermodel):
        self.brand=userbrand
        self.model=usermodel

    def full_name(self):
        return f"{self.brand}-{self.model}"

class ElectricCar(Car):
    def __init__(self, userbrand, usermodel,battery_size):
        super().__init__(userbrand, usermodel)
        self.battery_size=battery_size


tesla= ElectricCar("Tata","Nano","80khw")

print(tesla.model)
print(tesla.full_name())
print(tesla.battery_size)