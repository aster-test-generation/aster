# Automatically generated by Pynguin.
import tornado.concurrent as module_0
import concurrent.futures._base as module_1

def test_case_0():
    pass

def test_case_1():
    float_0 = None
    dict_0 = {float_0: float_0}
    complex_0 = None
    dict_1 = {}
    tuple_0 = (float_0, dict_0, complex_0, dict_1)
    bool_0 = module_0.is_future(tuple_0)

def test_case_2():
    callable_0 = module_0.run_on_executor()
    dummy_executor_0 = module_0.DummyExecutor()
    future_0 = dummy_executor_0.submit(callable_0)

def test_case_3():
    list_0 = []
    dummy_executor_0 = module_0.DummyExecutor(*list_0)
    callable_0 = module_0.run_on_executor()
    future_0 = dummy_executor_0.submit(callable_0)
    dummy_executor_0.shutdown()

def test_case_4():
    callable_0 = module_0.run_on_executor()

def test_case_5():
    future_0 = module_1.Future()
    module_0.future_set_result_unless_cancelled(future_0, future_0)

def test_case_6():
    future_0 = module_1.Future()
    base_exception_0 = None
    module_0.future_set_exception_unless_cancelled(future_0, base_exception_0)

def test_case_7():
    str_0 = '}1q.*[o^UoDS}H'
    str_1 = 'nq_DY)wtAkjVI%gj*/\x0c#'
    dict_0 = {str_0: str_0, str_0: str_0, str_1: str_0, str_0: str_0}
    list_0 = [dict_0]
    callable_0 = module_0.run_on_executor(*list_0)