# Automatically generated by Pynguin.
import ansible.inventory.host as module_0
import ansible.inventory.group as module_1

def test_case_0():
    try:
        str_0 = '8\r~CE@'
        str_1 = "(i'iC&r"
        int_0 = 127
        host_0 = module_0.Host(str_1, int_0)
        var_0 = host_0.__setstate__(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        dict_0 = {}
        host_0 = module_0.Host(dict_0)
        var_0 = host_0.get_groups()
        bytes_0 = b'&\x00s\xc8O\xcc\x05'
        host_1 = module_0.Host(bytes_0)
        str_0 = 'DEFAULT_SHUTDOWN_COMMAND_ARGS'
        bool_0 = False
        var_1 = host_0.get_name()
        str_1 = ')[b\x0bG\nctin?SA43}'
        var_2 = host_1.__ne__(str_1)
        var_3 = host_1.__eq__(bool_0)
        var_4 = host_1.populate_ancestors(str_0)
        var_5 = host_1.get_magic_vars()
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = None
        host_0 = module_0.Host()
        var_0 = host_0.set_variable(int_0, int_0)
        str_0 = 'o<46<b3-5X8^c}$S'
        list_0 = [host_0, int_0, str_0]
        var_1 = host_0.remove_group(list_0)
        var_2 = host_0.get_vars()
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'h1'
        host_0 = module_0.Host(str_0)
        group_0 = module_1.Group(str_0)
        var_0 = host_0.remove_group(group_0)
        var_1 = host_0.set_variable(var_0, group_0)
        float_0 = 1288.315306483087
        int_0 = -1083
        var_2 = host_0.set_variable(float_0, int_0)
        var_3 = host_0.add_group(group_0)
        var_4 = host_0.add_group(group_0)
        var_5 = host_0.__repr__()
        str_1 = 'g2'
        group_1 = module_1.Group(str_1)
        var_6 = host_0.add_group(group_1)
        var_7 = host_0.add_group(group_1)
        var_8 = group_1.__getstate__()
        var_9 = host_0.__hash__()
        var_10 = group_0.add_child_group(group_1)
        var_11 = host_0.get_groups()
        var_12 = host_0.get_magic_vars()
        var_13 = group_1.__str__()
        var_14 = host_0.add_group(group_1)
        var_15 = group_1.get_name()
        var_16 = host_0.remove_group(group_1)
        set_0 = set()
        var_17 = group_0.deserialize(set_0)
    except BaseException:
        pass