# Automatically generated by Pynguin.
import ansible.parsing.quoting as module_0

def test_case_0():
    bytes_0 = b''
    var_0 = module_0.is_quoted(bytes_0)

def test_case_1():
    bytes_0 = b'\xebH\xef\x9dPw\xbc\xa2\x94\x80\x01s'
    var_0 = module_0.unquote(bytes_0)

def test_case_2():
    str_0 = '4IR"8@\x0bbB68,|wnP1(Y\\'
    var_0 = module_0.is_quoted(str_0)

def test_case_3():
    str_0 = '"str"'
    var_0 = module_0.unquote(str_0)
    str_1 = "'str'"
    var_1 = module_0.unquote(str_1)
    str_2 = 'str'
    var_2 = module_0.unquote(str_2)
    str_3 = '"""str"""'
    var_3 = module_0.unquote(str_3)

def test_case_4():
    str_0 = '"false"'
    var_0 = module_0.is_quoted(str_0)
    str_1 = 'true'
    var_1 = module_0.is_quoted(str_1)
    str_2 = 'fal"se'
    var_2 = module_0.is_quoted(str_2)