# Automatically generated by Pynguin.
import tornado.queues as module_0

def test_case_0():
    pass

def test_case_1():
    queue_0 = module_0.Queue()

def test_case_2():
    queue_0 = module_0.Queue()
    bool_0 = queue_0.full()

def test_case_3():
    queue_0 = module_0.Queue()
    var_0 = None
    queue_0.put_nowait(var_0)
    str_0 = queue_0.__repr__()
    queue_0.task_done()
    int_0 = queue_0.qsize()
    queue_1 = module_0.Queue()
    bool_0 = queue_1.empty()
    str_1 = queue_1.__repr__()

def test_case_4():
    queue_0 = module_0.Queue()
    str_0 = queue_0.__repr__()

def test_case_5():
    queue_0 = module_0.Queue()
    str_0 = queue_0.__str__()

def test_case_6():
    priority_queue_0 = module_0.PriorityQueue()

def test_case_7():
    lifo_queue_0 = module_0.LifoQueue()

def test_case_8():
    queue_0 = module_0.Queue()
    int_0 = 0
    queue_0.put_nowait(int_0)

def test_case_9():
    queue_0 = module_0.Queue()
    int_0 = 0
    queue_0.put_nowait(int_0)
    var_0 = queue_0.get_nowait()

def test_case_10():
    int_0 = 1
    queue_0 = module_0.Queue(int_0)
    queue_0.put_nowait(int_0)
    var_0 = queue_0.put_nowait