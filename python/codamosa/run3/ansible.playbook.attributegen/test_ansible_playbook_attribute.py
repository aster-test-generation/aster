# Automatically generated by Pynguin.
import ansible.playbook.attribute as module_0

def test_case_0():
    field_attribute_0 = module_0.FieldAttribute()

def test_case_1():
    str_0 = 'test that the Attribute constructor works correctly'
    str_1 = 'str'
    attribute_0 = module_0.Attribute(str_1)
    bool_0 = True
    str_2 = 'list'
    var_0 = attribute_0.__lt__(attribute_0)
    var_1 = type(str_2)
    attribute_1 = module_0.Attribute(str_1, bool_0, str_0, bool_0, str_2, bool_0, var_1, bool_0, bool_0, str_0)

def test_case_2():
    str_0 = ''
    int_0 = 510
    attribute_0 = module_0.Attribute(str_0, int_0, int_0)

def test_case_3():
    str_0 = 'test that the Attribute constructor works correctly'
    attribute_0 = module_0.Attribute(str_0)
    str_1 = 'list'
    var_0 = type(attribute_0)
    int_0 = -2383
    int_1 = 2064
    dict_0 = {}
    attribute_1 = module_0.Attribute(str_1, int_0, var_0, int_1, dict_0)