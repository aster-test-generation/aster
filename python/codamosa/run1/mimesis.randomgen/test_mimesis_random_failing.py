# Automatically generated by Pynguin.
import mimesis.random as module_0

def test_case_0():
    try:
        int_0 = 1695
        random_0 = module_0.Random()
        list_0 = random_0.randints(int_0)
        str_0 = '8Ou"]"?'
        str_1 = random_0.generate_string(str_0)
        int_1 = -1874
        list_1 = random_0.randints(int_1)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'hypotrochanteric'
        dict_0 = {str_0: str_0, str_0: str_0}
        any_0 = module_0.get_random_item(dict_0)
        bytes_0 = b's~\x1f\x14\xe2\xf2\xbb\xe0\x16\xc1\x00\xe5\xb5\xf7'
        random_0 = module_0.Random(bytes_0)
        bytes_1 = random_0.urandom()
    except BaseException:
        pass

def test_case_2():
    try:
        random_0 = module_0.Random()
        random_1 = module_0.Random(random_0)
        random_2 = module_0.Random()
        str_0 = None
        int_0 = -4577
        str_1 = 'j9al4;hNC3s2L'
        bool_0 = False
        str_2 = random_0.randstr(bool_0, int_0)
        str_3 = random_0.generate_string(str_1, int_0)
        str_4 = random_0.generate_string(str_0, int_0)
        str_5 = random_0.custom_code(str_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = None
        set_0 = {int_0, int_0, int_0, int_0}
        tuple_0 = (set_0,)
        any_0 = module_0.get_random_item(int_0, tuple_0)
    except BaseException:
        pass

def test_case_4():
    try:
        random_0 = module_0.Random()
        str_0 = '@###'
        str_1 = '#'
        str_2 = random_0.custom_code(str_0, str_1, str_1)
    except BaseException:
        pass