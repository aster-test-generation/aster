# Automatically generated by Pynguin.
import ansible.playbook.task as module_0
import ansible.parsing.yaml.objects as module_1
import ansible.playbook.role as module_2

def test_case_0():
    try:
        str_0 = 'g0k#e=++vX?.79ZYhF'
        list_0 = [str_0, str_0]
        tuple_0 = None
        str_1 = 'D|Y\nZLo\nl'
        int_0 = 1727
        tuple_1 = (list_0, tuple_0, str_1, int_0)
        tuple_2 = ()
        dict_0 = {tuple_2: tuple_2, tuple_2: tuple_2, tuple_2: tuple_2}
        str_2 = '<C}ja:x,`!g$'
        str_3 = 't3\'-lt"0sN@'
        task_0 = module_0.Task(dict_0, str_2, str_3)
        task_1 = module_0.Task(task_0)
        task_2 = module_0.Task(tuple_2, task_1)
        var_0 = task_2.copy(str_0, tuple_1)
        str_4 = "2\x0clKtst?$h'"
        task_3 = module_0.Task(str_4)
        var_1 = task_3.serialize()
    except BaseException:
        pass

def test_case_1():
    try:
        task_0 = module_0.Task()
        list_0 = [task_0, task_0]
        int_0 = 69
        float_0 = -2194.62
        var_0 = task_0.load(list_0, int_0, float_0)
    except BaseException:
        pass

def test_case_2():
    try:
        task_0 = module_0.Task()
        var_0 = task_0.preprocess_data(task_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '\t3bzcB0`Z5d3<M/'
        task_0 = module_0.Task()
        var_0 = task_0.post_validate(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = -551.55
        task_0 = module_0.Task(float_0)
        var_0 = task_0.__repr__()
        int_0 = 3897
        dict_0 = {int_0: int_0, int_0: int_0, int_0: int_0, int_0: int_0}
        task_1 = module_0.Task(dict_0)
        var_1 = task_1.get_vars()
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'P\x0b4MiuAX'
        task_0 = module_0.Task(str_0, str_0)
        var_0 = task_0.serialize()
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = '\t/'
        task_0 = module_0.Task(str_0)
        var_0 = task_0.__repr__()
        task_1 = module_0.Task()
        int_0 = 1181
        var_1 = task_0.set_loader(int_0)
    except BaseException:
        pass

def test_case_7():
    try:
        task_0 = module_0.Task()
        var_0 = task_0.__repr__()
        var_1 = task_0.__repr__()
        set_0 = {task_0}
        bytes_0 = b'\xfb-\xbc\xfb'
        var_2 = task_0.get_vars()
        var_3 = task_0.set_loader(bytes_0)
        task_1 = module_0.Task(set_0)
        var_4 = task_1.all_parents_static()
    except BaseException:
        pass

def test_case_8():
    try:
        int_0 = 1675
        task_0 = module_0.Task(int_0)
        var_0 = task_0.get_first_parent_include()
    except BaseException:
        pass

def test_case_9():
    try:
        bool_0 = False
        task_0 = module_0.Task()
        task_1 = module_0.Task(task_0)
        var_0 = task_1.post_validate(bool_0)
    except BaseException:
        pass

def test_case_10():
    try:
        float_0 = 1241.459
        bool_0 = True
        int_0 = 5020
        task_0 = module_0.Task(int_0)
        task_1 = module_0.Task()
        task_2 = module_0.Task(float_0, bool_0, task_1)
        var_0 = task_2.copy()
        set_0 = set()
        var_1 = task_2.get_first_parent_include()
        var_2 = task_2.copy(set_0)
        var_3 = task_0.__repr__()
        str_0 = 'h.I#&;N}\\o'
        task_3 = module_0.Task(str_0)
        var_4 = task_2.serialize()
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'yb\n/|Jb]\x0c'
        task_0 = module_0.Task()
        task_1 = module_0.Task(task_0)
        var_0 = task_1.copy()
        str_1 = 'collections'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_1: str_1}
        ansible_mapping_0 = module_1.AnsibleMapping(**dict_0)
        bytes_0 = b"nW\xdcW\x835\xc1&\x8d\x18W\xb7q'/p\xb4+\xb9\xd2"
        task_2 = module_0.Task()
        var_1 = task_2.get_include_params()
        task_3 = module_0.Task(str_0)
        var_2 = task_3.__repr__()
        task_4 = module_0.Task()
        var_3 = task_4.load(ansible_mapping_0, bytes_0, task_3)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = 'acton'
        str_1 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
        task_0 = module_0.Task()
        var_0 = task_0.preprocess_data(str_1)
    except BaseException:
        pass

def test_case_13():
    try:
        task_0 = module_0.Task()
        dict_0 = {}
        ansible_mapping_0 = module_1.AnsibleMapping(**dict_0)
        str_0 = 'o.-xR41\x0cgKCn~Ms'
        var_0 = task_0.load(ansible_mapping_0, str_0)
    except BaseException:
        pass

def test_case_14():
    try:
        bool_0 = True
        task_0 = module_0.Task(bool_0)
        dict_0 = {task_0: task_0, task_0: bool_0, task_0: bool_0}
        var_0 = task_0.preprocess_data(dict_0)
    except BaseException:
        pass

def test_case_15():
    try:
        float_0 = 1241.459
        bool_0 = False
        int_0 = 5020
        task_0 = module_0.Task(int_0)
        task_1 = module_0.Task()
        task_2 = module_0.Task(float_0, bool_0, task_1)
        var_0 = task_2.copy()
        set_0 = set()
        var_1 = task_2.get_first_parent_include()
        var_2 = task_2.__repr__()
        bool_1 = True
        str_0 = '=T\x0c(\x0cyu5]'
        dict_0 = {str_0: var_1, str_0: bool_1, str_0: set_0, str_0: var_0}
        dict_1 = {str_0: dict_0, str_0: str_0, str_0: task_1}
        var_3 = task_1.get_vars()
        var_4 = task_2.deserialize(dict_1)
        var_5 = task_2.serialize()
        dict_2 = {}
        str_1 = '*W'
        tuple_0 = (str_1, str_0, str_0, task_2)
        tuple_1 = (tuple_0,)
        var_6 = task_1.get_include_params()
        var_7 = task_2.load(dict_2, tuple_1, str_0)
    except BaseException:
        pass

def test_case_16():
    try:
        str_0 = 'action'
        str_1 = 'vars'
        str_2 = 'when'
        str_3 = 'install and config mysql'
        str_4 = 'yum'
        str_5 = 'yes'
        str_6 = 'yum_error_fatal'
        str_7 = 'ansible_os_family == "RedHat"'
        str_8 = {str_6: str_3, str_0: str_4, str_3: str_5, str_1: str_6, str_2: str_7}
        task_0 = module_0.Task()
        var_0 = task_0.preprocess_data(str_8)
    except BaseException:
        pass

def test_case_17():
    try:
        str_0 = 'n.;aPN25}ZbxPoH\x0cl O'
        str_1 = 'collections'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_1: str_1}
        ansible_mapping_0 = module_1.AnsibleMapping(**dict_0)
        bytes_0 = b"nW\xdcW\x835\xc1&\x8d\x18W\xb7q'/p\xb4+\xb9\xd2"
        task_0 = module_0.Task()
        var_0 = task_0.load(ansible_mapping_0, bytes_0, task_0)
    except BaseException:
        pass

