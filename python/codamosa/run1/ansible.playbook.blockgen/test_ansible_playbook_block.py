# Automatically generated by Pynguin.
import ansible.playbook.block as module_0
import ansible.playbook.role as module_1

def test_case_0():
    pass

def test_case_1():
    block_0 = module_0.Block()
    var_0 = block_0.serialize()

def test_case_2():
    str_0 = 'w3dIf]Ho2'
    bool_0 = True
    block_0 = module_0.Block(bool_0)
    list_0 = [bool_0, block_0]
    str_1 = 'libselinux.so.1'
    tuple_0 = (block_0, list_0, str_1)
    block_1 = module_0.Block(tuple_0)
    str_2 = 'XB*JQu~'
    tuple_1 = (str_0, block_1, str_2)
    block_2 = module_0.Block(tuple_1, tuple_0)
    var_0 = block_2.__repr__()

def test_case_3():
    float_0 = -3239.114
    block_0 = module_0.Block(float_0)
    var_0 = block_0.copy()
    var_1 = block_0.__ne__(block_0)
    var_2 = block_0.serialize()

def test_case_4():
    bytes_0 = b'\x9d\xf2\xc0|\x12x\xa2\xda\x90\\\xf8a'
    block_0 = module_0.Block(bytes_0)
    var_0 = block_0.get_vars()
    var_1 = block_0.has_tasks()
    var_2 = block_0.copy()

def test_case_5():
    list_0 = []
    float_0 = -1871.74
    str_0 = 'oc(]8fo'
    block_0 = module_0.Block()
    var_0 = block_0.load(list_0, float_0, block_0, str_0)

def test_case_6():
    block_0 = module_0.Block()
    var_0 = block_0.preprocess_data(block_0)

def test_case_7():
    block_0 = module_0.Block()
    var_0 = block_0.copy()

def test_case_8():
    bool_0 = True
    bytes_0 = b'gf\xe6E'
    block_0 = module_0.Block(bytes_0)
    var_0 = block_0.serialize()
    block_1 = module_0.Block(bool_0)
    str_0 = '06135b5f-f788-1561-1344-000000001b98'
    role_0 = module_1.Role()
    block_2 = module_0.Block(block_1, block_1, str_0)
    var_1 = block_0.preprocess_data(bool_0)
    var_2 = block_2.copy()
    var_3 = block_2.__repr__()
    var_4 = block_2.all_parents_static()

def test_case_9():
    float_0 = 60.0
    float_1 = -3843.499
    str_0 = 'b}ZxRV.}b6m\\.'
    list_0 = [str_0]
    tuple_0 = (float_1, str_0, list_0)
    bytes_0 = b'G;\xdc\x9b\xc7'
    block_0 = module_0.Block(tuple_0, bytes_0, tuple_0)
    var_0 = block_0.filter_tagged_tasks(float_0)

def test_case_10():
    block_0 = module_0.Block()
    var_0 = block_0.serialize()
    var_1 = block_0.deserialize(var_0)

def test_case_11():
    str_0 = 'GSiGOW\nu'
    block_0 = module_0.Block()
    var_0 = block_0.set_loader(str_0)

def test_case_12():
    float_0 = -3239.114
    block_0 = module_0.Block(float_0)
    var_0 = block_0.serialize()

def test_case_13():
    float_0 = 100.0
    list_0 = [float_0, float_0, float_0]
    dict_0 = {float_0: float_0, float_0: list_0}
    role_0 = module_1.Role(dict_0)
    block_0 = module_0.Block(role_0)
    var_0 = block_0.copy()

def test_case_14():
    set_0 = set()
    block_0 = module_0.Block()
    var_0 = block_0.filter_tagged_tasks(set_0)

def test_case_15():
    block_0 = module_0.Block()
    var_0 = block_0.has_tasks()

def test_case_16():
    bool_0 = False
    tuple_0 = (bool_0,)
    list_0 = [tuple_0]
    block_0 = module_0.Block(list_0)
    var_0 = block_0.get_first_parent_include()

def test_case_17():
    str_0 = 'failed to transfer file to %s'
    int_0 = 468
    dict_0 = {str_0: str_0, str_0: str_0, str_0: int_0}
    str_1 = ".'P"
    str_2 = '06135b5f-f788-1561-1344-000000000d83'
    block_0 = module_0.Block(str_1, str_2)
    var_0 = block_0.copy(dict_0)

def test_case_18():
    str_0 = 'S\nfscOZ@a#R}jWsYVuj'
    list_0 = [str_0, str_0]
    block_0 = module_0.Block()
    var_0 = block_0.preprocess_data(list_0)

def test_case_19():
    str_0 = 'oO0qV'
    dict_0 = {str_0: str_0}
    str_1 = 'g<0xB_x_B\r\x0c'
    tuple_0 = (str_1,)
    block_0 = module_0.Block(tuple_0)
    block_1 = module_0.Block(dict_0, block_0)
    list_0 = [block_1, tuple_0, tuple_0]
    float_0 = -417.19
    bool_0 = False
    block_2 = module_0.Block(list_0, float_0, bool_0)
    block_3 = module_0.Block(float_0)
    block_4 = module_0.Block(block_2, block_3)
    var_0 = block_4.serialize()

