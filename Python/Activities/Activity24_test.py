import pytest


@pytest.fixture()
def wallet():
    amount = 0
    return amount


@pytest.mark.parametrize("earned ,spent,expected",[(30,10,20), (20,2,180),])
def test_data(wallet, earned, spent, expected):
    wallet = wallet + earned
    wallet -= spent
    assert expected == expected
