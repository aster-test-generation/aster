# Automatically generated by Pynguin.
import httpie.plugins.manager as module_0

def test_case_0():
    try:
        plugin_manager_0 = module_0.PluginManager()
        dict_0 = plugin_manager_0.get_auth_plugin_mapping()
        list_0 = [plugin_manager_0]
        type_0 = None
        list_1 = [type_0, type_0, type_0]
        var_0 = plugin_manager_0.register(*list_1)
        var_1 = plugin_manager_0.filter(list_0)
    except BaseException:
        pass

def test_case_1():
    try:
        type_0 = None
        list_0 = []
        plugin_manager_0 = module_0.PluginManager(*list_0)
        var_0 = plugin_manager_0.load_installed_plugins()
        dict_0 = plugin_manager_0.get_auth_plugin_mapping()
        var_1 = plugin_manager_0.filter()
        var_2 = plugin_manager_0.unregister(type_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = None
        plugin_manager_0 = module_0.PluginManager()
        type_0 = plugin_manager_0.get_auth_plugin(str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        plugin_manager_0 = module_0.PluginManager(**dict_0)
        list_0 = plugin_manager_0.get_converters()
        str_0 = '+||*na9Y\'"'
        list_1 = plugin_manager_0.get_transport_plugins()
        type_0 = plugin_manager_0.get_auth_plugin(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '\n    Information about the execution context\n    (standard streams, config directory, etc).\n\n    By default, it represents the actual environment.\n    All of the attributes can be overwritten though, which\n    is used by the test suite to simulate various scenarios.\n\n    '
        str_1 = 'x>^*c%mZT^^'
        list_0 = [str_1]
        plugin_manager_0 = module_0.PluginManager(*list_0)
        type_0 = plugin_manager_0.get_auth_plugin(str_0)
    except BaseException:
        pass