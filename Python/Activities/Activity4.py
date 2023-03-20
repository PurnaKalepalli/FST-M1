inputplayer1 = str(input("Enter the Player1 Name : "))
inputplayer2 = str(input("Enter the Player2 Name : "))

while True:
    player1Choice = str(input(inputplayer1+"- Choose your option among rock, paper or scissor -> ").lower())
    player2Choice = str(input(inputplayer2+"- Choose your option among rock, paper or scissor -> ").lower())

    if (player1Choice != "rock" and player1Choice != "paper" and player1Choice != "scissor"):
        print ("Player1 not selected any valid choice among rock, paper and scissor")
    if (player2Choice != "sock" and player2Choice != "paper" and player2Choice != "scissor"):
        print ("Player2 not selected any valid choice among rock, paper and scissor")

    if (player1Choice == "rock"):
        if (player2Choice == "paper"):
            print ("Player 2 wins by choosing "+player2Choice+" when Player1 chose "+player1Choice)
        elif (player2Choice == "scissor"):
            print ("Player 1 wins by choosing "+player1Choice+" when Player2 chose "+player2Choice)
        elif (player2Choice == "rock"):
            print ("Game is a tie since both players selected same choice : "+player2Choice)
        else:
            print ("Player2 not selected any valid choice among rock, paper and scissor")

    elif (player1Choice == "paper"):
        if (player2Choice == "scissor"):
            print ("Player 2 wins by choosing "+player2Choice+" when Player1 chose "+player1Choice)
        elif (player2Choice == "rock"):
            print ("Player 1 wins by choosing "+player1Choice+" when Player2 chose "+player2Choice)
        elif (player2Choice == "paper"):
            print ("Game is a tie since both players selected same choice : "+player1Choice)
        else:
            print ("Player2 not selected any valid choice among rock, paper and scissor")

    elif (player1Choice == "scissor"):
        if (player2Choice == "rock"):
            print ("Player 2 wins by choosing "+player2Choice+" when Player1 chose "+player1Choice)
        elif (player2Choice == "paper"):
            print ("Player 1 wins by choosing "+player1Choice+" when Player2 chose "+player2Choice)
        elif (player2Choice == "scissor"):
            print ("Game is a tie since both players selected same choice : "+player1Choice)
        else:
            print ("Player2 not selected any valid choice among rock, paper and scissor")

    playAgain = str(input("Players want to play again - Yes or No : ").lower())

    if (playAgain == "yes"):
        continue
    elif (playAgain == "no"):
        raise SystemExit
    else:
        print ("Players not selected any valid choice to check if they want to play again or exit")
        raise SystemExit