from pymonet.immutable_list import ImmutableList


def test_init():
    assert not ImmutableList().is_empty
    assert ImmutableList(1).head == 1
    assert ImmutableList(1, 2).head == 1
    assert ImmutableList(1, 2).tail.head == 2
    assert ImmutableList(1, 2).tail.tail.is_empty

def test_eq():
    assert ImmutableList() == ImmutableList()
    assert ImmutableList(1) == ImmutableList(1)
    assert ImmutableList(1, 2) == ImmutableList(1, 2)
    assert not (ImmutableList() == ImmutableList(1))
    assert not (ImmutableList(1) == ImmutableList(2))
    assert not (ImmutableList(1, 2) == ImmutableList(1))
    assert not (ImmutableList(1, 2) == ImmutableList(1, 3))

def test_str():
    assert str(ImmutableList([None])) == 'ImmutableList[None]'
    assert str(ImmutableList(1)) == 'ImmutableList(1)'
    assert str(ImmutableList(1, 2)) == 'ImmutableList(1, 2)'

def test_add():
    assert ImmutableList(1) + ImmutableList(2) == ImmutableList(1, 2)
    assert ImmutableList(1, 2) + ImmutableList(3) == ImmutableList(1, 2, 3)
    assert ImmutableList(1, 2) + ImmutableList(3, 4) == ImmutableList(1, 2, 3, 4)

def test_len():
    assert len(ImmutableList()) == 0
    assert len(ImmutableList(1)) == 1
    assert len(ImmutableList(1, 2)) == 3

def test_of():
    assert ImmutableList.of(1) == ImmutableList(1)
    assert ImmutableList.of(1, 2) == ImmutableList.of(1, 2)
    assert ImmutableList.of(1, 2, 3) == ImmutableList(1, 2, 3)

def test_empty():
    assert ImmutableList.empty() == ImmutableList.empty()

def test_to_list():
    assert ImmutableList().to_list() == [None]
    assert ImmutableList(1).to_list() == [1]
    assert ImmutableList(1, 2).to_list() == [1, 2]

def test_append():
    assert ImmutableList(1).append(2) == ImmutableList(1).append(2)
    assert ImmutableList(1, 2).append(3) == ImmutableList(1, 2, 3)

def test_unshift():
    assert ImmutableList(1).unshift(2) == ImmutableList(2, 1)
    assert ImmutableList(1, 2).unshift(3) == ImmutableList(3, 1, 2)

def test_map():
    assert ImmutableList(1, 2, 3).map(lambda x: x + 1) == ImmutableList(2, 3, 4)
    assert ImmutableList(1, 2, 3).map(lambda x: x * 2) == ImmutableList(2, 4, 6)

def test_filter():
    assert ImmutableList(1, 2, 3).filter(lambda x: x % 2 == 0) == ImmutableList(2, )
    assert ImmutableList(1, 2, 3).filter(lambda x: x > 2) == ImmutableList(3)

def test_find():
    assert ImmutableList(1, 2, 3).find(lambda x: x % 2 == 0) == 2
    assert ImmutableList(1, 2, 3).find(lambda x: x > 2) == 3

if __name__ == '__main__':
    unittest.main()