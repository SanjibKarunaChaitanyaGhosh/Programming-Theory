# Create a Car Class with ATTRIBUTES like brand and model. Then create an instance of the class.

class Car:
    def __init__(userbrand,usermodel):
        brand=userbrand
        model=usermodel # model= variable , usermodel = parameter

my_car=Car("Toyota","Corolla") # creating Object
print(my_car)
print(type(my_car))

# print(my_car.brand)
# print(my_car.model)