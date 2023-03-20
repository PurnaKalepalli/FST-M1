def fibonacci(num):
    if (num > 1):
        return (fibonacci(num-1) + fibonacci(num-2))
    else:
        return num


fibonacciCount = int(input("How many fibonnaci numbers to be generated : ").strip())

if fibonacciCount > 0:
    print ("Fibonnaci numbers : ")
    for a in range (1, (fibonacciCount + 1)):
        print(fibonacci(a))