# Automatically generated by Pynguin.
import ansible.inventory.group as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'g2Z&'
    group_0 = module_0.Group(str_0)

def test_case_2():
    group_0 = module_0.Group()

def test_case_3():
    group_0 = module_0.Group()
    var_0 = group_0.__getstate__()

def test_case_4():
    dict_0 = {}
    group_0 = module_0.Group()
    var_0 = group_0.__setstate__(dict_0)

def test_case_5():
    group_0 = module_0.Group()
    var_0 = group_0.get_hosts()

def test_case_6():
    group_0 = module_0.Group()
    var_0 = group_0.clear_hosts_cache()

def test_case_7():
    group_0 = module_0.Group()
    var_0 = group_0.remove_host(group_0)

def test_case_8():
    group_0 = module_0.Group()
    group_1 = module_0.Group()
    var_0 = group_1.add_child_group(group_0)
    var_1 = group_1.get_vars()

def test_case_9():
    str_0 = 'MyGroup'
    group_0 = module_0.Group(str_0)
    group_1 = module_0.Group(str_0)
    var_0 = group_0.add_child_group(group_1)

def test_case_10():
    str_0 = 'g1'
    group_0 = module_0.Group(str_0)
    str_1 = 'g2Z&'
    group_1 = module_0.Group(str_1)

def test_case_11():
    str_0 = 'te*st1'
    group_0 = module_0.Group(str_0)
    var_0 = group_0.remove_host(group_0)
    var_1 = group_0.clear_hosts_cache()
    group_1 = module_0.Group(str_0)
    var_2 = group_0.add_child_group(group_1)
    var_3 = group_1.get_hosts()
    group_2 = module_0.Group()
    group_3 = module_0.Group()
    var_4 = group_3.add_child_group(group_0)

def test_case_12():
    str_0 = 'group'
    group_0 = module_0.Group(str_0)
    str_1 = 'ansible_group_priority'
    str_2 = '1'
    var_0 = group_0.set_variable(str_1, str_2)
    int_0 = None
    group_1 = module_0.Group(int_0)

def test_case_13():
    str_0 = 'group'
    group_0 = module_0.Group(str_0)
    var_0 = group_0.set_variable(str_0, str_0)
    str_1 = '#.1'
    var_1 = group_0.set_variable(str_0, str_1)

def test_case_14():
    group_0 = module_0.Group()
    group_1 = module_0.Group()
    var_0 = group_1.add_child_group(group_0)
    var_1 = group_1.get_hosts()

def test_case_15():
    str_0 = 'foo(b\tar[foo]foo'
    var_0 = module_0.to_safe_group_name(str_0, str_0, str_0)

def test_case_16():
    group_0 = module_0.Group()
    str_0 = 'name'
    str_1 = 'depth'
    str_2 = 'vars'
    str_3 = 'hosts'
    str_4 = 'parent_groups'
    str_5 = 'group1'
    int_0 = 1
    str_6 = 'a'
    int_1 = {str_6: int_0}
    str_7 = 'localhost'
    str_8 = [str_7]
    str_9 = 'parent_group1'
    str_10 = {str_0: str_9}
    str_11 = [str_10]
    var_0 = {str_0: str_5, str_1: int_0, str_2: int_1, str_3: str_8, str_4: str_11}
    var_1 = group_0.deserialize(var_0)

def test_case_17():
    str_0 = 'kG'
    group_0 = module_0.Group(str_0)
    group_1 = module_0.Group(str_0)
    var_0 = group_0.add_child_group(group_1)
    group_2 = module_0.Group()
    var_1 = group_2.add_child_group(group_0)

def test_case_18():
    str_0 = 'te*st1'
    group_0 = module_0.Group(str_0)
    var_0 = group_0.remove_host(group_0)
    group_1 = module_0.Group(str_0)
    var_1 = group_1.clear_hosts_cache()
    group_2 = module_0.Group(str_0)
    var_2 = group_0.add_child_group(group_2)
    list_0 = None
    set_0 = {group_1, group_1, group_1, str_0, group_1, list_0}
    var_3 = group_0.set_variable(list_0, set_0)
    var_4 = group_0.get_hosts()
    group_3 = module_0.Group()
    var_5 = group_3.add_child_group(group_0)
    var_6 = group_2.clear_hosts_cache()