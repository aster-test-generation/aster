# Automatically generated by Pynguin.
import ansible.galaxy.api as module_0
import threading as module_1
import ansible.errors as module_2

def test_case_0():
    pass

def test_case_1():
    list_0 = None
    var_0 = module_0.is_rate_limit_exception(list_0)

def test_case_2():
    str_0 = '\x0bTlkx$7Ul#8n*x]$-'
    var_0 = module_0.get_cache_id(str_0)

def test_case_3():
    str_0 = ''
    tuple_0 = None
    set_0 = {str_0, str_0}
    list_0 = [tuple_0]
    bytes_0 = b'\xca\x0fm\x930\x84\xf9\x06\x9b'
    str_1 = '3:\x0b!l'
    str_2 = '_^Av=j%'
    str_3 = '/etc/HOSTNAME'
    dict_0 = {str_1: tuple_0, str_1: str_2, str_3: list_0}
    galaxy_a_p_i_0 = module_0.GalaxyAPI(list_0, str_1, bytes_0, dict_0)
    dict_1 = {str_0: galaxy_a_p_i_0}
    dict_2 = None
    collection_version_metadata_0 = module_0.CollectionVersionMetadata(str_0, tuple_0, set_0, dict_1, dict_2, dict_0)

def test_case_4():
    list_0 = None
    bytes_0 = b'\xa7\x9d'
    str_0 = 'Bg]eaOX)mviJh'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(bytes_0, bytes_0, str_0, list_0)

def test_case_5():
    list_0 = None
    bytes_0 = b'\xa7\x9d'
    str_0 = 'Bg]eaOX)mviJh'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(bytes_0, bytes_0, str_0, list_0)
    var_0 = galaxy_a_p_i_0.__repr__()

def test_case_6():
    str_0 = 'Kw9cm%'
    str_1 = 'zFrPAQR0m/e$QK3'
    dict_0 = {str_0: str_0, str_1: str_1}
    float_0 = -310.84
    list_0 = [str_0, str_1]
    str_2 = 'h+"'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(str_0, dict_0, float_0, list_0, str_2)
    var_0 = galaxy_a_p_i_0.__unicode__()

def test_case_7():
    str_0 = 'Dame'
    int_0 = 43
    bool_0 = False
    galaxy_a_p_i_0 = module_0.GalaxyAPI(str_0, str_0, str_0, str_0, str_0, str_0, str_0, str_0, str_0, bool_0, int_0)

def test_case_8():
    int_0 = None
    bytes_0 = b'\xa7\x9d'
    str_0 = '6Bg3]eaOX)mv8iJh'
    list_0 = []
    galaxy_a_p_i_0 = module_0.GalaxyAPI(bytes_0, bytes_0, str_0, list_0)
    var_0 = galaxy_a_p_i_0.__lt__(int_0)

def test_case_9():
    str_0 = 'https://server.com:443'
    var_0 = module_0.get_cache_id(str_0)
    str_1 = 'https://server.co>:8,'
    var_1 = module_0.get_cache_id(str_1)

def test_case_10():
    str_0 = 'name'
    str_1 = 'ap\r_server'
    str_2 = 'api_key'
    str_3 = 'login_uZ*r'
    str_4 = 'login_password'
    str_5 = 'delegate_to'
    int_0 = 30
    bool_0 = False
    galaxy_a_p_i_0 = module_0.GalaxyAPI(str_0, str_1, str_2, str_3, str_4, str_4, str_4, str_3, str_5, bool_0, int_0)

def test_case_11():
    str_0 = 'role_uuid'
    tuple_0 = ()
    var_0 = module_0.get_cache_id(tuple_0)
    str_1 = 'login_uZ*r'
    int_0 = None
    thread_0 = module_1.Thread(int_0, int_0)
    ansible_error_0 = module_2.AnsibleError()
    var_1 = module_0.is_rate_limit_exception(ansible_error_0)
    int_1 = -20
    bool_0 = True
    galaxy_a_p_i_0 = module_0.GalaxyAPI(str_0, str_1, str_0, str_1, str_1, str_1, str_1, str_1, str_0, bool_0, int_1)
    var_2 = galaxy_a_p_i_0.__lt__(galaxy_a_p_i_0)
    var_3 = module_0.is_rate_limit_exception(str_0)
    var_4 = galaxy_a_p_i_0.__lt__(tuple_0)