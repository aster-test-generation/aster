# Automatically generated by Pynguin.
import ansible.playbook.play_context as module_0

def test_case_0():
    try:
        int_0 = 186
        play_context_0 = module_0.PlayContext(int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        play_context_0 = module_0.PlayContext()
        int_0 = -896
        var_0 = play_context_0.set_become_plugin(int_0)
        var_1 = play_context_0.set_attributes_from_cli()
        var_2 = play_context_0.set_attributes_from_plugin(int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        set_0 = {bool_0, bool_0}
        bool_1 = None
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_task_and_variable_override(bool_0, set_0, bool_1)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '0w'
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_become_plugin(str_0)
        bool_0 = False
        var_1 = play_context_0.update_vars(bool_0)
    except BaseException:
        pass

def test_case_4():
    try:
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.update_vars(play_context_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'b&[zq`Lm\t$k'
        dict_0 = {}
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_attributes_from_play(play_context_0)
        var_1 = play_context_0.update_vars(dict_0)
        list_0 = [var_0, dict_0]
        var_2 = play_context_0.set_task_and_variable_override(list_0, str_0, str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        play_context_0 = module_0.PlayContext()
        str_0 = 'MhTL=X(b:"2'
        set_0 = {str_0, str_0}
        var_0 = play_context_0.update_vars(set_0)
    except BaseException:
        pass

def test_case_7():
    try:
        int_0 = None
        str_0 = "Unexpected failure in finding the lookup named '%s' in the available lookup plugins"
        tuple_0 = (str_0,)
        play_context_0 = module_0.PlayContext(int_0, tuple_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'b&[zq`Lm\t$k'
        dict_0 = {str_0: str_0}
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_attributes_from_play(play_context_0)
        var_1 = play_context_0.update_vars(dict_0)
        play_context_1 = module_0.PlayContext()
        list_0 = [play_context_1]
        play_context_2 = module_0.PlayContext()
        var_2 = play_context_0.set_attributes_from_cli()
        play_context_3 = module_0.PlayContext()
        int_0 = -1940
        var_3 = play_context_2.set_task_and_variable_override(play_context_0, list_0, int_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'b&[zq`Lm\t$k'
        dict_0 = {str_0: str_0}
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_attributes_from_play(play_context_0)
        play_context_1 = module_0.PlayContext()
        var_1 = play_context_0.update_vars(dict_0)
        play_context_2 = module_0.PlayContext()
        var_2 = play_context_2.update_vars(dict_0)
        play_context_3 = module_0.PlayContext()
        var_3 = play_context_3.set_attributes_from_cli()
        play_context_4 = module_0.PlayContext(play_context_2)
        str_1 = 't%XlR\tyTF!C'
        play_context_5 = module_0.PlayContext(play_context_2)
        var_4 = play_context_5.update_vars(str_1)
    except BaseException:
        pass