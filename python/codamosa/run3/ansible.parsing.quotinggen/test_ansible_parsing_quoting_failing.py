# Automatically generated by Pynguin.
import ansible.parsing.quoting as module_0

def test_case_0():
    try:
        float_0 = -643.9663
        var_0 = module_0.is_quoted(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = False
        var_0 = module_0.unquote(bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\x0f\x9aw\xca'
        var_0 = module_0.unquote(bytes_0)
        bool_0 = False
        var_1 = module_0.unquote(bool_0)
    except BaseException:
        pass