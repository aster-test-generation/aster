# Automatically generated by Pynguin.
import mimesis.providers.choice as module_0

def test_case_0():
    try:
        list_0 = []
        int_0 = None
        choice_0 = module_0.Choice()
        var_0 = choice_0.__call__(list_0, int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        choice_0 = module_0.Choice()
        int_0 = -123
        choice_1 = module_0.Choice()
        var_0 = choice_1.__call__(choice_0, int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        choice_0 = module_0.Choice()
        str_0 = ''
        int_0 = 484
        var_0 = choice_0.__call__(str_0, int_0)
    except BaseException:
        pass

def test_case_3():
    try:
        choice_0 = module_0.Choice()
        str_0 = 'eh\x0cIhw23,4'
        int_0 = -3052
        bool_0 = True
        var_0 = choice_0.__call__(str_0, int_0, bool_0)
    except BaseException:
        pass

def test_case_4():
    try:
        choice_0 = module_0.Choice()
        str_0 = 'p4&\rY\tB\rmy(3xC\x0cA.'
        int_0 = 497
        bytes_0 = b'*-k\x01\xc5\xf5u\x99A%'
        list_0 = [str_0, choice_0, bytes_0]
        bool_0 = True
        var_0 = choice_0.__call__(list_0, int_0, bool_0)
    except BaseException:
        pass