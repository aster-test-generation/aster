# Automatically generated by Pynguin.
import ansible.module_utils.common.dict_transformations as module_0

def test_case_0():
    try:
        float_0 = None
        var_0 = module_0.camel_dict_to_snake_dict(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        list_0 = []
        var_0 = module_0.snake_dict_to_camel_dict(list_0)
        int_0 = 10240
        float_0 = 1400.539315
        var_1 = module_0.camel_dict_to_snake_dict(int_0, float_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = 1.5
        str_0 = 'u"B82CZ\'ta-.ZL'
        var_0 = module_0.recursive_diff(float_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ">X}\x0bK'5)\r5ts0=\x0be, bS"
        int_0 = -3
        var_0 = module_0.snake_dict_to_camel_dict(str_0, int_0)
        str_1 = '=iqymSi7MM'
        list_0 = [str_1, str_1, str_1]
        bytes_0 = None
        dict_0 = {str_1: bytes_0}
        var_1 = module_0.dict_merge(list_0, dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '%ET'
        str_1 = {str_0: str_0}
        var_0 = module_0.camel_dict_to_snake_dict(str_1)
        bool_0 = True
        str_2 = 'Re.quird'
        str_3 = 'ype'
        str_4 = 'required'
        var_1 = {str_3: str_4, str_4: bool_0, str_0: bool_0}
        var_2 = {str_3: var_1}
        var_3 = module_0.camel_dict_to_snake_dict(var_2, str_3, str_3)
        var_4 = module_0.camel_dict_to_snake_dict(str_2, bool_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '=\nrM0G`6y&25=\x0b~WS|V'
        dict_0 = None
        var_0 = module_0.dict_merge(str_0, dict_0)
        str_1 = {str_0: str_0}
        var_1 = module_0.camel_dict_to_snake_dict(str_1)
        bytes_0 = None
        list_0 = [bytes_0, var_0]
        bool_0 = True
        var_2 = module_0.camel_dict_to_snake_dict(str_1, bool_0)
        str_2 = 'M{d~}wq'
        var_3 = module_0.dict_merge(bytes_0, str_2)
        var_4 = {str_0: list_0, bytes_0: str_1}
        str_3 = 'ype'
        var_5 = module_0.dict_merge(list_0, bytes_0)
        set_0 = set()
        int_0 = 1
        bool_1 = None
        tuple_0 = (set_0, int_0, bool_1, str_3)
        var_6 = module_0.snake_dict_to_camel_dict(bool_0, tuple_0)
        str_4 = 'required'
        var_7 = {str_3: str_4, str_4: bool_0, str_3: bool_0}
        var_8 = {str_3: var_7, str_0: list_0}
        var_9 = module_0.camel_dict_to_snake_dict(var_8, str_0, str_0)
        var_10 = module_0.camel_dict_to_snake_dict(var_4, bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = ']w'
        dict_0 = None
        str_1 = {}
        var_0 = module_0.camel_dict_to_snake_dict(str_1)
        list_0 = []
        float_0 = 3283.4962
        tuple_0 = (float_0, dict_0, dict_0)
        var_1 = module_0.dict_merge(list_0, tuple_0)
        bytes_0 = None
        list_1 = [bytes_0, list_0]
        bool_0 = True
        var_2 = module_0.camel_dict_to_snake_dict(str_1, bool_0)
        float_1 = -994.1
        var_3 = module_0.snake_dict_to_camel_dict(float_1)
        var_4 = {str_0: list_1, bytes_0: str_1}
        str_2 = 'e8'
        var_5 = module_0.dict_merge(list_1, bytes_0)
        str_3 = 'required'
        var_6 = {str_2: str_3, str_3: bool_0, str_2: bool_0}
        var_7 = {str_2: var_6}
        var_8 = module_0.camel_dict_to_snake_dict(var_7, str_0, str_0)
        var_9 = module_0.camel_dict_to_snake_dict(var_4, bool_0)
    except BaseException:
        pass