# Automatically generated by Pynguin.
import ansible.executor.task_result as module_0
import ansible.parsing.dataloader as module_1

def test_case_0():
    pass

def test_case_1():
    str_0 = "c4.^?>@f1-S#1W'GroMC"
    task_result_0 = module_0.TaskResult(str_0, str_0, str_0)

def test_case_2():
    str_0 = "rhmSAYe>WQ\x0b;'{\x0c4?"
    bool_0 = False
    dict_0 = {str_0: bool_0, str_0: str_0, bool_0: bool_0}
    task_result_0 = module_0.TaskResult(str_0, str_0, dict_0)
    var_0 = task_result_0.is_skipped()

def test_case_3():
    str_0 = 'debugger'
    str_1 = 'on_failed'
    str_2 = {str_0: str_1}
    task_result_0 = module_0.TaskResult(str_0, str_0, str_2, str_2)
    var_0 = task_result_0.needs_debugger()

def test_case_4():
    str_0 = "z|.)'Ui6+!so"
    task_result_0 = module_0.TaskResult(str_0, str_0, str_0)
    var_0 = task_result_0.needs_debugger()

def test_case_5():
    str_0 = 'results'
    bool_0 = {}
    bool_1 = {str_0: bool_0}
    str_1 = 'task'
    task_result_0 = module_0.TaskResult(str_1, str_1, bool_1)
    var_0 = task_result_0.is_skipped()

def test_case_6():
    str_0 = 'debugger'
    str_1 = 'never'
    str_2 = {str_0: str_1, str_1: str_1}
    str_3 = 'test_task'
    task_result_0 = module_0.TaskResult(str_2, str_3, str_2, str_2)
    var_0 = task_result_0.needs_debugger()

def test_case_7():
    str_0 = 'results'
    bool_0 = False
    bool_1 = {str_0: bool_0}
    bool_2 = {str_0: bool_1}
    str_1 = 'task'
    task_result_0 = module_0.TaskResult(str_1, str_1, bool_2)
    var_0 = task_result_0.is_skipped()
    task_result_1 = module_0.TaskResult(str_1, str_1, bool_2)
    var_1 = task_result_1.is_skipped()

def test_case_8():
    str_0 = 'results'
    str_1 = 'skipped'
    bool_0 = True
    bool_1 = {str_1: bool_0}
    bool_2 = {str_1: bool_0}
    bool_3 = [bool_1, bool_2]
    bool_4 = {str_0: bool_3}
    str_2 = 'localhost'
    str_3 = 'task'
    task_result_0 = module_0.TaskResult(str_2, str_3, bool_4)
    var_0 = task_result_0.is_skipped()
    var_1 = bool_4[str_0]
    task_result_1 = module_0.TaskResult(str_2, str_3, bool_4)
    var_2 = task_result_1.is_skipped()
    task_result_2 = module_0.TaskResult(str_2, str_3, bool_4)
    var_3 = task_result_2.is_skipped()

def test_case_9():
    str_0 = 'localhost'
    var_0 = None
    str_1 = 'failed'
    str_2 = 'skipped'
    str_3 = 'results'
    bool_0 = False
    bool_1 = False
    bool_2 = {str_2: bool_1}
    bool_3 = {str_1: bool_0, str_2: bool_0, str_1: bool_0, str_3: bool_2}
    str_4 = 'debugger'
    str_5 = 'ignore_errors'
    str_6 = 'test'
    var_1 = {str_1: str_6, str_4: str_4, str_5: bool_0}
    data_loader_0 = module_1.DataLoader()
    task_result_0 = module_0.TaskResult(str_0, var_0, bool_3, var_1)
    var_2 = task_result_0.is_failed()
    var_3 = task_result_0.is_skipped()
    var_4 = task_result_0.is_changed()

def test_case_10():
    str_0 = 'localhost'
    var_0 = None
    str_1 = 'failed'
    str_2 = 'skipped'
    str_3 = 'unreachable'
    str_4 = 'results'
    bool_0 = False
    bool_1 = False
    bool_2 = {str_2: bool_1}
    bool_3 = [bool_2, bool_2, bool_0]
    bool_4 = {str_1: bool_0, str_2: bool_0, str_3: bool_0, str_4: bool_3}
    str_5 = 'debugger'
    str_6 = 'ignore_errors'
    str_7 = 'test'
    var_1 = {str_1: str_7, str_5: str_5, str_6: bool_0}
    data_loader_0 = module_1.DataLoader()
    task_result_0 = module_0.TaskResult(str_0, var_0, bool_4, var_1)
    var_2 = task_result_0.is_skipped()
    var_3 = task_result_0.is_changed()

def test_case_11():
    str_0 = ''
    str_1 = 'failed'
    bool_0 = False
    bool_1 = {str_1: bool_0}
    task_result_0 = module_0.TaskResult(str_0, str_0, bool_1)
    var_0 = task_result_0.is_failed()
    str_2 = 'Test 1 of TaskResult_is_failed() successful'
    var_1 = print(str_2)

def test_case_12():
    var_0 = None
    var_1 = None
    str_0 = 'failed_when_result'
    bool_0 = True
    bool_1 = {str_0: bool_0}
    var_2 = None
    task_result_0 = module_0.TaskResult(var_0, var_1, bool_1, var_2)
    var_3 = None
    var_4 = None
    var_5 = None
    task_result_1 = module_0.TaskResult(var_3, var_4, bool_1, var_5)
    var_6 = task_result_1.is_failed()
    var_7 = None
    var_8 = None
    str_1 = 'results'
    bool_2 = {str_0: bool_0}
    bool_3 = False
    bool_4 = {str_0: bool_3}
    bool_5 = [bool_2, bool_4]
    bool_6 = {str_1: bool_5}
    var_9 = None
    task_result_2 = module_0.TaskResult(var_7, var_8, bool_6, var_9)
    var_10 = task_result_2.is_failed()

def test_case_13():
    bool_0 = False
    str_0 = 'failed'
    str_1 = 'unreachable'
    bool_1 = {str_0: bool_0, str_1: bool_0}
    str_2 = 'debugger'
    str_3 = 'always'
    str_4 = {str_2: str_3}
    task_result_0 = module_0.TaskResult(bool_0, bool_0, bool_1, str_4)
    var_0 = task_result_0.needs_debugger()
    var_1 = var_0 == bool_1