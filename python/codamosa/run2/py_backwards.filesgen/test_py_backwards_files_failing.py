# Automatically generated by Pynguin.
import py_backwards.files as module_0

def test_case_0():
    try:
        str_0 = ''
        str_1 = '/B.py'
        iterable_0 = module_0.get_input_output_paths(str_0, str_0, str_1)
        var_0 = list(iterable_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'A/Bp'
        iterable_0 = module_0.get_input_output_paths(str_0, str_0, str_0)
        str_1 = 'x/B/B.py'
        iterable_1 = module_0.get_input_output_paths(str_0, str_1, str_1)
        var_0 = list(iterable_1)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '/A/B.py'
        str_1 = '/A'
        str_2 = '/B.py'
        iterable_0 = module_0.get_input_output_paths(str_0, str_2, str_1)
        var_0 = list(iterable_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ''
        iterable_0 = module_0.get_input_output_paths(str_0, str_0, str_0)
        var_0 = list(iterable_0)
        str_1 = '/B.py'
        var_1 = list(iterable_0)
        var_2 = None
        iterable_1 = module_0.get_input_output_paths(str_0, str_0, var_2)
        var_3 = list(iterable_1)
        iterable_2 = module_0.get_input_output_paths(str_0, str_0, str_1)
        var_4 = list(iterable_2)
    except BaseException:
        pass