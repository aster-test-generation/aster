# Automatically generated by Pynguin.
import ansible.plugins.action.set_fact as module_0

def test_case_0():
    try:
        float_0 = 2270.0964
        bool_0 = False
        dict_0 = {float_0: float_0}
        str_0 = 'a'
        int_0 = 1063
        float_1 = -2743.30515
        str_1 = '=90;b,'
        tuple_0 = ()
        action_module_0 = module_0.ActionModule(bool_0, float_1, str_1, tuple_0, tuple_0, str_1)
        action_module_1 = module_0.ActionModule(float_0, bool_0, dict_0, str_0, int_0, action_module_0)
        bool_1 = False
        str_2 = 'remote_tmp'
        action_module_2 = module_0.ActionModule(action_module_1, bool_1, str_2, str_2, float_1, bool_0)
        var_0 = action_module_2.run()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = None
        list_0 = [str_0, str_0, str_0, str_0]
        bool_0 = False
        str_1 = 'chown'
        str_2 = 'vm.stats.vm.v_page_size'
        complex_0 = None
        set_0 = set()
        tuple_0 = (complex_0, set_0)
        int_0 = -1156
        tuple_1 = (str_2, tuple_0, tuple_0, int_0)
        float_0 = -269.8442
        list_1 = []
        bool_1 = False
        action_module_0 = module_0.ActionModule(bool_0, str_1, tuple_1, float_0, list_1, bool_1)
        var_0 = action_module_0.run(list_0, list_0)
    except BaseException:
        pass