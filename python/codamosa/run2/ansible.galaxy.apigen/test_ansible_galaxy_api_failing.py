# Automatically generated by Pynguin.
import ansible.galaxy.api as module_0
import urllib.error as module_1
import ansible.errors as module_2
import threading as module_3

def test_case_0():
    try:
        str_0 = 'yE`'
        int_0 = None
        galaxy_error_0 = module_0.GalaxyError(int_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\xa7\x9d'
        str_0 = '6Bg3]eaOX)mv8iJh'
        list_0 = []
        galaxy_a_p_i_0 = module_0.GalaxyAPI(bytes_0, bytes_0, str_0, list_0)
        var_0 = galaxy_a_p_i_0.__lt__(list_0)
        var_1 = galaxy_a_p_i_0.__lt__(galaxy_a_p_i_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'testing'
        str_1 = 'url'
        int_0 = 404
        str_2 = 'errormsg'
        str_3 = 'headers'
        var_0 = None
        h_t_t_p_error_0 = module_1.HTTPError(str_1, int_0, str_2, str_3, var_0)
        galaxy_error_0 = module_0.GalaxyError(h_t_t_p_error_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '\n    Test t check if the constructor of class GalaxyAPI is workig poperly\n    '
        str_1 = 'perm_hwaddr'
        var_0 = module_0.get_cache_id(str_1)
        str_2 = 'name'
        var_1 = module_0.get_cache_id(str_2)
        str_3 = 'ap\r_server'
        str_4 = 'login_uZ*r'
        ansible_error_0 = module_2.AnsibleError()
        dict_0 = {str_2: ansible_error_0, str_4: str_3, ansible_error_0: str_0, str_2: str_3}
        str_5 = '};GmDE1QUM_e0W3&[D'
        event_0 = module_3.Event()
        int_0 = None
        int_1 = -1239
        thread_0 = module_3.Thread(int_0, int_1)
        float_0 = -998.669518
        str_6 = '\\w+9g~'
        galaxy_a_p_i_0 = module_0.GalaxyAPI(dict_0, str_5, event_0, thread_0, float_0, str_6)
        ansible_error_1 = module_2.AnsibleError()
        event_1 = None
        list_0 = [str_5, var_1, event_0]
        h_t_t_p_error_0 = module_1.HTTPError(event_1, thread_0, list_0, thread_0, thread_0)
        galaxy_error_0 = module_0.GalaxyError(h_t_t_p_error_0, list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '\n    Test to check if the constructor of class GalaxyAPI is working properly\n    '
        str_1 = 'am'
        str_2 = 'ap\r_server'
        tuple_0 = ()
        var_0 = module_0.get_cache_id(tuple_0)
        str_3 = 'login_uZ*r'
        ansible_error_0 = module_2.AnsibleError()
        event_0 = module_3.Event()
        int_0 = None
        int_1 = 480
        thread_0 = module_3.Thread(int_0, int_1)
        float_0 = -998.669518
        ansible_error_1 = module_2.AnsibleError()
        var_1 = module_0.is_rate_limit_exception(ansible_error_1)
        int_2 = 19
        set_0 = set()
        bytes_0 = b'\x97\xb6"\xe4\xa2\xc4aH.\x1a\x9fht\xed\xd9\x07YP\xce\xb0'
        bool_0 = False
        galaxy_a_p_i_0 = module_0.GalaxyAPI(set_0, bytes_0, bool_0, float_0)
        bool_1 = False
        galaxy_a_p_i_1 = module_0.GalaxyAPI(str_1, str_2, str_0, str_3, str_3, str_3, str_3, str_3, str_0, bool_1, int_2)
        var_2 = galaxy_a_p_i_1.__lt__(galaxy_a_p_i_1)
        str_4 = None
        var_3 = galaxy_a_p_i_1.__lt__(str_4)
        var_4 = galaxy_a_p_i_0.__lt__(galaxy_a_p_i_1)
        collection_metadata_0 = module_0.CollectionMetadata()
    except BaseException:
        pass