# Automatically generated by Pynguin.
import ansible.plugins.inventory.auto as module_0

def test_case_0():
    try:
        set_0 = set()
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.verify_file(set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b''
        int_0 = 1865
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.parse(bytes_0, int_0, bytes_0)
    except BaseException:
        pass