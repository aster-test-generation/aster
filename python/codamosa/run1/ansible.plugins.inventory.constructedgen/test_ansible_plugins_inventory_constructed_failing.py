# Automatically generated by Pynguin.
import ansible.plugins.inventory.constructed as module_0

def test_case_0():
    try:
        int_0 = 907
        dict_0 = {int_0: int_0, int_0: int_0}
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.get_all_host_vars(int_0, int_0, dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        inventory_module_0 = module_0.InventoryModule()
        bool_0 = True
        bytes_0 = None
        tuple_0 = None
        var_0 = inventory_module_0.host_vars(bool_0, bytes_0, tuple_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = -3641.5529
        tuple_0 = ()
        int_0 = None
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.parse(float_0, tuple_0, int_0)
    except BaseException:
        pass