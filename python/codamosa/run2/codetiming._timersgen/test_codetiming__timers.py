# Automatically generated by Pynguin.
import codetiming._timers as module_0

def test_case_0():
    timers_0 = module_0.Timers()

def test_case_1():
    timers_0 = module_0.Timers()
    str_0 = 'test'
    int_0 = 1
    timers_0.add(str_0, int_0)
    float_0 = timers_0.min(str_0)

def test_case_2():
    timers_0 = module_0.Timers()
    str_0 = 'test1'
    float_0 = 0.5
    timers_0.add(str_0, float_0)
    float_1 = timers_0.mean(str_0)

def test_case_3():
    str_0 = 'Unit test of median method of Timers class'
    timers_0 = module_0.Timers()
    int_0 = 10
    timers_0.add(str_0, int_0)
    timers_0.add(str_0, int_0)
    float_0 = timers_0.median(str_0)

def test_case_4():
    timers_0 = module_0.Timers()
    str_0 = 'tst1'
    float_0 = 2.5
    timers_0.add(str_0, float_0)
    float_1 = timers_0.max(str_0)