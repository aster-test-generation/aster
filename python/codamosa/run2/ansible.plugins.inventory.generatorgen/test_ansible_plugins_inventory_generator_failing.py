# Automatically generated by Pynguin.
import ansible.plugins.inventory.generator as module_0

def test_case_0():
    try:
        set_0 = None
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.verify_file(set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        inventory_module_0 = module_0.InventoryModule()
        str_0 = '`5:jq1+'
        inventory_module_1 = module_0.InventoryModule()
        var_0 = inventory_module_1.template(inventory_module_0, str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        inventory_module_0 = module_0.InventoryModule()
        bool_0 = False
        str_0 = 'Depsolve Error occurred attempting to install environment: {0}'
        float_0 = None
        var_0 = inventory_module_0.add_parents(inventory_module_0, bool_0, str_0, float_0)
    except BaseException:
        pass

def test_case_3():
    try:
        tuple_0 = None
        set_0 = {tuple_0}
        str_0 = 'd/Ed*[L|vk/TC?aU1'
        list_0 = [set_0]
        inventory_module_0 = module_0.InventoryModule()
        var_0 = inventory_module_0.parse(set_0, str_0, set_0, list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 1.0
        tuple_0 = ()
        str_0 = '46=T*#uj\rP~'
        inventory_module_0 = module_0.InventoryModule()
        inventory_module_1 = module_0.InventoryModule()
        var_0 = inventory_module_1.parse(float_0, tuple_0, str_0, inventory_module_0)
    except BaseException:
        pass

def test_case_5():
    try:
        inventory_module_0 = module_0.InventoryModule()
        bytes_0 = b's\x8e\xbb\xa2o\r\x03K{\xa9<z\x12oC'
        tuple_0 = ()
        var_0 = inventory_module_0.add_parents(inventory_module_0, bytes_0, tuple_0, tuple_0)
        bool_0 = False
        dict_0 = {tuple_0: inventory_module_0, tuple_0: var_0, tuple_0: var_0}
        var_1 = inventory_module_0.add_parents(bool_0, bool_0, dict_0, bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'standard_host_group'
        str_1 = 'test_host_group1'
        str_2 = 'test_child_group'
        str_3 = 'test_var'
        str_4 = 'test_value'
        str_5 = {str_3: str_4}
        str_6 = 'name'
        str_7 = 'new_test_value'
        str_8 = {str_6: str_0, str_7: str_2}
        int_0 = 0
        var_0 = str_1[int_0]
        var_1 = {str_6: var_0}
        var_2 = [str_8, var_1]
        inventory_module_0 = module_0.InventoryModule()
        var_3 = inventory_module_0.add_parents(str_0, str_2, var_2, str_5)
    except BaseException:
        pass