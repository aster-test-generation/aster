# Automatically generated by Pynguin.
import ansible.module_utils.common.dict_transformations as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'HttpEndpoint'
    str_1 = [str_0, str_0]
    str_2 = {str_0: str_1, str_0: str_1}
    var_0 = module_0.camel_dict_to_snake_dict(str_2)

def test_case_2():
    str_0 = 'HttpEndpoint'
    str_1 = {str_0: str_0, str_0: str_0}
    str_2 = [str_1, str_1]
    str_3 = {str_0: str_2, str_0: str_2}
    var_0 = module_0.camel_dict_to_snake_dict(str_3)

def test_case_3():
    set_0 = set()
    var_0 = module_0.snake_dict_to_camel_dict(set_0)

def test_case_4():
    str_0 = '\toa'
    list_0 = [str_0, str_0, str_0, str_0]
    var_0 = module_0.snake_dict_to_camel_dict(list_0)
    dict_0 = {str_0: str_0}
    int_0 = 311
    str_1 = '4y\\klD\n,X8tGyI9Gc>z5'
    var_1 = module_0.dict_merge(int_0, str_1)
    var_2 = module_0.snake_dict_to_camel_dict(dict_0, str_0)
    var_3 = module_0.camel_dict_to_snake_dict(dict_0)

def test_case_5():
    complex_0 = None
    var_0 = module_0.snake_dict_to_camel_dict(complex_0, complex_0)

def test_case_6():
    float_0 = -791.182
    var_0 = module_0.dict_merge(float_0, float_0)

def test_case_7():
    dict_0 = {}
    var_0 = module_0.dict_merge(dict_0, dict_0)

def test_case_8():
    str_0 = 'cache_update_time'
    dict_0 = {str_0: str_0}
    var_0 = module_0.snake_dict_to_camel_dict(dict_0)
    var_1 = module_0.dict_merge(str_0, str_0)
    bytes_0 = None
    var_2 = module_0.snake_dict_to_camel_dict(bytes_0)

def test_case_9():
    int_0 = 1
    int_1 = 2
    int_2 = 3
    int_3 = {int_0: int_0, int_1: int_1, int_2: int_2}
    int_4 = {int_0: int_0, int_1: int_1, int_2: int_2}
    var_0 = module_0.dict_merge(int_3, int_4)
    int_5 = {int_0: int_3}
    int_6 = {int_0: int_0, int_1: int_1, int_2: int_2}
    var_1 = module_0.dict_merge(int_5, int_6)
    int_7 = {int_0: int_4}
    int_8 = {int_1: int_1, int_2: int_2}
    var_2 = module_0.dict_merge(int_7, int_8)

def test_case_10():
    str_0 = 'n0m7p_'
    dict_0 = {str_0: str_0}
    int_0 = 311
    str_1 = '4y\\klD\n,X8tGyI9Gc>z5'
    var_0 = module_0.dict_merge(int_0, str_1)
    var_1 = module_0.snake_dict_to_camel_dict(dict_0)
    var_2 = module_0.snake_dict_to_camel_dict(dict_0, str_1)
    str_2 = '[P|%~]4M41LI`Q'
    int_1 = 22
    bytes_0 = b'\xf0\xe3\x7f\x9e,\xed%M\xb9\xb1\x16\xef\x9ce\x8b+'
    dict_1 = {bytes_0: var_2, str_0: str_2, int_1: str_0, str_0: str_0}
    var_3 = module_0.recursive_diff(dict_1, dict_1)

def test_case_11():
    str_0 = 'HttpEndpoint'
    str_1 = 'test'
    str_2 = {str_0: str_1}
    var_0 = module_0.camel_dict_to_snake_dict(str_2)
    str_3 = {str_0: str_1}
    bool_0 = True
    var_1 = module_0.camel_dict_to_snake_dict(str_3, bool_0)
    str_4 = 'Tags'
    str_5 = 'keyOne'
    str_6 = 'keyTwo'
    str_7 = 'valueOne'
    str_8 = 'valueTwo'
    str_9 = {str_5: str_7, str_6: str_8}
    str_10 = {str_0: str_1, str_4: str_9}
    var_2 = module_0.camel_dict_to_snake_dict(str_10, str_4)

def test_case_12():
    bytes_0 = b'\xd2\xe8\xd2W\x9e'
    bool_0 = False
    dict_0 = {bytes_0: bytes_0, bytes_0: bytes_0, bytes_0: bool_0, bytes_0: bool_0}
    var_0 = module_0.recursive_diff(dict_0, dict_0)

