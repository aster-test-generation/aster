# Automatically generated by Pynguin.
import ansible.config.data as module_0

def test_case_0():
    try:
        config_data_0 = module_0.ConfigData()
        var_0 = config_data_0.get_setting(config_data_0)
        str_0 = 'repository'
        var_1 = config_data_0.get_setting(str_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        config_data_0 = module_0.ConfigData()
        var_0 = config_data_0.get_settings()
        float_0 = -787.534519
        var_1 = config_data_0.get_settings(float_0)
    except BaseException:
        pass

def test_case_2():
    try:
        config_data_0 = module_0.ConfigData()
        str_0 = ''
        var_0 = config_data_0.update_setting(config_data_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        config_data_0 = module_0.ConfigData()
        var_0 = config_data_0.update_setting(config_data_0)
    except BaseException:
        pass

def test_case_4():
    try:
        config_data_0 = module_0.ConfigData()
        var_0 = ()
        str_0 = 'type'
        str_1 = {str_0: str_0, str_0: str_0}
        var_1 = type(str_0, var_0, str_1)
        var_2 = config_data_0.update_setting(str_0, var_1)
    except BaseException:
        pass

def test_case_5():
    try:
        config_data_0 = module_0.ConfigData()
        var_0 = ()
        str_0 = 'type'
        str_1 = 'name'
        str_2 = {str_0: str_1, str_1: str_1}
        var_1 = type(str_0, var_0, str_2)
        var_2 = config_data_0.update_setting(str_0, var_1)
    except BaseException:
        pass

def test_case_6():
    try:
        config_data_0 = module_0.ConfigData()
        str_0 = 'a'
        str_1 = 'v0)\x0bH`6ZX*\r:+n\r'
        var_0 = config_data_0.get_settings()
        set_0 = None
        var_1 = config_data_0.get_settings(set_0)
        var_2 = ()
        str_2 = 'type'
        str_3 = 'name'
        str_4 = 'playbook'
        str_5 = 'plugin1'
        str_6 = {str_2: str_0, str_2: str_4, var_2: var_0, str_3: str_5}
        var_3 = type(str_1, var_2, str_6)
        str_7 = 'bo'
        var_4 = config_data_0.get_setting(str_2, var_3)
        var_5 = config_data_0.update_setting(str_7, var_3)
    except BaseException:
        pass