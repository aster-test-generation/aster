# Automatically generated by Pynguin.
import ansible.module_utils.facts.collector as module_0
import collections as module_1

def test_case_0():
    pass

def test_case_1():
    base_fact_collector_0 = module_0.BaseFactCollector()

def test_case_2():
    int_0 = None
    list_0 = [int_0, int_0]
    base_fact_collector_0 = module_0.BaseFactCollector()
    base_fact_collector_1 = module_0.BaseFactCollector(list_0, base_fact_collector_0)
    var_0 = base_fact_collector_1.collect_with_namespace()

def test_case_3():
    var_0 = module_0.collector_classes_from_gather_subset()

def test_case_4():
    var_0 = module_0.collector_classes_from_gather_subset()
    base_fact_collector_0 = module_0.BaseFactCollector()
    list_0 = [base_fact_collector_0, base_fact_collector_0]
    var_1 = module_0.build_fact_id_to_collector_map(list_0)

def test_case_5():
    cycle_found_in_fact_deps_0 = None
    unresolved_fact_dep_0 = None
    str_0 = 'y[b'
    var_0 = module_0.collector_classes_from_gather_subset(cycle_found_in_fact_deps_0, unresolved_fact_dep_0, str_0)

def test_case_6():
    collector_not_found_error_0 = module_0.CollectorNotFoundError()
    list_0 = []
    cycle_found_in_fact_deps_0 = module_0.CycleFoundInFactDeps()
    var_0 = module_0.resolve_requires(list_0, cycle_found_in_fact_deps_0)

def test_case_7():
    str_0 = 'ZJGBgA.6._O&*lwI@hq2'
    bool_0 = False
    var_0 = module_0.get_collector_names(str_0, bool_0)
    unresolved_fact_dep_0 = module_0.UnresolvedFactDep()
    collector_not_found_error_0 = module_0.CollectorNotFoundError()

def test_case_8():
    str_0 = '5!K^hB1`\t\x0cVk&C'
    base_fact_collector_0 = module_0.BaseFactCollector()
    dict_0 = {base_fact_collector_0: str_0}
    var_0 = module_0.collector_classes_from_gather_subset(dict_0, dict_0)
    base_fact_collector_1 = module_0.BaseFactCollector()

def test_case_9():
    str_0 = 'Example'
    str_1 = None
    dict_0 = {str_0: str_1}
    base_fact_collector_0 = module_0.BaseFactCollector(dict_0)
    var_0 = base_fact_collector_0.collect()
    str_2 = 'Example'
    str_3 = 'Generic'
    dict_1 = {str_3: str_2}
    var_1 = module_0.tsort(dict_1)

def test_case_10():
    list_0 = []
    collector_not_found_error_0 = module_0.CollectorNotFoundError(*list_0)
    var_0 = module_0.collector_classes_from_gather_subset()
    str_0 = ']'
    str_1 = "t2 JZ'BKTPDumeqM2,$"
    tuple_0 = ()
    base_fact_collector_0 = module_0.BaseFactCollector()
    str_2 = '"?y]!U5VQ |tNXTH'
    list_1 = [str_2, base_fact_collector_0]
    dict_0 = {str_1: var_0}
    defaultdict_0 = module_1.defaultdict(**dict_0)
    var_1 = module_0.get_collector_names(list_1, defaultdict_0)
    dict_1 = {str_0: str_1, str_2: str_1}
    var_2 = module_0.tsort(dict_1)
    int_0 = 1997
    base_fact_collector_1 = module_0.BaseFactCollector(int_0, str_1)
    var_3 = base_fact_collector_1.collect_with_namespace(tuple_0)
    base_fact_collector_2 = module_0.BaseFactCollector()
    var_4 = base_fact_collector_2.collect_with_namespace(collector_not_found_error_0, collector_not_found_error_0)
    var_5 = module_0.resolve_requires(str_0, dict_1)
    unresolved_fact_dep_0 = module_0.UnresolvedFactDep()
    var_6 = base_fact_collector_0.collect(str_0)
    set_0 = {base_fact_collector_2, base_fact_collector_1}
    var_7 = module_0.build_fact_id_to_collector_map(set_0)
    dict_2 = {base_fact_collector_2: var_5, base_fact_collector_1: collector_not_found_error_0}
    var_8 = module_0.collector_classes_from_gather_subset(dict_2, dict_2)
    unresolved_fact_dep_1 = module_0.UnresolvedFactDep()