# Automatically generated by Pynguin.
import blib2to3.pgen2.literals as module_0
import re as module_1

def test_case_0():
    try:
        str_0 = 'z-]$z=5\\+<:BHIf'
        str_1 = module_0.evalString(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '"\rlIu'
        str_1 = module_0.evalString(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        module_0.test()
        str_0 = "'d'"
        str_1 = module_0.evalString(str_0)
        str_2 = '"""'
        str_3 = module_0.evalString(str_2)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '\\\\(.)'
        str_1 = '\\x'
        var_0 = module_1.match(str_0, str_1)
        str_2 = module_0.escape(var_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '\\\\(.)'
        str_1 = '\\,'
        var_0 = module_1.match(str_0, str_1)
        str_2 = module_0.escape(var_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = "\\\\(.)|['"
        str_1 = '"'
        var_0 = str_0 + str_1
        str_2 = '\\\\]'
        var_1 = var_0 + str_2
        str_3 = "'"
        var_2 = module_1.match(var_1, str_3)
        str_4 = module_0.escape(var_2)
    except BaseException:
        pass