# Automatically generated by Pynguin.
import mimesis.schema as module_0
import mimesis.providers.generic as module_1

def test_case_0():
    pass

def test_case_1():
    abstract_field_0 = module_0.AbstractField()

def test_case_2():
    str_0 = 'food.fruit'
    abstract_field_0 = module_0.AbstractField()
    any_0 = abstract_field_0.__call__(str_0)

def test_case_3():
    abstract_field_0 = module_0.AbstractField()
    var_0 = abstract_field_0.__str__()

def test_case_4():
    str_0 = 'name'
    abstract_field_0 = module_0.AbstractField()
    str_1 = 'k<|Z\x0b<*40&T'
    dict_0 = {str_1: str_1, str_1: abstract_field_0, str_1: str_0}
    list_0 = [dict_0, dict_0]
    any_0 = abstract_field_0.__call__(str_0, list_0)

def test_case_5():
    str_0 = 'food.fruit'
    abstract_field_0 = module_0.AbstractField()
    dict_0 = {str_0: str_0, str_0: abstract_field_0, str_0: str_0}
    list_0 = [dict_0, dict_0]
    any_0 = abstract_field_0.__call__(str_0, list_0)

def test_case_6():
    str_0 = 'P+uGoDUh;u'
    str_1 = 'food.fruit'
    abstract_field_0 = module_0.AbstractField()
    abstract_field_1 = module_0.AbstractField()
    dict_0 = {str_1: str_1, str_0: abstract_field_1, str_1: str_0}
    list_0 = [dict_0, dict_0]
    any_0 = abstract_field_0.__call__(str_1, list_0)
    generic_0 = module_1.Generic()
    generator_0 = generic_0.override_locale()
    any_1 = abstract_field_0.__call__(str_1, generator_0)