# Automatically generated by Pynguin.
import ansible.module_utils.facts.collector as module_0

def test_case_0():
    pass

def test_case_1():
    base_fact_collector_0 = module_0.BaseFactCollector()
    var_0 = base_fact_collector_0.collect()

def test_case_2():
    unresolved_fact_dep_0 = module_0.UnresolvedFactDep()
    str_0 = '=*?N*VKQ7bRx'
    base_fact_collector_0 = module_0.BaseFactCollector(unresolved_fact_dep_0, str_0)
    var_0 = base_fact_collector_0.collect_with_namespace()

def test_case_3():
    var_0 = module_0.collector_classes_from_gather_subset()

def test_case_4():
    str_0 = "\r>G5cFVS^pk8\x0csxpV'R"
    list_0 = []
    var_0 = module_0.collector_classes_from_gather_subset(list_0, str_0, str_0)

def test_case_5():
    bytes_0 = b'\x17\x98l\xc8\xa5>.<\xd2\x08\xd4\x9co'
    list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
    collector_not_found_error_0 = module_0.CollectorNotFoundError(*list_0)
    list_1 = [bytes_0]
    set_0 = set()
    base_fact_collector_0 = module_0.BaseFactCollector(collector_not_found_error_0, collector_not_found_error_0)
    var_0 = module_0.resolve_requires(set_0, collector_not_found_error_0)
    var_1 = base_fact_collector_0.collect_with_namespace(set_0)
    unresolved_fact_dep_0 = module_0.UnresolvedFactDep(*list_1)
    var_2 = module_0.collector_classes_from_gather_subset()
    collector_not_found_error_1 = module_0.CollectorNotFoundError()

def test_case_6():
    bytes_0 = b'\x17\x98l\xc8\xa5>.<\xd2\x08\xd4\x9co'
    list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
    var_0 = module_0.collector_classes_from_gather_subset()
    unresolved_fact_dep_0 = module_0.UnresolvedFactDep()
    collector_not_found_error_0 = module_0.CollectorNotFoundError(*list_0)
    base_fact_collector_0 = module_0.BaseFactCollector(collector_not_found_error_0, collector_not_found_error_0)
    unresolved_fact_dep_1 = module_0.UnresolvedFactDep()
    str_0 = 'dknS'
    dict_0 = {base_fact_collector_0: str_0}
    var_1 = module_0.collector_classes_from_gather_subset(dict_0)

def test_case_7():
    str_0 = 'bios'
    str_1 = 'disk'
    str_2 = [str_0, str_1]
    str_3 = 'bios_collector'
    str_4 = 'disk_collector'
    str_5 = [str_3]
    str_6 = [str_4]
    str_7 = {str_0: str_5, str_1: str_6}
    var_0 = module_0.select_collector_classes(str_2, str_7)

def test_case_8():
    str_0 = 'all'
    str_1 = 'hardware'
    str_2 = 'software'
    str_3 = [str_0, str_1, str_2]
    var_0 = frozenset(str_3)
    str_4 = [str_1, str_2]
    var_1 = frozenset(str_4)
    var_2 = []
    var_3 = module_0.get_collector_names(var_0, var_1, var_2)
    str_5 = [str_1, str_2]
    var_4 = set(str_5)
    str_6 = [str_0]
    var_5 = module_0.get_collector_names(var_0, var_1, str_6)
    str_7 = [str_1, str_2]
    var_6 = set(str_7)
    str_8 = [str_1, str_0]
    var_7 = module_0.get_collector_names(var_0, var_1, str_8)
    str_9 = [str_1, str_2]
    var_8 = set(str_9)

def test_case_9():
    str_0 = 'system'
    str_1 = {str_0: str_0}
    var_0 = module_0.collector_classes_from_gather_subset()
    str_2 = '\rIeYo?t,#'
    str_3 = 'all'
    var_1 = frozenset(str_2)
    str_4 = [str_3]
    str_5 = '!ay$'
    str_6 = [str_5]
    var_2 = module_0.get_collector_names(var_1, str_4, str_6, str_1)

def test_case_10():
    str_0 = 'system'
    str_1 = 'Generic'
    str_2 = {str_0: str_1}
    str_3 = 'network'
    str_4 = 'all'
    var_0 = frozenset(str_3)
    str_5 = [str_3]
    var_1 = frozenset(str_5)
    str_6 = [str_4]
    var_2 = module_0.get_collector_names(var_0, var_1, str_6, str_2)
    str_7 = '!all'
    str_8 = [str_7]
    var_3 = module_0.get_collector_names(var_0, var_1, str_8, str_2)
    str_9 = '!hardware'
    str_10 = [str_9]
    var_4 = module_0.get_collector_names(var_0, var_1, str_10, str_2)