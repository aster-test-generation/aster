# Automatically generated by Pynguin.
import ansible.playbook.base as module_0

def test_case_0():
    pass

def test_case_1():
    base_0 = module_0.Base()

def test_case_2():
    field_attribute_base_0 = module_0.FieldAttributeBase()

def test_case_3():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.dump_me()

def test_case_4():
    str_0 = '\n        Run the given playbook, based on the settings in the play which\n        may limit the runs to serialized groups, etc.\n        '
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.preprocess_data(str_0)

def test_case_5():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.get_ds()

def test_case_6():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.get_loader()

def test_case_7():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.get_variable_manager()

def test_case_8():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.validate()

def test_case_9():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.squash()

def test_case_10():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.copy()

def test_case_11():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.dump_attrs()

def test_case_12():
    float_0 = 4746.3
    dict_0 = {float_0: float_0, float_0: float_0, float_0: float_0, float_0: float_0}
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.from_attrs(dict_0)
    base_0 = module_0.Base()
    var_1 = base_0.get_dep_chain()
    var_2 = field_attribute_base_0.copy()

def test_case_13():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.serialize()

def test_case_14():
    field_attribute_base_0 = module_0.FieldAttributeBase()
    tuple_0 = (field_attribute_base_0,)
    str_0 = 'c"MNPY;PbP%7S'
    dict_0 = {tuple_0: tuple_0, tuple_0: tuple_0, field_attribute_base_0: field_attribute_base_0, field_attribute_base_0: str_0}
    var_0 = field_attribute_base_0.deserialize(dict_0)

def test_case_15():
    base_0 = module_0.Base()
    var_0 = base_0.get_search_path()

def test_case_16():
    base_0 = module_0.Base()
    var_0 = base_0.get_dep_chain()

def test_case_17():
    base_0 = module_0.Base()
    list_0 = []
    field_attribute_base_0 = module_0.FieldAttributeBase()
    var_0 = field_attribute_base_0.load_data(list_0)