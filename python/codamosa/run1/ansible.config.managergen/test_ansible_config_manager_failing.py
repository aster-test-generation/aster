# Automatically generated by Pynguin.
import ansible.config.manager as module_0

def test_case_0():
    try:
        bool_0 = True
        var_0 = module_0.get_config_type(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = "@DI\x0cc>\r&jMxj['g"
        config_manager_0 = module_0.ConfigManager(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        config_manager_0 = module_0.ConfigManager()
        var_0 = module_0.find_ini_config_file()
        str_0 = 'exception'
        list_0 = []
        var_1 = config_manager_0.get_plugin_vars(str_0, list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = -690.78
        config_manager_0 = module_0.ConfigManager(float_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = True
        int_0 = 64
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_config_value(bool_0, int_0, bool_0, int_0)
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = None
        dict_1 = {dict_0: dict_0, dict_0: dict_0, dict_0: dict_0}
        config_manager_0 = module_0.ConfigManager()
        list_0 = [dict_1, dict_1, dict_1, dict_0]
        int_0 = 750
        var_0 = config_manager_0.get_config_value(list_0, int_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'\x91\xf6Q\x8a=\n)\x1e\xfd\x19\xc7\xaa\xdf\xa4K\xd7<'
        config_manager_0 = module_0.ConfigManager()
        list_0 = [bytes_0, config_manager_0, config_manager_0, bytes_0]
        list_1 = [list_0, list_0, bytes_0]
        list_2 = [config_manager_0, list_1]
        var_0 = module_0.ensure_type(list_0, list_2)
    except BaseException:
        pass

def test_case_7():
    try:
        config_manager_0 = None
        str_0 = 'p}44F`\nG'
        var_0 = module_0.get_ini_config_value(config_manager_0, str_0)
        dict_0 = {}
        str_1 = '(d9TFiv~o{J}*#XdY7\x0b3'
        str_2 = '(\x0cQ.puo&^C/'
        dict_1 = {str_1: str_1, str_2: str_2}
        var_1 = module_0.get_ini_config_value(dict_0, dict_1)
        config_manager_1 = module_0.ConfigManager()
    except BaseException:
        pass

def test_case_8():
    try:
        list_0 = []
        config_manager_0 = module_0.ConfigManager(list_0)
    except BaseException:
        pass

def test_case_9():
    try:
        dict_0 = None
        dict_1 = {dict_0: dict_0, dict_0: dict_0, dict_0: dict_0, dict_0: dict_0}
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.update_config_data(dict_1)
    except BaseException:
        pass

def test_case_10():
    try:
        dict_0 = None
        config_manager_0 = module_0.ConfigManager()
        float_0 = -1277.01342
        str_0 = '^[@&qq9}'
        var_0 = config_manager_0.get_plugin_vars(dict_0, str_0)
        config_manager_1 = module_0.ConfigManager(str_0, float_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = ''
        config_manager_0 = module_0.ConfigManager()
        str_1 = '%s exists, matching creates option'
        str_2 = '*\ryr_5eg{Hg\x0cN'
        config_manager_1 = module_0.ConfigManager()
        var_0 = config_manager_1.initialize_plugin_configuration_definitions(config_manager_0, str_1, str_2)
        var_1 = module_0.find_ini_config_file(str_0)
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
        setting_0 = module_0.Setting(**dict_0)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = '/@C)AuR=-bG[ qWY:p`'
        list_0 = [str_0, str_0]
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_configuration_definition(list_0)
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = 'ansible.builtin.{0}'
        str_1 = 'patTlist'
        dict_0 = {str_1: str_1, str_0: str_1, str_0: str_0, str_1: str_1}
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_configuration_definition(str_0, dict_0)
    except BaseException:
        pass

def test_case_14():
    try:
        config_manager_0 = None
        dict_0 = {}
        str_0 = 'mGI9Y'
        dict_1 = {str_0: str_0, str_0: str_0}
        set_0 = None
        bool_0 = False
        set_1 = {bool_0}
        config_manager_1 = module_0.ConfigManager()
        var_0 = config_manager_1.get_plugin_options(config_manager_0, set_0, set_1)
        var_1 = module_0.get_ini_config_value(dict_0, dict_1)
        config_manager_2 = module_0.ConfigManager()
        var_2 = config_manager_2.get_plugin_options(config_manager_0, config_manager_0)
        config_manager_3 = module_0.ConfigManager(dict_0)
    except BaseException:
        pass

def test_case_15():
    try:
        float_0 = -210.6
        list_0 = None
        var_0 = module_0.ensure_type(float_0, list_0)
        str_0 = 'dict'
        str_1 = ' I+L'
        config_manager_0 = module_0.ConfigManager()
        var_1 = config_manager_0.get_config_value_and_origin(str_0, str_1, str_1)
    except BaseException:
        pass

def test_case_16():
    try:
        tuple_0 = ()
        config_manager_0 = module_0.ConfigManager(tuple_0)
    except BaseException:
        pass

def test_case_17():
    try:
        str_0 = 'hS\reK=Yh'
        int_0 = -1024
        config_manager_0 = module_0.ConfigManager()
        var_0 = config_manager_0.get_config_value(str_0, int_0)
    except BaseException:
        pass

def test_case_18():
    try:
        config_manager_0 = None
        str_0 = 'mGI9Y'
        dict_0 = {str_0: str_0, str_0: str_0}
        set_0 = None
        bool_0 = False
        set_1 = {bool_0}
        config_manager_1 = module_0.ConfigManager()
        var_0 = config_manager_1.get_plugin_options(config_manager_0, set_0, set_1)
        config_manager_2 = module_0.ConfigManager()
        var_1 = config_manager_2.get_plugin_options(config_manager_0, config_manager_0)
        str_1 = ']$US:&='
        int_0 = -715
        var_2 = config_manager_2.get_plugin_vars(str_1, int_0)
        list_0 = [dict_0]
        config_manager_3 = module_0.ConfigManager()
        var_3 = config_manager_3.update_config_data(list_0, list_0)
    except BaseException:
        pass

def test_case_19():
    try:
        float_0 = 668.722433
        bool_0 = False
        dict_0 = {float_0: float_0, float_0: bool_0, bool_0: float_0}
        str_0 = 'Q?CD[iN44W9'
        str_1 = None
        str_2 = 'G[vd4+]mjDx'
        dict_1 = {str_1: dict_0, str_2: str_0}
        bool_1 = True
        config_manager_0 = module_0.ConfigManager(dict_1, bool_1)
    except BaseException:
        pass