# Automatically generated by Pynguin.
import ansible.executor.stats as module_0

def test_case_0():
    try:
        str_0 = '=NB-qyX!d>?SrHCQ_QVF'
        list_0 = [str_0, str_0, str_0, str_0]
        aggregate_stats_0 = module_0.AggregateStats()
        tuple_0 = (str_0,)
        str_1 = 'failed_modules'
        var_0 = aggregate_stats_0.set_custom_stats(str_1, aggregate_stats_0)
        var_1 = aggregate_stats_0.update_custom_stats(tuple_0, aggregate_stats_0)
        var_2 = aggregate_stats_0.summarize(list_0)
    except BaseException:
        pass

def test_case_1():
    try:
        aggregate_stats_0 = module_0.AggregateStats()
        str_0 = 'TEST'
        str_1 = 'custom'
        str_2 = 'test'
        var_0 = aggregate_stats_0.set_custom_stats(str_0, str_1, str_2)
        var_1 = aggregate_stats_0.decrement(str_1, str_2)
    except BaseException:
        pass