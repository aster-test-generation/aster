# Automatically generated by Pynguin.
import ansible.inventory.host as module_0
import ansible.inventory.group as module_1

def test_case_0():
    host_0 = module_0.Host()

def test_case_1():
    host_0 = module_0.Host()
    var_0 = host_0.__str__()
    int_0 = 1531
    dict_0 = {host_0: int_0, host_0: host_0, var_0: var_0}
    var_1 = host_0.remove_group(dict_0)
    var_2 = host_0.__getstate__()

def test_case_2():
    str_0 = 'app'
    group_0 = module_1.Group(str_0)
    str_1 = '2'
    host_0 = module_0.Host(str_1, str_1)
    var_0 = host_0.get_groups()
    var_1 = len(var_0)
    str_2 = 'test'
    host_1 = module_0.Host(str_1, str_1)
    var_2 = host_1.add_group(group_0)
    var_3 = host_0.get_groups()
    var_4 = host_1.get_vars()
    str_3 = 'O\\\tx@'
    var_5 = host_0.set_variable(str_2, str_3)
    var_6 = len(var_3)
    var_7 = host_1.remove_group(group_0)
    var_8 = host_1.get_groups()
    var_9 = host_0.__eq__(host_1)
    float_0 = 0.0001
    var_10 = host_0.remove_group(float_0)
    var_11 = host_0.get_groups()
    group_1 = module_1.Group()
    group_2 = module_1.Group()

def test_case_3():
    host_0 = module_0.Host()
    var_0 = host_0.__str__()
    int_0 = 1531
    dict_0 = {host_0: int_0, host_0: host_0, var_0: var_0}
    var_1 = host_0.remove_group(dict_0)

def test_case_4():
    group_0 = module_1.Group()
    int_0 = 656000
    host_0 = module_0.Host(int_0)
    var_0 = host_0.populate_ancestors()
    dict_0 = {}
    host_1 = module_0.Host(dict_0)
    var_1 = host_1.__ne__(group_0)

def test_case_5():
    bytes_0 = b'M\x16~\xd0*\xaa\x89\x16'
    dict_0 = {bytes_0: bytes_0}
    host_0 = module_0.Host(dict_0)
    var_0 = host_0.populate_ancestors()
    host_1 = module_0.Host()
    var_1 = host_1.get_groups()
    var_2 = host_1.__repr__()
    var_3 = host_1.serialize()

def test_case_6():
    host_0 = module_0.Host()
    var_0 = host_0.serialize()

def test_case_7():
    bytes_0 = b'M\x16~\xd0*\xaa\x89\x16'
    dict_0 = {bytes_0: bytes_0}
    host_0 = module_0.Host(dict_0)
    var_0 = host_0.populate_ancestors()
    host_1 = module_0.Host()
    var_1 = host_1.get_groups()
    var_2 = host_1.serialize()

def test_case_8():
    group_0 = module_1.Group()
    host_0 = module_0.Host()
    var_0 = host_0.add_group(group_0)

def test_case_9():
    str_0 = None
    str_1 = 'C\\|mV(}R}/$2\n\r7f'
    host_0 = module_0.Host(str_1)
    var_0 = host_0.remove_group(str_0)

def test_case_10():
    host_0 = module_0.Host()
    var_0 = host_0.get_groups()

def test_case_11():
    str_0 = '/3\tto$58;?NW<D7:W\r7\x0c'
    host_0 = module_0.Host(str_0)
    str_1 = 'a]'
    group_0 = module_1.Group(str_1)
    var_0 = host_0.add_group(group_0)
    group_1 = module_1.Group(str_1)
    var_1 = group_1.add_child_group(group_0)
    var_2 = host_0.remove_group(group_0)
    var_3 = host_0.get_magic_vars()

def test_case_12():
    complex_0 = None
    int_0 = 4096
    dict_0 = {complex_0: complex_0, complex_0: int_0, int_0: int_0}
    host_0 = module_0.Host()
    var_0 = host_0.__setstate__(dict_0)

def test_case_13():
    host_0 = module_0.Host()
    group_0 = module_1.Group()
    var_0 = host_0.add_group(group_0)
    var_1 = host_0.remove_group(group_0)

def test_case_14():
    group_0 = module_1.Group()
    host_0 = module_0.Host()
    var_0 = host_0.add_group(group_0)
    var_1 = host_0.add_group(group_0)

def test_case_15():
    str_0 = 'xghurtvxjw'
    host_0 = module_0.Host(str_0)
    str_1 = 'test'
    var_0 = host_0.set_variable(str_1, str_1)
    var_1 = host_0.set_variable(str_1, str_1)

