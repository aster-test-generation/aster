# Automatically generated by Pynguin.
import flutes.iterator as module_0

def test_case_0():
    pass

def test_case_1():
    bytes_0 = b'U"\x1e\xbf!N\xd3\x91\xc9{\x0c\xcbtnj\xd3U\xc2'
    lazy_list_0 = module_0.LazyList(bytes_0)
    var_0 = list(lazy_list_0)

def test_case_2():
    int_0 = 1763
    bool_0 = False
    list_0 = [int_0, bool_0, int_0]
    range_0 = module_0.Range(*list_0)
    var_0 = range_0.__getitem__(bool_0)

def test_case_3():
    str_0 = 'utf-8'
    iterable_0 = None
    iterator_0 = module_0.split_by(iterable_0)
    map_list_0 = module_0.MapList(str_0, iterator_0)

def test_case_4():
    int_0 = 1801
    bool_0 = True
    list_0 = [int_0, int_0]
    range_0 = module_0.Range(*list_0)
    var_0 = range_0.__getitem__(bool_0)

def test_case_5():
    int_0 = 2136
    bool_0 = True
    list_0 = [int_0]
    range_0 = module_0.Range(*list_0)
    var_0 = range_0.__getitem__(bool_0)

def test_case_6():
    int_0 = 1743
    bool_0 = False
    list_0 = [int_0, bool_0, int_0]
    range_0 = module_0.Range(*list_0)
    var_0 = range_0.__getitem__(bool_0)
    int_1 = range_0.__len__()

def test_case_7():
    int_0 = 1802
    bool_0 = True
    list_0 = [int_0, bool_0, int_0]
    range_0 = module_0.Range(*list_0)
    iterator_0 = range_0.__iter__()
    var_0 = range_0.__getitem__(bool_0)

def test_case_8():
    bytes_0 = b'jM\x90_\xd3\x96'
    lazy_list_0 = module_0.LazyList(bytes_0)
    bool_0 = True
    var_0 = lazy_list_0.__getitem__(bool_0)
    var_1 = list(lazy_list_0)

def test_case_9():
    int_0 = 10
    var_0 = range(int_0)
    iterator_0 = module_0.chunk(int_0, var_0)
    var_1 = list(iterator_0)

def test_case_10():
    int_0 = 3
    int_1 = 11
    var_0 = range(int_1)
    iterator_0 = module_0.chunk(int_0, var_0)
    var_1 = list(iterator_0)

def test_case_11():
    int_0 = 1
    int_1 = 2
    int_2 = 3
    iterable_0 = None
    iterator_0 = module_0.drop(int_0, iterable_0)
    iterator_1 = module_0.drop_until(iterator_0, iterable_0)
    int_3 = [int_0, int_1, int_2]
    bool_0 = None
    iterator_2 = module_0.chunk(int_0, bool_0)
    iterator_3 = module_0.drop(int_2, int_3)
    var_0 = list(iterator_3)
    var_1 = len(var_0)

def test_case_12():
    int_0 = 1
    int_1 = 2
    int_2 = 3
    int_3 = [int_0, int_1, int_2]
    iterator_0 = module_0.drop(int_0, int_3)
    var_0 = list(iterator_0)
    var_1 = len(var_0)
    int_4 = [var_0]
    iterator_1 = module_0.drop(int_1, int_4)
    var_2 = list(iterator_1)
    var_3 = len(var_2)
    int_5 = [int_0, int_1, int_2]
    iterator_2 = module_0.drop(int_2, int_5)
    var_4 = list(iterator_2)
    var_5 = len(var_4)

def test_case_13():
    var_0 = None
    var_1 = []
    iterator_0 = module_0.drop_until(var_0, var_1)
    var_2 = list(iterator_0)
    int_0 = 1
    iterator_1 = module_0.drop_until(var_0, int_0)

def test_case_14():
    int_0 = 1802
    bool_0 = True
    list_0 = [int_0]
    range_0 = module_0.Range(*list_0)
    var_0 = range_0.__getitem__(bool_0)
    int_1 = range_0.__next__()

