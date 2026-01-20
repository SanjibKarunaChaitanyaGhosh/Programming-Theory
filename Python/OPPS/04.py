# Create a Car Class with ATTRIBUTES like brand and model. Then create an instance of the class.

class Car:
    def __init__(self,userbrand,usermodel):
        self.brand=userbrand
        self.model=usermodel # model= variable , usermodel = parameter

# init is a Constructer, when any object created , constructer called automatically
my_car=Car("Toyota","Corolla") # creating Object
print(my_car)
print(type(my_car))

print(my_car.brand)
print(my_car.model)


my_new_car=Car("Tata","Nano")

print(my_car.brand)
print(my_car.model)