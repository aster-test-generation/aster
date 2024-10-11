from pymonet.immutable_list import ImmutableList

def test_init():
    empty_list = ImmutableList()
    assert empty_list.head is None
    assert empty_list.tail is None
    assert empty_list.is_empty is True

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.head == 1
    assert non_empty_list.tail.head == 2
    assert non_empty_list.tail.tail.head == 3
    assert non_empty_list.tail.tail.tail is None
    assert non_empty_list.is_empty is False

def test_eq():
    empty_list1 = ImmutableList()
    empty_list2 = ImmutableList()
    assert empty_list1 == empty_list2

    non_empty_list1 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    non_empty_list2 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list1 == non_empty_list2

def test_str():
    empty_list = ImmutableList()
    assert str(empty_list) == 'ImmutableList[]'

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert str(non_empty_list) == 'ImmutableList[1, 2, 3]'

def test_add():
    empty_list = ImmutableList()
    assert empty_list + empty_list == empty_list

    non_empty_list1 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    non_empty_list2 = ImmutableList(4, ImmutableList(5, ImmutableList(6)))
    assert non_empty_list1 + non_empty_list2 == ImmutableList(1, ImmutableList(2, ImmutableList(3, 4, 5, 6)))

def test_len():
    empty_list = ImmutableList()
    assert len(empty_list) == 0

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert len(non_empty_list) == 3

def test_of():
    empty_list = ImmutableList.of()
    assert empty_list.head is None
    assert empty_list.tail is None
    assert empty_list.is_empty is True

    non_empty_list = ImmutableList.of(1, 2, 3)
    assert non_empty_list.head == 1
    assert non_empty_list.tail.head == 2
    assert non_empty_list.tail.tail.head == 3
    assert non_empty_list.tail.tail.tail is None
    assert non_empty_list.is_empty is False

def test_empty():
    empty_list = ImmutableList.empty()
    assert empty_list.head is None
    assert empty_list.tail is None
    assert empty_list.is_empty is True

def test_to_list():
    empty_list = ImmutableList()
    assert empty_list.to_list() == []

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.to_list() == [1, 2, 3]

def test_append():
    empty_list = ImmutableList()
    assert empty_list.append(1) == ImmutableList(1)

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.append(4) == ImmutableList(1, ImmutableList(2, ImmutableList(3, 4)))

def test_unshift():
    empty_list = ImmutableList()
    assert empty_list.unshift(1) == ImmutableList(1)

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.unshift(4) == ImmutableList(4, ImmutableList(1, ImmutableList(2, ImmutableList(3))))

def test_map():
    empty_list = ImmutableList()
    assert empty_list.map(lambda x: x + 1) == empty_list

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.map(lambda x: x + 1) == ImmutableList(2, ImmutableList(3, ImmutableList(4)))

if __name__ == '__main__':
    unittest.main()