# Automatically generated by Pynguin.
import pymonet.box as module_0

def test_case_0():
    try:
        dict_0 = {}
        str_0 = '\n        Call success_callback function with monad value when monad is not successfully.\n\n        :params fail_callback: function to apply with monad value.\n        :type fail_callback: Function(A)\n        :returns: self\n        :rtype: Try[A]\n        '
        bool_0 = False
        box_0 = module_0.Box(bool_0)
        var_0 = box_0.to_lazy()
        box_1 = module_0.Box(str_0)
        var_1 = box_1.map(dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'Validation.success[{}]'
        bool_0 = False
        dict_0 = {str_0: str_0, str_0: str_0, bool_0: bool_0}
        str_1 = '.R\x0bd^q5j=,k7Kxo3=/'
        box_0 = module_0.Box(str_1)
        var_0 = box_0.bind(dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'b![uftM\t6wCoP?l4bk'
        box_0 = module_0.Box(str_0)
        var_0 = box_0.to_lazy()
        bool_0 = True
        bool_1 = True
        box_1 = module_0.Box(bool_1)
        var_1 = box_1.ap(bool_0)
    except BaseException:
        pass