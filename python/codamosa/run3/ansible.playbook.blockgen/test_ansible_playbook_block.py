# Automatically generated by Pynguin.
import ansible.playbook.block as module_0
import ansible.playbook.role as module_1

def test_case_0():
    pass

def test_case_1():
    block_0 = module_0.Block()

def test_case_2():
    str_0 = '06135b5f-f788-c2aa-41f8-000000002150'
    str_1 = 'g`9E'
    int_0 = 1863
    dict_0 = {str_0: int_0, int_0: int_0, int_0: str_0}
    str_2 = 's#\x0b'
    block_0 = module_0.Block(str_2)
    var_0 = block_0.is_block(dict_0)
    bytes_0 = b'"\x01\xbd\x01\x1b3\x11C\x16\x12\x00hOF\x85\x90a'
    float_0 = 1076.95074
    block_1 = module_0.Block(int_0, bytes_0, str_0, float_0)
    var_1 = block_1.preprocess_data(str_1)
    block_2 = module_0.Block(str_0, str_0)

def test_case_3():
    bytes_0 = b'\xa2Zl\xd9\xdd'
    block_0 = module_0.Block(bytes_0, bytes_0)
    var_0 = block_0.has_tasks()

def test_case_4():
    bytes_0 = b'\xd4\xf7\xde\xc8\xb0\x99\xe1\xfc\xbc\x96'
    block_0 = module_0.Block()
    var_0 = block_0.set_loader(bytes_0)
    var_1 = block_0.__repr__()

def test_case_5():
    bool_0 = True
    block_0 = module_0.Block(bool_0)
    var_0 = block_0.get_vars()

def test_case_6():
    block_0 = module_0.Block()
    str_0 = ';B?'
    var_0 = block_0.preprocess_data(str_0)

def test_case_7():
    block_0 = module_0.Block()
    var_0 = block_0.copy()

def test_case_8():
    block_0 = module_0.Block()
    var_0 = block_0.serialize()

def test_case_9():
    bool_0 = False
    bool_1 = True
    block_0 = module_0.Block(bool_1, bool_0, bool_1)
    var_0 = block_0.copy()

def test_case_10():
    block_0 = module_0.Block()
    var_0 = {}
    var_1 = block_0.deserialize(var_0)

def test_case_11():
    bytes_0 = b'\xd4\xf7\xde\xc8\xb0\x99\xe1\xfc\xbc\x96'
    block_0 = module_0.Block()
    var_0 = block_0.set_loader(bytes_0)

def test_case_12():
    str_0 = '!\nlFV7Q)'
    block_0 = module_0.Block(str_0)
    var_0 = block_0.serialize()

def test_case_13():
    int_0 = -1658
    role_0 = module_1.Role(int_0)
    block_0 = module_0.Block(role_0)
    var_0 = block_0.copy()

def test_case_14():
    block_0 = module_0.Block()
    var_0 = block_0.filter_tagged_tasks(block_0)

def test_case_15():
    block_0 = module_0.Block()
    var_0 = block_0.has_tasks()

def test_case_16():
    int_0 = 146
    bool_0 = False
    block_0 = module_0.Block(int_0, bool_0)
    list_0 = [int_0, bool_0]
    block_1 = module_0.Block(int_0, block_0, list_0)
    var_0 = block_1.copy()
    var_1 = block_1.get_include_params()

def test_case_17():
    block_0 = module_0.Block()
    var_0 = block_0.get_first_parent_include()
    str_0 = '!\nlFV7Q)'
    block_1 = module_0.Block(str_0)
    var_1 = block_1.serialize()
    var_2 = block_1.get_dep_chain()

def test_case_18():
    int_0 = 1683
    int_1 = 82
    dict_0 = {int_1: int_1, int_1: int_1, int_1: int_1}
    block_0 = module_0.Block(int_1, dict_0)
    var_0 = block_0.filter_tagged_tasks(int_0)

def test_case_19():
    str_0 = '06135b5-f788-caa-41f8-0000000007eb'
    list_0 = [str_0, str_0, str_0, str_0]
    str_1 = "M'7"
    bytes_0 = b'\xdc'
    block_0 = module_0.Block()
    block_1 = module_0.Block(str_1, bytes_0, block_0, list_0)
    var_0 = block_1.filter_tagged_tasks(list_0)
    float_0 = -817.422
    block_2 = module_0.Block(float_0)
    list_1 = [block_1, str_0, str_0]
    var_1 = block_2.preprocess_data(list_1)
    tuple_0 = None
    var_2 = block_1.filter_tagged_tasks(tuple_0)

def test_case_20():
    str_0 = ''
    list_0 = [str_0, str_0]
    block_0 = module_0.Block(str_0, str_0, list_0)
    var_0 = block_0.has_tasks()
    dict_0 = {var_0: list_0}
    var_1 = block_0.preprocess_data(dict_0)

def test_case_21():
    bool_0 = None
    bytes_0 = b'\x90D\x15\xd3*\xce\xcd=\xbb1\xdd\xf7\xaa\xccz'
    dict_0 = {bool_0: bytes_0}
    block_0 = module_0.Block(dict_0)
    var_0 = block_0.all_parents_static()
    var_1 = block_0.get_vars()
    bytes_1 = b'\x1e\x1f\xde'
    bool_1 = True
    var_2 = block_0.get_dep_chain()
    block_1 = module_0.Block()
    var_3 = block_1.has_tasks()
    int_0 = 146
    var_4 = block_1.copy()
    block_2 = module_0.Block(var_4)
    var_5 = block_2.get_first_parent_include()
    var_6 = block_2.serialize()
    var_7 = block_2.preprocess_data(bool_1)
    var_8 = block_2.deserialize(dict_0)
    var_9 = block_1.all_parents_static()
    bool_2 = False
    block_3 = module_0.Block(int_0, bool_2)
    float_0 = 74.99
    var_10 = block_3.is_block(dict_0)
    var_11 = block_3.set_loader(float_0)
    var_12 = block_1.filter_tagged_tasks(bytes_1)
    var_13 = block_1.all_parents_static()
    var_14 = block_2.get_dep_chain()
    var_15 = block_1.all_parents_static()
    var_16 = block_1.copy()
    str_0 = '7j6'
    block_4 = module_0.Block(str_0)
    block_5 = module_0.Block(int_0, block_1)
    var_17 = block_5.serialize()

def test_case_22():
    str_0 = 'name'
    str_1 = 'block'
    str_2 = 'read block data'
    str_3 = 'register'
    str_4 = 'read from file'
    str_5 = 'command cat /tmp/test'
    str_6 = 'file_content'
    str_7 = {str_0: str_4, str_4: str_5, str_3: str_6}
    str_8 = [str_7]
    str_9 = {str_0: str_2, str_1: str_8}
    var_0 = None
    bool_0 = False
    block_0 = module_0.Block(var_0, var_0, var_0, var_0, bool_0, bool_0)
    var_1 = block_0.preprocess_data(str_9)