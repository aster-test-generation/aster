# Automatically generated by Pynguin.
import youtube_dl.jsinterp as module_0

def test_case_0():
    try:
        str_0 = 'U^+>C?qLc2Z'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        var_0 = j_s_interpreter_0.interpret_statement(str_0, j_s_interpreter_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'NDTC'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        var_0 = j_s_interpreter_0.call_function(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '3|< "2'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        var_0 = j_s_interpreter_0.interpret_statement(str_0, j_s_interpreter_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'dWJZeHpgm{URh\x0b9f='
        int_0 = -25
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        str_1 = 'divideBy1(6)'
        var_0 = j_s_interpreter_0.interpret_expression(str_1, j_s_interpreter_0, int_0)
    except BaseException:
        pass

def test_case_4():
    try:
        int_0 = -20
        str_0 = '()'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0, int_0)
        var_0 = j_s_interpreter_0.interpret_expression(str_0, int_0, int_0)
        str_1 = 'a+1'
        var_1 = j_s_interpreter_0.interpret_expression(str_1, int_0, int_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'gF.FqG_@d'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        var_0 = j_s_interpreter_0.interpret_statement(str_0, j_s_interpreter_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'J!&02b)'
        list_0 = []
        j_s_interpreter_0 = module_0.JSInterpreter(list_0)
        j_s_interpreter_1 = module_0.JSInterpreter(list_0)
        str_1 = 'nV.Om]'
        var_0 = j_s_interpreter_0.interpret_statement(str_1, str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        int_0 = 4
        str_0 = 'Qr]_7=)(*? \n'
        var_0 = {}
        j_s_interpreter_0 = module_0.JSInterpreter(str_0, var_0)
        str_1 = 'funcName(z)'
        var_1 = j_s_interpreter_0.interpret_expression(str_1, int_0, int_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'var a = 2;'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        str_1 = 'var a = (2 + 3'
        str_2 = 'a'
        int_0 = 2
        int_1 = {str_2: int_0}
        int_2 = 100
        var_0 = j_s_interpreter_0.interpret_statement(str_1, int_1, int_2)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = "('a'|'b')+'c';"
        int_0 = 100
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        var_0 = j_s_interpreter_0.interpret_expression(str_0, str_0, int_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'Ut'
        int_0 = 4
        int_1 = {str_0: int_0, str_0: str_0, int_0: int_0}
        j_s_interpreter_0 = module_0.JSInterpreter(str_0, int_1)
        str_1 = 'funcNWme()'
        str_2 = ',w@IL63\x0c7`'
        var_0 = j_s_interpreter_0.interpret_expression(str_1, int_1, str_2)
    except BaseException:
        pass

def test_case_11():
    try:
        int_0 = 19
        str_0 = '()a'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0, int_0)
        var_0 = j_s_interpreter_0.interpret_expression(str_0, int_0, int_0)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = '\n    function walk(i,j) {\n        if (i > 0) {\n            var x = i + j;\n            return walk(i-1, j);\n        } else {\n            return j;\n        }\n    }\n    '
        int_0 = 0
        int_1 = [str_0, str_0, int_0, int_0]
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        str_1 = 'walk'
        var_0 = j_s_interpreter_0.call_function(str_1, *int_1)
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = 'var abc={"def":function(g){return g+1;}};'
        j_s_interpreter_0 = module_0.JSInterpreter(str_0)
        str_1 = 'abc'
        var_0 = j_s_interpreter_0.extract_object(str_1)
        str_2 = 'def'
        var_1 = var_0[str_2]
        str_3 = 'var abc={"def 1":"def2","def 3":function(g){return g+1;}};'
        j_s_interpreter_1 = module_0.JSInterpreter(str_3)
        var_2 = j_s_interpreter_1.extract_object(str_1)
    except BaseException:
        pass