def test_case_20():
    str_0 = 'Collection'
    int_0 = 0
    bool_0 = True
    block_0 = module_0.Block(bool_0)
    var_0 = block_0.preprocess_data(str_0)
    block_1 = module_0.Block()
    var_1 = block_1.all_parents_static()
    var_2 = block_1.get_first_parent_include()
    block_2 = module_0.Block()
    var_3 = block_2.serialize()
    var_4 = block_0.deserialize(var_3)
    bytes_0 = None
    var_5 = block_1.filter_tagged_tasks(bytes_0)
    var_6 = block_0.copy()
    role_0 = module_1.Role(block_2)
    dict_0 = {var_2: role_0}
    var_7 = block_0.serialize()
    list_0 = [dict_0, block_2, int_0, var_3]
    var_8 = block_1.copy(list_0)
    var_9 = block_2.deserialize(dict_0)

def test_case_21():
    int_0 = -1524
    str_0 = 'ML:'
    set_0 = set()
    role_0 = module_1.Role()
    block_0 = module_0.Block(str_0, set_0, role_0)
    var_0 = block_0.filter_tagged_tasks(int_0)
    var_1 = block_0.__repr__()

def test_case_22():
    str_0 = 'uollction'
    float_0 = -3363.9
    int_0 = 0
    list_0 = [str_0]
    bool_0 = False
    tuple_0 = (float_0, list_0, list_0, bool_0)
    block_0 = module_0.Block(tuple_0)
    var_0 = block_0.has_tasks()
    var_1 = block_0.preprocess_data(block_0)
    bool_1 = False
    tuple_1 = (float_0, int_0, int_0, bool_1)
    bool_2 = True
    block_1 = module_0.Block(str_0, block_0, bool_2)
    var_2 = block_1.all_parents_static()
    var_3 = block_0.get_dep_chain()
    var_4 = block_1.get_first_parent_include()
    var_5 = block_0.set_loader(tuple_1)
    var_6 = block_0.is_block(str_0)
    var_7 = block_0.preprocess_data(bool_0)
    var_8 = block_0.serialize()
    var_9 = block_1.deserialize(var_8)
    var_10 = block_0.copy()
    var_11 = block_1.copy()

def test_case_23():
    str_0 = 'uollction'
    float_0 = -3363.9
    int_0 = 0
    list_0 = [int_0, int_0, str_0]
    list_1 = [str_0]
    bool_0 = False
    tuple_0 = (float_0, list_0, list_1, bool_0)
    block_0 = module_0.Block(tuple_0)
    var_0 = block_0.has_tasks()
    var_1 = block_0.preprocess_data(block_0)
    bool_1 = True
    block_1 = module_0.Block(str_0, block_0, bool_1)
    var_2 = block_1.all_parents_static()
    int_1 = -1524
    str_1 = 'ML:'
    set_0 = set()
    role_0 = module_1.Role()
    block_2 = module_0.Block(str_1, set_0, role_0)
    var_3 = block_2.filter_tagged_tasks(int_1)
    var_4 = block_0.get_dep_chain()
    var_5 = block_1.get_first_parent_include()
    var_6 = block_2.__repr__()
    var_7 = block_0.set_loader(tuple_0)
    var_8 = block_0.is_block(str_0)
    bool_2 = True
    var_9 = block_0.preprocess_data(bool_2)
    list_2 = [block_0]
    list_3 = [block_0, list_2]
    var_10 = block_0.is_block(list_3)
    var_11 = block_2.serialize()
    var_12 = block_1.deserialize(var_11)
    var_13 = block_0.copy()
    role_1 = module_1.Role()
    var_14 = block_1.copy()

def test_case_24():
    str_0 = ''
    float_0 = -3363.9
    int_0 = 0
    list_0 = [int_0, int_0, str_0]
    list_1 = [str_0]
    bool_0 = True
    tuple_0 = (float_0, list_0, list_1, bool_0)
    block_0 = module_0.Block(tuple_0)
    var_0 = block_0.has_tasks()
    var_1 = block_0.preprocess_data(block_0)
    str_1 = 'z$Sq"kDZ9\\SFp#5en'
    dict_0 = {int_0: var_0, str_0: bool_0, float_0: str_1}
    var_2 = block_0.preprocess_data(dict_0)
    bool_1 = False
    tuple_1 = (float_0, int_0, int_0, bool_1)
    bool_2 = True
    block_1 = module_0.Block(str_0, block_0, bool_2)
    var_3 = block_1.all_parents_static()
    int_1 = -1524
    set_0 = set()
    role_0 = module_1.Role()
    block_2 = module_0.Block(bool_1, set_0, role_0)
    var_4 = block_2.filter_tagged_tasks(int_1)
    var_5 = block_1.get_first_parent_include()
    var_6 = block_2.__repr__()
    var_7 = block_0.set_loader(tuple_1)
    var_8 = block_0.preprocess_data(var_2)
    bytes_0 = b'\x11\xa9w\x02\x1fM\x91x\x19V0c\xed\xe3\x9c'
    block_3 = module_0.Block(bytes_0, block_1)
    var_9 = block_0.serialize()
    var_10 = block_1.deserialize(var_9)
    var_11 = block_0.copy()
    var_12 = block_0.filter_tagged_tasks(list_1)
    role_1 = module_1.Role()
    var_13 = block_3.copy()