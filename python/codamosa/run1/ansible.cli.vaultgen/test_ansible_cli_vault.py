# Automatically generated by Pynguin.
import ansible.cli.vault as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = "!vrK7XD y'Q@$"
    vault_c_l_i_0 = module_0.VaultCLI(str_0)

def test_case_2():
    str_0 = 'Si#kE'
    tuple_0 = (str_0,)
    vault_c_l_i_0 = module_0.VaultCLI(tuple_0)
    var_0 = vault_c_l_i_0.run()
    var_1 = vault_c_l_i_0.execute_encrypt()
    var_2 = vault_c_l_i_0.execute_edit()

def test_case_3():
    bool_0 = False
    bytes_0 = b'j:\xf3\\\xa4\xb2\xbe\xf0\x11X'
    vault_c_l_i_0 = module_0.VaultCLI(bytes_0)
    var_0 = vault_c_l_i_0.format_ciphertext_yaml(bool_0)