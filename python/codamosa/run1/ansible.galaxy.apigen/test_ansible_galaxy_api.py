# Automatically generated by Pynguin.
import ansible.galaxy.api as module_0
import urllib.error as module_1

def test_case_0():
    pass

def test_case_1():
    int_0 = 27
    var_0 = module_0.is_rate_limit_exception(int_0)

def test_case_2():
    str_0 = 'http://galaxy.ansible.com:https/api/'
    var_0 = module_0.get_cache_id(str_0)

def test_case_3():
    int_0 = 400
    str_0 = 'Bad Request'
    h_t_t_p_error_0 = module_1.HTTPError(str_0, int_0, str_0, str_0, str_0)
    galaxy_error_0 = module_0.GalaxyError(h_t_t_p_error_0, str_0)

def test_case_4():
    int_0 = 1739
    galaxy_error_0 = None
    str_0 = '%<Gc,oy'
    bool_0 = True
    collection_version_metadata_0 = module_0.CollectionVersionMetadata(int_0, galaxy_error_0, int_0, str_0, str_0, bool_0)
    dict_0 = {collection_version_metadata_0: int_0, galaxy_error_0: bool_0}
    str_1 = 'N)<am9R>kl/zpaN'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(dict_0, str_1, bool_0)

def test_case_5():
    str_0 = 'v2'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(str_0, str_0, str_0, str_0)

def test_case_6():
    str_0 = '^'
    set_0 = {str_0}
    float_0 = -4121.2028
    list_0 = []
    list_1 = [float_0]
    list_2 = [str_0, list_0, list_0, list_1]
    dict_0 = {str_0: set_0}
    galaxy_a_p_i_0 = module_0.GalaxyAPI(str_0, set_0, float_0, list_2, dict_0, set_0)
    var_0 = galaxy_a_p_i_0.__str__()

def test_case_7():
    int_0 = 1464
    list_0 = [int_0, int_0, int_0]
    bytes_0 = b'~\xc6\xf7\x1b'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(int_0, list_0, bytes_0, list_0, int_0)
    dict_0 = {}
    list_1 = [galaxy_a_p_i_0, list_0, dict_0, bytes_0]
    collection_metadata_0 = module_0.CollectionMetadata(*list_1)
    bool_0 = True
    bool_1 = False
    galaxy_a_p_i_1 = module_0.GalaxyAPI(galaxy_a_p_i_0, dict_0, collection_metadata_0, bool_0, bool_1)
    var_0 = galaxy_a_p_i_1.__unicode__()

def test_case_8():
    bool_0 = False
    list_0 = []
    str_0 = '/5SA>1~'
    list_1 = [str_0, str_0, str_0, list_0]
    collection_metadata_0 = module_0.CollectionMetadata(*list_1)
    str_1 = '/fP\\q'
    galaxy_a_p_i_0 = module_0.GalaxyAPI(list_0, list_0, str_0, collection_metadata_0, str_1)
    var_0 = galaxy_a_p_i_0.__lt__(bool_0)

def test_case_9():
    str_0 = 'https://galaxy.ansible.com:80/api/v1/roles/fred.joe'
    var_0 = module_0.get_cache_id(str_0)
    str_1 = 'http://galaxy.ansible.com:https/api/'
    var_1 = module_0.get_cache_id(str_1)