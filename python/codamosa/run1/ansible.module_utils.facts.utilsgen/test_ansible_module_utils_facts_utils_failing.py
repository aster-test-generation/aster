# Automatically generated by Pynguin.
import ansible.module_utils.facts.utils as module_0

def test_case_0():
    try:
        bool_0 = None
        var_0 = module_0.get_mount_size(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '/etc/passwd'
        bool_0 = True
        var_0 = None
        var_1 = module_0.get_file_lines(str_0, bool_0, var_0)
        var_2 = module_0.get_file_content(str_0, bool_0)
        str_1 = '\n'
        var_3 = module_0.get_file_lines(str_0, bool_0, str_1)
        var_4 = module_0.get_file_content(str_0, bool_0)
        bool_1 = False
        var_5 = module_0.get_file_lines(str_0, bool_1, str_1)
        var_6 = module_0.get_file_content(str_0, bool_1)
        list_0 = [bool_1]
        tuple_0 = (list_0,)
        set_0 = None
        var_7 = module_0.get_file_content(tuple_0, set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '/etc/passwd'
        str_1 = '\n'
        bool_0 = True
        var_0 = module_0.get_file_lines(str_0, bool_0, str_1)
        var_1 = module_0.get_file_content(str_0, bool_0)
        str_2 = ''
        var_2 = module_0.get_file_lines(str_0, bool_0, str_2)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '/'
        var_0 = module_0.get_file_content(str_0)
    except BaseException:
        pass