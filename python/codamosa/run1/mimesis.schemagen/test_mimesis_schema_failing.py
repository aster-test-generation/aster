# Automatically generated by Pynguin.
import mimesis.schema as module_0

def test_case_0():
    try:
        str_0 = '@Wa*F'
        abstract_field_0 = module_0.AbstractField()
        any_0 = abstract_field_0.__call__(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        abstract_field_0 = module_0.AbstractField()
        any_0 = abstract_field_0.__call__()
    except BaseException:
        pass

def test_case_2():
    try:
        abstract_field_0 = module_0.AbstractField()
        var_0 = abstract_field_0.__str__()
        abstract_field_1 = module_0.AbstractField()
        set_0 = set()
        schema_0 = module_0.Schema(set_0)
    except BaseException:
        pass

def test_case_3():
    try:
        callable_0 = None
        schema_0 = module_0.Schema(callable_0)
    except BaseException:
        pass

def test_case_4():
    try:
        abstract_field_0 = module_0.AbstractField()
        schema_0 = module_0.Schema(abstract_field_0)
        list_0 = schema_0.create()
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'text.word'
        str_1 = 'Generic.person.name'
        abstract_field_0 = module_0.AbstractField()
        any_0 = abstract_field_0.__call__(str_0)
        any_1 = abstract_field_0.__call__(str_1)
    except BaseException:
        pass

def test_case_6():
    try:
        abstract_field_0 = module_0.AbstractField()
        schema_0 = module_0.Schema(abstract_field_0)
        str_0 = '!jdM\x0b\rp5S-hH_0.{B'
        int_0 = -2940
        list_0 = schema_0.create(int_0)
        any_0 = abstract_field_0.__call__(str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'en'
        list_0 = [str_0]
        tuple_0 = (list_0,)
        abstract_field_0 = module_0.AbstractField(str_0, str_0, tuple_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'username'
        str_1 = 'person.name'
        optional_0 = None
        abstract_field_0 = module_0.AbstractField()
        any_0 = abstract_field_0.__call__(str_0, optional_0)
        str_2 = '(w$\t)`b2ni,=ID/!p$'
        dict_0 = {str_2: abstract_field_0, str_1: str_1, str_1: str_1, str_2: abstract_field_0}
        abstract_field_1 = module_0.AbstractField()
        dict_1 = None
        list_0 = [abstract_field_1, str_0]
        dict_2 = {}
        list_1 = [dict_2, dict_2, dict_2]
        tuple_0 = (dict_1, list_0, list_1)
        any_1 = abstract_field_1.__call__(str_0, tuple_0)
        str_3 = 'choice'
        any_2 = abstract_field_1.__call__(str_3, dict_0, **dict_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'username'
        optional_0 = None
        abstract_field_0 = module_0.AbstractField()
        any_0 = abstract_field_0.__call__(str_0, optional_0)
        abstract_field_1 = module_0.AbstractField()
        dict_0 = None
        list_0 = [abstract_field_1, str_0]
        dict_1 = {}
        list_1 = [dict_1, dict_1, dict_1]
        tuple_0 = (dict_0, list_0, list_1)
        any_1 = abstract_field_1.__call__(str_0, tuple_0)
        any_2 = abstract_field_0.__call__(str_0, abstract_field_0)
    except BaseException:
        pass