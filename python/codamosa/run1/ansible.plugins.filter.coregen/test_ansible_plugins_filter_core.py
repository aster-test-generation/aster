# Automatically generated by Pynguin.
import ansible.plugins.filter.core as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '/usr/bin/*/__ini_npyc'
    int_0 = 2130
    set_0 = {int_0}
    var_0 = module_0.regex_replace(set_0)
    var_1 = module_0.fileglob(str_0)
    bytes_0 = b' f?e\x1e\xa0p\x8etzc\xfe\xae6\x87'
    var_2 = module_0.to_yaml(bytes_0)

def test_case_2():
    bool_0 = False
    list_0 = []
    dict_0 = {bool_0: list_0}
    var_0 = module_0.subelements(dict_0, list_0)
    int_0 = -1182
    str_0 = 'ENm}U\x0c;\x0cu'
    var_1 = module_0.to_nice_yaml(str_0, *list_0)
    var_2 = module_0.to_bool(int_0)

def test_case_3():
    str_0 = '2l/x7\x0cO7'
    var_0 = module_0.to_json(str_0)

def test_case_4():
    str_0 = 'P)Q'
    float_0 = -2274.7
    var_0 = module_0.quote(float_0)
    var_1 = module_0.to_bool(str_0)

def test_case_5():
    str_0 = '/usr/bin/*/__init__.pyc'
    var_0 = module_0.fileglob(str_0)

def test_case_6():
    var_0 = module_0.regex_replace()

def test_case_7():
    bool_0 = True
    str_0 = 'Ci6r"iLjY~+#Sg'
    var_0 = module_0.regex_findall(bool_0, str_0)

def test_case_8():
    str_0 = '190.168.1.10'
    var_0 = module_0.regex_search(str_0, str_0)

def test_case_9():
    bytes_0 = b',:\x88\x82\x035\xd5\xb0\xd1\xdcD'
    var_0 = module_0.from_yaml(bytes_0)

def test_case_10():
    float_0 = 1.5
    bytes_0 = b'\x0e\xc5\x10ug'
    var_0 = module_0.rand(float_0, bytes_0)

def test_case_11():
    float_0 = None
    var_0 = module_0.randomize_list(float_0)

def test_case_12():
    var_0 = module_0.combine()
    bytes_0 = b'u'
    var_1 = module_0.randomize_list(bytes_0)

def test_case_13():
    bool_0 = True
    list_0 = [bool_0]
    var_0 = module_0.to_uuid(list_0)
    list_1 = []
    dict_0 = {bool_0: list_1}
    var_1 = module_0.subelements(dict_0, list_1)

def test_case_14():
    var_0 = module_0.combine()

def test_case_15():
    str_0 = "VT3Nsq&,>o'K:6c+"
    list_0 = [str_0]
    var_0 = module_0.combine(*list_0)

def test_case_16():
    str_0 = '-x[CV'
    var_0 = module_0.path_join(str_0)
    str_1 = '\\{=4a\t=rb'
    var_1 = module_0.path_join(str_1)

def test_case_17():
    filter_module_0 = module_0.FilterModule()
    var_0 = filter_module_0.filters()
    var_1 = module_0.combine()

def test_case_18():
    list_0 = None
    var_0 = module_0.quote(list_0)
    str_0 = 'default'
    dict_0 = {str_0: str_0, str_0: str_0}
    var_1 = module_0.comment(str_0, **dict_0)

def test_case_19():
    str_0 = 'msg'
    var_0 = module_0.mandatory(str_0, str_0)

def test_case_20():
    str_0 = '\n'
    var_0 = module_0.to_bool(str_0)

def test_case_21():
    bool_0 = True
    list_0 = []
    dict_0 = {bool_0: list_0}
    var_0 = module_0.subelements(dict_0, list_0)

def test_case_22():
    float_0 = 547.43082
    var_0 = module_0.to_bool(float_0)

def test_case_23():
    list_0 = None
    var_0 = module_0.from_yaml_all(list_0)
    str_0 = '@H%D'
    int_0 = -1182
    var_1 = module_0.ternary(str_0, list_0, int_0)
    int_1 = -5419
    var_2 = module_0.to_bool(int_1)

def test_case_24():
    var_0 = module_0.combine()
    set_0 = set()
    str_0 = 'yCTiR^5VMKzn$\'"'
    var_1 = module_0.ternary(set_0, str_0, str_0)

def test_case_25():
    list_0 = None
    var_0 = module_0.from_yaml_all(list_0)
    bool_0 = False
    list_1 = []
    dict_0 = {bool_0: list_1}
    var_1 = module_0.subelements(dict_0, list_1)

def test_case_26():
    str_0 = 'default'
    dict_0 = {str_0: str_0, str_0: str_0}
    var_0 = module_0.comment(str_0, **dict_0)

def test_case_27():
    bool_0 = None
    list_0 = [bool_0]
    var_0 = module_0.to_nice_json(bool_0, *list_0)
    str_0 = 'default'
    dict_0 = {str_0: str_0, str_0: str_0}
    var_1 = module_0.comment(str_0, **dict_0)

