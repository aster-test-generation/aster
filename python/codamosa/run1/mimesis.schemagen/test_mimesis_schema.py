# Automatically generated by Pynguin.
import mimesis.schema as module_0

def test_case_0():
    abstract_field_0 = module_0.AbstractField()

def test_case_1():
    str_0 = 'person.name'
    optional_0 = None
    abstract_field_0 = module_0.AbstractField()
    any_0 = abstract_field_0.__call__(str_0, optional_0)

def test_case_2():
    str_0 = 'username'
    abstract_field_0 = module_0.AbstractField()
    any_0 = abstract_field_0.__call__(str_0)

def test_case_3():
    str_0 = 'person.name'
    abstract_field_0 = module_0.AbstractField()
    var_0 = abstract_field_0.__str__()
    any_0 = abstract_field_0.__call__(str_0)
    dict_0 = {var_0: any_0, str_0: abstract_field_0, any_0: str_0}
    any_1 = abstract_field_0.__call__(str_0, dict_0)

def test_case_4():
    str_0 = 'person.name'
    optional_0 = None
    abstract_field_0 = module_0.AbstractField()
    dict_0 = {optional_0: str_0, str_0: abstract_field_0, str_0: str_0}
    any_0 = abstract_field_0.__call__(str_0, dict_0)