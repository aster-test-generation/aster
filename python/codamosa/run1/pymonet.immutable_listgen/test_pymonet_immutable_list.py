# Automatically generated by Pynguin.
import pymonet.immutable_list as module_0

def test_case_0():
    pass

def test_case_1():
    immutable_list_0 = module_0.ImmutableList()

def test_case_2():
    bool_0 = True
    immutable_list_0 = module_0.ImmutableList(bool_0)
    str_0 = immutable_list_0.__str__()

def test_case_3():
    bytes_0 = None
    list_0 = [bytes_0, bytes_0]
    immutable_list_0 = module_0.ImmutableList()
    optional_0 = immutable_list_0.find(list_0)

def test_case_4():
    int_0 = 1485
    immutable_list_0 = module_0.ImmutableList(int_0)
    immutable_list_1 = module_0.ImmutableList(int_0, immutable_list_0)
    var_0 = immutable_list_1 == immutable_list_0

def test_case_5():
    int_0 = 1
    int_1 = 2
    immutable_list_0 = module_0.ImmutableList(int_1)
    immutable_list_1 = module_0.ImmutableList(int_0, immutable_list_0)
    immutable_list_2 = module_0.ImmutableList(int_1)
    immutable_list_3 = module_0.ImmutableList(int_0, immutable_list_2)
    immutable_list_4 = module_0.ImmutableList(int_0)
    immutable_list_5 = module_0.ImmutableList(int_1)
    immutable_list_6 = module_0.ImmutableList(int_0, immutable_list_5)
    immutable_list_7 = module_0.ImmutableList(int_0)
    immutable_list_8 = module_0.ImmutableList(int_1, immutable_list_7)
    var_0 = immutable_list_6 == immutable_list_8

def test_case_6():
    int_0 = 1485
    int_1 = 2
    immutable_list_0 = module_0.ImmutableList(int_1)
    immutable_list_1 = module_0.ImmutableList(int_0, immutable_list_0)
    immutable_list_2 = module_0.ImmutableList(int_0)
    immutable_list_3 = module_0.ImmutableList(int_0, immutable_list_0)
    immutable_list_4 = module_0.ImmutableList(int_0)
    var_0 = immutable_list_3 == immutable_list_1