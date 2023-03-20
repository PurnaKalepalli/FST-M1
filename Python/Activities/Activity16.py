class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")
car1 = Car("Suziki", "Ertiga", "2018", "Automatic", "Blue")
car2 = Car("Toyota", "Camry", "2019", "Manual", "White")
car3 = Car("Maruti", "Baleno", "2020", "Automatic", "Red")
car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()