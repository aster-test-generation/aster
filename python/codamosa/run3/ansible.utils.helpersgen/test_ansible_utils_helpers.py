# Automatically generated by Pynguin.
import ansible.utils.helpers as module_0

def test_case_0():
    bytes_0 = b'\xb5\xb2\xa5\x1d\xac\x95W\tk?Q'
    var_0 = module_0.object_to_dict(bytes_0)

def test_case_1():
    str_0 = 'the vault identity to use'
    var_0 = module_0.deduplicate_list(str_0)

def test_case_2():
    bytes_0 = b'\xb5\xb2\xa5\x1d\xac\x95W\tk?Q'
    var_0 = module_0.object_to_dict(bytes_0)
    str_0 = ']_cl8g#w'
    dict_0 = {str_0: str_0, bytes_0: str_0, bytes_0: str_0, bytes_0: bytes_0}
    var_1 = module_0.object_to_dict(str_0, dict_0)

def test_case_3():
    str_0 = 'test'
    bool_0 = True
    list_0 = [str_0, str_0]
    var_0 = module_0.object_to_dict(bool_0, list_0)

def test_case_4():
    int_0 = 100
    var_0 = module_0.pct_to_int(int_0, int_0)
    int_1 = 20
    var_1 = module_0.pct_to_int(int_0, int_1)
    str_0 = '10%'
    var_2 = module_0.pct_to_int(str_0, int_1)
    str_1 = '0%'
    var_3 = module_0.pct_to_int(str_1, int_0)
    var_4 = module_0.pct_to_int(str_1, int_1)
    str_2 = '101%'
    var_5 = module_0.pct_to_int(str_2, int_0)
    var_6 = module_0.pct_to_int(str_2, int_1)