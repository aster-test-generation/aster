# Automatically generated by Pynguin.
import ansible.inventory.data as module_0
import ansible.inventory.host as module_1

def test_case_0():
    pass

def test_case_1():
    inventory_data_0 = module_0.InventoryData()

def test_case_2():
    inventory_data_0 = module_0.InventoryData()
    var_0 = inventory_data_0.serialize()
    str_0 = '`1D'
    var_1 = inventory_data_0.add_group(str_0)
    str_1 = 'localhost'
    var_2 = inventory_data_0.add_host(str_1, str_0)
    var_3 = inventory_data_0.reconcile_inventory()

def test_case_3():
    inventory_data_0 = module_0.InventoryData()
    var_0 = inventory_data_0.reconcile_inventory()

def test_case_4():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'localhost'
    var_0 = inventory_data_0.get_host(str_0)

def test_case_5():
    int_0 = 44
    inventory_data_0 = module_0.InventoryData()
    var_0 = inventory_data_0.remove_group(int_0)

def test_case_6():
    str_0 = '-U'
    inventory_data_0 = module_0.InventoryData()
    var_0 = inventory_data_0.add_host(str_0)

def test_case_7():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'localhost'
    var_0 = inventory_data_0.add_host(str_0)

def test_case_8():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'host1'
    var_0 = inventory_data_0.get_host(str_0)
    bytes_0 = b'5\xb7m\xcf\xaf\x9a\xd4\xd0\x8c\x94\x92\xc2\x08X'
    host_0 = module_1.Host(bytes_0)
    var_1 = inventory_data_0.remove_host(host_0)

def test_case_9():
    inventory_data_0 = module_0.InventoryData()
    inventory_data_1 = module_0.InventoryData()
    var_0 = inventory_data_1.get_groups_dict()

def test_case_10():
    inventory_data_0 = module_0.InventoryData()
    var_0 = inventory_data_0.get_groups_dict()
    var_1 = inventory_data_0.get_groups_dict()
    inventory_data_1 = module_0.InventoryData()
    str_0 = 'sh'
    var_2 = inventory_data_1.add_host(str_0)

def test_case_11():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'test123'
    var_0 = inventory_data_0.add_group(str_0)
    var_1 = inventory_data_0.add_host(str_0, str_0)

def test_case_12():
    inventory_data_0 = module_0.InventoryData()
    str_0 = '`1D'
    str_1 = ']ZFf,'
    var_0 = inventory_data_0.get_host(str_1)
    var_1 = inventory_data_0.add_group(str_0)
    str_2 = 'localhost'
    var_2 = inventory_data_0.add_host(str_2, str_0)
    var_3 = inventory_data_0.reconcile_inventory()
    str_3 = "could not find '%s' key in iterated item '%s'"
    str_4 = 'Pa3Gz(C\x0cOB'
    dict_0 = {str_3: str_2, str_4: inventory_data_0}
    var_4 = inventory_data_0.deserialize(dict_0)

def test_case_13():
    inventory_data_0 = module_0.InventoryData()
    str_0 = '1'
    var_0 = inventory_data_0.add_group(str_0)
    var_1 = inventory_data_0.add_host(str_0, str_0)
    var_2 = inventory_data_0.remove_group(str_0)
    str_1 = '<'
    var_3 = inventory_data_0.reconcile_inventory()
    var_4 = inventory_data_0.add_group(str_1)
    var_5 = inventory_data_0.reconcile_inventory()

def test_case_14():
    str_0 = '-U'
    inventory_data_0 = module_0.InventoryData()
    var_0 = inventory_data_0.add_host(str_0)
    var_1 = inventory_data_0.reconcile_inventory()

def test_case_15():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'test123'
    var_0 = inventory_data_0.add_group(str_0)
    var_1 = inventory_data_0.add_host(str_0, str_0)
    var_2 = inventory_data_0.reconcile_inventory()

def test_case_16():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'test123'
    var_0 = inventory_data_0.add_group(str_0)
    str_1 = 'localhost'
    var_1 = inventory_data_0.add_host(str_1, str_0)
    var_2 = inventory_data_0.get_groups_dict()
    var_3 = inventory_data_0.reconcile_inventory()

def test_case_17():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'localhost'
    var_0 = inventory_data_0.add_host(str_0)
    var_1 = inventory_data_0.reconcile_inventory()
    var_2 = inventory_data_0.reconcile_inventory()

def test_case_18():
    inventory_data_0 = module_0.InventoryData()
    str_0 = '1'
    var_0 = inventory_data_0.get_host(str_0)
    var_1 = inventory_data_0.add_group(str_0)
    var_2 = inventory_data_0.add_host(str_0, str_0)
    var_3 = inventory_data_0.add_host(str_0)
    var_4 = inventory_data_0.reconcile_inventory()
    var_5 = inventory_data_0.reconcile_inventory()

def test_case_19():
    inventory_data_0 = module_0.InventoryData()
    str_0 = '1'
    var_0 = inventory_data_0.get_host(str_0)
    var_1 = inventory_data_0.add_group(str_0)
    str_1 = 'localhost'
    var_2 = inventory_data_0.add_host(str_1, str_0)
    var_3 = inventory_data_0.reconcile_inventory()
    var_4 = inventory_data_0.add_host(str_0)
    var_5 = inventory_data_0.reconcile_inventory()
    var_6 = inventory_data_0.reconcile_inventory()

def test_case_20():
    inventory_data_0 = module_0.InventoryData()
    str_0 = 'localhost'
    var_0 = inventory_data_0.get_host(str_0)
    str_1 = '127.0.0.1'
    var_1 = inventory_data_0.get_host(str_1)