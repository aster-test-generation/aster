# Automatically generated by Pynguin.
import ansible.playbook.attribute as module_0

def test_case_0():
    try:
        bool_0 = False
        bytes_0 = b'\xdbUQ\xb7<\x89~\xe2h\xedo\xc4\xe8\x14w'
        set_0 = set()
        tuple_0 = (bool_0, bytes_0, set_0, bytes_0)
        str_0 = ''
        int_0 = 510
        attribute_0 = module_0.Attribute(str_0, int_0, int_0)
        var_0 = attribute_0.__eq__(tuple_0)
    except BaseException:
        pass

def test_case_1():
    try:
        tuple_0 = None
        str_0 = 'X3d"i'
        int_0 = -5342
        attribute_0 = module_0.Attribute(str_0, int_0, str_0)
        var_0 = attribute_0.__ne__(tuple_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\x95\x82\xb7\x96\xcc\xeb\xeb}\xa8\xcf?\xc2\xb1\xac'
        bool_0 = True
        int_0 = 433
        int_1 = -901
        str_0 = 'pj'
        set_0 = {int_1, bytes_0, int_1, int_0}
        dict_0 = {}
        list_0 = [set_0]
        bytes_1 = b'8^,\x14\xb8\x88\xcc'
        tuple_0 = (dict_0, bytes_0, list_0, bytes_1)
        field_attribute_0 = module_0.FieldAttribute(set_0, tuple_0, int_1, bytes_1)
        attribute_0 = module_0.Attribute(field_attribute_0)
        field_attribute_1 = module_0.FieldAttribute(str_0, attribute_0, tuple_0)
        str_1 = 'scutil'
        attribute_1 = module_0.Attribute(int_0, int_1, field_attribute_1, str_1)
        attribute_2 = module_0.Attribute(int_0, attribute_1, bytes_1, field_attribute_0)
        var_0 = attribute_2.__gt__(bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'o}'
        bool_0 = False
        list_0 = [str_0, str_0, str_0]
        int_0 = 123
        tuple_0 = ()
        tuple_1 = (int_0, tuple_0)
        dict_0 = {str_0: list_0, tuple_1: str_0, str_0: int_0}
        bytes_0 = b'h\x8e\x8bg\xc6=\xe3\xf8\x1d\xa4\xeb(\xfas\xa0*\x92'
        attribute_0 = module_0.Attribute(str_0, list_0, tuple_1, dict_0, bytes_0, str_0)
        var_0 = attribute_0.__le__(bool_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'list'
        bool_0 = False
        attribute_0 = module_0.Attribute(str_0, bool_0, str_0, str_0, str_0, bool_0, str_0, bool_0, str_0, str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bytes_0 = b'\x95\x82\xb7\x96\xcc\xeb\xeb}\xa8\xcf?\xc2\xb1\xac'
        int_0 = 433
        int_1 = -901
        str_0 = 'pj'
        set_0 = {int_1, bytes_0, int_1, int_0}
        dict_0 = {}
        list_0 = [set_0]
        tuple_0 = (dict_0, bytes_0, list_0, bytes_0)
        field_attribute_0 = module_0.FieldAttribute(set_0, tuple_0, int_1, bytes_0)
        attribute_0 = module_0.Attribute(field_attribute_0)
        field_attribute_1 = module_0.FieldAttribute(str_0, attribute_0, tuple_0)
        str_1 = 'scutil'
        attribute_1 = module_0.Attribute(int_0, int_1, field_attribute_1, str_1)
        attribute_2 = module_0.Attribute(int_0, attribute_1, bytes_0, field_attribute_0)
        var_0 = attribute_0.__ge__(str_1)
    except BaseException:
        pass