# 2. CLASS METHOD AND SELF
# add a method to that Car class that displays the full name of the car(brand and model)

class Car():
    def __init__(self,userbrand,usermodel):
        self.brand=userbrand
        self.model=usermodel

    def full_name(self):
        # return f"Model is : {self.brand} and the brand is : {self.model}"
        return f"so the full name of the car is {self.brand}-{self.model}"
    
my_car=Car("Tata","Nano")
print(my_car.full_name())