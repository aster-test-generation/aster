# Automatically generated by Pynguin.
import tornado.netutil as module_0
import socket as module_1
import tornado.ioloop as module_2

def test_case_0():
    pass

def test_case_1():
    str_0 = "'ih1lXJ"
    socket_0 = module_0.bind_unix_socket(str_0)

def test_case_2():
    str_0 = None
    bool_0 = module_0.is_valid_ip(str_0)

def test_case_3():
    str_0 = 'm;:Dkt=)Y05DIqJ*'
    bool_0 = module_0.is_valid_ip(str_0)

def test_case_4():
    resolver_0 = module_0.Resolver()
    str_0 = "S'ZMa+8'9 "
    int_0 = -1513
    awaitable_0 = resolver_0.resolve(str_0, int_0)
    resolver_0.close()
    dict_0 = {}
    s_s_l_context_0 = module_0.ssl_options_to_context(dict_0)

def test_case_5():
    dict_0 = {}
    s_s_l_context_0 = module_0.ssl_options_to_context(dict_0)

def test_case_6():
    dict_0 = {}
    s_s_l_context_0 = module_0.ssl_options_to_context(dict_0)
    s_s_l_context_1 = module_0.ssl_options_to_context(s_s_l_context_0)
    socket_0 = module_1.socket()
    s_s_l_socket_0 = module_0.ssl_wrap_socket(socket_0, s_s_l_context_1)

def test_case_7():
    str_0 = ','
    socket_0 = module_0.bind_unix_socket(str_0)
    dict_0 = {}
    s_s_l_socket_0 = module_0.ssl_wrap_socket(socket_0, dict_0)

def test_case_8():
    int_0 = 2680
    list_0 = module_0.bind_sockets(int_0)

def test_case_9():
    i_o_loop_0 = module_2.IOLoop()
    i_o_loop_1 = i_o_loop_0.instance()
    i_o_loop_2 = i_o_loop_1.instance()
    i_o_loop_3 = i_o_loop_2.instance()
    i_o_loop_4 = i_o_loop_3.instance()
    i_o_loop_0.initialize()
    list_0 = [i_o_loop_4]
    dict_0 = {}
    executor_resolver_0 = module_0.ExecutorResolver(*list_0, **dict_0)
    executor_resolver_0.initialize()