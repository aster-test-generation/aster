# Automatically generated by Pynguin.
import tornado.concurrent as module_0
import concurrent.futures._base as module_1

def test_case_0():
    try:
        set_0 = set()
        bool_0 = module_0.is_future(set_0)
        dummy_executor_0 = module_0.DummyExecutor()
        callable_0 = None
        future_0 = dummy_executor_0.submit(callable_0)
        dict_0 = {}
        module_0.future_set_result_unless_cancelled(future_0, dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        dummy_executor_0 = module_0.DummyExecutor()
        future_0 = None
        str_0 = 'U'
        future_1 = dummy_executor_0.submit(str_0)
        dummy_executor_0.shutdown()
        module_0.chain_future(future_0, future_0)
    except BaseException:
        pass

def test_case_2():
    try:
        dummy_executor_0 = module_0.DummyExecutor()
        list_0 = [dummy_executor_0, dummy_executor_0, dummy_executor_0]
        list_1 = [list_0, dummy_executor_0]
        callable_0 = module_0.run_on_executor(*list_1)
    except BaseException:
        pass

def test_case_3():
    try:
        dummy_executor_0 = module_0.DummyExecutor()
        future_0 = None
        callable_0 = module_0.run_on_executor()
        future_1 = dummy_executor_0.submit(future_0)
        module_0.chain_future(future_0, future_0)
    except BaseException:
        pass

def test_case_4():
    try:
        future_0 = None
        module_0.chain_future(future_0, future_0)
    except BaseException:
        pass

def test_case_5():
    try:
        future_0 = None
        future_1 = module_1.Future()
        str_0 = 'g+ST s&cf%/AQ:c'
        callable_0 = None
        module_0.future_add_done_callback(future_1, callable_0)
        dict_0 = {str_0: future_1}
        dummy_executor_0 = module_0.DummyExecutor()
        future_2 = dummy_executor_0.submit(future_1, **dict_0)
        future_3 = dummy_executor_0.submit(dummy_executor_0, **dict_0)
        dummy_executor_1 = module_0.DummyExecutor()
        dummy_executor_0.shutdown()
        module_0.chain_future(future_0, future_0)
    except BaseException:
        pass

def test_case_6():
    try:
        int_0 = 526
        dummy_executor_0 = module_0.DummyExecutor()
        future_0 = dummy_executor_0.submit(int_0)
        callable_0 = None
        module_0.future_add_done_callback(future_0, callable_0)
    except BaseException:
        pass

def test_case_7():
    try:
        callable_0 = module_0.run_on_executor()
        list_0 = []
        callable_1 = module_0.run_on_executor(*list_0)
        bool_0 = module_0.is_future(callable_0)
        dummy_executor_0 = module_0.DummyExecutor()
        dummy_executor_1 = module_0.DummyExecutor()
        return_value_ignored_error_0 = module_0.ReturnValueIgnoredError()
        return_value_ignored_error_1 = module_0.ReturnValueIgnoredError()
        future_0 = None
        type_0 = None
        int_0 = None
        int_1 = 2358
        tuple_0 = (type_0, int_0, int_1)
        module_0.future_set_exc_info(future_0, tuple_0)
    except BaseException:
        pass

def test_case_8():
    try:
        future_0 = module_1.Future()
        float_0 = -4478.9479
        dict_0 = None
        module_0.future_set_result_unless_cancelled(future_0, dict_0)
        list_0 = [float_0, float_0]
        callable_0 = module_0.run_on_executor()
        dummy_executor_0 = module_0.DummyExecutor()
        future_1 = dummy_executor_0.submit(callable_0)
        str_0 = None
        str_1 = 'log_rotate_mode'
        str_2 = ">*GLQ_X|Pp='"
        dict_1 = {str_1: list_0, str_2: str_0}
        callable_1 = module_0.run_on_executor(*list_0, **dict_1)
    except BaseException:
        pass

def test_case_9():
    try:
        dummy_executor_0 = module_0.DummyExecutor()
        future_0 = None
        str_0 = 'U'
        list_0 = [str_0]
        callable_0 = module_0.run_on_executor(*list_0)
        future_1 = dummy_executor_0.submit(callable_0, *list_0)
        module_0.chain_future(future_0, future_0)
    except BaseException:
        pass