# Automatically generated by Pynguin.
import ansible.module_utils.api as module_0

def test_case_0():
    pass

def test_case_1():
    var_0 = module_0.rate_limit_argument_spec()

def test_case_2():
    var_0 = module_0.retry_argument_spec()

def test_case_3():
    var_0 = module_0.basic_auth_argument_spec()

def test_case_4():
    var_0 = module_0.rate_limit()

def test_case_5():
    var_0 = module_0.retry()

def test_case_6():
    str_0 = '|{ou;t[:'
    var_0 = module_0.retry_never(str_0)

def test_case_7():
    var_0 = module_0.rate_limit_argument_spec()
    int_0 = 8
    bool_0 = False
    var_1 = module_0.retry_with_delays_and_condition(int_0, bool_0)

def test_case_8():
    bytes_0 = b''
    var_0 = module_0.retry_with_delays_and_condition(bytes_0)
    var_1 = module_0.rate_limit()
    dict_0 = {}
    var_2 = module_0.generate_jittered_backoff(dict_0)

def test_case_9():
    bool_0 = False
    var_0 = module_0.rate_limit_argument_spec()
    dict_0 = {bool_0: var_0, bool_0: var_0, bool_0: var_0}
    str_0 = '^\rJ!(acFl'
    float_0 = 0.0001
    str_1 = 'XenServer'
    tuple_0 = (float_0, str_1)
    float_1 = -1470.642
    tuple_1 = (str_0, tuple_0, float_1)
    var_1 = module_0.retry_with_delays_and_condition(dict_0, tuple_1)
    str_2 = 'checksum mismatch'
    str_3 = 'JB'
    set_0 = {str_3, bool_0}
    var_2 = module_0.rate_limit(set_0)
    var_3 = module_0.retry_with_delays_and_condition(bool_0, str_2)