# Automatically generated by Pynguin.
import httpie.output.formatters.colors as module_0
import httpie.context as module_1

def test_case_0():
    pass

def test_case_1():
    str_0 = '/(7gETS.4BVZw'
    optional_0 = module_0.get_lexer(str_0)

def test_case_2():
    str_0 = '/(7gETS.+BqVZw'
    optional_0 = module_0.get_lexer(str_0)

def test_case_3():
    str_0 = 'appliation/jso*n'
    bool_0 = True
    optional_0 = module_0.get_lexer(str_0, bool_0, str_0)

def test_case_4():
    str_0 = 'Bv/YJj8b\\0~-'
    set_0 = None
    type_0 = None
    optional_0 = module_0.get_lexer(str_0, str_0, type_0)
    environment_0 = module_1.Environment(set_0)
    simplified_h_t_t_p_lexer_0 = module_0.SimplifiedHTTPLexer()

def test_case_5():
    str_0 = 'text/plain'
    optional_0 = module_0.get_lexer(str_0)

def test_case_6():
    str_0 = 'applicItion/json/\x0cL'
    optional_0 = module_0.get_lexer(str_0)

def test_case_7():
    str_0 = 'application/json'
    bool_0 = True
    optional_0 = module_0.get_lexer(str_0, bool_0, str_0)