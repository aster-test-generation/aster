# Automatically generated by Pynguin.
import ansible.executor.stats as module_0

def test_case_0():
    aggregate_stats_0 = module_0.AggregateStats()

def test_case_1():
    float_0 = 512.0
    aggregate_stats_0 = module_0.AggregateStats()
    var_0 = aggregate_stats_0.summarize(float_0)

def test_case_2():
    int_0 = 257
    float_0 = 437.69
    aggregate_stats_0 = module_0.AggregateStats()
    var_0 = aggregate_stats_0.set_custom_stats(int_0, float_0)

def test_case_3():
    aggregate_stats_0 = module_0.AggregateStats()
    aggregate_stats_1 = module_0.AggregateStats()
    aggregate_stats_2 = module_0.AggregateStats()
    aggregate_stats_3 = module_0.AggregateStats()
    int_0 = 2075
    bytes_0 = None
    complex_0 = None
    var_0 = aggregate_stats_3.update_custom_stats(int_0, bytes_0, complex_0)

def test_case_4():
    aggregate_stats_0 = module_0.AggregateStats()
    str_0 = 'host'
    bool_0 = True
    int_0 = 131072
    str_1 = 'xNN/95M VbV\x0b\x0bucD$&?@'
    var_0 = aggregate_stats_0.set_custom_stats(bool_0, int_0, str_1)
    str_2 = 'ok'
    var_1 = aggregate_stats_0.decrement(str_2, str_0)

def test_case_5():
    float_0 = -1052.4
    float_1 = 2405.8
    bool_0 = None
    aggregate_stats_0 = module_0.AggregateStats()
    var_0 = aggregate_stats_0.update_custom_stats(float_0, float_1, bool_0)
    aggregate_stats_1 = module_0.AggregateStats()
    str_0 = 'host'
    str_1 = 'ok'
    var_1 = aggregate_stats_1.decrement(str_1, str_0)
    dict_0 = {}
    int_0 = 1576
    var_2 = aggregate_stats_0.update_custom_stats(int_0, dict_0)

def test_case_6():
    aggregate_stats_0 = module_0.AggregateStats()
    str_0 = 'test.example.com'
    str_1 = 'new facts'
    str_2 = 'some'
    str_3 = 'value'
    str_4 = {str_2: str_3}
    var_0 = aggregate_stats_0.update_custom_stats(str_1, str_4, str_0)
    str_5 = 'other'
    str_6 = {str_5: str_3}
    var_1 = aggregate_stats_0.update_custom_stats(str_1, str_6, str_0)
    str_7 = 'another_value'
    str_8 = {str_5: str_7}
    var_2 = aggregate_stats_0.update_custom_stats(str_1, str_8, str_0)

def test_case_7():
    str_0 = 'Unit test for method decrement of class AggregateStats: '
    var_0 = print(str_0)
    aggregate_stats_0 = module_0.AggregateStats()
    str_1 = 'ok'
    str_2 = 'host1'
    var_1 = aggregate_stats_0.increment(str_1, str_2)
    var_2 = aggregate_stats_0.increment(str_1, str_2)
    var_3 = aggregate_stats_0.decrement(str_1, str_2)
    str_3 = 'Test passed'
    var_4 = print(str_3)

def test_case_8():
    aggregate_stats_0 = module_0.AggregateStats()
    str_0 = 'host'
    str_1 = 'ok'
    var_0 = aggregate_stats_0.decrement(str_1, str_0)
    var_1 = aggregate_stats_0.decrement(str_1, str_0)

def test_case_9():
    aggregate_stats_0 = module_0.AggregateStats()
    str_0 = 'host'
    str_1 = 'ok'
    var_0 = aggregate_stats_0.decrement(str_1, str_0)