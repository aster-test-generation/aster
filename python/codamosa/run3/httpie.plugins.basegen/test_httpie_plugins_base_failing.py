# Automatically generated by Pynguin.
import httpie.plugins.base as module_0

def test_case_0():
    try:
        auth_plugin_0 = module_0.AuthPlugin()
        str_0 = 'PROTOCOL_TLSv1_1'
        var_0 = auth_plugin_0.get_auth(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        transport_plugin_0 = module_0.TransportPlugin()
        var_0 = transport_plugin_0.get_adapter()
    except BaseException:
        pass

def test_case_2():
    try:
        dict_0 = {}
        base_plugin_0 = module_0.BasePlugin(**dict_0)
        transport_plugin_0 = module_0.TransportPlugin()
        converter_plugin_0 = module_0.ConverterPlugin(dict_0)
        var_0 = converter_plugin_0.convert(transport_plugin_0)
    except BaseException:
        pass

def test_case_3():
    try:
        formatter_plugin_0 = module_0.FormatterPlugin()
    except BaseException:
        pass