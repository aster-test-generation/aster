# Automatically generated by Pynguin.
import httpie.context as module_0
import httpie.output.formatters.colors as module_1

def test_case_0():
    try:
        environment_0 = module_0.Environment()
        dict_0 = {}
        color_formatter_0 = module_1.ColorFormatter(environment_0, **dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '{"field": "value"}'
        str_1 = 'application/sn'
        bool_0 = True
        optional_0 = module_1.get_lexer(str_1, bool_0, str_0)
        str_2 = 'vL6jm$\rN"z{U`SCPxmt'
        optional_1 = module_1.get_lexer(str_2)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '{"field: "value"}'
        str_1 = 'text/plain'
        bool_0 = True
        optional_0 = module_1.get_lexer(str_1, bool_0, str_0)
        str_2 = '~'
        dict_0 = {str_2: bool_0, str_2: str_0, str_2: str_2}
        environment_0 = module_0.Environment(**dict_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'appl|cation/sn'
        bool_0 = True
        optional_0 = module_1.get_lexer(str_0, str_0, bool_0)
    except BaseException:
        pass