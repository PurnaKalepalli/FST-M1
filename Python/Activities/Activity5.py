while True:
    num = int(input ("Enter a number to create multiplication table : "))

    for a in range (1,11):
        print (num, " x " ,a, " = " ,(num * a))

    repeat = str (input("Do you want to run again with different number - Yes or No: ").lower())

    if (repeat == "yes"):
        continue
    elif (repeat == "no"):
        raise SystemExit
    else:
        raise SystemExit