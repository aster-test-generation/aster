# Automatically generated by Pynguin.
import ansible.parsing.ajson as module_0

def test_case_0():
    try:
        ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder()
        bytes_0 = b'\x12\xe0'
        var_0 = ansible_j_s_o_n_decoder_0.object_hook(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'VaDmn0?'
        str_1 = "an undefined variable was found when attempting to template the vars_files item '%s'"
        list_0 = []
        list_1 = []
        ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder(*list_1)
        var_0 = ansible_j_s_o_n_decoder_0.object_hook(list_0)
        dict_0 = {str_0: str_0, str_0: str_0, str_1: str_0}
        ansible_j_s_o_n_decoder_1 = module_0.AnsibleJSONDecoder(**dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '__ansible_unsafe'
        str_1 = 'unsafe_string'
        str_2 = {str_0: str_1}
        ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder()
        var_0 = ansible_j_s_o_n_decoder_0.object_hook(str_2)
        var_1 = var_0.__class__
        var_2 = ansible_j_s_o_n_decoder_0.object_hook(str_2)
        var_3 = var_2.vault
    except BaseException:
        pass