def test_case_15():
    int_0 = 1
    int_1 = 2
    int_2 = 3
    int_3 = 6
    int_4 = 8
    int_5 = [int_0, int_1, int_2, int_0, int_1, int_3, int_0, int_4, int_0]
    str_0 = ' Split by: '
    bool_0 = True
    str_1 = '.'
    iterator_0 = module_0.split_by(str_0, bool_0, separator=str_1)
    var_0 = list(iterator_0)
    var_1 = [bool_0, int_1, int_2, int_4, int_2, int_3, int_4, int_4, int_5]
    iterator_1 = module_0.split_by(var_1, separator=int_1)
    var_2 = list(iterator_1)

def test_case_16():
    bytes_0 = b'U"\x1e\xbf!N\xd3\x91\xc9{\x0c\xcbtnj\xd3U\xc2'
    lazy_list_0 = module_0.LazyList(bytes_0)
    var_0 = lazy_list_0.__iter__()
    var_1 = list(var_0)

def test_case_17():
    bytes_0 = b'jM\x90_\xd3\x96'
    lazy_list_0 = module_0.LazyList(bytes_0)
    bool_0 = False
    var_0 = lazy_list_0.__getitem__(bool_0)
    var_1 = list(lazy_list_0)

def test_case_18():
    int_0 = 1
    int_1 = 1
    int_2 = 3
    int_3 = 4
    int_4 = 5
    int_5 = 6
    int_6 = 7
    int_7 = 8
    int_8 = 9
    int_9 = [int_0, int_1, int_2, int_3, int_4, int_5, int_6, int_7, int_8]
    str_0 = 'F'
    bool_0 = True
    str_1 = '\\'
    iterator_0 = module_0.split_by(str_0, bool_0, separator=str_1)
    var_0 = list(iterator_0)
    var_1 = [bool_0, int_1, int_2, int_3, int_4, int_5, int_6, int_7, int_8]
    tuple_0 = ()
    list_0 = [int_2, int_9, int_5, int_1]
    iterator_1 = module_0.split_by(tuple_0, criterion=list_0)
    iterator_2 = module_0.split_by(var_1, separator=int_1)
    var_2 = list(iterator_2)

def test_case_19():
    bytes_0 = b'U"\x1e!N\xd3\x91\xc9{\x0c\xcbtnj\xd3\xc2'
    lazy_list_0 = module_0.LazyList(bytes_0)
    var_0 = list(lazy_list_0)
    var_1 = lazy_list_0.__len__()

def test_case_20():
    bytes_0 = b'U"\x1e\xbf!N\xd3\x91\xc9{\x0c\xcbtnj\xd3U\xc2'
    lazy_list_0 = module_0.LazyList(bytes_0)
    var_0 = list(lazy_list_0)
    var_1 = lazy_list_0.__iter__()

def test_case_21():
    int_0 = 5
    int_1 = 1000000
    var_0 = range(int_1)
    iterator_0 = module_0.take(int_0, var_0)
    int_2 = 0
    var_1 = range(int_1)
    iterator_1 = module_0.take(int_2, var_1)
    var_2 = list(iterator_1)
    var_3 = list(iterator_1)

def test_case_22():
    int_0 = 5
    var_0 = range(int_0)
    iterator_0 = module_0.take(int_0, var_0)
    int_1 = 0
    iterator_1 = module_0.take(int_0, var_0)
    var_1 = list(iterator_1)
    iterator_2 = module_0.take(int_1, iterator_1)
    var_2 = list(iterator_2)
    int_2 = 10
    var_3 = range(int_2)

def test_case_23():
    int_0 = 1000000
    var_0 = range(int_0)
    int_1 = 0
    var_1 = range(int_1)
    iterator_0 = module_0.take(int_0, var_1)
    var_2 = list(iterator_0)
    var_3 = range(int_1)
    iterator_1 = module_0.take(int_1, var_3)
    var_4 = list(iterator_1)
    int_2 = 10
    var_5 = range(int_2)
    iterator_2 = module_0.take(int_2, var_5)
    var_6 = list(iterator_2)