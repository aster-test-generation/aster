# Automatically generated by Pynguin.
import cookiecutter.find as module_0

def test_case_0():
    try:
        float_0 = None
        var_0 = module_0.find_template(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '0``\x0b\nS'
        var_0 = module_0.find_template(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '../'
        var_0 = module_0.find_template(str_0)
    except BaseException:
        pass