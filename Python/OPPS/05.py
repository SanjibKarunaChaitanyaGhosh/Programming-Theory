# Create Two Car Class with ATTRIBUTES like brand and model. Then create an instance of the class.

class Car:
    def __init__(self,userbrand,usermodel):
        self.brand=userbrand
        self.model=usermodel 

# object-1
my_car=Car("Toyota","Corolla")

print(my_car.brand)
print(my_car.model)

# object-2
my_new_car=Car("Tata","Nano")

print(my_car.brand)
print(my_car.model)