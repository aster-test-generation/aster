# Automatically generated by Pynguin.
import ansible.plugins.inventory.constructed as module_0

def test_case_0():
    try:
        list_0 = []
        float_0 = 2106.1363
        str_0 = 'da'
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.get_all_host_vars(list_0, float_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'e4s<Gfq#"aSCFn'
        float_0 = 992.9248
        float_1 = None
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.host_vars(str_0, float_0, float_1)
    except BaseException:
        pass

def test_case_2():
    try:
        inventory_module_0 = module_0.InventoryModule()
        list_0 = []
        inventory_module_1 = module_0.InventoryModule()
        var_0 = inventory_module_1.parse(inventory_module_0, inventory_module_0, list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'E8T{c'
        dict_0 = {}
        str_1 = '[;h ^H*diP['
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.parse(str_0, dict_0, str_1)
    except BaseException:
        pass