# Automatically generated by Pynguin.
import ansible.cli.vault as module_0

def test_case_0():
    try:
        complex_0 = None
        dict_0 = {complex_0: complex_0, complex_0: complex_0, complex_0: complex_0, complex_0: complex_0}
        vault_c_l_i_0 = module_0.VaultCLI(dict_0)
        var_0 = vault_c_l_i_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = True
        bytes_0 = b'j:\xf3\\\xa4\xb2\xbe\xf0\x11X'
        vault_c_l_i_0 = module_0.VaultCLI(bytes_0)
        var_0 = vault_c_l_i_0.format_ciphertext_yaml(bool_0)
        var_1 = vault_c_l_i_0.post_process_args(bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        vault_c_l_i_0 = module_0.VaultCLI(bool_0)
        var_0 = vault_c_l_i_0.execute_encrypt()
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = 2.0
        vault_c_l_i_0 = module_0.VaultCLI(float_0)
        var_0 = vault_c_l_i_0.execute_encrypt_string()
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = False
        bytes_0 = b'j:\xf3\\\xa4\xb2\xbe\xf0\x11X'
        vault_c_l_i_0 = module_0.VaultCLI(bytes_0)
        var_0 = vault_c_l_i_0.format_ciphertext_yaml(bool_0)
        var_1 = vault_c_l_i_0.execute_decrypt()
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = 983.11426
        vault_c_l_i_0 = module_0.VaultCLI(float_0)
        var_0 = vault_c_l_i_0.execute_create()
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = '\noptions:\n  backup:\n    description:\n    - Create a backup file including the timestamp information so you can get\n      the original file back if you somehow clobbered it incorrectly.\n    type: bool\n    default: no\n'
        vault_c_l_i_0 = module_0.VaultCLI(str_0)
        var_0 = vault_c_l_i_0.execute_edit()
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = '&Lp0]q!o|IYJS;qq'
        vault_c_l_i_0 = module_0.VaultCLI(str_0)
        var_0 = vault_c_l_i_0.execute_view()
    except BaseException:
        pass

def test_case_8():
    try:
        bytes_0 = b'\x05\xd5\xef{z'
        vault_c_l_i_0 = module_0.VaultCLI(bytes_0)
        var_0 = vault_c_l_i_0.execute_rekey()
    except BaseException:
        pass

def test_case_9():
    try:
        bool_0 = True
        bytes_0 = b'j:\xf3\\\xa4\xb2\xbe\xf0\x11X'
        vault_c_l_i_0 = module_0.VaultCLI(bytes_0)
        var_0 = vault_c_l_i_0.format_ciphertext_yaml(bool_0)
        list_0 = [bool_0]
        str_0 = '\x0chljhB=='
        var_1 = vault_c_l_i_0.format_ciphertext_yaml(list_0, str_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'szE\r]3/g$:sGnx\nYPBv@'
        vault_c_l_i_0 = module_0.VaultCLI(str_0)
        var_0 = vault_c_l_i_0.init_parser()
        float_0 = 355.9756
        var_1 = vault_c_l_i_0.post_process_args(float_0)
    except BaseException:
        pass

def test_case_11():
    try:
        bool_0 = True
        bytes_0 = b'j:\xf3\\\xa4\xb2\xbe\xf0\x11X'
        vault_c_l_i_0 = module_0.VaultCLI(bytes_0)
        var_0 = vault_c_l_i_0.format_ciphertext_yaml(bool_0)
        float_0 = 0.0
        bool_1 = True
        set_0 = set()
        str_0 = '3iqhO\rV%|ZDU.QF8f`0'
        tuple_0 = (float_0, bool_1, set_0, str_0)
        list_0 = []
        tuple_1 = (tuple_0, list_0)
        list_1 = [bool_0, tuple_1, str_0]
        float_1 = -1102.758
        var_1 = vault_c_l_i_0.format_ciphertext_yaml(list_1, vault_c_l_i_0, float_1)
    except BaseException:
        pass