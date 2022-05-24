import pytest


@pytest.fixture()
def get_list():
    list1 = list(range(11))
    print(list1)
    return list1