# Automatically generated by Pynguin.
import ansible.executor.stats as module_0

def test_case_0():
    aggregate_stats_0 = module_0.AggregateStats()

def test_case_1():
    aggregate_stats_0 = module_0.AggregateStats()
    str_0 = 'failures'
    str_1 = 'testhost'
    var_0 = aggregate_stats_0.increment(str_0, str_1)
    var_1 = aggregate_stats_0.decrement(str_0, str_1)

def test_case_2():
    bool_0 = True
    aggregate_stats_0 = module_0.AggregateStats()
    var_0 = aggregate_stats_0.summarize(bool_0)

def test_case_3():
    aggregate_stats_0 = module_0.AggregateStats()
    dict_0 = {aggregate_stats_0: aggregate_stats_0}
    aggregate_stats_1 = module_0.AggregateStats()
    var_0 = aggregate_stats_1.update_custom_stats(aggregate_stats_0, dict_0)

def test_case_4():
    float_0 = 2243.22808
    int_0 = 116
    aggregate_stats_0 = module_0.AggregateStats()
    var_0 = aggregate_stats_0.set_custom_stats(float_0, int_0)
    int_1 = 442
    var_1 = aggregate_stats_0.set_custom_stats(int_1, aggregate_stats_0)
    int_2 = -2243
    bytes_0 = b'\tZT\xfa\x04\xfbb{\xab\x82'
    var_2 = aggregate_stats_0.update_custom_stats(int_2, bytes_0)

def test_case_5():
    aggregate_stats_0 = module_0.AggregateStats()
    aggregate_stats_1 = module_0.AggregateStats()
    int_0 = 434
    var_0 = aggregate_stats_1.set_custom_stats(int_0, aggregate_stats_1)
    str_0 = 'J\x0c7w`.XOU\x0c\r*k\rf3`'
    var_1 = aggregate_stats_1.update_custom_stats(int_0, str_0)

def test_case_6():
    aggregate_stats_0 = module_0.AggregateStats()
    str_0 = 'failures'
    var_0 = aggregate_stats_0.decrement(str_0, str_0)
    var_1 = aggregate_stats_0.decrement(str_0, str_0)

def test_case_7():
    str_0 = 'test_var1'
    str_1 = 'test_var2'
    str_2 = 'test_prop1'
    str_3 = 'test_prop2'
    int_0 = 1
    int_1 = 2
    int_2 = {str_2: int_0, str_3: int_1}
    str_4 = 'test_str1'
    var_0 = {str_0: int_2, str_1: str_4}
    aggregate_stats_0 = module_0.AggregateStats()
    str_5 = '_test'
    var_1 = aggregate_stats_0.update_custom_stats(str_5, var_0)
    var_2 = aggregate_stats_0.update_custom_stats(str_5, var_0)
    var_3 = aggregate_stats_0.custom