def test_case_13():
    str_0 = '!)}'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    dict_1 = {str_0: str_0, str_0: dict_0}
    var_0 = module_0.camel_dict_to_snake_dict(dict_1)

def test_case_14():
    int_0 = 1
    int_1 = 2
    var_0 = dict(c1=int_0, c2=int_1)
    var_1 = dict(a=int_0, b=int_0, c=var_0, d=int_1)
    var_2 = dict(c1=int_1, c2=int_1)
    var_3 = dict(a=int_0, c=var_2, d=int_1)
    var_4 = dict(c1=var_1)
    var_5 = dict(b=int_0, c=var_4, d=int_0)
    var_6 = dict(c1=int_1)
    var_7 = dict(c=var_6, d=int_1)
    var_8 = module_0.recursive_diff(var_1, var_3)
    var_9 = dict(c1=int_0, c2=int_1)
    var_10 = dict(a=int_0, b=int_0, c=int_1, d=int_0)

def test_case_15():
    str_0 = 'n0m7p'
    list_0 = [str_0, str_0, str_0, str_0, str_0, str_0, str_0, str_0]
    var_0 = module_0.snake_dict_to_camel_dict(list_0)
    dict_0 = {str_0: str_0}
    str_1 = '5)vx"zHI;<{'
    int_0 = 311
    var_1 = module_0.dict_merge(int_0, str_1)
    str_2 = 'y\rl'
    var_2 = module_0.snake_dict_to_camel_dict(dict_0)
    var_3 = module_0.snake_dict_to_camel_dict(dict_0, str_1)
    var_4 = module_0.camel_dict_to_snake_dict(dict_0)
    str_3 = '[P|%~]4M41LI`Q'
    int_1 = 5
    bytes_0 = b'\xf0\xe3\x7f\x9e,\xed%M\xb9\xb1\x16\xef\x9ce\x8b+'
    dict_1 = {bytes_0: var_3, str_2: str_3, int_1: str_2, str_1: str_1}
    complex_0 = None
    var_5 = module_0.dict_merge(list_0, complex_0)
    var_6 = module_0.recursive_diff(dict_0, dict_1)

def test_case_16():
    str_0 = '_added_by_ansible_this_time'
    str_1 = [str_0, str_0]
    str_2 = {str_0: str_1, str_0: str_1}
    var_0 = module_0.camel_dict_to_snake_dict(str_2)

def test_case_17():
    int_0 = 1
    int_1 = 2
    int_2 = 3
    int_3 = [int_0, int_1, int_2]
    str_0 = 'a'
    str_1 = 'b'
    str_2 = 'c'
    int_4 = {str_2: int_0}
    int_5 = {str_0: int_0, str_1: int_4}
    int_6 = {int_0: int_3, int_1: int_5}
    int_7 = [int_0, int_1, int_2]
    int_8 = {int_0: int_7, int_1: int_7}
    var_0 = module_0.recursive_diff(int_6, int_8)
    int_9 = [int_0, int_1, int_2]
    int_10 = {str_2: int_0}
    int_11 = {str_0: int_0, str_1: int_10}
    int_12 = {int_0: int_9, int_1: int_11}
    int_13 = 7
    int_14 = 8
    int_15 = 9
    int_16 = [int_13, int_14, int_15]
    int_17 = {str_2: int_0}
    int_18 = {str_0: int_0, str_1: int_17}
    int_19 = {int_0: int_16, int_1: int_18}
    var_1 = module_0.recursive_diff(int_12, int_19)

def test_case_18():
    str_0 = 'Unit testing of function: recursive_diff'
    var_0 = print(str_0)
    var_1 = {}
    var_2 = {}
    var_3 = module_0.recursive_diff(var_1, var_2)
    str_1 = 'Somehow the function works.'
    var_4 = print(str_1)
    str_2 = "Something's wrong with the function."
    var_5 = print(str_2)
    str_3 = 'a'
    str_4 = 'b'
    int_0 = 1
    int_1 = 2
    int_2 = {str_3: int_0, str_4: int_1}
    var_6 = {}
    var_7 = module_0.recursive_diff(int_2, var_6)
    str_5 = 'Somehow the function works.'
    var_8 = print(str_5)
    str_6 = "Something's wrong with the function."
    var_9 = print(str_6)
    var_10 = {}
    int_3 = {str_3: int_0, str_4: int_1}
    var_11 = module_0.recursive_diff(var_10, int_3)