# Automatically generated by Pynguin.
import ansible.executor.task_result as module_0

def test_case_0():
    try:
        var_0 = None
        task_result_0 = module_0.TaskResult(var_0, var_0, var_0, var_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'P'
        dict_0 = {str_0: str_0}
        task_result_0 = module_0.TaskResult(dict_0, dict_0, str_0)
        var_0 = task_result_0.clean_copy()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'P'
        dict_0 = {str_0: str_0}
        str_1 = 'getting variables'
        task_result_0 = module_0.TaskResult(dict_0, dict_0, str_1)
        var_0 = task_result_0.is_changed()
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'P'
        dict_0 = {str_0: str_0}
        task_result_0 = module_0.TaskResult(dict_0, dict_0, str_0)
        var_0 = task_result_0.needs_debugger(task_result_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = -1287.9754
        bool_0 = True
        str_0 = '..#RtTY!!6d~?G10PrXG'
        task_result_0 = module_0.TaskResult(float_0, bool_0, str_0)
        var_0 = task_result_0.is_skipped()
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = {}
        str_0 = 'getting variables'
        task_result_0 = module_0.TaskResult(dict_0, dict_0, str_0)
        var_0 = task_result_0.clean_copy()
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'localhost'
        str_1 = 'test'
        str_2 = 'data'
        str_3 = 'debugger'
        str_4 = 'never'
        str_5 = {str_3: str_4}
        bool_0 = True
        task_result_0 = module_0.TaskResult(str_0, str_1, str_2, str_5)
        var_0 = task_result_0.needs_debugger()
        var_1 = task_result_0.needs_debugger(bool_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'failed_when_result'
        bool_0 = False
        bool_1 = {str_0: bool_0}
        task_result_0 = module_0.TaskResult(str_0, bool_0, bool_1)
        var_0 = task_result_0.is_failed()
        var_1 = task_result_0.needs_debugger()
        var_2 = task_result_0.clean_copy()
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'host'
        str_1 = 'failed_when_result'
        bool_0 = False
        str_2 = 'name'
        str_3 = 'ignore_errors'
        str_4 = 'never'
        bool_1 = True
        bool_2 = {str_1: bool_1}
        var_0 = {str_2: str_2, str_3: str_4, str_3: bool_0}
        task_result_0 = module_0.TaskResult(str_0, str_3, bool_2, var_0)
        var_1 = task_result_0.needs_debugger(bool_0)
        var_2 = task_result_0.needs_debugger(bool_1)
        var_3 = {str_2: str_2, str_0: str_4, str_3: bool_0}
        task_result_1 = module_0.TaskResult(str_0, str_2, bool_1, var_3)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'testhost'
        str_1 = 'debugger'
        str_2 = 'on_failed'
        str_3 = {str_1: str_2}
        str_4 = 'failed'
        var_0 = None
        task_result_0 = module_0.TaskResult(str_0, var_0, str_4, str_3)
        var_1 = task_result_0.needs_debugger()
    except BaseException:
        pass

def test_case_10():
    try:
        var_0 = None
        str_0 = 'results'
        str_1 = 'failed_when_result'
        bool_0 = True
        bool_1 = {str_1: bool_0}
        bool_2 = [bool_1]
        bool_3 = {str_0: bool_2}
        task_result_0 = module_0.TaskResult(var_0, var_0, bool_3)
        var_1 = task_result_0.needs_debugger()
        var_2 = task_result_0.needs_debugger(bool_0)
        str_2 = 'debugger'
        str_3 = 'always'
        str_4 = {str_2: str_3}
        task_result_1 = module_0.TaskResult(var_0, var_0, var_0, str_4)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'host'
        str_1 = 'failed_when_result'
        bool_0 = True
        str_2 = 'name'
        str_3 = 'ignore_errors'
        str_4 = 'never'
        bool_1 = True
        bool_2 = {str_1: bool_1}
        var_0 = {str_2: str_4, str_3: str_4, str_3: bool_0}
        task_result_0 = module_0.TaskResult(str_0, str_3, bool_2, var_0)
        var_1 = task_result_0.needs_debugger(bool_0)
        var_2 = task_result_0.needs_debugger(bool_1)
        var_3 = {str_2: str_2, str_0: str_4, str_3: bool_0}
        task_result_1 = module_0.TaskResult(str_0, str_2, bool_1, var_3)
    except BaseException:
        pass

def test_case_12():
    try:
        var_0 = None
        str_0 = 'results'
        str_1 = 'failed_when_result'
        bool_0 = True
        bool_1 = [str_1]
        bool_2 = {str_0: bool_1}
        task_result_0 = module_0.TaskResult(var_0, var_0, bool_2)
        var_1 = task_result_0.needs_debugger()
        var_2 = task_result_0.needs_debugger(bool_0)
        var_3 = task_result_0.clean_copy()
    except BaseException:
        pass

def test_case_13():
    try:
        var_0 = None
        str_0 = 'results'
        bool_0 = True
        bool_1 = [str_0, str_0]
        bool_2 = {str_0: bool_1}
        task_result_0 = module_0.TaskResult(var_0, var_0, bool_2)
        var_1 = task_result_0.needs_debugger()
        var_2 = task_result_0.needs_debugger(bool_0)
        var_3 = task_result_0.clean_copy()
    except BaseException:
        pass