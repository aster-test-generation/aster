# Automatically generated by Pynguin.
import ansible.playbook.task as module_0

def test_case_0():
    pass

def test_case_1():
    task_0 = module_0.Task()

def test_case_2():
    task_0 = module_0.Task()
    var_0 = task_0.__repr__()

def test_case_3():
    str_0 = '>c'
    task_0 = module_0.Task()
    task_1 = module_0.Task(str_0, task_0)
    var_0 = task_1.__repr__()

def test_case_4():
    task_0 = module_0.Task()
    var_0 = task_0.get_vars()

def test_case_5():
    task_0 = module_0.Task()
    var_0 = task_0.get_include_params()

def test_case_6():
    task_0 = module_0.Task()
    var_0 = task_0.get_name()
    var_1 = task_0.copy()

def test_case_7():
    task_0 = module_0.Task()
    var_0 = task_0.serialize()

def test_case_8():
    dict_0 = {}
    task_0 = module_0.Task()
    var_0 = task_0.deserialize(dict_0)
    var_1 = task_0.__repr__()
    int_0 = -1420
    var_2 = task_0.all_parents_static()
    var_3 = task_0.set_loader(int_0)

def test_case_9():
    complex_0 = None
    task_0 = module_0.Task(complex_0)
    str_0 = None
    var_0 = task_0.set_loader(str_0)
    var_1 = task_0.copy()

def test_case_10():
    task_0 = module_0.Task()
    var_0 = task_0.get_vars()
    task_1 = module_0.Task()
    var_1 = task_1.get_vars()
    var_2 = task_1.get_vars()
    dict_0 = {task_1: var_2, task_1: var_1}
    str_0 = "rV27@]J\r'|#,<Z^e)"
    task_2 = module_0.Task(task_1, str_0)
    var_3 = task_2.set_loader(dict_0)
    str_1 = 'Cp\x0clU\rzusT.%hxU1_'
    str_2 = 'F#RFHI3\x0ctK&'
    var_4 = task_2.set_loader(str_2)
    var_5 = task_1.set_loader(str_1)
    var_6 = task_1.get_vars()

def test_case_11():
    task_0 = module_0.Task()
    var_0 = task_0.get_vars()
    var_1 = task_0.get_first_parent_include()

def test_case_12():
    task_0 = module_0.Task()
    task_1 = module_0.Task(task_0)
    var_0 = task_1.copy()
    var_1 = task_1.serialize()
    var_2 = task_0.get_first_parent_include()
    var_3 = task_1.get_include_params()
    int_0 = 136
    dict_0 = {task_1: int_0}
    var_4 = task_1.deserialize(dict_0)
    var_5 = task_1.get_first_parent_include()
    task_2 = module_0.Task()
    var_6 = task_1.__repr__()

def test_case_13():
    task_0 = module_0.Task()
    str_0 = 'name'
    var_0 = task_0.get_include_params()
    str_1 = 'action'
    str_2 = 'poll'
    str_3 = 'with_items'
    str_4 = '`\\08'
    str_5 = 'aowaysh_ru'
    str_6 = 'dummy_module'
    int_0 = 10
    int_1 = -16
    var_1 = {str_0: str_4, str_1: str_6, str_5: int_0, str_2: int_1, str_3: str_5}
    var_2 = task_0.preprocess_data(var_1)

def test_case_14():
    task_0 = module_0.Task()
    str_0 = 'nae'
    str_1 = 'action'
    str_2 = 'ansible.builtin.copy'
    str_3 = {str_0: str_0, str_1: str_2}
    var_0 = task_0.preprocess_data(str_3)

def test_case_15():
    task_0 = module_0.Task()
    var_0 = task_0.all_parents_static()
    task_1 = module_0.Task()
    var_1 = task_0.get_first_parent_include()
    var_2 = task_1.serialize()
    str_0 = 'action'
    str_1 = 'task_alias'
    var_3 = task_1.get_name()
    str_2 = 'module'
    str_3 = 'args'
    var_4 = task_1.__repr__()
    var_5 = task_1.get_vars()
    var_6 = task_1.get_first_parent_include()
    int_0 = 5
    var_7 = []
    var_8 = task_1.get_include_params()
    var_9 = {str_0: str_1, str_0: str_1, str_1: int_0, str_2: int_0, str_3: var_7}
    var_10 = task_1.preprocess_data(var_9)
    var_11 = task_0.get_first_parent_include()