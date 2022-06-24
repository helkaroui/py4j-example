from py4j.java_gateway import JavaGateway


def main():
    gateway = JavaGateway()
    random = gateway.jvm.java.util.Random()   # create a java.util.Random instance
    number1 = random.nextInt(10)
    number2 = random.nextInt(10)
    addition_app = gateway.entry_point
    value = addition_app.addition(number1, number2)
    print(value)

if __name__=="__main__":
    main()