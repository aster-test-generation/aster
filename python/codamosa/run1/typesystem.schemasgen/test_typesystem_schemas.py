# Automatically generated by Pynguin.
import typesystem.schemas as module_0
import typesystem.fields as module_1

def test_case_0():
    pass

def test_case_1():
    schema_definitions_0 = module_0.SchemaDefinitions()

def test_case_2():
    schema_definitions_0 = module_0.SchemaDefinitions()
    int_0 = schema_definitions_0.__len__()
    list_0 = [int_0]
    schema_0 = module_0.Schema(*list_0)
    int_1 = schema_definitions_0.__len__()
    bool_0 = schema_0.__eq__(schema_0)
    iterator_0 = schema_definitions_0.__iter__()

def test_case_3():
    schema_definitions_0 = module_0.SchemaDefinitions()
    int_0 = schema_definitions_0.__len__()
    field_0 = None
    module_0.set_definitions(field_0, schema_definitions_0)

def test_case_4():
    tuple_0 = None
    schema_0 = module_0.Schema()
    bool_0 = schema_0.__eq__(tuple_0)
    schema_definitions_0 = module_0.SchemaDefinitions()
    schema_definitions_0.__setitem__(tuple_0, schema_0)

def test_case_5():
    schema_definitions_0 = module_0.SchemaDefinitions()
    field_0 = None
    module_0.set_definitions(field_0, schema_definitions_0)

def test_case_6():
    schema_0 = module_0.Schema()

def test_case_7():
    schema_definitions_0 = module_0.SchemaDefinitions()
    int_0 = schema_definitions_0.__len__()
    list_0 = [int_0]
    schema_0 = module_0.Schema(*list_0)

def test_case_8():
    dict_0 = {}
    list_0 = [dict_0]
    schema_0 = module_0.Schema(*list_0, **dict_0)

def test_case_9():
    tuple_0 = None
    schema_0 = module_0.Schema()
    bool_0 = schema_0.__eq__(tuple_0)

def test_case_10():
    schema_0 = module_0.Schema()
    bool_0 = schema_0.__eq__(schema_0)

def test_case_11():
    schema_0 = module_0.Schema()
    str_0 = schema_0.__repr__()

def test_case_12():
    schema_0 = module_0.Schema()
    int_0 = schema_0.__len__()

def test_case_13():
    str_0 = 'X\nD<*y+M]\x0cumN/L4au\\'
    reference_0 = module_0.Reference(str_0)
    schema_0 = module_0.Schema()
    any_0 = reference_0.serialize(schema_0)

def test_case_14():
    schema_0 = module_0.Schema()
    int_0 = schema_0.__len__()
    tuple_0 = None
    str_0 = schema_0.__repr__()
    list_0 = [schema_0]
    str_1 = '~=Y\t_y+j1#YT#+,]QIz'
    reference_0 = module_0.Reference(str_1)
    any_0 = reference_0.serialize(tuple_0)
    schema_1 = module_0.Schema(*list_0)
    bool_0 = schema_0.__eq__(schema_0)
    schema_2 = module_0.Schema()
    bool_1 = schema_2.__eq__(bool_0)
    str_2 = schema_2.__repr__()
    reference_1 = module_0.Reference(str_2)
    field_0 = module_1.Field()
    str_3 = 'multiple_matches'
    dict_0 = {str_3: bool_0, str_0: schema_2, str_0: schema_1}
    schema_definitions_0 = module_0.SchemaDefinitions(*list_0, **dict_0)
    module_0.set_definitions(field_0, schema_definitions_0)

def test_case_15():
    str_0 = 'Test set_definitions:'
    var_0 = print(str_0)
    schema_definitions_0 = module_0.SchemaDefinitions()
    str_1 = 'child'
    str_2 = 'Child'
    reference_0 = module_0.Reference(str_2)
    reference_1 = {str_1: reference_0}
    object_0 = module_1.Object(properties=reference_1)
    module_0.set_definitions(object_0, schema_definitions_0)
    str_3 = 'Test 1: Pass'
    var_1 = print(str_3)
    schema_0 = module_0.Schema()
    reference_2 = module_0.Reference(str_2)
    reference_3 = {str_1: reference_2}
    object_1 = module_1.Object(properties=reference_3)
    module_0.set_definitions(object_1, schema_definitions_0)
    str_4 = 'Test 2: Pass'
    var_2 = print(str_4)
    str_5 = '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-'
    var_3 = print(str_5)

def test_case_16():
    str_0 = 'Test set_definitions:'
    var_0 = print(str_0)
    schema_definitions_0 = module_0.SchemaDefinitions()
    schema_0 = module_0.Schema()
    int_0 = schema_0.__len__()
    str_1 = 'child'
    str_2 = 'Child'
    reference_0 = module_0.Reference(str_2)
    reference_1 = {str_1: reference_0}
    bool_0 = schema_0.__eq__(reference_0)
    object_0 = module_1.Object(properties=reference_1)
    module_0.set_definitions(object_0, schema_definitions_0)
    str_3 = 'Test 1: Pass'
    var_1 = print(str_3)
    schema_definitions_1 = module_0.SchemaDefinitions()
    schema_1 = module_0.Schema()
    reference_2 = {str_1: reference_0}
    object_1 = module_1.Object(properties=reference_2)
    module_0.set_definitions(object_1, schema_definitions_1)
    str_4 = 'Test 2: Pass'
    var_2 = print(str_4)
    str_5 = '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-'
    var_3 = print(str_5)