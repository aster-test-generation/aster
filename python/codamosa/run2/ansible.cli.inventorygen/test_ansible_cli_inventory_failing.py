# Automatically generated by Pynguin.
import ansible.cli.inventory as module_0

def test_case_0():
    try:
        str_0 = 'n'
        inventory_c_l_i_0 = module_0.InventoryCLI(str_0)
        var_0 = inventory_c_l_i_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = -2301
        set_0 = {int_0, int_0, int_0}
        int_1 = 1707
        inventory_c_l_i_0 = module_0.InventoryCLI(int_1)
        inventory_c_l_i_1 = module_0.InventoryCLI(inventory_c_l_i_0)
        var_0 = inventory_c_l_i_1.dump(set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        set_0 = None
        dict_0 = {set_0: set_0, set_0: set_0, set_0: set_0, set_0: set_0}
        inventory_c_l_i_0 = module_0.InventoryCLI(dict_0)
        int_0 = 2607
        inventory_c_l_i_1 = module_0.InventoryCLI(int_0)
        var_0 = inventory_c_l_i_1.inventory_graph()
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'PLUGINS'
        float_0 = 1796.788868
        inventory_c_l_i_0 = module_0.InventoryCLI(float_0)
        var_0 = inventory_c_l_i_0.json_inventory(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = True
        float_0 = -501.509685
        inventory_c_l_i_0 = module_0.InventoryCLI(float_0)
        inventory_c_l_i_1 = module_0.InventoryCLI(inventory_c_l_i_0)
        var_0 = inventory_c_l_i_1.yaml_inventory(bool_0)
    except BaseException:
        pass

def test_case_5():
    try:
        list_0 = None
        bool_0 = True
        inventory_c_l_i_0 = module_0.InventoryCLI(bool_0)
        inventory_c_l_i_1 = module_0.InventoryCLI(inventory_c_l_i_0)
        inventory_c_l_i_2 = module_0.InventoryCLI(inventory_c_l_i_1)
        var_0 = inventory_c_l_i_2.toml_inventory(list_0)
    except BaseException:
        pass