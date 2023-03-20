import pytest


@pytest.fixture
def amount():
    walletAmt = 0
    return walletAmt


@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18)])
def testOrders(amount, earned, spent, expected):
    amount+= earned
    amount -= spent
    assert amount == expected
