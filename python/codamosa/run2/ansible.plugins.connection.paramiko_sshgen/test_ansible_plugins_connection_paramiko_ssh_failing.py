# Automatically generated by Pynguin.
import ansible.plugins.connection.paramiko_ssh as module_0

def test_case_0():
    try:
        bytes_0 = b'\x87\xb4\xb9+m\x9d'
        my_add_policy_0 = module_0.MyAddPolicy(bytes_0, bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        tuple_0 = ()
        bytes_0 = b']\x1c\xc1(6j1kh\xecM\xed\xc3\xf3\xef'
        float_0 = -2799.44338
        set_0 = {bytes_0, tuple_0, bytes_0, tuple_0}
        list_0 = []
        list_1 = []
        bytes_1 = b'\xf9\xb1\xe2W]'
        str_0 = ':.:G{]nnpa]-Z\x0cE,'
        connection_0 = module_0.Connection(bytes_1, tuple_0, str_0)
        my_add_policy_0 = module_0.MyAddPolicy(list_1, connection_0)
        var_0 = my_add_policy_0.missing_host_key(float_0, set_0, list_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = 2857
        set_0 = {int_0}
        int_1 = -1249
        float_0 = 16.198
        list_0 = [float_0]
        tuple_0 = (float_0, list_0)
        connection_0 = module_0.Connection(set_0, int_1, tuple_0)
        var_0 = connection_0.close()
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'\x14nSu\x8b\x91\xe5\xf1\xa2\r\x15\x91\x8d\x8e:b'
        float_0 = -2557.994974
        str_0 = 'i)OEm=N("o!'
        bool_0 = None
        dict_0 = {str_0: bool_0, str_0: bytes_0}
        bytes_1 = b''
        list_0 = [dict_0, bytes_1, float_0]
        list_1 = [bytes_1]
        connection_0 = module_0.Connection(list_0, list_1, dict_0, *list_0)
        var_0 = connection_0.exec_command(dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '^a?v4=j]//)s#'
        bytes_0 = b'o\xd8\xc0\x8cr\x90\x1a\xcdb9\xbd\x17\xbdA'
        dict_0 = {bytes_0: bytes_0, bytes_0: bytes_0, bytes_0: bytes_0, bytes_0: bytes_0}
        dict_1 = {}
        int_0 = 2817
        float_0 = 1418.85132
        str_1 = "b o6\tQ'DE-u"
        list_0 = [dict_0, bytes_0, str_0]
        connection_0 = module_0.Connection(float_0, str_1, *list_0)
        var_0 = connection_0.put_file(dict_1, int_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bytes_0 = b'\xdf\xc8R\xc2<\x17\xe0\xb9K\xcd\xee$\r\xefi\x91x'
        int_0 = -1249
        list_0 = [bytes_0, bytes_0, bytes_0]
        connection_0 = module_0.Connection(bytes_0, bytes_0, *list_0)
        list_1 = [bytes_0, int_0]
        my_add_policy_0 = None
        var_0 = connection_0.fetch_file(list_1, my_add_policy_0)
    except BaseException:
        pass