# Automatically generated by Pynguin.
import ansible.module_utils.splitter as module_0

def test_case_0():
    try:
        str_0 = '=vT;sQ3?'
        var_0 = module_0.split_args(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        complex_0 = None
        var_0 = module_0.unquote(complex_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\x99\x8a\xded\xa9`\x0fo\xf4\x1a\xcfO?(\xc2\xc8\xa7\x86\xb6\x80'
        var_0 = module_0.split_args(bytes_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ''
        var_0 = module_0.unquote(str_0)
        str_1 = '""'
        var_1 = module_0.unquote(str_1)
        str_2 = '"\\'
        str_3 = '"'
        var_2 = str_2 + str_3
        var_3 = var_2 + str_3
        var_4 = module_0.unquote(var_3)
        str_4 = "'\\"
        str_5 = "'"
        var_5 = str_4 + str_5
        var_6 = var_5 + str_5
        str_6 = '"\'"'
        var_7 = module_0.unquote(str_6)
        str_7 = '\'"\''
        var_8 = module_0.unquote(str_7)
        str_8 = 'a'
        var_9 = module_0.unquote(str_8)
        str_9 = 'abc'
        var_10 = module_0.unquote(str_9)
        str_10 = 'a\\'
        var_11 = str_10 + str_1
        var_12 = module_0.unquote(var_11)
        str_11 = '"a"'
        var_13 = module_0.unquote(str_11)
        complex_0 = None
        var_14 = module_0.split_args(complex_0)
    except BaseException:
        pass