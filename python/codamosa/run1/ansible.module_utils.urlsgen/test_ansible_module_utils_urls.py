# Automatically generated by Pynguin.
import ansible.module_utils.urls as module_0
import tempfile as module_1

def test_case_0():
    pass

def test_case_1():
    custom_h_t_t_p_s_handler_0 = module_0.CustomHTTPSHandler()
    h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()

def test_case_2():
    str_0 = ''
    dict_0 = {str_0: str_0, str_0: str_0}
    unix_h_t_t_p_handler_0 = module_0.UnixHTTPHandler(dict_0)
    var_0 = module_0.prepare_multipart(dict_0)

def test_case_3():
    parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
    request_0 = module_0.Request(parse_result_dotted_dict_0)

def test_case_4():
    str_0 = 'Invalid unicode encoding encountered'
    var_0 = module_0.generic_urlparse(str_0)

def test_case_5():
    str_0 = 'https://www.googls.com'
    var_0 = module_0.maybe_add_ssl_handler(str_0, str_0)

def test_case_6():
    var_0 = module_1.mktemp()
    var_1 = module_0.atexit_remove_file(var_0)

def test_case_7():
    str_0 = ''
    dict_0 = {str_0: str_0, str_0: str_0}
    var_0 = module_0.prepare_multipart(dict_0)

def test_case_8():
    var_0 = module_0.url_argument_spec()

def test_case_9():
    dict_0 = {}
    list_0 = [dict_0, dict_0]
    bytes_0 = b'r\x1e\xd6Z\xaeN\xaa'
    parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
    tuple_0 = (bytes_0, parse_result_dotted_dict_0)
    s_s_l_validation_handler_0 = module_0.SSLValidationHandler(tuple_0, tuple_0)
    var_0 = s_s_l_validation_handler_0.detect_no_proxy(list_0)

def test_case_10():
    str_0 = "\n    >>> test_maybe_add_ssl_handler()\n    Traceback (most recent call last):\n       ...\n    ImportError: No module named 'lxml'\n    "
    str_1 = 'htps://wwwgoogle.com'
    var_0 = module_0.maybe_add_ssl_handler(str_1, str_0)

def test_case_11():
    list_0 = []
    parse_result_dotted_dict_0 = module_0.ParseResultDottedDict(*list_0)
    int_0 = -4879
    s_s_l_validation_handler_0 = module_0.SSLValidationHandler(parse_result_dotted_dict_0, int_0)
    dict_0 = {}
    var_0 = s_s_l_validation_handler_0.make_context(dict_0, parse_result_dotted_dict_0)

def test_case_12():
    str_0 = 'sk=xyg2]?MM6Y)'
    dict_0 = {str_0: str_0, str_0: str_0}
    var_0 = module_0.prepare_multipart(dict_0)

def test_case_13():
    float_0 = -4045.0
    var_0 = module_0.get_channel_binding_cert_hash(float_0)

def test_case_14():
    s_s_l_validation_error_0 = module_0.SSLValidationError()
    bytes_0 = b'\x9fq\xc6\xe8\xaa\xabm+'
    var_0 = module_0.generic_urlparse(bytes_0)

def test_case_15():
    str_0 = 'https://www.python.org'
    bool_0 = False
    var_0 = module_0.maybe_add_ssl_handler(str_0, bool_0)