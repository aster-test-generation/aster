# Automatically generated by Pynguin.
import ansible.plugins.connection.paramiko_ssh as module_0

def test_case_0():
    try:
        tuple_0 = ()
        list_0 = [tuple_0, tuple_0, tuple_0, tuple_0]
        int_0 = 257
        my_add_policy_0 = module_0.MyAddPolicy(list_0, int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'N2\xed\x19Z'
        bool_0 = True
        dict_0 = {}
        str_0 = 'Timeout when waiting for search string %s in %s:%s'
        float_0 = 4568.183821
        tuple_0 = (str_0, bool_0, float_0)
        connection_0 = module_0.Connection(bool_0, dict_0, tuple_0)
        var_0 = connection_0.exec_command(bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        str_0 = 'ansible.builtin'
        list_0 = [bool_0]
        connection_0 = module_0.Connection(bool_0, str_0, *list_0)
        var_0 = connection_0.reset()
        dict_0 = {str_0: bool_0, str_0: var_0, str_0: str_0}
        var_1 = connection_0.fetch_file(list_0, dict_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = True
        str_0 = 'ansible.builtin'
        list_0 = [bool_0]
        connection_0 = module_0.Connection(bool_0, str_0, *list_0)
        var_0 = connection_0.reset()
        var_1 = connection_0.close()
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'N2\xed\x19Z'
        bool_0 = True
        dict_0 = {bool_0: bytes_0, bool_0: bool_0}
        bool_1 = True
        str_0 = 'Q`J)kkBY\r Qq\rVYeP6'
        connection_0 = module_0.Connection(dict_0, bool_1, str_0)
        str_1 = 'Enumeration not supported on this database.'
        var_0 = connection_0.put_file(dict_0, str_1)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '\x0caW{,~'
        bytes_0 = b'\x0f\x07M6\xd6q\x8b\x7f\x14\x8cDS(\x9dW\xa6\x90'
        list_0 = [str_0, bytes_0, bytes_0]
        connection_0 = module_0.Connection(str_0, bytes_0, *list_0)
        var_0 = connection_0.reset()
        bytes_1 = b'\xc8\x83V\xff\xe4\x94\xf2Y\xa4\xb3\xd9\x98\xf3x|\xbb'
        list_1 = [var_0, var_0, bytes_1, bytes_0]
        str_1 = "ou-tHS1ag'm:!"
        tuple_0 = (list_1,)
        str_2 = 'm;'
        my_add_policy_0 = module_0.MyAddPolicy(str_2, connection_0)
        var_1 = my_add_policy_0.missing_host_key(list_1, str_1, tuple_0)
    except BaseException:
        pass