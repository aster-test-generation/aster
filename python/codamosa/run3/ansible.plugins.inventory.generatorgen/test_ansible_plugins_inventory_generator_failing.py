# Automatically generated by Pynguin.
import ansible.plugins.inventory.generator as module_0

def test_case_0():
    try:
        list_0 = []
        list_1 = [list_0, list_0]
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.template(list_1, list_0)
    except BaseException:
        pass

def test_case_1():
    try:
        tuple_0 = ()
        float_0 = None
        str_0 = None
        bool_0 = False
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.add_parents(tuple_0, float_0, str_0, bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        inventory_module_0 = module_0.InventoryModule()
        int_0 = 1873
        set_0 = {inventory_module_0}
        str_0 = 'x'
        inventory_module_1 = module_0.InventoryModule()
        var_0 = inventory_module_1.add_parents(inventory_module_0, int_0, set_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'\x9fw'
        dict_0 = {bytes_0: bytes_0, bytes_0: bytes_0}
        float_0 = -2055.345
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.parse(bytes_0, dict_0, float_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = None
        inventory_module_0 = module_0.InventoryModule()
        list_0 = [bytes_0, bytes_0, bytes_0]
        tuple_0 = ()
        inventory_module_1 = module_0.InventoryModule()
        inventory_module_2 = module_0.InventoryModule()
        var_0 = inventory_module_2.verify_file(list_0)
        inventory_module_3 = module_0.InventoryModule()
        str_0 = 'q~v'
        inventory_module_4 = module_0.InventoryModule()
        var_1 = inventory_module_3.parse(list_0, tuple_0, str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        inventory_module_0 = module_0.InventoryModule()
        str_0 = 'test.txt'
        float_0 = -2164.0691
        tuple_0 = ()
        var_0 = inventory_module_0.add_parents(float_0, str_0, tuple_0, tuple_0)
        var_1 = inventory_module_0.add_parents(inventory_module_0, tuple_0, str_0, str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        inventory_module_0 = module_0.InventoryModule()
        str_0 = 'name'
        str_1 = 'vars'
        str_2 = 'operation'
        str_3 = 'build'
        str_4 = {str_2: str_3}
        str_5 = {str_0: str_2, str_1: str_4}
        str_6 = 'application'
        str_7 = {str_0: str_6}
        str_8 = 'environment'
        str_9 = {str_0: str_8}
        str_10 = {str_0: str_6}
        str_11 = [str_7, str_9, str_10]
        str_12 = 'webapp'
        str_13 = 'prod'
        str_14 = {str_6: str_12, str_2: str_3, str_8: str_13}
        var_0 = inventory_module_0.add_parents(inventory_module_0, str_5, str_11, str_14)
    except BaseException:
        pass

def test_case_7():
    try:
        inventory_module_0 = module_0.InventoryModule()
        str_0 = '/usr/bin/vmstat'
        var_0 = inventory_module_0.verify_file(str_0)
        float_0 = 1000.0
        tuple_0 = ()
        var_1 = inventory_module_0.add_parents(float_0, str_0, tuple_0, tuple_0)
        str_1 = '[>0AQ1Z7a`XWfA@VVw$Q'
        bytes_0 = b'\xc3s\xf8\xfe\xc2'
        str_2 = 'hVA!xtfB\t'
        set_0 = {var_1, bytes_0, str_1, tuple_0}
        inventory_module_1 = module_0.InventoryModule()
        var_2 = inventory_module_0.add_parents(str_2, set_0, set_0, set_0)
    except BaseException:
        pass