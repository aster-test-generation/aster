# Automatically generated by Pynguin.
import pymonet.box as module_0
import builtins as module_1

def test_case_0():
    pass

def test_case_1():
    str_0 = '\x0c$G\x0b5\rwO(V\r$vIw\x0bnmvg'
    box_0 = module_0.Box(str_0)

def test_case_2():
    dict_0 = {}
    object_0 = module_1.object(**dict_0)
    bytes_0 = b''
    box_0 = module_0.Box(bytes_0)
    bool_0 = box_0.__eq__(object_0)

def test_case_3():
    str_0 = "VNfoK#$*~_g+W'Sr"
    str_1 = '_yk|z}(QRT%#!y\'""'
    dict_0 = {str_0: str_0, str_0: str_0, str_1: str_0, str_1: str_1}
    box_0 = module_0.Box(dict_0)
    str_2 = box_0.__str__()

def test_case_4():
    str_0 = '\x0c$G\x0b5\rwO(V\r$vIw\x0bnmvg'
    box_0 = module_0.Box(str_0)
    var_0 = box_0.to_maybe()

def test_case_5():
    int_0 = 1
    box_0 = module_0.Box(int_0)
    box_1 = module_0.Box(int_0)
    var_0 = box_0.to_lazy()
    bool_0 = box_0.__eq__(box_1)
    box_2 = module_0.Box(int_0)
    bool_1 = box_2.__eq__(box_1)
    str_0 = '1'
    bool_2 = box_0.__eq__(str_0)
    var_1 = box_2.to_validation()
    box_3 = module_0.Box(int_0)
    bool_3 = box_3.__eq__(int_0)

def test_case_6():
    str_0 = '?2\t`rz'
    box_0 = module_0.Box(str_0)
    var_0 = box_0.to_validation()