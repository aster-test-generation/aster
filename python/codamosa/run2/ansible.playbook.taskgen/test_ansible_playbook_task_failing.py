# Automatically generated by Pynguin.
import ansible.playbook.task as module_0

def test_case_0():
    try:
        str_0 = '\x0c)/t^R@$,5*q=y|'
        bytes_0 = b'G\x05\x1fV\xcePR\xd5\xcd\x03-\x00\x9d\xd3\x1b\x0f\xd2['
        dict_0 = {str_0: bytes_0, bytes_0: bytes_0}
        task_0 = module_0.Task()
        list_0 = [task_0]
        task_1 = module_0.Task(dict_0, task_0, list_0)
        var_0 = task_1.copy()
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = -2354
        bytes_0 = b'>\xbe5'
        task_0 = module_0.Task(bytes_0)
        var_0 = task_0.load(int_0, int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        task_0 = module_0.Task()
        str_0 = {}
        var_0 = task_0.preprocess_data(str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        task_0 = module_0.Task()
        var_0 = task_0.preprocess_data(task_0)
    except BaseException:
        pass

def test_case_4():
    try:
        task_0 = module_0.Task()
        str_0 = "Nx{3 {'"
        var_0 = task_0.post_validate(str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        task_0 = module_0.Task()
        task_1 = module_0.Task(task_0)
        var_0 = task_1.get_first_parent_include()
        task_2 = module_0.Task()
        var_1 = task_2.get_include_params()
        bool_0 = False
        var_2 = task_1.post_validate(bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = '%$;66*wkZ4k$#Sa1jz'
        task_0 = module_0.Task()
        var_0 = task_0.get_first_parent_include()
        task_1 = module_0.Task(str_0)
        var_1 = task_1.__repr__()
        var_2 = task_1.get_vars()
    except BaseException:
        pass

def test_case_7():
    try:
        task_0 = module_0.Task()
        task_1 = module_0.Task(task_0)
        var_0 = task_1.get_include_params()
        task_2 = module_0.Task()
        str_0 = {}
        var_1 = task_2.preprocess_data(str_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'vyS'
        task_0 = module_0.Task(str_0)
        var_0 = task_0.serialize()
    except BaseException:
        pass

def test_case_9():
    try:
        float_0 = None
        int_0 = 80
        task_0 = module_0.Task(int_0)
        var_0 = task_0.deserialize(float_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'pty'
        task_0 = module_0.Task(str_0)
        bytes_0 = b"'\x99\xe9C#\xd1\t\xb8*\x02\x8d\x8f\x1a\t\xc9\xc2"
        task_1 = module_0.Task(bytes_0)
        var_0 = task_1.set_loader(task_0)
    except BaseException:
        pass

def test_case_11():
    try:
        bytes_0 = b'\xebg]\xc4\xc9\x850\xf3-\xff[\xd7\xb1\n\xebNj\xa6\x13\x0b'
        task_0 = module_0.Task()
        var_0 = task_0.get_name()
        task_1 = module_0.Task(bytes_0)
        var_1 = task_0.all_parents_static()
        var_2 = task_1.all_parents_static()
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = "b$\x0c11'#SmuM.="
        task_0 = module_0.Task(str_0)
        var_0 = task_0.get_first_parent_include()
    except BaseException:
        pass

def test_case_13():
    try:
        task_0 = module_0.Task()
        str_0 = {task_0: task_0}
        var_0 = task_0.preprocess_data(str_0)
    except BaseException:
        pass

def test_case_14():
    try:
        task_0 = module_0.Task()
        str_0 = 'Task1'
        str_1 = {str_0: str_0}
        var_0 = task_0.preprocess_data(str_1)
    except BaseException:
        pass

def test_case_15():
    try:
        bytes_0 = b'\x7f'
        bool_0 = False
        task_0 = module_0.Task(bool_0)
        str_0 = 'nael'
        str_1 = 'raw'
        var_0 = task_0.get_include_params()
        str_2 = 'Ansible task'
        var_1 = task_0.get_vars()
        str_3 = {str_1: bytes_0, str_0: str_2, str_1: bytes_0, str_1: str_0}
        var_2 = task_0.__repr__()
        task_1 = module_0.Task(task_0)
        dict_0 = {var_2: task_0, var_2: task_1, str_1: str_2, task_1: var_2}
        var_3 = task_1.deserialize(dict_0)
        var_4 = task_1.get_name()
        var_5 = task_1.get_first_parent_include()
        var_6 = task_1.serialize()
        var_7 = task_0.load(str_3, str_2, str_0)
    except BaseException:
        pass

def test_case_16():
    try:
        str_0 = 'raw'
        task_0 = module_0.Task()
        str_1 = 'N'
        str_2 = {str_0: task_0, str_1: str_1, str_0: task_0, str_0: str_1}
        var_0 = task_0.__repr__()
        var_1 = task_0.load(str_2, str_0, str_1)
    except BaseException:
        pass

def test_case_17():
    try:
        tuple_0 = None
        bool_0 = False
        dict_0 = {tuple_0: tuple_0, tuple_0: tuple_0, bool_0: bool_0}
        task_0 = module_0.Task(tuple_0, dict_0)
        var_0 = task_0.serialize()
    except BaseException:
        pass

def test_case_18():
    try:
        task_0 = module_0.Task()
        str_0 = 'parent'
        str_1 = 'parent_type'
        str_2 = {str_0: str_0, str_1: str_1, str_1: str_1}
        var_0 = task_0.deserialize(str_2)
    except BaseException:
        pass

def test_case_19():
    try:
        task_0 = module_0.Task()
        str_0 = "?+\x0b'.\rT9a=z<"
        str_1 = 'parent_type'
        str_2 = 'role'
        str_3 = {str_0: str_0, str_1: str_1, str_2: str_2}
        var_0 = task_0.deserialize(str_3)
    except BaseException:
        pass

def test_case_20():
    try:
        bytes_0 = b'\x7f'
        bool_0 = False
        task_0 = module_0.Task(bool_0)
        str_0 = 'nael'
        str_1 = 'raw'
        var_0 = task_0.get_include_params()
        str_2 = 'Ansible task'
        var_1 = task_0.get_vars()
        str_3 = {str_1: bytes_0, str_0: str_2, str_1: bytes_0, str_1: str_0}
        var_2 = task_0.__repr__()
        task_1 = module_0.Task(task_0)
        dict_0 = {var_2: task_0, var_2: task_1, str_1: str_2, task_1: var_2}
        var_3 = task_1.get_first_parent_include()
        var_4 = task_1.deserialize(dict_0)
        var_5 = task_1.get_name()
        var_6 = task_1.get_first_parent_include()
        var_7 = task_0.load(str_3, str_2, str_0)
    except BaseException:
        pass

def test_case_21():
    try:
        bytes_0 = b'\x7f'
        bool_0 = False
        task_0 = module_0.Task(bool_0)
        var_0 = task_0.set_loader(bytes_0)
        str_0 = 'raw'
        var_1 = task_0.get_include_params()
        var_2 = task_0.get_vars()
        float_0 = 2.0
        var_3 = task_0.copy(float_0)
        var_4 = task_0.get_first_parent_include()
        var_5 = task_0.__repr__()
        task_1 = module_0.Task(task_0)
        dict_0 = {var_5: task_0, var_5: var_0, str_0: var_4, task_1: var_5}
        var_6 = task_1.deserialize(dict_0)
        var_7 = task_0.preprocess_data
        set_0 = set()
        var_8 = task_1.get_name()
        var_9 = task_1.get_first_parent_include()
        var_10 = task_1.serialize()
        var_11 = task_1.get_include_params()
        var_12 = task_0.get_vars()
        str_1 = 'mw'
        var_13 = task_0.load(var_10, str_1, set_0)
    except BaseException:
        pass