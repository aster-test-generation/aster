# Automatically generated by Pynguin.
import pymonet.monad_try as module_0

def test_case_0():
    pass

def test_case_1():
    bool_0 = False
    try_0 = module_0.Try(bool_0, bool_0)

def test_case_2():
    set_0 = set()
    bool_0 = True
    try_0 = module_0.Try(bool_0, bool_0)
    bool_1 = try_0.__eq__(set_0)

def test_case_3():
    str_0 = 'PcW}60:.o\t`\x0b~OZ,4z9'
    bool_0 = True
    try_0 = module_0.Try(str_0, bool_0)
    str_1 = try_0.__str__()

def test_case_4():
    bool_0 = False
    list_0 = [bool_0]
    bytes_0 = b'\xec1<\x9c'
    bool_1 = False
    try_0 = module_0.Try(bytes_0, bool_1)
    var_0 = try_0.map(list_0)

def test_case_5():
    float_0 = 323.0
    list_0 = [float_0, float_0, float_0, float_0]
    bool_0 = False
    try_0 = module_0.Try(list_0, bool_0)
    var_0 = try_0.get()
    bytes_0 = b''
    bool_1 = False
    try_1 = module_0.Try(bytes_0, bool_1)
    str_0 = try_1.__str__()
    complex_0 = None
    set_0 = {complex_0, complex_0, complex_0, complex_0}
    bool_2 = True
    try_2 = module_0.Try(set_0, bool_2)
    try_3 = module_0.Try(try_2, bool_2)

def test_case_6():
    str_0 = '\n        Take mapper function and return value of Left.\n\n        :returns: Stored value\n        :rtype: A\n        '
    str_1 = ''
    bool_0 = False
    try_0 = module_0.Try(str_1, bool_0)
    var_0 = try_0.get_or_else(str_0)

def test_case_7():
    bool_0 = True
    try_0 = module_0.Try(bool_0, bool_0)
    var_0 = lambda x: x
    var_1 = try_0.filter(var_0)
    try_1 = module_0.Try(bool_0, bool_0)
    bool_1 = False
    try_2 = module_0.Try(bool_1, bool_0)
    var_2 = lambda x: x
    var_3 = try_2.filter(var_2)
    try_3 = module_0.Try(bool_1, bool_1)
    try_4 = module_0.Try(bool_0, bool_1)
    var_4 = lambda x: x
    try_5 = module_0.Try(bool_0, bool_1)
    try_6 = module_0.Try(bool_1, bool_1)
    var_5 = lambda x: x
    var_6 = try_6.filter(var_5)
    try_7 = module_0.Try(bool_1, bool_1)