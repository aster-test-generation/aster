# Automatically generated by Pynguin.
import pymonet.task as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '>fouoR'
    task_0 = module_0.Task(str_0)

def test_case_2():
    float_0 = 2125.123076
    bytes_0 = b'\xe6\xbe\xd3\x06\xac\x08):a\xb5'
    task_0 = module_0.Task(bytes_0)
    var_0 = task_0.map(float_0)
    str_0 = ''
    task_1 = module_0.Task(str_0)

def test_case_3():
    float_0 = -952.79
    dict_0 = {}
    task_0 = module_0.Task(dict_0)
    var_0 = task_0.map(float_0)
    bool_0 = None
    var_1 = task_0.bind(bool_0)