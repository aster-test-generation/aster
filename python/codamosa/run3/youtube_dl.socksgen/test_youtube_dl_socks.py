# Automatically generated by Pynguin.
import youtube_dl.socks as module_0

def test_case_0():
    sockssocket_0 = module_0.sockssocket()

def test_case_1():
    int_0 = 1
    socks5_error_0 = module_0.Socks5Error(int_0)

def test_case_2():
    socks5_error_0 = module_0.Socks5Error()

def test_case_3():
    sockssocket_0 = module_0.sockssocket()
    str_0 = '127.0.0.1'
    int_0 = 9050
    int_1 = 2
    bool_0 = True
    var_0 = None
    var_1 = sockssocket_0.setproxy(int_1, str_0, int_0, bool_0, var_0, var_0)

def test_case_4():
    bool_0 = False
    sockssocket_0 = module_0.sockssocket()
    var_0 = sockssocket_0.recvall(bool_0)

def test_case_5():
    tuple_0 = ()
    socks4_error_0 = module_0.Socks4Error(tuple_0)

def test_case_6():
    int_0 = 1
    int_1 = 2
    invalid_version_error_0 = module_0.InvalidVersionError(int_0, int_1)

def test_case_7():
    sockssocket_0 = module_0.sockssocket()
    str_0 = 'example.com'
    int_0 = 80
    var_0 = (str_0, int_0)
    var_1 = sockssocket_0.connect(var_0)
    int_1 = 80
    var_2 = sockssocket_0.recvall(int_1)