# Automatically generated by Pynguin.
import ansible.plugins.callback.default as module_0

def test_case_0():
    try:
        bool_0 = False
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.set_options(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        dict_0 = {}
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_failed(dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_ok(bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_no_hosts_matched()
        tuple_0 = ()
        var_1 = callback_module_0.v2_runner_on_skipped(tuple_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'\xaa\xec\xa5\xe9Ss\xcf\x83\x9d\xf2#n:\xac\x8d\xbf'
        list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
        list_1 = [list_0]
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_no_hosts_matched()
        callback_module_1 = module_0.CallbackModule()
        var_1 = callback_module_1.v2_runner_on_unreachable(list_1)
    except BaseException:
        pass

def test_case_5():
    try:
        int_0 = 2892
        int_1 = None
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_no_hosts_matched()
        callback_module_1 = module_0.CallbackModule()
        var_1 = callback_module_1.v2_playbook_on_notify(int_0, int_1)
        callback_module_2 = module_0.CallbackModule()
        complex_0 = None
        var_2 = callback_module_2.v2_playbook_on_cleanup_task_start(complex_0)
    except BaseException:
        pass

def test_case_6():
    try:
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_no_hosts_remaining()
        callback_module_1 = module_0.CallbackModule()
        var_1 = callback_module_1.v2_playbook_on_start(callback_module_1)
    except BaseException:
        pass

def test_case_7():
    try:
        bool_0 = False
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_task_start(callback_module_0, bool_0)
    except BaseException:
        pass

def test_case_8():
    try:
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_handler_task_start(callback_module_0)
    except BaseException:
        pass

def test_case_9():
    try:
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_cleanup_task_start(callback_module_0)
    except BaseException:
        pass

def test_case_10():
    try:
        callback_module_0 = module_0.CallbackModule()
        callback_module_1 = module_0.CallbackModule()
        bytes_0 = b'\xc2\xec\xe4\xff\xef<\xf3?\xf0\xb8'
        bool_0 = False
        var_0 = callback_module_1.v2_runner_on_start(bytes_0, bool_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'W.]\rN4H%,KE'
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_play_start(str_0)
    except BaseException:
        pass

def test_case_12():
    try:
        callback_module_0 = module_0.CallbackModule()
        bool_0 = False
        var_0 = callback_module_0.v2_on_file_diff(bool_0)
    except BaseException:
        pass

def test_case_13():
    try:
        callback_module_0 = module_0.CallbackModule()
        callback_module_1 = module_0.CallbackModule()
        str_0 = 'S{1{>'
        var_0 = callback_module_1.v2_runner_item_on_ok(str_0)
    except BaseException:
        pass

def test_case_14():
    try:
        callback_module_0 = module_0.CallbackModule()
        set_0 = {callback_module_0, callback_module_0, callback_module_0}
        callback_module_1 = module_0.CallbackModule()
        var_0 = callback_module_1.v2_runner_item_on_failed(set_0)
    except BaseException:
        pass

def test_case_15():
    try:
        str_0 = '\rBSR\txMG+yL'
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_item_on_skipped(str_0)
    except BaseException:
        pass

def test_case_16():
    try:
        callback_module_0 = module_0.CallbackModule()
        list_0 = []
        var_0 = callback_module_0.v2_playbook_on_include(list_0)
    except BaseException:
        pass

def test_case_17():
    try:
        callback_module_0 = module_0.CallbackModule()
        str_0 = '"include" is deprecated, use include_tasks/import_tasks instead'
        callback_module_1 = module_0.CallbackModule()
        var_0 = callback_module_1.v2_playbook_on_stats(str_0)
    except BaseException:
        pass

def test_case_18():
    try:
        complex_0 = None
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_retry(complex_0)
    except BaseException:
        pass

def test_case_19():
    try:
        callback_module_0 = module_0.CallbackModule()
        bool_0 = False
        int_0 = 5310
        tuple_0 = (bool_0, int_0, callback_module_0)
        var_0 = callback_module_0.v2_runner_on_async_poll(tuple_0)
    except BaseException:
        pass

def test_case_20():
    try:
        str_0 = 'C! #nR[\\'
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_async_ok(str_0)
    except BaseException:
        pass

def test_case_21():
    try:
        str_0 = None
        callback_module_0 = module_0.CallbackModule()
        dict_0 = {callback_module_0: str_0}
        var_0 = callback_module_0.v2_runner_on_async_failed(dict_0)
    except BaseException:
        pass

def test_case_22():
    try:
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_start(callback_module_0)
    except BaseException:
        pass