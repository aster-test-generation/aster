# Automatically generated by Pynguin.
import tornado.locks as module_0

def test_case_0():
    pass

def test_case_1():
    lock_0 = module_0.Lock()

def test_case_2():
    event_0 = module_0.Event()

def test_case_3():
    event_0 = module_0.Event()
    str_0 = event_0.__repr__()
    event_1 = module_0.Event()
    event_1.set()

def test_case_4():
    event_0 = module_0.Event()
    event_0.set()

def test_case_5():
    lock_0 = module_0.Lock()
    str_0 = lock_0.__repr__()

def test_case_6():
    semaphore_0 = module_0.Semaphore()
    semaphore_0.release()

def test_case_7():
    event_0 = module_0.Event()
    event_0.set()
    event_0.set()
    str_0 = event_0.__repr__()
    event_1 = module_0.Event()
    event_1.set()