# Automatically generated by Pynguin.
import ansible.template.safe_eval as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'Q'
    var_0 = module_0.safe_eval(str_0)

def test_case_2():
    float_0 = -1275.644
    var_0 = module_0.safe_eval(float_0)

def test_case_3():
    str_0 = 'We^`.Nnxo@EMMer'
    bool_0 = False
    list_0 = [bool_0]
    var_0 = module_0.safe_eval(str_0, bool_0, list_0)
    int_0 = 117
    var_1 = module_0.safe_eval(int_0)
    str_1 = "uif}il#$EIf~'O"
    var_2 = module_0.safe_eval(str_1, str_1)
    float_0 = 1932.3
    str_2 = 'Y(=x'
    var_3 = module_0.safe_eval(float_0, str_2)

def test_case_4():
    float_0 = -1275.644
    str_0 = "&\x0bM)'B\n!"
    str_1 = 'q(LK%Q/ hva'
    var_0 = module_0.safe_eval(str_0, str_1)
    var_1 = module_0.safe_eval(float_0)

def test_case_5():
    str_0 = '1'
    var_0 = module_0.safe_eval(str_0)
    str_1 = '"string"'
    var_1 = module_0.safe_eval(str_1)
    str_2 = '[1, 2, 3]'
    var_2 = module_0.safe_eval(str_2)
    str_3 = '{1: 2, 3: 4}'
    var_3 = module_0.safe_eval(str_3)
    str_4 = 'true'
    var_4 = module_0.safe_eval(str_4)
    str_5 = 'false'
    var_5 = module_0.safe_eval(str_5)
    str_6 = 'null'
    var_6 = module_0.safe_eval(str_6)
    str_7 = 'var'
    int_0 = 1
    var_7 = dict(var=int_0)
    var_8 = module_0.safe_eval(str_7, var_7)
    str_8 = 'distribution_release'
    bytes_0 = b'0\xffB<bE;\xfd\xca\xfesh\xd6\x16\xce\xd1\x94\xb4\xb2'
    var_9 = module_0.safe_eval(str_8, bytes_0, bytes_0)

def test_case_6():
    int_0 = -889
    str_0 = "r_uAj~<i'6AN [:?#F\rd"
    set_0 = {int_0, str_0, int_0}
    var_0 = module_0.safe_eval(int_0, str_0, set_0)

def test_case_7():
    str_0 = '~xjB9I'
    var_0 = module_0.safe_eval(str_0, str_0)

def test_case_8():
    str_0 = 'u4'
    var_0 = module_0.safe_eval(str_0, str_0)

def test_case_9():
    str_0 = '1 + 1'
    str_1 = 'var'
    str_2 = 'val'
    str_3 = {str_1: str_2}
    var_0 = module_0.safe_eval(str_0, str_3)
    str_4 = '1 / 0'
    bool_0 = True
    var_1 = module_0.safe_eval(str_4, bool_0)

def test_case_10():
    str_0 = 'foo'
    str_1 = [str_0]
    var_0 = module_0.safe_eval(str_1)
    str_2 = 'bar'
    str_3 = {str_0: str_2}
    var_1 = module_0.safe_eval(str_3)
    str_4 = 'true'
    str_5 = {str_4: str_0}
    var_2 = module_0.safe_eval(str_5)
    str_6 = '{{ foo }}'
    var_3 = module_0.safe_eval(str_6)
    str_7 = '1234'
    bool_0 = True
    complex_0 = None
    var_4 = module_0.safe_eval(str_7, complex_0, bool_0)