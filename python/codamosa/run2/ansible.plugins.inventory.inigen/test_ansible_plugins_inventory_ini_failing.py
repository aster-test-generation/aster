# Automatically generated by Pynguin.
import ansible.plugins.inventory.ini as module_0

def test_case_0():
    try:
        int_0 = -2957
        dict_0 = None
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.parse(int_0, dict_0, int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        inventory_module_0 = module_0.InventoryModule()
        dict_0 = None
        inventory_module_1 = module_0.InventoryModule()
        inventory_module_2 = module_0.InventoryModule()
        bool_0 = True
        dict_1 = None
        var_0 = inventory_module_2.parse(bool_0, dict_0, dict_1)
        inventory_module_3 = module_0.InventoryModule()
        bool_1 = False
        tuple_0 = ()
        str_0 = '!'
        var_1 = inventory_module_3.parse(tuple_0, bool_1, str_0)
    except BaseException:
        pass