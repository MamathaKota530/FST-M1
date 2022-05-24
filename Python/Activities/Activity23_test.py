import pytest


def test_sum1(get_list):
    sum =0
    for num in get_list:
        sum += num
    assert sum == 55

