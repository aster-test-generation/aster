# Automatically generated by Pynguin.
import ansible.playbook.play as module_0

def test_case_0():
    pass

def test_case_1():
    play_0 = module_0.Play()

def test_case_2():
    play_0 = module_0.Play()
    var_0 = play_0.__repr__()

def test_case_3():
    play_0 = module_0.Play()
    var_0 = play_0.get_name()

def test_case_4():
    play_0 = module_0.Play()
    play_1 = module_0.Play()
    var_0 = play_1.get_handlers()
    dict_0 = {}
    bytes_0 = b'.\x9b\xd9\xbe\xef\x97\x1b\xbd\xc9'
    var_1 = play_1.load(dict_0, bytes_0)

def test_case_5():
    play_0 = module_0.Play()
    var_0 = play_0.compile()

def test_case_6():
    play_0 = module_0.Play()
    var_0 = play_0.compile_roles_handlers()

def test_case_7():
    play_0 = module_0.Play()
    var_0 = play_0.get_vars()
    play_1 = module_0.Play()
    var_1 = play_0.serialize()

def test_case_8():
    play_0 = module_0.Play()
    var_0 = play_0.get_vars_files()

def test_case_9():
    play_0 = module_0.Play()
    var_0 = play_0.__repr__()
    var_1 = play_0.get_handlers()

def test_case_10():
    play_0 = module_0.Play()
    var_0 = play_0.serialize()

def test_case_11():
    play_0 = module_0.Play()
    var_0 = play_0.get_tasks()

def test_case_12():
    str_0 = 'localhost'
    play_0 = module_0.Play()
    var_0 = play_0.get_name()
    play_1 = module_0.Play()
    str_1 = 'name'
    var_1 = setattr(play_1, str_1, str_0)
    var_2 = play_1.get_name()
    play_2 = module_0.Play()
    var_3 = play_2.get_name()
    play_3 = module_0.Play()
    str_2 = 'hosts'
    str_3 = '1.2.3.4'
    str_4 = '5.6.7.8'
    str_5 = [str_3, str_4]
    var_4 = setattr(play_3, str_2, str_5)
    var_5 = play_3.get_name()
    play_4 = module_0.Play()
    str_6 = "localhos'"
    var_6 = setattr(play_4, str_2, str_6)

def test_case_13():
    play_0 = module_0.Play()
    str_0 = 'step'
    str_1 = 'include'
    str_2 = 'name'
    str_3 = 'roles'
    str_4 = 'included_path'
    str_5 = 'action_groups'
    str_6 = 'group_actions'
    int_0 = 15
    var_0 = []
    str_7 = '1'
    str_8 = {str_7: str_7}
    var_1 = {str_0: int_0, str_1: str_4, str_2: str_2, str_4: str_4, str_3: var_0, str_4: str_6, str_5: str_5, str_6: str_8}
    var_2 = play_0.deserialize(var_1)