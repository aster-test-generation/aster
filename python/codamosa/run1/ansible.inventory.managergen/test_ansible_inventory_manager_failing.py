# Automatically generated by Pynguin.
import ansible.inventory.manager as module_0

def test_case_0():
    try:
        bool_0 = False
        tuple_0 = ()
        var_0 = module_0.order_patterns(tuple_0)
        str_0 = "/tmp/tmpio0r800i/aster-py-cli/'\x0c-"
        int_0 = -3755
        str_1 = "If you need to use '{cmd}' because the {mod} module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        inventory_manager_0 = module_0.InventoryManager(int_0, str_1)
        var_1 = inventory_manager_0.get_host(str_0)
        bool_1 = False
        inventory_manager_1 = module_0.InventoryManager(bool_1)
        var_2 = module_0.split_host_pattern(bool_0)
        bool_2 = True
        var_3 = inventory_manager_1.add_group(bool_2)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 0.2
        bool_0 = True
        set_0 = set()
        inventory_manager_0 = module_0.InventoryManager(float_0, bool_0, set_0)
        var_0 = inventory_manager_0.parse_sources()
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        str_0 = "/tm/tmpio0r800i/aster-py-li/'\x0c-"
        int_0 = -3755
        str_1 = "If you need to use '{cmd}' because the {mod} module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        inventory_manager_0 = module_0.InventoryManager(int_0, str_1)
        var_0 = inventory_manager_0.get_host(str_0)
        var_1 = module_0.split_host_pattern(bool_0)
        bool_1 = True
        var_2 = inventory_manager_0.add_group(bool_1)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'V#48jnK'
        int_0 = 1213
        str_1 = 'F'
        inventory_manager_0 = module_0.InventoryManager(int_0, str_1)
        var_0 = inventory_manager_0.get_groups_dict()
        dict_0 = {str_0: str_0}
        inventory_manager_1 = module_0.InventoryManager(str_0, dict_0)
        set_0 = {inventory_manager_1, str_1, inventory_manager_1, inventory_manager_1}
        inventory_manager_2 = module_0.InventoryManager(set_0)
        float_0 = 0.2
        var_1 = inventory_manager_1.add_host(inventory_manager_2, float_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'LTnU=bl'
        set_0 = {str_0, str_0, str_0, str_0}
        inventory_manager_0 = None
        set_1 = {inventory_manager_0, inventory_manager_0}
        list_0 = [set_1, set_1, inventory_manager_0]
        inventory_manager_1 = module_0.InventoryManager(list_0)
        var_0 = inventory_manager_1.get_host(set_0)
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = 3693.1
        bytes_0 = b'\x17\x1c\x9d\x06K\x86b\tJ'
        str_0 = '!-J>F"Z,V:l\tN'
        inventory_manager_0 = module_0.InventoryManager(bytes_0, str_0)
        list_0 = [inventory_manager_0]
        tuple_0 = (float_0, float_0, inventory_manager_0, list_0)
        var_0 = module_0.order_patterns(tuple_0)
    except BaseException:
        pass

def test_case_6():
    try:
        float_0 = 249.3536
        bytes_0 = b'\xde\xd6\x92\x94\x9b\xf4\xe4\xd4\xba"3\x927\x1f\xfcD\xf4\xf7\xba'
        inventory_manager_0 = module_0.InventoryManager(bytes_0)
        var_0 = inventory_manager_0.subset(float_0)
        int_0 = -409
        inventory_manager_1 = module_0.InventoryManager(int_0)
        var_1 = inventory_manager_1.refresh_inventory()
        str_0 = '8+'
        var_2 = inventory_manager_1.restrict_to_hosts(str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = ''
        set_0 = {str_0, str_0, str_0}
        tuple_0 = ()
        inventory_manager_0 = module_0.InventoryManager(tuple_0)
        str_1 = ',UJ'
        inventory_manager_1 = module_0.InventoryManager(str_1)
        var_0 = inventory_manager_1.subset(set_0)
        str_2 = 'KN\\=\x0bk\x0c&}\tMQ\x0bK;Q@'
        var_1 = inventory_manager_1.list_groups()
        var_2 = inventory_manager_1.remove_restriction()
        float_0 = 1236.2742
        var_3 = inventory_manager_1.add_group(str_1)
        inventory_manager_2 = module_0.InventoryManager(str_2, float_0)
    except BaseException:
        pass

def test_case_8():
    try:
        bool_0 = None
        int_0 = -227
        var_0 = module_0.split_host_pattern(bool_0)
        inventory_manager_0 = module_0.InventoryManager(int_0)
        str_0 = None
        var_1 = inventory_manager_0.subset(str_0)
        list_0 = []
        float_0 = 712.35
        tuple_0 = None
        var_2 = inventory_manager_0.get_host(tuple_0)
        var_3 = inventory_manager_0.add_host(list_0, float_0)
    except BaseException:
        pass

def test_case_9():
    try:
        float_0 = 3693.1
        bytes_0 = b'\x17\x1c\x9d\x06K\x86b\tJ'
        str_0 = '!-J>F"Z,V:l\tN'
        inventory_manager_0 = module_0.InventoryManager(bytes_0, str_0)
        var_0 = inventory_manager_0.remove_restriction()
        list_0 = [inventory_manager_0]
        tuple_0 = (float_0, float_0, inventory_manager_0, list_0)
        var_1 = module_0.order_patterns(tuple_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'Dw4[$Z'
        bytes_0 = None
        bytes_1 = b'\x00Q\x100\x18\xe5\x9dT"c\xa1?\xfc\x08\xb3\x1197\xcd\xdf'
        inventory_manager_0 = module_0.InventoryManager(bytes_1)
        list_0 = [str_0, str_0]
        inventory_manager_1 = None
        tuple_0 = (str_0, bytes_0, list_0, inventory_manager_1)
        dict_0 = {inventory_manager_1: str_0}
        inventory_manager_2 = module_0.InventoryManager(tuple_0, dict_0)
        var_0 = inventory_manager_2.clear_pattern_cache()
        str_1 = "n;b'OK597$|#e=J9.W"
        int_0 = 200000
        str_2 = 'Ro[MUF7=|'
        dict_1 = {int_0: str_2, int_0: str_1}
        tuple_1 = (str_2, str_2, dict_1)
        set_0 = None
        float_0 = 0.0001
        var_1 = inventory_manager_0.get_hosts(set_0, float_0)
        var_2 = module_0.order_patterns(tuple_1)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'j<jKQ)L\t&}0?'
        float_0 = 1682.93
        inventory_manager_0 = module_0.InventoryManager(float_0)
        var_0 = module_0.order_patterns(str_0)
        int_0 = -2509
        var_1 = inventory_manager_0.get_host(int_0)
        var_2 = inventory_manager_0.parse_source(str_0)
        int_1 = -2957
        var_3 = inventory_manager_0.add_group(int_1)
    except BaseException:
        pass

def test_case_12():
    try:
        float_0 = 249.3536
        bytes_0 = b'\xde\xd6\x92\x94\x9b\xf4\xe4\xd4\xba"3\x927\x1f\xfcD\xf4\xf7\xba@'
        inventory_manager_0 = module_0.InventoryManager(bytes_0)
        var_0 = inventory_manager_0.subset(float_0)
        int_0 = -409
        inventory_manager_1 = module_0.InventoryManager(int_0)
        var_1 = inventory_manager_1.refresh_inventory()
        int_1 = -1864
        list_0 = [int_1, int_1, int_1]
        bytes_1 = b':\xb3\x88\xd75\xbcrlh\xe9%\\f1L'
        str_0 = None
        var_2 = inventory_manager_1.restrict_to_hosts(str_0)
        inventory_manager_2 = module_0.InventoryManager(list_0, bytes_1)
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = 'l[]mU* :k$^GFI'
        tuple_0 = ()
        inventory_manager_0 = module_0.InventoryManager(tuple_0)
        var_0 = inventory_manager_0.remove_restriction()
        list_0 = [str_0, str_0]
        var_1 = inventory_manager_0.restrict_to_hosts(list_0)
    except BaseException:
        pass