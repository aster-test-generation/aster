# Automatically generated by Pynguin.
import ansible.config.manager as module_0

def test_case_0():
    config_manager_0 = module_0.ConfigManager()

def test_case_1():
    str_0 = 'lWU3/b:Q\x0b\n'
    str_1 = 'S2<'
    dict_0 = {str_0: str_0, str_1: str_1}
    var_0 = module_0.get_ini_config_value(dict_0, str_0)

def test_case_2():
    float_0 = 0.0001
    dict_0 = None
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.get_plugin_options(float_0, dict_0)

def test_case_3():
    config_manager_0 = None
    dict_0 = {}
    str_0 = '(d9TFiv~o{J}*#XdY7\x0b3'
    dict_1 = {str_0: str_0, str_0: str_0}
    var_0 = module_0.get_ini_config_value(dict_0, dict_1)
    config_manager_1 = module_0.ConfigManager()
    var_1 = config_manager_1.get_plugin_options(config_manager_0, config_manager_0)

def test_case_4():
    dict_0 = None
    config_manager_0 = module_0.ConfigManager()
    str_0 = '^[@&qq9}'
    var_0 = config_manager_0.get_plugin_vars(dict_0, str_0)
    dict_1 = {str_0: str_0, str_0: config_manager_0}
    var_1 = module_0.resolve_path(dict_1)

def test_case_5():
    config_manager_0 = module_0.ConfigManager()
    var_0 = config_manager_0.get_plugin_options(config_manager_0, config_manager_0)
    str_0 = ']$US:&='
    int_0 = -689
    var_1 = config_manager_0.get_plugin_vars(str_0, int_0)
    config_manager_1 = module_0.ConfigManager()
    tuple_0 = ()
    var_2 = config_manager_1.get_configuration_definition(tuple_0)