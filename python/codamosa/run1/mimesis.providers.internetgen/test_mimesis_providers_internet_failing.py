# Automatically generated by Pynguin.
import mimesis.providers.internet as module_0
import mimesis.enums as module_1

def test_case_0():
    try:
        internet_0 = module_0.Internet()
        str_0 = internet_0.content_type()
        str_1 = '"'
        str_2 = internet_0.home_page(str_1)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = True
        port_range_0 = module_1.PortRange.EPHEMERAL
        dict_0 = {}
        internet_0 = module_0.Internet(**dict_0)
        str_0 = internet_0.ip_v4(bool_0, port_range_0)
        internet_1 = module_0.Internet()
        str_1 = internet_1.top_level_domain()
        str_2 = internet_1.image_placeholder()
        int_0 = -276
        var_0 = internet_1.hashtags(int_0)
        str_3 = internet_1.network_protocol()
        str_4 = internet_1.top_level_domain()
        str_5 = internet_1.home_page()
        list_0 = [var_0]
        internet_2 = module_0.Internet(*list_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = -1304
        internet_0 = module_0.Internet()
        int_1 = internet_0.http_status_code()
        internet_1 = module_0.Internet()
        str_0 = internet_1.home_page()
        internet_2 = module_0.Internet()
        list_0 = [int_0, int_0, int_0, internet_1]
        internet_3 = module_0.Internet(*list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        internet_0 = module_0.Internet()
        str_0 = internet_0.image_placeholder()
        list_0 = [internet_0]
        internet_1 = module_0.Internet(*list_0)
        str_1 = internet_0.http_method()
        dict_0 = {}
        internet_2 = module_0.Internet(*list_0, **dict_0)
        str_2 = internet_2.home_page()
        i_pv6_address_0 = internet_0.ip_v6_object()
        var_0 = internet_1.stock_image()
        str_3 = internet_0.mac_address()
        str_4 = internet_0.home_page()
        str_5 = internet_0.http_status_message()
        internet_3 = module_0.Internet()
        var_1 = internet_3.hashtags()
        str_6 = 'application/vnd.oma.bcast.ltkm'
        list_1 = [str_6, str_6]
        bool_0 = True
        var_2 = internet_2.stock_image(str_5, str_3, list_1, bool_0)
    except BaseException:
        pass

def test_case_4():
    try:
        internet_0 = module_0.Internet()
        str_0 = internet_0.image_placeholder()
        str_1 = internet_0.content_type()
        str_2 = internet_0.ip_v4()
        str_3 = internet_0.emoji()
        list_0 = None
        str_4 = internet_0.top_level_domain(list_0)
        int_0 = internet_0.http_status_code()
        int_1 = internet_0.http_status_code()
        internet_1 = module_0.Internet()
        int_2 = internet_1.port()
        str_5 = internet_1.emoji()
        str_6 = internet_0.http_method()
        str_7 = internet_1.emoji()
        str_8 = internet_0.http_status_message()
        var_0 = internet_1.hashtags()
        int_3 = internet_0.http_status_code()
        var_1 = internet_1.stock_image()
        i_pv6_address_0 = internet_0.ip_v6_object()
        int_4 = internet_0.http_status_code()
        bool_0 = True
        str_9 = internet_0.ip_v4(bool_0)
        str_10 = internet_0.home_page()
        bool_1 = True
        port_range_0 = None
        internet_2 = module_0.Internet()
        str_11 = internet_2.ip_v4(bool_1, port_range_0)
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = {}
        internet_0 = module_0.Internet()
        str_0 = internet_0.image_placeholder()
        internet_1 = module_0.Internet(**dict_0)
        str_1 = internet_1.http_method()
        str_2 = internet_1.home_page()
        var_0 = internet_1.stock_image()
        int_0 = internet_0.http_status_code()
        var_1 = internet_0.stock_image()
        i_pv6_address_0 = internet_0.ip_v6_object()
        int_1 = internet_1.http_status_code()
        bool_0 = True
        str_3 = internet_1.ip_v4()
        str_4 = internet_0.home_page()
        str_5 = internet_1.image_placeholder(str_3)
        list_0 = [str_1]
        var_2 = internet_0.stock_image(str_1, str_1, list_0, bool_0)
    except BaseException:
        pass