def test_case_28():
    str_0 = 'tests/*'
    set_0 = {str_0, str_0}
    list_0 = [set_0, str_0, set_0]
    tuple_0 = (set_0, list_0)
    var_0 = module_0.flatten(tuple_0)
    var_1 = module_0.fileglob(str_0)

def test_case_29():
    str_0 = 'key'
    str_1 = 'value'
    str_2 = 'a'
    str_3 = 'b'
    str_4 = {str_0: str_2, str_1: str_3}
    str_5 = 'c'
    str_6 = 'd'
    str_7 = {str_0: str_5, str_1: str_6}
    str_8 = [str_4, str_7]
    var_0 = module_0.list_of_dict_key_value_elements_to_dict(str_8, str_0, str_1)

def test_case_30():
    dict_0 = {}
    list_0 = None
    list_1 = [dict_0, dict_0, dict_0, list_0]
    var_0 = module_0.combine(*list_1)

def test_case_31():
    str_0 = "VT3Nsq&,>o'K:6c+"
    bool_0 = True
    bytes_0 = b'\xe6\xcb^\xf1\xecN\xa6|^\x1e\x1d\xe3\xde'
    var_0 = module_0.regex_escape(bytes_0)
    dict_0 = {var_0: bool_0, bytes_0: var_0, bool_0: bytes_0}
    set_0 = None
    var_1 = module_0.dict_to_list_of_dict_key_value_elements(dict_0, set_0)
    var_2 = module_0.fileglob(str_0)

def test_case_32():
    str_0 = '\tnM/{$W\\;A8\t'
    var_0 = module_0.regex_search(str_0, str_0)

def test_case_33():
    bool_0 = None
    float_0 = None
    set_0 = None
    str_0 = 'zcfo!`=I'
    var_0 = module_0.ternary(bool_0, float_0, set_0, str_0)

def test_case_34():
    float_0 = -2157.9866457276994
    list_0 = [float_0, float_0, float_0, float_0]
    str_0 = 'T+KTfPS'
    list_1 = [list_0, str_0]
    tuple_0 = (list_1,)
    var_0 = module_0.randomize_list(tuple_0, tuple_0)

def test_case_35():
    float_0 = 1.5
    bytes_0 = b'\x0bJ\xe9\x0b\x95\xecq\xaa\x00'
    tuple_0 = (bytes_0,)
    int_0 = 1332
    var_0 = module_0.randomize_list(tuple_0, int_0)
    bytes_1 = b'\x0e\xc5\x10ug'
    var_1 = module_0.rand(float_0, bytes_1)
    bool_0 = None
    float_1 = None
    set_0 = None
    str_0 = 'zcfo!`=I'
    var_2 = module_0.ternary(bool_0, float_1, set_0, str_0)

def test_case_36():
    str_0 = 'test'
    str_1 = '\\w'
    str_2 = 'a'
    var_0 = module_0.regex_replace(str_0, str_1, str_2)
    str_3 = 't'
    var_1 = module_0.regex_replace(str_0, str_3, str_2)
    bool_0 = True
    var_2 = module_0.regex_replace(str_0, str_3, str_2, bool_0)
    var_3 = module_0.regex_replace(str_0, str_3, str_2, bool_0)
    str_4 = ''
    var_4 = module_0.regex_replace(str_0, str_4, str_2)
    var_5 = len(var_4)

def test_case_37():
    str_0 = 'name'
    str_1 = 'groups'
    str_2 = 'authorized'
    str_3 = '_ice'
    str_4 = 'wheel'
    str_5 = [str_4]
    str_6 = [str_3]
    str_7 = {str_0: str_3, str_1: str_5, str_2: str_6}
    str_8 = [str_7]
    var_0 = module_0.subelements(str_8, str_1)

def test_case_38():
    str_0 = 'tests/*'
    var_0 = module_0.fileglob(str_0)

def test_case_39():
    var_0 = lambda a, b: a[b]
    int_0 = 1
    dict_0 = {}
    var_1 = module_0.to_bool(dict_0)
    filter_module_0 = module_0.FilterModule()
    var_2 = module_0.to_bool(filter_module_0)
    var_3 = module_0.to_bool(int_0)

def test_case_40():
    str_0 = 'Hello, world!'
    var_0 = module_0.regex_search(str_0, str_0)
    str_1 = 'World'
    var_1 = module_0.regex_search(str_1, str_1)
    str_2 = 'Hello, world!'
    str_3 = '(world)'
    var_2 = module_0.regex_search(str_2, str_3)
    str_4 = 'Hello, world!'
    str_5 = 'w(o)rld'
    var_3 = module_0.regex_search(str_4, str_5)
    str_6 = 'ignorecase'
    bool_0 = True
    bool_1 = {str_6: bool_0}
    str_7 = 'Hello, world!'
    str_8 = 'world'
    var_4 = module_0.regex_search(str_7, str_8, **bool_1)