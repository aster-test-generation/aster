# Automatically generated by Pynguin.
import semantic_release.helpers as module_0
import urllib3.util.retry as module_1

def test_case_0():
    pass

def test_case_1():
    set_0 = set()
    var_0 = module_0.format_arg(set_0)

def test_case_2():
    str_0 = 'hvcs_domain'
    var_0 = module_0.format_arg(str_0)
    str_1 = '+\x0b^\r\t|X H~YP uR/EGa9'
    list_0 = []
    var_1 = module_0.format_arg(list_0)
    tuple_0 = None
    bytes_0 = b'C\xe7\x99x\xd5'
    logged_function_0 = module_0.LoggedFunction(bytes_0)
    var_2 = logged_function_0.__call__(tuple_0)
    dict_0 = {str_1: str_1}
    logged_function_1 = module_0.LoggedFunction(dict_0)

def test_case_3():
    session_0 = module_0.build_requests_session()

def test_case_4():
    str_0 = '\x0c'
    session_0 = None
    int_0 = -506
    tuple_0 = (session_0, int_0)
    var_0 = module_0.format_arg(tuple_0)
    int_1 = -864
    session_1 = module_0.build_requests_session(str_0, int_1)

def test_case_5():
    list_0 = []
    int_0 = -2137
    collection_0 = None
    bool_0 = True
    retry_0 = module_1.Retry(int_0, collection_0, bool_0)
    session_0 = module_0.build_requests_session(list_0, retry_0)

def test_case_6():
    list_0 = []
    logged_function_0 = module_0.LoggedFunction(list_0)

def test_case_7():
    session_0 = module_0.build_requests_session()
    str_0 = 'PYPI_TOKEN'
    int_0 = -332
    str_1 = 'V}q\x0c~vxgjrfr\\'
    tuple_0 = (int_0, str_1)
    logged_function_0 = module_0.LoggedFunction(tuple_0)
    var_0 = logged_function_0.__call__(str_0)

def test_case_8():
    session_0 = module_0.build_requests_session()
    str_0 = None
    logged_function_0 = module_0.LoggedFunction(str_0)
    str_1 = '`]('
    int_0 = 7
    list_0 = None
    dict_0 = {str_1: session_0, int_0: list_0}
    logged_function_1 = module_0.LoggedFunction(int_0)
    var_0 = logged_function_1.__call__(dict_0)
    logged_function_2 = module_0.LoggedFunction(int_0)
    var_1 = logged_function_2.__call__(str_1)
    session_1 = module_0.build_requests_session()
    var_2 = logged_function_2.__call__(logged_function_2)
    float_0 = -358.0
    bool_0 = False
    set_0 = None
    float_1 = -1239.86
    tuple_0 = (session_0, float_1, logged_function_0)
    session_2 = module_0.build_requests_session(tuple_0, bool_0)
    float_2 = 1321.9
    retry_0 = module_1.Retry(int_0, set_0, logged_function_2, float_2, float_0, bool_0, bool_0)
    var_3 = logged_function_2.__call__(retry_0)
    bool_1 = True
    session_3 = module_0.build_requests_session(bool_0, retry_0)
    optional_0 = None
    float_3 = -3569.5108
    retry_1 = module_1.Retry(bool_1, optional_0, float_3, float_3)
    var_4 = logged_function_0.__call__(list_0)
    var_5 = module_0.format_arg(float_0)

def test_case_9():
    session_0 = module_0.build_requests_session()
    var_0 = session_0.headers
    var_1 = print(var_0)
    str_0 = 'https://google.com'
    var_2 = session_0.get(str_0)
    var_3 = print(var_2)