def test_case_18():
    try:
        str_0 = 'var2'
        str_1 = {str_0: str_0, str_0: str_0}
        str_2 = {str_0: str_0, str_0: str_1}
        str_3 = 'parent_type'
        str_4 = 'parent'
        str_5 = 'TaskInclude'
        str_6 = {str_3: str_5, str_4: str_1, str_0: str_2}
        task_0 = module_0.Task()
        var_0 = task_0.deserialize(str_6)
        var_1 = task_0._parent
        var_2 = str_3._role
    except BaseException:
        pass

def test_case_19():
    try:
        str_0 = 'name'
        str_1 = 'action'
        task_0 = module_0.Task(str_0, str_1)
        str_2 = 'parent'
        str_3 = 'parent_type'
        str_4 = 'role'
        str_5 = 'implicit'
        str_6 = 'resolved_action'
        str_7 = {str_2: str_2, str_3: str_3, str_4: str_4, str_5: str_5, str_6: str_6}
        var_0 = task_0.deserialize(str_7)
    except BaseException:
        pass

def test_case_20():
    try:
        str_0 = 'var2'
        str_1 = 'val1'
        str_2 = {str_0: str_1, str_1: str_1}
        str_3 = {str_0: str_0, str_0: str_1}
        str_4 = 'parent_type'
        str_5 = 'parent'
        str_6 = 'role'
        str_7 = 'TaskInclude'
        str_8 = {str_4: str_7, str_5: str_2, str_6: str_3}
        task_0 = module_0.Task()
        var_0 = task_0.deserialize(str_8)
        var_1 = task_0._parent
        var_2 = str_4._role
    except BaseException:
        pass

def test_case_21():
    try:
        str_0 = 'action'
        bytes_0 = b'N\xf9;\xc1\xc9C\xa3A\x07Io>'
        task_0 = module_0.Task(bytes_0)
        str_1 = 'when'
        task_1 = module_0.Task()
        role_0 = module_2.Role(task_1, task_1)
        var_0 = task_1.get_vars()
        var_1 = task_0.get_name()
        str_2 = '^x8UPKLQ'
        int_0 = 763
        dict_0 = {str_2: var_1, str_2: int_0, str_1: int_0, str_0: str_1}
        var_2 = task_1.load(dict_0, role_0)
    except BaseException:
        pass