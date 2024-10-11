# Automatically generated by Pynguin.
import ansible.module_utils.urls as module_0
import urllib.request as module_1

def test_case_0():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        connection_error_0 = module_0.ConnectionError()
        no_s_s_l_error_0 = module_0.NoSSLError()
        int_0 = 2808
        missing_module_error_0 = module_0.MissingModuleError(int_0, no_s_s_l_error_0)
        var_0 = module_0.prepare_multipart(missing_module_error_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'https://google.com'
        var_0 = module_1.urlopen(str_0)
        var_1 = module_0.getpeercert(var_0)
        str_1 = 'https://expired.badssl.com/'
        var_2 = module_1.urlopen(str_1)
    except BaseException:
        pass

def test_case_2():
    try:
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        custom_h_t_t_p_s_handler_0 = module_0.CustomHTTPSHandler()
        var_0 = custom_h_t_t_p_s_handler_0.https_open(h_t_t_p_s_client_auth_handler_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'test_unix_socket'
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(str_0)
        var_0 = unix_h_t_t_p_s_connection_0.connect()
    except BaseException:
        pass

def test_case_4():
    try:
        list_0 = []
        no_s_s_l_error_0 = module_0.NoSSLError()
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        list_1 = [no_s_s_l_error_0]
        list_2 = []
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(list_1, list_2)
        var_0 = s_s_l_validation_handler_0.detect_no_proxy(list_0)
        list_3 = []
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(list_3)
        list_4 = []
        var_1 = unix_h_t_t_p_s_connection_0.__call__(*list_4)
    except BaseException:
        pass

def test_case_5():
    try:
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        var_0 = module_0.unix_socket_patch_httpconnection_connect()
        unix_h_t_t_p_connection_0 = module_0.UnixHTTPConnection(s_s_l_validation_error_0)
        var_1 = unix_h_t_t_p_connection_0.connect()
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'\xcb\xec\xee\xfb'
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        list_0 = [bytes_0, s_s_l_validation_error_0]
        unix_h_t_t_p_connection_0 = module_0.UnixHTTPConnection(list_0)
        custom_h_t_t_p_s_handler_0 = None
        unix_h_t_t_p_connection_1 = module_0.UnixHTTPConnection(custom_h_t_t_p_s_handler_0)
        var_0 = unix_h_t_t_p_connection_1.__call__()
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'R*@$\x0b'
        no_s_s_l_error_0 = module_0.NoSSLError()
        str_1 = ' y,^d=);s;\\bP*'
        dict_0 = {str_0: no_s_s_l_error_0, str_0: no_s_s_l_error_0, str_1: str_0, str_1: str_0}
        str_2 = None
        missing_module_error_0 = module_0.MissingModuleError(dict_0, str_2)
        var_0 = module_0.RedirectHandlerFactory()
        set_0 = {str_2, str_1}
        unix_h_t_t_p_handler_0 = module_0.UnixHTTPHandler(set_0)
        unix_h_t_t_p_connection_0 = module_0.UnixHTTPConnection(unix_h_t_t_p_handler_0)
        custom_h_t_t_p_s_handler_0 = module_0.CustomHTTPSHandler(unix_h_t_t_p_connection_0, unix_h_t_t_p_connection_0)
        request_with_method_0 = None
        tuple_0 = (missing_module_error_0, custom_h_t_t_p_s_handler_0, request_with_method_0)
        unix_h_t_t_p_handler_1 = module_0.UnixHTTPHandler(tuple_0)
        list_0 = [custom_h_t_t_p_s_handler_0]
        var_1 = unix_h_t_t_p_handler_1.http_open(list_0)
    except BaseException:
        pass

def test_case_8():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        var_0 = parse_result_dotted_dict_0.as_list()
        connection_error_0 = module_0.ConnectionError()
        no_s_s_l_error_0 = module_0.NoSSLError()
        var_1 = module_0.getpeercert(parse_result_dotted_dict_0)
    except BaseException:
        pass

def test_case_9():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        str_0 = 'xh%)h:"dT6$\x0cb%'
        var_0 = request_0.head(str_0)
    except BaseException:
        pass

def test_case_10():
    try:
        proxy_error_0 = None
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(proxy_error_0, h_t_t_p_s_client_auth_handler_0)
        var_0 = s_s_l_validation_handler_0.http_request(h_t_t_p_s_client_auth_handler_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = '\rl"G)7\r#T'
        var_0 = module_0.getpeercert(str_0)
    except BaseException:
        pass

def test_case_12():
    try:
        float_0 = -1841.46877
        var_0 = module_0.rfc2822_date_string(float_0)
    except BaseException:
        pass

def test_case_13():
    try:
        list_0 = []
        bool_0 = None
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(list_0, bool_0)
        unix_h_t_t_p_s_connection_0 = None
        set_0 = {unix_h_t_t_p_s_connection_0}
        list_1 = [set_0, bool_0, unix_h_t_t_p_s_connection_0, list_0]
        request_0 = module_0.Request(s_s_l_validation_handler_0, unix_h_t_t_p_s_connection_0, set_0, unix_h_t_t_p_s_connection_0, list_1)
    except BaseException:
        pass

def test_case_14():
    try:
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        list_0 = []
        proxy_error_0 = module_0.ProxyError(*list_0)
        no_s_s_l_error_0 = module_0.NoSSLError(*list_0)
        var_0 = module_0.prepare_multipart(proxy_error_0)
    except BaseException:
        pass

def test_case_15():
    try:
        list_0 = []
        dict_0 = {}
        proxy_error_0 = module_0.ProxyError(*list_0, **dict_0)
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        custom_h_t_t_p_s_handler_0 = module_0.CustomHTTPSHandler()
        var_0 = module_0.basic_auth_header(h_t_t_p_s_client_auth_handler_0, custom_h_t_t_p_s_handler_0)
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict(*list_0)
        var_1 = module_0.generic_urlparse(parse_result_dotted_dict_0)
    except BaseException:
        pass

def test_case_16():
    try:
        str_0 = '\x0cFINdF\r~EF!O'
        bytes_0 = b'\xc8\xde\x87\xa0\xf1'
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(str_0, bytes_0)
        str_1 = '1u!'
        dict_0 = None
        list_0 = []
        request_with_method_0 = module_0.RequestWithMethod(str_1, bytes_0, dict_0, list_0)
    except BaseException:
        pass

def test_case_17():
    try:
        dict_0 = {}
        unix_h_t_t_p_connection_0 = None
        dict_1 = {unix_h_t_t_p_connection_0: unix_h_t_t_p_connection_0}
        no_s_s_l_error_0 = module_0.NoSSLError()
        request_0 = module_0.Request(dict_1, no_s_s_l_error_0)
        var_0 = request_0.head(dict_0)
    except BaseException:
        pass

def test_case_18():
    try:
        str_0 = 'https://google.com'
        var_0 = module_1.urlopen(str_0)
    except BaseException:
        pass

def test_case_19():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        var_0 = request_0.head(parse_result_dotted_dict_0)
    except BaseException:
        pass

def test_case_20():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        var_0 = module_0.url_argument_spec()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        bool_0 = True
        missing_module_error_0 = module_0.MissingModuleError(request_0, bool_0)
        list_0 = [request_0, request_0]
        var_1 = request_0.delete(list_0)
    except BaseException:
        pass

def test_case_21():
    try:
        list_0 = []
        float_0 = -851.599073
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        request_0 = module_0.Request(list_0, float_0, s_s_l_validation_error_0)
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(float_0, request_0)
        var_0 = s_s_l_validation_handler_0.get_ca_certs()
        list_1 = None
        var_1 = s_s_l_validation_handler_0.validate_proxy_response(list_1)
    except BaseException:
        pass

def test_case_22():
    try:
        bool_0 = None
        list_0 = None
        tuple_0 = ()
        dict_0 = {list_0: list_0, list_0: list_0, list_0: tuple_0, tuple_0: list_0}
        request_0 = module_0.Request(dict_0)
        var_0 = request_0.options(bool_0)
    except BaseException:
        pass

def test_case_23():
    try:
        proxy_error_0 = None
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(proxy_error_0, h_t_t_p_s_client_auth_handler_0)
        str_0 = '(J1eu; @bocjfT"><H'
        dict_0 = {h_t_t_p_s_client_auth_handler_0: str_0}
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(dict_0)
        unix_h_t_t_p_connection_0 = module_0.UnixHTTPConnection(unix_h_t_t_p_s_connection_0)
        var_0 = s_s_l_validation_handler_0.make_context(str_0, unix_h_t_t_p_connection_0)
    except BaseException:
        pass

def test_case_24():
    try:
        str_0 = 'Of'
        float_0 = -62.228
        list_0 = [str_0, float_0]
        dict_0 = {}
        s_s_l_validation_error_0 = module_0.SSLValidationError(**dict_0)
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(s_s_l_validation_error_0)
        var_0 = unix_h_t_t_p_s_connection_0.__call__(*list_0)
        str_1 = 'swapcached'
        connection_error_0 = module_0.ConnectionError()
        missing_module_error_0 = module_0.MissingModuleError(str_1, connection_error_0)
        bool_0 = False
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(bool_0, list_0)
        unix_h_t_t_p_handler_0 = None
        unix_h_t_t_p_handler_1 = module_0.UnixHTTPHandler(unix_h_t_t_p_handler_0, **dict_0)
        str_2 = "'s$cGvB!P&L"
        str_3 = 'U9]Ot=M\x0cqA'
        dict_1 = {str_2: str_1, str_0: s_s_l_validation_handler_0, str_3: connection_error_0, str_3: bool_0}
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler(**dict_1)
    except BaseException:
        pass

def test_case_25():
    try:
        str_0 = 'mJ:t\x0b:6yP+e`<k'
        dict_0 = {str_0: str_0, str_0: str_0}
        var_0 = module_0.fetch_url(str_0, dict_0, str_0, str_0)
    except BaseException:
        pass

def test_case_26():
    try:
        var_0 = module_0.RedirectHandlerFactory()
        str_0 = '{=G/3;!7<'
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(str_0)
        float_0 = 1784.968761
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(unix_h_t_t_p_s_connection_0, unix_h_t_t_p_s_connection_0, float_0)
        custom_h_t_t_p_s_handler_0 = None
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler(custom_h_t_t_p_s_handler_0)
        var_1 = s_s_l_validation_handler_0.http_request(h_t_t_p_s_client_auth_handler_0)
    except BaseException:
        pass

def test_case_27():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        tuple_0 = ()
        dict_0 = {}
        no_s_s_l_error_0 = module_0.NoSSLError(**dict_0)
        float_0 = -2171.4108688158026
        list_0 = []
        str_0 = 'f\r\nyPl<0'
        bool_0 = True
        request_0 = module_0.Request(parse_result_dotted_dict_0, float_0, tuple_0, no_s_s_l_error_0, list_0, str_0, bool_0, no_s_s_l_error_0, str_0)
        var_0 = request_0.head(parse_result_dotted_dict_0)
    except BaseException:
        pass

def test_case_28():
    try:
        list_0 = []
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        connection_error_0 = module_0.ConnectionError()
        int_0 = 1627
        var_0 = module_0.build_ssl_validation_error(list_0, h_t_t_p_s_client_auth_handler_0, connection_error_0, int_0)
    except BaseException:
        pass

def test_case_29():
    try:
        bytes_0 = None
        float_0 = -1226.56615
        set_0 = {bytes_0, float_0, bytes_0}
        list_0 = [bytes_0, bytes_0, set_0, bytes_0]
        no_s_s_l_error_0 = module_0.NoSSLError(*list_0)
        dict_0 = {float_0: no_s_s_l_error_0, float_0: float_0, no_s_s_l_error_0: bytes_0}
        int_0 = 1116
        bool_0 = False
        int_1 = 1024
        tuple_0 = (int_1,)
        var_0 = module_0.fetch_file(set_0, dict_0, int_0, bool_0, tuple_0)
    except BaseException:
        pass

def test_case_30():
    try:
        parse_result_dotted_dict_0 = None
        request_0 = module_0.Request(parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0)
        str_0 = 'xh%)h:"dT6$\x0cb%'
        var_0 = request_0.head(str_0)
    except BaseException:
        pass

def test_case_31():
    try:
        parse_result_dotted_dict_0 = None
        request_0 = module_0.Request(parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0, parse_result_dotted_dict_0)
        str_0 = 'xh%Hh:\\dT)6$\x0cb%'
        var_0 = request_0.head(str_0)
    except BaseException:
        pass

def test_case_32():
    try:
        no_s_s_l_error_0 = module_0.NoSSLError()
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        list_0 = [no_s_s_l_error_0]
        var_0 = request_0.get(list_0)
    except BaseException:
        pass

def test_case_33():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        var_0 = parse_result_dotted_dict_0.as_list()
        float_0 = -3208.506403
        bool_0 = True
        set_0 = set()
        str_0 = None
        dict_0 = {}
        request_0 = module_0.Request(str_0, dict_0, float_0)
        list_0 = [var_0, s_s_l_validation_error_0, str_0]
        bool_1 = True
        var_1 = module_0.open_url(float_0, bool_0, parse_result_dotted_dict_0, set_0, request_0, dict_0, list_0, bool_1)
    except BaseException:
        pass

def test_case_34():
    try:
        dict_0 = {}
        s_s_l_validation_error_0 = module_0.SSLValidationError(**dict_0)
        bytes_0 = b'Z\xd2\x1f_m\x16\x8a'
        var_0 = module_0.build_ssl_validation_error(s_s_l_validation_error_0, dict_0, bytes_0)
    except BaseException:
        pass

def test_case_35():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        str_0 = 'ZQ\x0c;L1#1@/p()_|'
        int_0 = 404
        missing_module_error_0 = module_0.MissingModuleError(int_0, int_0)
        set_0 = {missing_module_error_0}
        str_1 = ' 8A3);R?Xsga\\N'
        dict_0 = {str_0: parse_result_dotted_dict_0, str_0: int_0, str_1: missing_module_error_0}
        var_0 = request_0.patch(set_0, **dict_0)
    except BaseException:
        pass

def test_case_36():
    try:
        no_s_s_l_error_0 = None
        str_0 = 'Fe>L"d^$0Y'
        var_0 = module_0.maybe_add_ssl_handler(no_s_s_l_error_0, str_0)
        list_0 = []
        float_0 = -851.59907
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        request_0 = module_0.Request(list_0, float_0, s_s_l_validation_error_0)
        tuple_0 = ()
        bytes_0 = b'\x9fq\xc6\xe8\xaa\xabm+'
        proxy_error_0 = module_0.ProxyError()
        unix_h_t_t_p_handler_0 = None
        set_0 = {tuple_0, s_s_l_validation_error_0}
        str_1 = 'nevra'
        str_2 = 'Cg7>qpuWwW],'
        list_1 = [float_0, bytes_0, no_s_s_l_error_0, tuple_0]
        str_3 = ''
        str_4 = 'play vars'
        dict_0 = {str_1: str_1, str_2: list_1, str_3: unix_h_t_t_p_handler_0, str_4: list_0}
        var_1 = module_0.open_url(proxy_error_0, unix_h_t_t_p_handler_0, set_0, proxy_error_0, dict_0)
    except BaseException:
        pass

def test_case_37():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        str_0 = 'manual stanza not supported in a .conf file'
        var_0 = request_0.post(str_0)
    except BaseException:
        pass

def test_case_38():
    try:
        str_0 = 'Linux'
        str_1 = ''
        dict_0 = {str_0: str_0, str_1: str_1}
        unix_h_t_t_p_handler_0 = module_0.UnixHTTPHandler(dict_0)
        tuple_0 = ()
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(unix_h_t_t_p_handler_0, tuple_0)
        var_0 = s_s_l_validation_handler_0.get_ca_certs()
        int_0 = 4682
        no_s_s_l_error_0 = module_0.NoSSLError()
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        var_1 = module_0.open_url(int_0, no_s_s_l_error_0, h_t_t_p_s_client_auth_handler_0)
    except BaseException:
        pass

def test_case_39():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        var_0 = parse_result_dotted_dict_0.as_list()
        float_0 = -3208.506403
        var_1 = parse_result_dotted_dict_0.as_list()
        custom_h_t_t_p_s_handler_0 = module_0.CustomHTTPSHandler()
        unix_h_t_t_p_connection_0 = module_0.UnixHTTPConnection(custom_h_t_t_p_s_handler_0)
        str_0 = None
        dict_0 = {}
        request_0 = module_0.Request(str_0, dict_0, float_0)
        s_s_l_validation_error_1 = module_0.SSLValidationError(**dict_0)
        list_0 = [var_0, s_s_l_validation_error_0, str_0]
        connection_error_0 = module_0.ConnectionError()
        unix_h_t_t_p_handler_0 = module_0.UnixHTTPHandler(connection_error_0, **dict_0)
        list_1 = None
        str_1 = 'Z'
        missing_module_error_0 = module_0.MissingModuleError(str_1, connection_error_0)
        bytes_0 = None
        bytes_1 = b'\xa1\xe4\x92='
        var_2 = module_0.open_url(connection_error_0, dict_0, unix_h_t_t_p_handler_0, list_1, unix_h_t_t_p_handler_0, missing_module_error_0, s_s_l_validation_error_1, bytes_0, list_0, bytes_1)
    except BaseException:
        pass

def test_case_40():
    try:
        list_0 = []
        float_0 = -851.599073
        s_s_l_validation_error_0 = module_0.SSLValidationError()
        str_0 = 'Linux'
        dict_0 = {str_0: list_0, str_0: str_0, str_0: float_0, str_0: str_0, str_0: float_0}
        unix_h_t_t_p_handler_0 = module_0.UnixHTTPHandler(dict_0)
        var_0 = module_0.prepare_multipart(dict_0)
    except BaseException:
        pass

def test_case_41():
    try:
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        request_0 = module_0.Request(parse_result_dotted_dict_0)
        bytes_0 = b'\xb9\xe1\x05)\xad$H\xda\x89*Q,w\xe0\xa2_\x02\xbe\xa8E'
        proxy_error_0 = module_0.ProxyError()
        str_0 = '"'
        str_1 = 'Darwin'
        str_2 = 'H;*Uv\r'
        dict_0 = {str_0: parse_result_dotted_dict_0, str_1: parse_result_dotted_dict_0, str_2: request_0, str_1: bytes_0}
        var_0 = request_0.put(bytes_0, proxy_error_0, **dict_0)
    except BaseException:
        pass

def test_case_42():
    try:
        proxy_error_0 = None
        h_t_t_p_s_client_auth_handler_0 = module_0.HTTPSClientAuthHandler()
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(proxy_error_0, h_t_t_p_s_client_auth_handler_0)
        request_0 = None
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict()
        list_0 = [s_s_l_validation_handler_0, h_t_t_p_s_client_auth_handler_0, proxy_error_0]
        str_0 = '=I1"'
        custom_h_t_t_p_s_handler_0 = module_0.CustomHTTPSHandler(parse_result_dotted_dict_0, list_0, str_0)
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(custom_h_t_t_p_s_handler_0)
        var_0 = s_s_l_validation_handler_0.make_context(request_0, unix_h_t_t_p_s_connection_0)
    except BaseException:
        pass

def test_case_43():
    try:
        bytes_0 = b'\xfa\x13\x16\x8cZ\x86\xc2(n\xdd\xab\xfc\xd9\x0e\xb8'
        unix_h_t_t_p_connection_0 = module_0.UnixHTTPConnection(bytes_0)
        float_0 = -3101.217986
        unix_h_t_t_p_s_connection_0 = module_0.UnixHTTPSConnection(float_0)
        str_0 = '+\n}`Sz%%M@V\rZ'
        set_0 = None
        dict_0 = {str_0: set_0}
        parse_result_dotted_dict_0 = module_0.ParseResultDottedDict(**dict_0)
        bool_0 = True
        s_s_l_validation_handler_0 = module_0.SSLValidationHandler(unix_h_t_t_p_s_connection_0, parse_result_dotted_dict_0, bool_0)
        var_0 = s_s_l_validation_handler_0.http_request(unix_h_t_t_p_connection_0)
    except BaseException:
        pass