def test_case_16():
    str_0 = 'h1'
    host_0 = module_0.Host(str_0)
    str_1 = 'a]'
    group_0 = module_1.Group(str_1)
    var_0 = host_0.add_group(group_0)
    var_1 = host_0.__hash__()
    group_1 = module_1.Group(str_1)
    var_2 = group_1.add_child_group(group_0)
    var_3 = host_0.get_magic_vars()
    var_4 = host_0.get_vars()
    var_5 = host_0.__getstate__()
    var_6 = host_0.remove_group(group_0)
    var_7 = host_0.get_name()
    var_8 = host_0.get_magic_vars()

def test_case_17():
    str_0 = 'app'
    group_0 = module_1.Group(str_0)
    str_1 = 'prod'
    str_2 = '22'
    group_1 = module_1.Group(str_0)
    host_0 = module_0.Host(str_2, str_2)
    var_0 = host_0.add_group(group_1)
    var_1 = host_0.get_groups()
    str_3 = 'O\\\tx@'
    var_2 = host_0.set_variable(str_1, str_3)
    var_3 = len(var_1)
    var_4 = host_0.populate_ancestors()
    var_5 = host_0.get_magic_vars()
    group_2 = module_1.Group()

def test_case_18():
    str_0 = '/3\tto$58;?NW<D7:W>\r\x0c'
    host_0 = module_0.Host(str_0)
    str_1 = 'a]'
    group_0 = module_1.Group(str_1)
    var_0 = host_0.add_group(group_0)
    group_1 = module_1.Group(str_1)
    var_1 = group_1.add_child_group(group_0)
    var_2 = host_0.get_magic_vars()
    var_3 = host_0.remove_group(group_0)
    var_4 = host_0.get_magic_vars()

def test_case_19():
    str_0 = 'hostname'
    str_1 = 'key'
    str_2 = 'val{ue'
    str_3 = {str_1: str_2}
    str_4 = '1.1.1.1'
    str_5 = 'uuid'
    str_6 = 'name'
    str_7 = 'vars'
    str_8 = 'children'
    str_9 = 'groupname'
    str_10 = {str_1: str_2}
    str_11 = {str_6: str_9, str_7: str_10, str_8: str_2}
    str_12 = [str_11]
    bool_0 = True
    var_0 = dict(name=str_0, vars=str_3, address=str_4, uuid=str_5, groups=str_12, implicit=bool_0)
    host_0 = module_0.Host()
    var_1 = host_0.deserialize(var_0)

def test_case_20():
    str_0 = 'h1'
    host_0 = module_0.Host(str_0)
    group_0 = module_1.Group(str_0)
    group_1 = module_1.Group(str_0)
    var_0 = group_1.add_child_group(group_0)
    var_1 = host_0.add_group(group_0)
    var_2 = host_0.remove_group(group_0)

def test_case_21():
    str_0 = 'my_host'
    str_1 = '1234'
    host_0 = module_0.Host(str_0, str_1)
    str_2 = 'md_va1'
    str_3 = 'my_value'
    var_0 = host_0.set_variable(str_2, str_3)
    str_4 = 'my_value2'
    var_1 = host_0.set_variable(str_2, str_4)
    var_2 = host_0.vars
    var_3 = len(var_2)
    str_5 = 'my_nested_var'
    str_6 = 'subkey1'
    str_7 = 'subvalue1'
    str_8 = {str_6: str_7}
    var_4 = host_0.set_variable(str_5, str_8)
    var_5 = host_0.vars
    var_6 = len(var_5)
    str_9 = 'subkey2'
    str_10 = {str_9: str_6}
    var_7 = host_0.set_variable(str_5, str_10)

def test_case_22():
    str_0 = 'my_host'
    str_1 = '1234'
    host_0 = module_0.Host(str_0, str_1)
    str_2 = 'md_va1'
    str_3 = 'my_value'
    var_0 = host_0.set_variable(str_2, str_3)
    str_4 = 'my_value2'
    var_1 = host_0.set_variable(str_2, str_4)
    var_2 = host_0.vars
    var_3 = len(var_2)
    str_5 = 'my_nested_var'
    str_6 = 'subkey1'
    str_7 = 'subvalue1'
    str_8 = {str_6: str_7}
    var_4 = host_0.set_variable(str_5, str_8)
    var_5 = len(str_1)
    str_9 = 'subkey2'
    var_6 = host_0.set_variable(str_5, str_9)