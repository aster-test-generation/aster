# Automatically generated by Pynguin.
import ansible.parsing.ajson as module_0
import ansible.utils.unsafe_proxy as module_1

def test_case_0():
    pass

def test_case_1():
    ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder()

def test_case_2():
    ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder()
    str_0 = '{"__ansible_vault": "secret"}'
    var_0 = ansible_j_s_o_n_decoder_0.decode(str_0)

def test_case_3():
    ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder()
    str_0 = '__ansible_vault'
    str_1 = {ansible_j_s_o_n_decoder_0: ansible_j_s_o_n_decoder_0, str_0: str_0, ansible_j_s_o_n_decoder_0: ansible_j_s_o_n_decoder_0, str_0: str_0, ansible_j_s_o_n_decoder_0: str_0, str_0: str_0, str_0: ansible_j_s_o_n_decoder_0, str_0: ansible_j_s_o_n_decoder_0}
    var_0 = ansible_j_s_o_n_decoder_0.object_hook(str_1)

def test_case_4():
    list_0 = []
    dict_0 = {}
    ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder(**dict_0)
    var_0 = ansible_j_s_o_n_decoder_0.object_hook(list_0)

def test_case_5():
    ansible_j_s_o_n_decoder_0 = module_0.AnsibleJSONDecoder()
    str_0 = '__ansible_unsafe'
    str_1 = 'bar'
    dict_0 = {}
    var_0 = ansible_j_s_o_n_decoder_0.object_hook(dict_0)
    str_2 = {str_1: str_1, str_0: str_1}
    var_1 = module_1.wrap_var(str_1)
    var_2 = ansible_j_s_o_n_decoder_0.object_hook(str_2)