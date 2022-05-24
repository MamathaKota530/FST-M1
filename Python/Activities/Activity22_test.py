import pytest


def test_add1():
    x= 5
    y = 5
    assert x+y == 10


def test_diff1():
    x= 5
    y = 5
    assert x-y == 0


@pytest.mark.activity
def test_product1():
    x= 5
    y = 5
    assert x*y == 100


@pytest.mark.activity
def test_quotient1():
    x= 5
    y = 5
    assert x/y == 1