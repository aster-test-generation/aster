# Automatically generated by Pynguin.
import ansible.config.manager as module_0

def test_case_0():
    try:
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_configuration_definitions()
        config_manager_1 = module_0.ConfigManager()
        bool_0 = True
        dict_0 = {}
        var_1 = config_manager_1.get_config_value(bool_0, dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'Almalinux'
        config_manager_0 = module_0.ConfigManager(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\x92'
        str_0 = '<{self!s} of type {coll_type!r} from {src!s}>'
        str_1 = ';R5}X#DdeCE'
        list_0 = [str_0, bytes_0, str_0, str_1]
        set_0 = {str_0, str_1, str_0}
        config_manager_0 = module_0.ConfigManager(list_0, set_0)
    except BaseException:
        pass

def test_case_3():
    try:
        plugin_0 = None
        float_0 = 499.6684520708469
        dict_0 = {plugin_0: plugin_0, plugin_0: float_0, plugin_0: plugin_0, plugin_0: float_0}
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_plugin_options(plugin_0, float_0, dict_0, config_manager_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 512.3313934131053
        config_manager_0 = module_0.ConfigManager()
        str_0 = 'tmppath'
        bytes_0 = b'\xc3\xed\xe8x\xc7\xf8\xbb)\xd7\xef\x9dd\xf6\xb7\xbe\xbb\x9b'
        var_0 = config_manager_0.get_config_value_and_origin(str_0, float_0, str_0, bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '(W]Y3'
        str_1 = 'GG+e5~P]xTu '
        dict_0 = {str_0: str_0, str_1: str_1}
        list_0 = [dict_0, str_0, str_0]
        tuple_0 = ()
        int_0 = 2056
        set_0 = {int_0, str_1}
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_config_value(list_0, tuple_0, set_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'${\xcc l\x82'
        set_0 = {bytes_0, bytes_0, bytes_0, bytes_0}
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_config_value(set_0)
    except BaseException:
        pass

def test_case_7():
    try:
        set_0 = set()
        config_manager_0 = module_0.ConfigManager(set_0)
    except BaseException:
        pass

def test_case_8():
    try:
        int_0 = -2137
        str_0 = 'a"$P3cR0`B/z9dC(A'
        dict_0 = {str_0: int_0, str_0: str_0}
        var_0 = module_0.ensure_type(int_0, dict_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bool_0 = True
        float_0 = 823.5893
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_plugin_vars(bool_0, float_0)
        plugin_0 = None
        bytes_0 = b'\xe5W?0\xa4\xf0\x18s'
        var_1 = module_0.get_ini_config_value(plugin_0, bytes_0)
        str_0 = "+'\\pLk~"
        dict_0 = {str_0: bool_0}
        plugin_1 = module_0.Plugin(**dict_0)
    except BaseException:
        pass

def test_case_10():
    try:
        bool_0 = False
        config_manager_0 = module_0.ConfigManager(bool_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = ''
        set_0 = {str_0, str_0, str_0}
        var_0 = module_0.resolve_path(set_0)
        int_0 = 726
        bool_0 = True
        config_manager_0 = module_0.ConfigManager()
        var_1 = config_manager_0.get_plugin_vars(str_0, bool_0)
        float_0 = None
        var_2 = module_0.ensure_type(float_0, str_0)
        config_manager_1 = module_0.ConfigManager()
        var_3 = config_manager_1.update_config_data(int_0)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = '6f.'
        var_0 = module_0.resolve_path(str_0)
        config_manager_0 = module_0.ConfigManager()
        bool_0 = None
        config_manager_1 = module_0.ConfigManager(bool_0)
        bytes_0 = b'\xf6\xf9\xf6\xc9\x8fC\x12D1G\x00\x9a\x9f\xd39\xdc'
        int_0 = -129
        var_1 = config_manager_0.get_config_value_and_origin(config_manager_1, bytes_0, int_0)
    except BaseException:
        pass

def test_case_13():
    try:
        plugin_0 = None
        int_0 = -2087
        set_0 = {plugin_0, int_0, plugin_0}
        var_0 = module_0.get_ini_config_value(int_0, set_0)
        float_0 = 511.0745807517067
        config_manager_0 = module_0.ConfigManager()
        var_1 = config_manager_0.get_configuration_definition(plugin_0)
        dict_0 = {plugin_0: plugin_0, plugin_0: float_0, plugin_0: plugin_0, plugin_0: float_0}
        config_manager_1 = module_0.ConfigManager()
        var_2 = config_manager_1.get_plugin_vars(plugin_0, dict_0)
        config_manager_2 = module_0.ConfigManager()
        var_3 = module_0.get_ini_config_value(var_0, var_0)
        var_4 = config_manager_1.get_configuration_definitions()
        var_5 = config_manager_1.update_config_data(plugin_0, dict_0)
    except BaseException:
        pass

def test_case_14():
    try:
        bool_0 = False
        float_0 = 823.5893
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_plugin_vars(bool_0, float_0)
        var_1 = config_manager_0.get_configuration_definition(config_manager_0, bool_0)
        config_manager_1 = module_0.ConfigManager()
        str_0 = '[debug] %s'
        config_manager_2 = module_0.ConfigManager(str_0)
    except BaseException:
        pass

def test_case_15():
    try:
        plugin_0 = None
        float_0 = 514.6035491988985
        config_manager_0 = module_0.ConfigManager()
        dict_0 = {config_manager_0: config_manager_0, plugin_0: float_0, plugin_0: float_0, plugin_0: plugin_0}
        var_0 = config_manager_0.update_config_data(dict_0)
    except BaseException:
        pass

def test_case_16():
    try:
        str_0 = 'JD/\\s?U5mr'
        dict_0 = {str_0: str_0}
        float_0 = 0.1
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_configuration_definition(dict_0, float_0, str_0)
    except BaseException:
        pass

def test_case_17():
    try:
        config_manager_0 = module_0.ConfigManager()
        bytes_0 = b'\xd66\x81\xa9\xfd\xaer\xfc4\x98C\xeb\xc8Kb\x0e\x92\xc1z'
        tuple_0 = (bytes_0, bytes_0, config_manager_0)
        bool_0 = True
        config_manager_1 = module_0.ConfigManager(tuple_0, bool_0)
    except BaseException:
        pass

def test_case_18():
    try:
        bool_0 = None
        float_0 = 100.0
        var_0 = module_0.get_ini_config_value(bool_0, float_0)
        bytes_0 = b'\xeb\x82\xb4#`\xbfj\xea'
        config_manager_0 = module_0.ConfigManager()
        str_0 = '8}H~];9HE;`q4\x0bz=}v'
        plugin_0 = None
        list_0 = [plugin_0, bytes_0, config_manager_0, bytes_0]
        var_1 = config_manager_0.get_configuration_definitions(str_0, plugin_0, list_0)
        plugin_1 = module_0.Plugin()
    except BaseException:
        pass

def test_case_19():
    try:
        plugin_0 = None
        float_0 = 514.6035491988985
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_configuration_definition(plugin_0)
        dict_0 = {plugin_0: plugin_0, plugin_0: float_0, plugin_0: plugin_0, plugin_0: float_0}
        var_1 = config_manager_0.get_configuration_definitions(float_0)
        list_0 = [dict_0, var_0]
        var_2 = module_0.get_ini_config_value(plugin_0, list_0)
        str_0 = "'/BwJRV-a%p@iSu$P"
        str_1 = 'D\\\\Bef_;'
        dict_1 = {str_0: dict_0, str_0: str_0}
        var_3 = config_manager_0.initialize_plugin_configuration_definitions(plugin_0, float_0, dict_1)
        setting_0 = None
        float_1 = -2361.560993
        var_4 = config_manager_0.initialize_plugin_configuration_definitions(setting_0, float_1, str_1)
        setting_1 = module_0.Setting()
    except BaseException:
        pass