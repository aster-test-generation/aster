# Automatically generated by Pynguin.
import mimesis.providers.internet as module_0
import mimesis.enums as module_1

def test_case_0():
    internet_0 = module_0.Internet()

def test_case_1():
    float_0 = -759.610837
    list_0 = [float_0]
    internet_0 = module_0.Internet()
    i_pv4_address_0 = internet_0.ip_v4_object()
    internet_1 = module_0.Internet(*list_0)
    str_0 = internet_0.mac_address()
    str_1 = internet_1.content_type()
    str_2 = internet_1.image_placeholder()

def test_case_2():
    internet_0 = module_0.Internet()
    i_pv4_address_0 = internet_0.ip_v4_object()
    internet_1 = module_0.Internet()
    var_0 = internet_1.stock_image()
    int_0 = internet_1.http_status_code()
    str_0 = internet_1.http_status_message()

def test_case_3():
    list_0 = []
    internet_0 = module_0.Internet(*list_0)
    str_0 = internet_0.ip_v4()
    internet_1 = module_0.Internet(*list_0)
    str_1 = internet_1.http_status_message()
    internet_2 = module_0.Internet()
    str_2 = internet_2.content_type()
    str_3 = internet_1.http_method()
    str_4 = internet_2.mac_address()

def test_case_4():
    internet_0 = module_0.Internet()
    i_pv4_address_0 = internet_0.ip_v4_object()
    str_0 = internet_0.image_placeholder()
    internet_1 = module_0.Internet()
    str_1 = internet_1.top_level_domain()
    i_pv4_address_1 = internet_1.ip_v4_object()
    str_2 = internet_1.emoji()
    port_range_0 = module_1.PortRange.EPHEMERAL
    int_0 = internet_0.port(port_range_0)
    bool_0 = True
    str_3 = internet_0.home_page()
    str_4 = internet_1.emoji()
    port_range_1 = module_1.PortRange.WELL_KNOWN
    str_5 = internet_1.ip_v4(bool_0, port_range_1)
    int_1 = internet_0.http_status_code()

def test_case_5():
    internet_0 = module_0.Internet()
    str_0 = internet_0.ip_v6()
    port_range_0 = module_1.PortRange.ALL
    var_0 = internet_0.stock_image()
    internet_1 = module_0.Internet()
    int_0 = -26
    internet_2 = module_0.Internet()
    var_1 = internet_2.stock_image(int_0)
    int_1 = internet_1.port(port_range_0)
    internet_3 = module_0.Internet()
    str_1 = internet_2.mac_address()
    str_2 = internet_2.content_type()
    str_3 = internet_1.image_placeholder()

def test_case_6():
    str_0 = '6q8<5;lA'
    internet_0 = module_0.Internet()
    str_1 = internet_0.emoji()
    str_2 = internet_0.image_placeholder(str_0)
    internet_1 = module_0.Internet()
    str_3 = internet_1.top_level_domain()
    str_4 = internet_1.top_level_domain()

def test_case_7():
    internet_0 = module_0.Internet()
    var_0 = internet_0.hashtags()

def test_case_8():
    internet_0 = module_0.Internet()
    str_0 = 'q7)4\rd65i9O6R'
    str_1 = internet_0.home_page()
    str_2 = internet_0.image_placeholder(str_0)
    int_0 = internet_0.http_status_code()
    int_1 = internet_0.port()
    str_3 = internet_0.http_status_message()
    str_4 = internet_0.user_agent()

def test_case_9():
    internet_0 = module_0.Internet()
    str_0 = internet_0.user_agent()

def test_case_10():
    internet_0 = module_0.Internet()
    var_0 = internet_0.stock_image()
    int_0 = internet_0.port()
    var_1 = internet_0.hashtags(int_0)
    int_1 = internet_0.http_status_code()
    str_0 = internet_0.http_method()
    int_2 = internet_0.http_status_code()
    str_1 = internet_0.http_status_message()
    str_2 = internet_0.network_protocol()
    str_3 = internet_0.top_level_domain()

def test_case_11():
    internet_0 = module_0.Internet()
    var_0 = internet_0.hashtags()
    var_1 = len(var_0)
    int_0 = 1
    var_2 = internet_0.hashtags(int_0)
    var_3 = len(var_2)