# Automatically generated by Pynguin.
import pymonet.semigroups as module_0

def test_case_0():
    try:
        semigroup_0 = module_0.Semigroup()
    except BaseException:
        pass

def test_case_1():
    try:
        map_0 = None
        list_0 = None
        list_1 = [list_0, list_0, list_0, list_0]
        list_2 = [list_1]
        all_0 = module_0.All(list_2)
        last_0 = module_0.Last(all_0)
        semigroup_0 = module_0.Semigroup(last_0)
        bool_0 = semigroup_0.__eq__(map_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = -1607
        complex_0 = None
        set_0 = {complex_0}
        semigroup_0 = module_0.Semigroup(set_0)
        var_0 = semigroup_0.fold(int_0)
    except BaseException:
        pass

def test_case_3():
    try:
        tuple_0 = ()
        set_0 = {tuple_0, tuple_0, tuple_0, tuple_0}
        first_0 = module_0.First(set_0)
        sum_0 = module_0.Sum(first_0)
        int_0 = 2260
        one_0 = module_0.One(int_0)
        first_1 = module_0.First(one_0)
        last_0 = module_0.Last(first_1)
        sum_1 = module_0.Sum(last_0)
        int_1 = -696
        all_0 = module_0.All(int_1)
        sum_2 = module_0.Sum(all_0)
        sum_3 = sum_2.concat(sum_1)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'w;%! \\U1XPI{,{d%\r'
        one_0 = module_0.One(str_0)
        str_1 = one_0.__str__()
        bytes_0 = b"'\x0b"
        float_0 = -530.6
        var_0 = one_0.concat(float_0)
        sum_0 = module_0.Sum(bytes_0)
        str_2 = 'Box[U]'
        all_0 = module_0.All(str_2)
        all_1 = module_0.All(all_0)
        complex_0 = None
        str_3 = all_0.__str__()
        semigroup_0 = module_0.Semigroup(complex_0)
        last_0 = module_0.Last(semigroup_0)
        max_0 = module_0.Max(str_0)
        var_1 = max_0.concat(all_0)
        bool_0 = semigroup_0.__eq__(all_1)
    except BaseException:
        pass

def test_case_5():
    try:
        all_0 = None
        str_0 = 'K&"T(&'
        all_1 = module_0.All(str_0)
        all_2 = all_1.concat(all_0)
    except BaseException:
        pass

def test_case_6():
    try:
        map_0 = None
        first_0 = module_0.First(map_0)
        str_0 = first_0.__str__()
        max_0 = module_0.Max(first_0)
        dict_0 = {str_0: str_0, map_0: max_0}
        first_1 = module_0.First(dict_0)
        all_0 = module_0.All(max_0)
        min_0 = module_0.Min(all_0)
        var_0 = min_0.concat(first_1)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'w;%! \\U1XPI{,{d%\r'
        one_0 = module_0.One(str_0)
        str_1 = one_0.__str__()
        bytes_0 = b"'\x0b"
        float_0 = -530.6
        var_0 = one_0.concat(float_0)
        sum_0 = module_0.Sum(bytes_0)
        str_2 = 'Box[U]'
        all_0 = module_0.All(str_2)
        all_1 = module_0.All(all_0)
        complex_0 = None
        semigroup_0 = module_0.Semigroup(complex_0)
        last_0 = module_0.Last(semigroup_0)
        max_0 = module_0.Max(str_0)
        var_1 = max_0.concat(all_0)
        bool_0 = None
        first_0 = module_0.First(bool_0)
        var_2 = last_0.concat(first_0)
        bool_1 = semigroup_0.__eq__(all_1)
    except BaseException:
        pass

def test_case_8():
    try:
        map_0 = None
        one_0 = module_0.One(map_0)
        one_1 = module_0.One(one_0)
        one_2 = module_0.One(one_1)
        max_0 = module_0.Max(one_2)
        str_0 = 'K^H|,m_aYp"'
        map_1 = module_0.Map(str_0)
        complex_0 = None
        last_0 = module_0.Last(complex_0)
        str_1 = last_0.__str__()
        set_0 = None
        str_2 = last_0.__str__()
        var_0 = map_1.concat(set_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bytes_0 = b'oLT\x0c\xb6\x11'
        str_0 = 'w;%! \\U1XPI{,{d%\r'
        one_0 = module_0.One(str_0)
        str_1 = one_0.__str__()
        min_0 = module_0.Min(bytes_0)
        bytes_1 = b"'\x0b"
        float_0 = -530.6
        var_0 = one_0.concat(float_0)
        sum_0 = module_0.Sum(bytes_1)
        var_1 = min_0.concat(sum_0)
        list_0 = [min_0, str_0, var_0]
        all_0 = module_0.All(list_0)
        str_2 = 'Box[U]'
        all_1 = module_0.All(str_2)
        all_2 = all_1.concat(all_0)
        complex_0 = None
        semigroup_0 = module_0.Semigroup(complex_0)
        last_0 = module_0.Last(semigroup_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'J:wJR'
        one_0 = module_0.One(str_0)
        tuple_0 = ()
        min_0 = module_0.Min(tuple_0)
        map_0 = module_0.Map(min_0)
        max_0 = module_0.Max(map_0)
        one_1 = module_0.One(max_0)
        int_0 = -3080
        semigroup_0 = module_0.Semigroup(int_0)
        last_0 = module_0.Last(semigroup_0)
        str_1 = last_0.__str__()
        one_2 = module_0.One(tuple_0)
        str_2 = ''
        var_0 = one_2.concat(str_2)
    except BaseException:
        pass

def test_case_11():
    try:
        map_0 = None
        float_0 = 3545.00715
        min_0 = module_0.Min(float_0)
        str_0 = map_0.__str__()
        dict_0 = {map_0: map_0}
        list_0 = []
        first_0 = module_0.First(list_0)
        str_1 = first_0.__str__()
        map_1 = module_0.Map(dict_0)
        int_0 = True
        map_2 = module_0.Map(int_0)
        str_2 = first_0.__str__()
        bytes_0 = b'\xbf\xd7\xe5\xaa\xbeW\xd26\xe2\x87\xe7\x0e2\xe4\\'
        last_0 = module_0.Last(first_0)
        tuple_0 = (bytes_0, last_0, first_0)
        var_0 = map_1.concat(tuple_0)
    except BaseException:
        pass