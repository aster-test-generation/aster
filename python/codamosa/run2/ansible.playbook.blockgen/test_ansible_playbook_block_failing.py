# Automatically generated by Pynguin.
import ansible.playbook.role as module_0
import ansible.playbook.block as module_1
import ansible.errors as module_2

def test_case_0():
    try:
        float_0 = 1.5
        role_0 = module_0.Role()
        block_0 = module_1.Block(float_0, role_0)
        var_0 = block_0.all_parents_static()
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\xcfs3\x9dE\xc1*\xc2\x17\xe4\x83w\xe0\xd8\xee\xb6~\x7fCW'
        float_0 = 0.2
        block_0 = module_1.Block(float_0)
        var_0 = block_0.__eq__(bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '!L8'
        block_0 = module_1.Block(str_0)
        var_0 = block_0.has_tasks()
        var_1 = block_0.get_vars()
        str_1 = 'Directory %s already exists, but not as a regular file\n'
        block_1 = module_1.Block()
        var_2 = block_1.__eq__(block_1)
        var_3 = block_1.__ne__(str_1)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ''
        str_1 = '+iNTm[`j'
        block_0 = module_1.Block(str_0, str_1)
        var_0 = block_0.get_vars()
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 1266.155
        str_0 = None
        tuple_0 = ()
        block_0 = module_1.Block(tuple_0)
        var_0 = block_0.load(float_0, str_0, str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'n%"B;n4I(?cMcOA92XI'
        bytes_0 = b'\xc1\xefwj'
        block_0 = module_1.Block(str_0, bytes_0)
        var_0 = block_0.serialize()
    except BaseException:
        pass

def test_case_6():
    try:
        tuple_0 = ()
        tuple_1 = (tuple_0,)
        list_0 = [tuple_0, tuple_1, tuple_0]
        block_0 = module_1.Block(tuple_1, list_0, list_0)
        var_0 = block_0.copy()
    except BaseException:
        pass

def test_case_7():
    try:
        set_0 = set()
        bytes_0 = None
        int_0 = -1702
        dict_0 = {bytes_0: bytes_0, int_0: int_0, bytes_0: int_0, bytes_0: int_0}
        list_0 = [dict_0, bytes_0]
        block_0 = module_1.Block(dict_0, list_0)
        var_0 = block_0.set_loader(set_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = '06135b5f-f788-0dc8-8e51-0000000008c2'
        block_0 = module_1.Block(str_0, str_0)
        int_0 = 1143
        block_1 = module_1.Block(block_0, int_0)
        var_0 = block_1.serialize()
    except BaseException:
        pass

def test_case_9():
    try:
        block_0 = module_1.Block()
        var_0 = block_0.get_include_params()
        var_1 = block_0.serialize()
        str_0 = 'file (%s) is %s, cannot continue'
        var_2 = block_0.is_block(block_0)
        var_3 = block_0.deserialize(str_0)
    except BaseException:
        pass

def test_case_10():
    try:
        bytes_0 = b'o8\xdaf\xb3\xb3<,!\x0eU\xb9\x99\x82\xf4'
        float_0 = 845.9
        bytes_1 = b'\xaa\xe58'
        block_0 = module_1.Block(float_0, bytes_1)
        var_0 = block_0.has_tasks()
        var_1 = block_0.preprocess_data(bytes_0)
        block_1 = module_1.Block()
        var_2 = block_1.get_include_params()
        str_0 = '-N'
        var_3 = block_1.copy()
        dict_0 = {str_0: var_3, str_0: var_2}
        var_4 = block_1.filter_tagged_tasks(dict_0)
        var_5 = block_0.get_include_params()
    except BaseException:
        pass

def test_case_11():
    try:
        int_0 = 60
        set_0 = {int_0, int_0, int_0, int_0}
        str_0 = '44=L\nHTE6%Y%mL{76[5>'
        list_0 = []
        int_1 = -3971
        block_0 = module_1.Block(str_0, list_0, int_1)
        var_0 = block_0.get_first_parent_include()
        role_0 = module_0.Role(set_0)
        str_1 = 'HU\rU\r7HNN\tfQz3&'
        block_1 = module_1.Block(int_0, role_0, str_1)
        var_1 = block_1.serialize()
    except BaseException:
        pass

def test_case_12():
    try:
        bool_0 = False
        int_0 = 0
        set_0 = {int_0, int_0, bool_0}
        block_0 = module_1.Block(bool_0, set_0)
        var_0 = block_0.get_first_parent_include()
    except BaseException:
        pass

def test_case_13():
    try:
        float_0 = 936.34
        int_0 = 3952
        bytes_0 = b'z\xf6\tc\xe9\xbfdIk%\xf0\xb4U\x86\x11{\xd3\x8cb1'
        dict_0 = {int_0: int_0, float_0: bytes_0, bytes_0: float_0}
        bool_0 = True
        block_0 = module_1.Block()
        var_0 = block_0.copy(bool_0)
        str_0 = 'SzP{InkPp\x0bx'
        block_1 = module_1.Block(str_0, str_0)
        list_0 = [var_0, bytes_0, var_0]
        var_1 = block_1.load(list_0, dict_0, dict_0, float_0, block_1)
    except BaseException:
        pass

def test_case_14():
    try:
        float_0 = 2391.3424
        block_0 = module_1.Block()
        set_0 = {float_0}
        str_0 = '/VwOdZ`"\rRwijb'
        tuple_0 = (set_0,)
        block_1 = module_1.Block(set_0, str_0, float_0, block_0, tuple_0)
        var_0 = block_1.serialize()
    except BaseException:
        pass

def test_case_15():
    try:
        str_0 = 'a\\e;wil'
        str_1 = '!O`}9,XC3[w\n\x0cSP#t'
        bytes_0 = b'W\xb5\xe4\xaa+[Z'
        set_0 = {str_0, str_1, bytes_0}
        block_0 = module_1.Block()
        block_1 = module_1.Block(str_1, str_1, set_0, set_0)
        var_0 = block_0.get_first_parent_include()
        var_1 = block_1.copy(str_0)
        bool_0 = False
        var_2 = block_1.preprocess_data(bool_0)
        block_2 = module_1.Block()
        var_3 = block_2.serialize()
        var_4 = block_2.get_first_parent_include()
        var_5 = block_2.get_vars()
        int_0 = 0
        str_2 = '06135b5f-f788-0dc8-8e51-0000000001be'
        dict_0 = {str_0: var_4}
        block_3 = module_1.Block(str_2, dict_0, dict_0)
        var_6 = block_1.deserialize(dict_0)
        bytes_1 = b'\xde\xefE\x8cR\x88'
        float_0 = -440.23
        var_7 = block_1.load(dict_0, str_2, bytes_1, dict_0, str_0, float_0, int_0)
    except BaseException:
        pass

def test_case_16():
    try:
        int_0 = -1034
        set_0 = {int_0, int_0, int_0}
        bool_0 = True
        dict_0 = {}
        bytes_0 = b"\xd3\xb8\x8b('"
        block_0 = module_1.Block(bool_0, dict_0, bytes_0)
        var_0 = block_0.set_loader(set_0)
    except BaseException:
        pass

def test_case_17():
    try:
        bytes_0 = b'\x11\xa9\xd7\xd0,i\xe2z\x11\xbe\xe5\xc9\xeb\xe2<\xd9\xd4\xdf'
        block_0 = module_1.Block(bytes_0)
        var_0 = block_0.serialize()
        set_0 = set()
        int_0 = 400
        ansible_parser_error_0 = module_2.AnsibleParserError(set_0, block_0, set_0)
        tuple_0 = (ansible_parser_error_0, set_0, int_0, block_0)
        role_0 = module_0.Role(tuple_0)
        block_1 = module_1.Block(set_0, role_0, role_0)
        var_1 = block_1.serialize()
    except BaseException:
        pass

def test_case_18():
    try:
        bool_0 = True
        role_0 = module_0.Role(bool_0)
        block_0 = module_1.Block(role_0)
        block_1 = module_1.Block(block_0, bool_0, role_0)
        var_0 = block_1.serialize()
    except BaseException:
        pass

def test_case_19():
    try:
        str_0 = 'a\\e;wi'
        role_0 = module_0.Role()
        list_0 = [str_0, str_0, str_0]
        block_0 = module_1.Block(list_0)
        var_0 = block_0.set_loader(role_0)
        str_1 = '06135b5f-f788-0dc-8e51-00c0000018e'
        bytes_0 = b'W\xb5\xe4\xaa+[Z'
        block_1 = module_1.Block()
        var_1 = block_1.has_tasks()
        ansible_parser_error_0 = None
        var_2 = block_0.preprocess_data(ansible_parser_error_0)
        block_2 = module_1.Block(str_1, block_0, bytes_0, list_0, list_0)
        var_3 = block_1.get_first_parent_include()
        int_0 = -2261
        var_4 = block_2.filter_tagged_tasks(int_0)
        bool_0 = False
        var_5 = block_2.preprocess_data(bool_0)
        block_3 = module_1.Block()
        var_6 = block_3.serialize()
        var_7 = block_3.get_first_parent_include()
        var_8 = block_3.get_vars()
        str_2 = '06135b5f-f788-0dc8-8e51-0000000001be'
        dict_0 = {str_0: var_7}
        block_4 = module_1.Block(str_2, dict_0, dict_0)
        var_9 = block_2.deserialize(var_6)
        var_10 = block_2.serialize()
    except BaseException:
        pass

def test_case_20():
    try:
        str_0 = 'a\\e;wi'
        role_0 = module_0.Role()
        list_0 = [str_0, str_0, str_0]
        str_1 = '06135b5f-f788-0dc-8e51-00c0000018e'
        bytes_0 = b'W\xb5\xe4\xaa+[Z'
        block_0 = module_1.Block()
        var_0 = block_0.has_tasks()
        ansible_parser_error_0 = None
        var_1 = block_0.preprocess_data(ansible_parser_error_0)
        block_1 = module_1.Block(str_1, block_0, bytes_0, list_0, list_0)
        var_2 = block_0.get_first_parent_include()
        int_0 = -2261
        var_3 = block_1.filter_tagged_tasks(int_0)
        var_4 = block_1.copy(str_0)
        bool_0 = False
        var_5 = block_1.preprocess_data(bool_0)
        block_2 = module_1.Block()
        var_6 = block_2.all_parents_static()
        var_7 = block_2.serialize()
        var_8 = block_1.__repr__()
        var_9 = block_2.get_first_parent_include()
        str_2 = '06135b5f-f788-0dc8-8e51-0000000001be'
        dict_0 = {str_0: var_9}
        block_3 = module_1.Block(str_2, dict_0, dict_0)
        var_10 = block_1.deserialize(var_7)
        str_3 = 'WyJ)\rx@j/#\t(:ILnZM'
        var_11 = block_1.load(dict_0, block_1, str_3)
    except BaseException:
        pass