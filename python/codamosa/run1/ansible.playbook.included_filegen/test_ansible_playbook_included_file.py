# Automatically generated by Pynguin.
import ansible.playbook.included_file as module_0

def test_case_0():
    pass

def test_case_1():
    dict_0 = {}
    list_0 = None
    int_0 = -1179
    included_file_0 = module_0.IncludedFile(dict_0, int_0, list_0, int_0)

def test_case_2():
    float_0 = -1620.22
    set_0 = set()
    str_0 = "x\x0cnl,r'P"
    int_0 = -1256
    included_file_0 = module_0.IncludedFile(set_0, str_0, int_0, set_0)
    var_0 = included_file_0.add_host(float_0)

def test_case_3():
    str_0 = 'policy-rc.d'
    list_0 = [str_0, str_0]
    str_1 = 'T6j&8!\tr4~fW[,]'
    int_0 = 797
    included_file_0 = module_0.IncludedFile(list_0, list_0, str_1, int_0)
    var_0 = included_file_0.__repr__()

def test_case_4():
    set_0 = set()
    tuple_0 = ()
    bytes_0 = b'5\xfe^\x8b\xd8\xf6\x03\x999\xdb\x98'
    str_0 = 'z37N'
    dict_0 = {}
    str_1 = 'NbX&[\x0b'
    bool_0 = True
    included_file_0 = module_0.IncludedFile(str_0, dict_0, str_1, bool_0)
    var_0 = included_file_0.process_include_results(set_0, tuple_0, bytes_0, set_0)

def test_case_5():
    str_0 = 'filename1'
    int_0 = 5
    str_1 = 'a'
    str_2 = 'b'
    str_3 = [str_1, str_2]
    var_0 = set(str_3)
    str_4 = 'task1'
    included_file_0 = module_0.IncludedFile(str_0, int_0, var_0, str_4)
    str_5 = 'c'
    str_6 = [str_1, str_2, str_5]
    var_1 = set(str_6)
    str_7 = 'task2'
    included_file_1 = module_0.IncludedFile(str_0, int_0, var_1, str_7)
    var_2 = included_file_0.__eq__(included_file_1)