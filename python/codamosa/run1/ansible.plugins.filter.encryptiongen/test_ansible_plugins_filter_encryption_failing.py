# Automatically generated by Pynguin.
import ansible.plugins.filter.encryption as module_0
import ansible.parsing.yaml.objects as module_1

def test_case_0():
    try:
        str_0 = 'Pm_'
        var_0 = module_0.do_vault(str_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        list_0 = []
        int_0 = -364
        list_1 = [list_0, int_0, int_0, int_0]
        var_0 = module_0.do_vault(list_0, int_0, list_1)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'f%lof>cLR<A!M]dA'
        str_1 = 'a#\t#j&YIS.W'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_1: str_1}
        set_0 = None
        var_0 = module_0.do_vault(dict_0, str_1, set_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = True
        set_0 = {bool_0}
        var_0 = module_0.do_unvault(bool_0, set_0)
    except BaseException:
        pass

def test_case_4():
    try:
        int_0 = 400
        bytes_0 = b'\xa2\xe3\xd1V\xffbR'
        var_0 = module_0.do_unvault(int_0, bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '$ANSIBLE_VAULT;1.1;AES256 - #<hex_digits>'
        var_0 = module_0.do_unvault(str_0, str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        filter_module_0 = module_0.FilterModule()
        float_0 = 1183.320451
        ansible_vault_encrypted_unicode_0 = module_1.AnsibleVaultEncryptedUnicode(float_0)
        str_0 = '5wSt`>}"N>u%Wis84C0T'
        var_0 = module_0.do_unvault(ansible_vault_encrypted_unicode_0, str_0)
    except BaseException:
        pass