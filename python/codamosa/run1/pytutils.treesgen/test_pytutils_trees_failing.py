# Automatically generated by Pynguin.
import pytutils.trees as module_0

def test_case_0():
    try:
        str_0 = 'players:player4:tag'
        str_1 = 'fourth player'
        var_0 = module_0.get_tree_node(str_1, str_0, str_1)
    except BaseException:
        pass

def test_case_1():
    try:
        tree_0 = module_0.Tree()
        var_0 = tree_0.__getitem__(tree_0)
    except BaseException:
        pass

def test_case_2():
    try:
        tree_0 = module_0.Tree()
        var_0 = tree_0.__setitem__(tree_0, tree_0)
    except BaseException:
        pass

def test_case_3():
    try:
        var_0 = module_0.tree()
        bool_0 = False
        str_0 = 'D8S0'
        int_0 = 1659
        registry_tree_0 = module_0.RegistryTree(bool_0, str_0, int_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = ']<Eu&% Vj.M-Z'
        registry_tree_0 = module_0.RegistryTree(str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        tree_0 = module_0.Tree()
        tuple_0 = None
        str_0 = 'v=cIP:$Vrxjw'
        bytes_0 = b'\xf0\x96\xd6\xa0\x11\xa2'
        var_0 = tree_0.__setitem__(tuple_0, str_0, bytes_0)
    except BaseException:
        pass

def test_case_6():
    try:
        tree_0 = module_0.Tree()
        str_0 = '&'
        bool_0 = True
        var_0 = module_0.get_tree_node(tree_0, str_0, tree_0, bool_0)
    except BaseException:
        pass