# Automatically generated by Pynguin.
import httpie.utils as module_0

def test_case_0():
    explicit_null_auth_0 = module_0.ExplicitNullAuth()

def test_case_1():
    list_0 = None
    dict_0 = {list_0: list_0, list_0: list_0, list_0: list_0}
    str_0 = module_0.repr_dict(dict_0)

def test_case_2():
    str_0 = 'Set-Cookie'
    bool_0 = True
    var_0 = module_0.humanize_bytes(bool_0)
    str_1 = '$dDDe'
    str_2 = (str_0, str_1)
    str_3 = 'value2; Path=/; Expires=Wed, 29-Jan-2020 21:59:02 GMT; Max-Age=0'
    str_4 = (str_0, str_3)
    str_5 = [str_2, str_4]
    var_1 = print(str_5)
    list_0 = module_0.get_expired_cookies(str_5)
    var_2 = len(str_2)

def test_case_3():
    str_0 = '(builtin)'
    dict_0 = {str_0: str_0}
    dict_1 = {}
    explicit_null_auth_0 = module_0.ExplicitNullAuth(**dict_1)
    var_0 = explicit_null_auth_0.__call__(dict_0)

def test_case_4():
    str_0 = 'fixtures/fakefile.csv'
    var_0 = module_0.get_content_type(str_0)

def test_case_5():
    str_0 = 'Ia<#g\\QKtX<SK,Hj6*#'
    tuple_0 = (str_0, str_0)
    list_0 = [tuple_0, tuple_0]
    list_1 = module_0.get_expired_cookies(list_0)

def test_case_6():
    str_0 = '.\t'
    str_1 = "A~If6\nz'"
    tuple_0 = (str_0, str_1)
    list_0 = [tuple_0, tuple_0, tuple_0]
    dict_0 = {}
    str_2 = module_0.repr_dict(dict_0)
    list_1 = [dict_0, dict_0, dict_0, dict_0]
    list_2 = module_0.get_expired_cookies(list_0, list_1)

def test_case_7():
    bool_0 = False
    var_0 = module_0.humanize_bytes(bool_0)

def test_case_8():
    str_0 = 'Set-Cookie'
    str_1 = (str_0, str_0)
    str_2 = [str_1, str_1]
    list_0 = module_0.get_expired_cookies(str_2)

def test_case_9():
    str_0 = 'Set-Cookie'
    str_1 = (str_0, str_0)
    str_2 = 'value2; Path=/; Expires=Wed, 29-Jan-2020 21:59:02 GMT; Max-Age=0'
    str_3 = (str_0, str_2)
    str_4 = [str_1, str_3]
    list_0 = module_0.get_expired_cookies(str_4)
    var_0 = len(list_0)

def test_case_10():
    str_0 = 'Set-Cookie'
    str_1 = 'A#(l'
    str_2 = (str_0, str_0)
    str_3 = 'valu/2; Path=/; Ex9ires=Wed, 29-Jan-2020 21:59:02 GMT; Max-Age=0'
    str_4 = (str_0, str_3)
    str_5 = [str_2, str_4]
    var_0 = print(str_1)
    list_0 = module_0.get_expired_cookies(str_5)
    var_1 = len(list_0)
    var_2 = len(list_0)

def test_case_11():
    str_0 = 'foo.JPG'
    var_0 = module_0.get_content_type(str_0)
    str_1 = 'foo.html.gz'
    var_1 = module_0.get_content_type(str_1)
    str_2 = 'foo'
    var_2 = module_0.get_content_type(str_2)