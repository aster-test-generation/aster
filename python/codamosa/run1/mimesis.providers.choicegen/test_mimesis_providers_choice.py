# Automatically generated by Pynguin.
import mimesis.providers.choice as module_0

def test_case_0():
    choice_0 = module_0.Choice()

def test_case_1():
    str_0 = '+386'
    dict_0 = {}
    choice_0 = module_0.Choice(**dict_0)
    var_0 = choice_0.__call__(str_0)
    choice_1 = module_0.Choice()

def test_case_2():
    str_0 = 'atola'
    int_0 = 2055
    bool_0 = False
    choice_0 = module_0.Choice()
    var_0 = choice_0.__call__(str_0, int_0, bool_0)

def test_case_3():
    str_0 = 'aoatolah'
    int_0 = 2055
    bool_0 = False
    choice_0 = module_0.Choice()
    str_1 = 'j74gcFmV5D'
    bool_1 = False
    var_0 = choice_0.__call__(str_1, bool_1)
    var_1 = choice_0.__call__(str_0, int_0, bool_0)
    float_0 = 304.66686
    str_2 = "@})md)N6(U1'H3wAUXX"
    set_0 = {float_0, var_1, choice_0, choice_0}
    int_1 = 1024
    tuple_0 = (str_2, set_0, int_1, str_0)
    var_2 = choice_0.__call__(tuple_0, int_1, bool_0)

def test_case_4():
    choice_0 = module_0.Choice()
    str_0 = 'a'
    str_1 = 'b'
    str_2 = 'c'
    str_3 = [str_0, str_1, str_2]
    var_0 = choice_0.__call__(str_3)
    choice_1 = module_0.Choice()
    str_4 = [str_0, str_1, str_2]
    int_0 = 1
    var_1 = choice_1.__call__(str_4, int_0)
    choice_2 = module_0.Choice()
    str_5 = 'abc'
    int_1 = 2
    var_2 = choice_2.__call__(str_5, int_1)
    choice_3 = module_0.Choice()
    str_6 = (str_0, str_1, str_2)
    int_2 = 5
    var_3 = choice_3.__call__(str_6, int_2)
    choice_4 = module_0.Choice()
    str_7 = 'aabbbccccddddd'
    int_3 = 4
    bool_0 = True
    var_4 = choice_4.__call__(str_7, int_3, bool_0)