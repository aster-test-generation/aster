# Automatically generated by Pynguin.
import flutes.iterator as module_0

def test_case_0():
    pass

def test_case_1():
    int_0 = 2460
    str_0 = ''
    dict_0 = {str_0: int_0}
    var_0 = module_0.scanr(int_0, dict_0)

def test_case_2():
    int_0 = 5
    list_0 = [int_0, int_0, int_0]
    lazy_list_0 = module_0.LazyList(list_0)
    var_0 = list(lazy_list_0)

def test_case_3():
    str_0 = 'M'
    lazy_list_0 = module_0.LazyList(str_0)

def test_case_4():
    int_0 = -2466
    list_0 = [int_0]
    range_0 = module_0.Range(*list_0)
    list_1 = [int_0, int_0, int_0, int_0]
    lazy_list_0 = module_0.LazyList(list_1)
    var_0 = list(lazy_list_0)

def test_case_5():
    int_0 = 5
    list_0 = [int_0]
    range_0 = module_0.Range(*list_0)
    iterator_0 = range_0.__iter__()
    var_0 = []
    iterator_1 = module_0.drop_until(int_0, var_0)
    int_1 = -3094
    set_0 = set()
    iterator_2 = module_0.chunk(int_1, set_0)
    var_1 = list(iterator_1)

def test_case_6():
    int_0 = -2466
    list_0 = [int_0]
    range_0 = module_0.Range(*list_0)
    int_1 = range_0.__len__()
    list_1 = [int_0, int_0, int_0, int_0]
    lazy_list_0 = module_0.LazyList(list_1)
    var_0 = list(lazy_list_0)

def test_case_7():
    int_0 = -12
    list_0 = [int_0, int_0, int_0, int_0, int_0]
    dict_0 = {}
    map_list_0 = module_0.MapList(dict_0, list_0)
    lazy_list_0 = module_0.LazyList(list_0)
    var_0 = list(lazy_list_0)

def test_case_8():
    int_0 = 2460
    str_0 = ''
    dict_0 = {str_0: int_0}
    map_list_0 = module_0.MapList(str_0, dict_0)
    int_1 = 11
    var_0 = module_0.scanr(int_1, dict_0)
    iterator_0 = map_list_0.__iter__()

def test_case_9():
    bool_0 = False
    str_0 = 'T'
    lazy_list_0 = module_0.LazyList(str_0)
    var_0 = lazy_list_0.__getitem__(bool_0)

def test_case_10():
    int_0 = 3
    str_0 = 'Hello, world!'
    iterator_0 = module_0.take(int_0, str_0)
    var_0 = list(iterator_0)
    int_1 = 0
    int_2 = 1000000
    var_1 = range(int_2)
    iterator_1 = module_0.take(int_0, var_1)
    var_2 = list(iterator_1)
    iterator_2 = module_0.take(int_1, str_0)
    var_3 = list(iterator_2)
    int_3 = 10
    str_1 = 'Python'
    iterator_3 = module_0.take(int_3, str_1)
    var_4 = list(iterator_3)
    var_5 = list(str_1)

def test_case_11():
    int_0 = 5
    var_0 = []
    iterator_0 = module_0.drop_until(int_0, var_0)
    var_1 = list(iterator_0)

def test_case_12():
    str_0 = ' Split by: '
    bool_0 = False
    str_1 = ' '
    iterator_0 = module_0.split_by(str_0, bool_0, separator=str_1)
    var_0 = list(iterator_0)

def test_case_13():
    int_0 = 2
    int_1 = [int_0, int_0, int_0, int_0, int_0]
    lazy_list_0 = module_0.LazyList(int_1)
    int_2 = 0
    var_0 = lazy_list_0[int_2]
    int_3 = 30
    var_1 = var_0 + int_3
    var_2 = lazy_list_0[int_2]
    int_4 = 1
    var_3 = int_2 + int_4

def test_case_14():
    str_0 = ' Split by: '
    bool_0 = True
    str_1 = 'N'
    iterator_0 = module_0.split_by(str_0, bool_0, separator=str_1)
    var_0 = list(iterator_0)
    iterator_1 = module_0.split_by(str_0, bool_0, separator=str_0)
    var_1 = list(iterator_1)

def test_case_15():
    str_0 = ' Split by: '
    bool_0 = True
    str_1 = ''
    iterator_0 = module_0.split_by(str_0, bool_0, separator=str_1)
    str_2 = ' '
    iterator_1 = module_0.split_by(str_0, bool_0, separator=str_2)
    var_0 = list(iterator_1)

def test_case_16():
    iterator_0 = None
    float_0 = -636.2
    tuple_0 = (iterator_0, float_0)
    lazy_list_0 = module_0.LazyList(tuple_0)
    var_0 = lazy_list_0.__iter__()
    var_1 = list(var_0)

def test_case_17():
    int_0 = -3
    list_0 = [int_0, int_0, int_0, int_0]
    lazy_list_0 = module_0.LazyList(list_0)
    var_0 = list(lazy_list_0)
    var_1 = lazy_list_0.__len__()

def test_case_18():
    int_0 = 37
    list_0 = [int_0, int_0, int_0]
    lazy_list_0 = module_0.LazyList(list_0)
    var_0 = list(lazy_list_0)
    var_1 = lazy_list_0.__iter__()

def test_case_19():
    int_0 = -38
    var_0 = lambda x: x ** int_0
    int_1 = 1
    int_2 = -26
    int_3 = 4
    int_4 = 5
    int_5 = [int_1, int_0, int_2, int_3, int_4]
    map_list_0 = module_0.MapList(var_0, int_5)
    int_6 = 0
    var_1 = slice(int_6, int_4, int_0)
    var_2 = map_list_0.__getitem__(var_1)

def test_case_20():
    int_0 = -2186
    int_1 = -556
    list_0 = [int_0]
    range_0 = module_0.Range(*list_0)
    var_0 = range_0.__getitem__(int_0)
    var_1 = range(int_1, int_1)
    iterator_0 = module_0.drop_until(int_1, var_1)
    var_2 = list(iterator_0)

def test_case_21():
    var_0 = lambda s, x: x + s
    str_0 = 'a'
    str_1 = 'b'
    str_2 = 'c'
    str_3 = 'd'
    str_4 = [str_0, str_1, str_2, str_3]
    var_1 = module_0.scanl(var_0, str_4)
    var_2 = list(var_1)
    var_3 = lambda s, x: x + s

def test_case_22():
    int_0 = 1
    int_1 = 2
    int_2 = 3
    int_3 = 4
    int_4 = [int_0, int_1, int_2, int_3]
    lazy_list_0 = module_0.LazyList(int_4)
    str_0 = 'The result of __getitem__ if idx is int:'
    var_0 = print(str_0)
    var_1 = lazy_list_0[int_1]
    var_2 = print(var_1)
    str_1 = 'The result of __getitem__ if idx is slice:'
    var_3 = print(str_1)
    var_4 = lazy_list_0[int_0:int_2]
    var_5 = print(var_4)
    int_5 = -1
    var_6 = lazy_list_0[:int_5]
    var_7 = print(var_6)