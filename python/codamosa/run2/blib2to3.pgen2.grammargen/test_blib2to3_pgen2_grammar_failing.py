# Automatically generated by Pynguin.
import blib2to3.pgen2.grammar as module_0

def test_case_0():
    try:
        bytes_0 = b'$\xa5e`\xdau``\x0f\xd8z\x8d\x88\x7f\x97\xd3'
        grammar_0 = module_0.Grammar()
        grammar_0.loads(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        grammar_0 = module_0.Grammar()
        var_0 = grammar_0.copy()
        bytes_0 = b'\x9c\xcdNP\xed\x80\xa7\xc4\x9e\xb6\xa6\x9c\xb7\x15\x83'
        grammar_1 = module_0.Grammar()
        grammar_1.report()
        grammar_1.loads(bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = ',y'
        grammar_0 = module_0.Grammar()
        grammar_1 = module_0.Grammar()
        var_0 = grammar_1.copy()
        grammar_2 = module_0.Grammar()
        grammar_2.report()
        grammar_2.load(str_0)
    except BaseException:
        pass