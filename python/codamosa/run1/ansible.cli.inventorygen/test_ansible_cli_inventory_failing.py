# Automatically generated by Pynguin.
import ansible.cli.inventory as module_0

def test_case_0():
    try:
        str_0 = '"&N\x0bK_.ny\x0b|U(_}'
        list_0 = [str_0]
        inventory_c_l_i_0 = module_0.InventoryCLI(list_0)
        var_0 = inventory_c_l_i_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = True
        int_0 = -369
        inventory_c_l_i_0 = module_0.InventoryCLI(int_0)
        var_0 = inventory_c_l_i_0.dump(bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'1\xdb\x142\xc0\xd9\xa1E\xc8I\x08??\x80HFL\xc0\xe0^'
        inventory_c_l_i_0 = module_0.InventoryCLI(bytes_0)
        var_0 = inventory_c_l_i_0.inventory_graph()
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'\xf7\xb24\x89\xafLJ\xcf\x8f\xe6]) '
        list_0 = [bytes_0, bytes_0]
        set_0 = {bytes_0}
        inventory_c_l_i_0 = module_0.InventoryCLI(set_0)
        bool_0 = True
        inventory_c_l_i_1 = module_0.InventoryCLI(bool_0)
        var_0 = inventory_c_l_i_0.json_inventory(list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = "1_Te=<'G=(=2uA\x0c%(9go"
        dict_0 = {str_0: str_0, str_0: str_0}
        inventory_c_l_i_0 = module_0.InventoryCLI(dict_0)
        bool_0 = True
        var_0 = inventory_c_l_i_0.yaml_inventory(bool_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bytes_0 = b'\xb6\xe4\x10*-\xc0\xde\x9b]'
        list_0 = None
        float_0 = 772.33525
        tuple_0 = (list_0, float_0)
        inventory_c_l_i_0 = module_0.InventoryCLI(tuple_0)
        var_0 = inventory_c_l_i_0.toml_inventory(bytes_0)
    except BaseException:
        pass