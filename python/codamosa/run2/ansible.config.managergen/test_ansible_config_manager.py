# Automatically generated by Pynguin.
import ansible.config.manager as module_0

def test_case_0():
    var_0 = module_0.find_ini_config_file()

def test_case_1():
    config_manager_0 = module_0.ConfigManager()

def test_case_2():
    plugin_0 = None
    config_manager_0 = module_0.ConfigManager()
    int_0 = 2728
    var_0 = module_0.get_ini_config_value(int_0, plugin_0)

def test_case_3():
    plugin_0 = None
    float_0 = 511.0745807517067
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.get_configuration_definition(plugin_0)
    dict_0 = {plugin_0: plugin_0, plugin_0: float_0, plugin_0: plugin_0, plugin_0: float_0}
    config_manager_1 = module_0.ConfigManager()
    var_1 = config_manager_1.get_plugin_vars(plugin_0, dict_0)
    config_manager_2 = module_0.ConfigManager()
    list_0 = [var_0, float_0, config_manager_1]
    var_2 = module_0.get_ini_config_value(list_0, plugin_0)
    var_3 = config_manager_1.get_configuration_definitions()
    var_4 = config_manager_1.get_plugin_options(float_0, plugin_0)

def test_case_4():
    plugin_0 = None
    float_0 = 511.0745807517067
    dict_0 = {plugin_0: plugin_0, plugin_0: float_0, plugin_0: plugin_0, plugin_0: float_0}
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.get_plugin_vars(plugin_0, dict_0)

def test_case_5():
    bytes_0 = b'\\\xda:\xa4>\xdfx\xd4\x1a\xb9'
    float_0 = -2954.506
    list_0 = []
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.initialize_plugin_configuration_definitions(bytes_0, float_0, list_0)

def test_case_6():
    plugin_0 = None
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.get_configuration_definition(plugin_0)

def test_case_7():
    plugin_0 = None
    float_0 = 514.6035491988985
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.get_configuration_definition(plugin_0)
    dict_0 = {plugin_0: plugin_0, plugin_0: float_0, plugin_0: plugin_0, plugin_0: float_0}
    var_1 = config_manager_0.get_configuration_definitions(float_0)
    str_0 = '<%.\rX0?w._'
    str_1 = '\nX*IR}p2'
    dict_1 = {str_0: dict_0, str_1: plugin_0}
    var_2 = config_manager_0.initialize_plugin_configuration_definitions(plugin_0, float_0, dict_1)
    config_manager_1 = module_0.ConfigManager()
    var_3 = config_manager_1.get_plugin_vars(plugin_0, dict_0)
    var_4 = config_manager_1.get_plugin_options(plugin_0, float_0, dict_0, dict_1)