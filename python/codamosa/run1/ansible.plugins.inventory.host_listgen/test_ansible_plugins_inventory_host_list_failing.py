# Automatically generated by Pynguin.
import ansible.plugins.inventory.host_list as module_0

def test_case_0():
    try:
        inventory_module_0 = module_0.InventoryModule()
        bool_0 = False
        str_0 = 'ownership, perms or SE linux context changed'
        var_0 = inventory_module_0.verify_file(str_0)
        str_1 = '\r,Pl\\`'
        var_1 = inventory_module_0.parse(inventory_module_0, bool_0, str_1)
    except BaseException:
        pass

def test_case_1():
    try:
        inventory_module_0 = module_0.InventoryModule()
        str_0 = 'host1.example.com ost2, host3'
        var_0 = None
        var_1 = inventory_module_0.parse(inventory_module_0, var_0, str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        inventory_module_0 = module_0.InventoryModule()
        bytes_0 = b''
        var_0 = inventory_module_0.parse(bytes_0, bytes_0, bytes_0)
    except BaseException:
        pass

def test_case_3():
    try:
        inventory_module_0 = module_0.InventoryModule()
        bool_0 = False
        var_0 = inventory_module_0.verify_file(bool_0)
        str_0 = '\r,Pl\\G'
        var_1 = inventory_module_0.parse(inventory_module_0, bool_0, str_0)
    except BaseException:
        pass