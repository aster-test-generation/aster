# Automatically generated by Pynguin.
import ansible.plugins.inventory.auto as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '/usr/share/ansible/inventory_plugins/auto_inv.yml'
    inventory_module_0 = module_0.InventoryModule()
    var_0 = inventory_module_0.verify_file(str_0)
    str_1 = '/usr/share/ansible/inventory_plugins/auto_inv.yaml'
    inventory_module_1 = module_0.InventoryModule()
    var_1 = inventory_module_1.verify_file(str_1)
    str_2 = '/usr/share/ansible/inventory_plugins/auto_inv.txt'
    inventory_module_2 = module_0.InventoryModule()
    var_2 = inventory_module_2.verify_file(str_2)

def test_case_2():
    str_0 = 'D:\\code\\ansible\\inventory\\aws_ec2.yml'
    inventory_module_0 = module_0.InventoryModule()
    var_0 = inventory_module_0.verify_file(str_0)

def test_case_3():
    str_0 = '/usr/share/ansible/inventory_plugins/auto_inv.yml'
    inventory_module_0 = module_0.InventoryModule()
    var_0 = inventory_module_0.verify_file(str_0)
    str_1 = '/usr/share/ansible/inventory_plugins/auto_inv.yaml'
    inventory_module_1 = module_0.InventoryModule()
    var_1 = inventory_module_1.verify_file(str_1)
    var_2 = inventory_module_1.verify_file(str_1)
    inventory_module_2 = module_0.InventoryModule()