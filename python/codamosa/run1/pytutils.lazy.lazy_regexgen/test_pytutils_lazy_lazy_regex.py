# Automatically generated by Pynguin.
import pytutils.lazy.lazy_regex as module_0

def test_case_0():
    pass

def test_case_1():
    var_0 = module_0.lazy_compile()

def test_case_2():
    str_0 = 'a'
    lazy_regex_0 = module_0.LazyRegex(str_0)
    var_0 = lazy_regex_0.__getstate__()
    str_1 = 'b'
    lazy_regex_1 = module_0.LazyRegex(str_1)
    var_1 = lazy_regex_1.__setstate__(var_0)

def test_case_3():
    var_0 = module_0.install_lazy_compile()

def test_case_4():
    var_0 = module_0.reset_compile()

def test_case_5():
    complex_0 = None
    var_0 = module_0.reset_compile()
    lazy_regex_0 = module_0.LazyRegex()
    set_0 = set()
    lazy_regex_1 = module_0.LazyRegex(set_0)
    invalid_pattern_0 = module_0.InvalidPattern(lazy_regex_1)
    var_1 = invalid_pattern_0.__eq__(complex_0)
    var_2 = invalid_pattern_0.__eq__(invalid_pattern_0)