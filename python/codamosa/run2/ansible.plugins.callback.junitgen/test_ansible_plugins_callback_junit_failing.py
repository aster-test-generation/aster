# Automatically generated by Pynguin.
import ansible.plugins.callback.junit as module_0

def test_case_0():
    try:
        str_0 = '2SdIMz\x0bP]Cy\t0CMN\\'
        int_0 = 1808
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_task_start(str_0, int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 1590
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_include(int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        callback_module_0 = module_0.CallbackModule()
        callback_module_1 = module_0.CallbackModule()
        var_0 = callback_module_1.v2_playbook_on_start(callback_module_0)
    except BaseException:
        pass

def test_case_3():
    try:
        callback_module_0 = module_0.CallbackModule()
        callback_module_1 = module_0.CallbackModule()
        list_0 = [callback_module_1]
        var_0 = callback_module_1.v2_playbook_on_play_start(list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        callback_module_0 = module_0.CallbackModule()
        callback_module_1 = module_0.CallbackModule()
        str_0 = 'T,GL{<>7\\LVv'
        var_0 = callback_module_1.v2_runner_on_no_hosts(str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bool_0 = True
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_playbook_on_cleanup_task_start(bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        callback_module_0 = module_0.CallbackModule()
        str_0 = 'EB3|e\x0c}<UBi+-"U,'
        var_0 = callback_module_0.v2_playbook_on_handler_task_start(str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        bytes_0 = None
        float_0 = 687.971328
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_failed(bytes_0, float_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'Q&U4  so|'
        tuple_0 = ()
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_failed(str_0, tuple_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bytes_0 = b'\xce\x19\xc6\x92\x18Ea\n'
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_ok(bytes_0)
    except BaseException:
        pass

def test_case_10():
    try:
        int_0 = -2306
        dict_0 = {int_0: int_0, int_0: int_0, int_0: int_0, int_0: int_0}
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_skipped(dict_0)
    except BaseException:
        pass

def test_case_11():
    try:
        bytes_0 = b'\x04\xa7\xc7\xf4_\x90>\xb4l"\x16'
        list_0 = [bytes_0, bytes_0, bytes_0]
        task_data_0 = module_0.TaskData(bytes_0, list_0, bytes_0, list_0, list_0)
        callback_module_0 = module_0.CallbackModule()
        str_0 = 'Failed to perform archive operation'
        var_0 = callback_module_0.v2_runner_on_failed(task_data_0, str_0)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = 'uuid'
        str_1 = 'play'
        str_2 = 'action'
        task_data_0 = module_0.TaskData(str_0, str_2, str_2, str_1, str_2)
        str_3 = 'status'
        host_data_0 = module_0.HostData(str_0, str_0, str_3, str_1)
        var_0 = task_data_0.add_host(host_data_0)
        host_data_1 = module_0.HostData(str_0, str_0, str_3, str_1)
        var_1 = task_data_0.add_host(host_data_1)
    except BaseException:
        pass