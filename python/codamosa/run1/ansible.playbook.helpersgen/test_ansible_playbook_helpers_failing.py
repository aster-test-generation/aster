# Automatically generated by Pynguin.
import ansible.playbook.helpers as module_0

def test_case_0():
    try:
        bool_0 = True
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        str_0 = '=J\tRPz'
        var_0 = module_0.load_list_of_blocks(list_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        tuple_0 = ()
        float_0 = 0.001
        bytes_0 = b'~'
        var_0 = module_0.load_list_of_blocks(tuple_0, float_0, bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = 7
        bool_0 = True
        list_0 = []
        str_0 = 'secondary'
        var_0 = module_0.load_list_of_tasks(int_0, bool_0, list_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = 512.0
        float_1 = None
        dict_0 = {float_0: float_0, float_0: float_1, float_1: float_0}
        list_0 = [float_0, dict_0, dict_0]
        int_0 = -1622
        var_0 = module_0.load_list_of_roles(list_0, int_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'D'
        float_0 = 1288.8809
        var_0 = module_0.load_list_of_roles(str_0, float_0)
    except BaseException:
        pass

def test_case_5():
    try:
        list_0 = []
        var_0 = module_0.load_list_of_roles(list_0, list_0)
        bool_0 = True
        list_1 = [bool_0, bool_0, bool_0, bool_0]
        str_0 = '=J\tRPz'
        var_1 = module_0.load_list_of_blocks(list_1, str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'y!-Gs_Mbasv2\nn'
        bool_0 = True
        float_0 = None
        int_0 = -1546
        str_1 = 'Z;`SZ\n7c.hWd?k'
        str_2 = '-{Ip|'
        tuple_0 = (int_0, str_1, str_2)
        bytes_0 = b'\xfd'
        list_0 = [bytes_0, int_0]
        float_1 = 781.605894
        var_0 = module_0.load_list_of_blocks(float_0, tuple_0, list_0, float_1, str_1)
        var_1 = module_0.load_list_of_roles(str_0, bool_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'tasks'
        str_1 = 'yum'
        str_2 = 'name=nginx state=present'
        str_3 = {str_1: str_1, str_1: str_2}
        str_4 = 'name=nginx state=started'
        str_5 = [str_3, str_2]
        str_6 = {str_0: str_5}
        var_0 = None
        bool_0 = True
        var_1 = None
        var_2 = str_6[str_0]
        var_3 = module_0.load_list_of_tasks(var_2, str_6, var_0, var_0, str_4, bool_0, str_2, var_1)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'tasks'
        str_1 = 'name'
        str_2 = 'Ku*'
        str_3 = 'Install Nginx'
        str_4 = 'name=nginx state=present'
        str_5 = {str_1: str_3, str_2: str_4}
        str_6 = 'service'
        str_7 = [str_5, str_2]
        str_8 = {str_0: str_7}
        var_0 = None
        var_1 = None
        bool_0 = False
        var_2 = None
        var_3 = None
        var_4 = str_8[str_0]
        var_5 = module_0.load_list_of_tasks(var_4, str_8, var_0, str_6, var_1, bool_0, var_2, var_3)
    except BaseException:
        pass

def test_case_9():
    try:
        float_0 = -2735.03669
        dict_0 = {float_0: float_0}
        list_0 = [dict_0, float_0]
        bytes_0 = b'm\xa5\x9d\xcd0\xdf\x91'
        int_0 = None
        str_0 = None
        var_0 = module_0.load_list_of_tasks(list_0, bytes_0, int_0, str_0, list_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'args'
        str_1 = 'a=1 b=2 c=3'
        str_2 = {str_0: str_0, str_0: str_0}
        str_3 = 'task2'
        str_4 = [str_2, str_1]
        var_0 = None
        bool_0 = False
        var_1 = None
        var_2 = module_0.load_list_of_tasks(str_4, str_3, str_1, str_3, var_0, bool_0, var_1, str_1)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = '[Z6'
        str_1 = 'args'
        str_2 = 'a=1 b=2 c=3'
        str_3 = {str_0: str_1, str_1: str_1}
        str_4 = 'task2'
        str_5 = [str_3, str_0]
        var_0 = None
        var_1 = None
        bool_0 = False
        var_2 = None
        var_3 = None
        var_4 = module_0.load_list_of_tasks(str_5, str_4, str_2, var_0, var_1, bool_0, var_2, var_3)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = 'raw'
        str_1 = 'block'
        str_2 = 'async'
        str_3 = 'name: copy files dest: /etc/file'
        str_4 = 'no'
        int_0 = 1
        var_0 = {str_0: str_3, str_1: str_4, str_2: int_0}
        var_1 = {str_0: str_3, str_1: str_4, str_2: int_0}
        var_2 = [var_0, var_1]
        var_3 = None
        var_4 = None
        var_5 = None
        var_6 = None
        bool_0 = False
        var_7 = None
        var_8 = None
        var_9 = module_0.load_list_of_tasks(var_2, var_3, var_4, var_5, var_6, bool_0, var_7, var_8)
    except BaseException:
        pass