# Automatically generated by Pynguin.
import ansible.inventory.host as module_0

def test_case_0():
    try:
        str_0 = '?\n7(B8K[J{'
        host_0 = module_0.Host(str_0)
        var_0 = host_0.__hash__()
        str_1 = 'FgJOqWk anA:eR\r{'
        var_1 = host_0.populate_ancestors(str_1)
        var_2 = host_0.__ne__(host_0)
        var_3 = host_0.__getstate__()
    except BaseException:
        pass

def test_case_1():
    try:
        host_0 = module_0.Host()
        var_0 = host_0.deserialize(host_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = 282.0
        list_0 = [float_0]
        host_0 = module_0.Host(float_0, list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = -1672.0664980990543
        host_0 = module_0.Host()
        str_0 = '/}gTSn|XWhy7O'
        host_1 = module_0.Host(str_0)
        var_0 = host_1.__repr__()
        var_1 = host_1.populate_ancestors(float_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = "'RSO"
        str_1 = ',~)b'
        host_0 = module_0.Host(str_1)
        var_0 = host_0.get_vars()
        host_1 = module_0.Host(str_0)
        bytes_0 = b'\xa7/\x95\x1cG\xcbh}\xf5\xe5$1]6U'
        tuple_0 = ()
        tuple_1 = (bytes_0, tuple_0)
        var_1 = host_1.populate_ancestors(tuple_1)
        var_2 = host_1.get_magic_vars()
    except BaseException:
        pass

def test_case_5():
    try:
        set_0 = None
        host_0 = module_0.Host()
        var_0 = host_0.remove_group(set_0)
        host_1 = module_0.Host()
        var_1 = host_1.get_vars()
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = "'RSO"
        float_0 = -1230.65797
        bool_0 = True
        int_0 = 126
        host_0 = module_0.Host(int_0)
        var_0 = host_0.set_variable(int_0, int_0)
        host_1 = module_0.Host(bool_0)
        var_1 = host_1.__eq__(float_0)
        var_2 = host_1.__str__()
        var_3 = host_0.get_groups()
        var_4 = host_0.populate_ancestors()
        var_5 = host_1.__hash__()
        str_1 = ',~)b'
        var_6 = host_1.remove_group(str_1)
        host_2 = module_0.Host(str_1)
        var_7 = host_2.get_vars()
        host_3 = module_0.Host(str_0)
        str_2 = "q:^X 'y\rYq6;|8"
        var_8 = host_1.populate_ancestors(str_2)
        var_9 = host_0.get_magic_vars()
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'Testing Host class deserialize method'
        var_0 = print(str_0)
        str_1 = 'my_host'
        str_2 = 'my_var'
        str_3 = 'my_var_value'
        str_4 = {str_2: str_3}
        str_5 = 'my_address'
        str_6 = 'my_id'
        str_7 = 'my_group'
        str_8 = [str_7]
        bool_0 = True
        var_1 = dict(name=str_1, vars=str_4, address=str_5, uuid=str_6, groups=str_8, implicit=bool_0)
        host_0 = module_0.Host()
        var_2 = host_0.deserialize(var_1)
    except BaseException:
        pass