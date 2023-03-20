import pytest



def test_addition():

    num1 = 20
    num2 = 40
    sum = num1 + num2
    assert sum == 60


def test_subtraction():
    num1 = 200
    num2 = 100
    diff = num1 - num2
    assert diff == 100


def test_multiplication():
    num1 = 10
    num2 = 5
    mul = num1 * num2
    assert mul == 50


def test_division():
    num1 = 200
    num2 = 10
    quotient = num1 / num2
    assert quotient == 20