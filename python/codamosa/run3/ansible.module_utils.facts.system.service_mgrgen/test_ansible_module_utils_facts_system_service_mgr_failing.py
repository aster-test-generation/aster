# Automatically generated by Pynguin.
import ansible.module_utils.facts.system.service_mgr as module_0

def test_case_0():
    try:
        dict_0 = {}
        bool_0 = False
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector(bool_0)
        var_0 = service_mgr_fact_collector_0.is_systemd_managed(dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = True
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector()
        service_mgr_fact_collector_1 = module_0.ServiceMgrFactCollector()
        var_0 = service_mgr_fact_collector_1.collect()
        service_mgr_fact_collector_2 = module_0.ServiceMgrFactCollector(service_mgr_fact_collector_0)
        var_1 = service_mgr_fact_collector_2.is_systemd_managed_offline(bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector()
        set_0 = {service_mgr_fact_collector_0, service_mgr_fact_collector_0}
        bool_0 = True
        float_0 = 1169.0
        list_0 = [float_0, bool_0, float_0, set_0]
        str_0 = '{x];V9#gZo[2of'
        var_0 = service_mgr_fact_collector_0.collect(list_0, str_0)
        tuple_0 = (service_mgr_fact_collector_0, set_0, bool_0, float_0)
        dict_0 = {}
        service_mgr_fact_collector_1 = module_0.ServiceMgrFactCollector(dict_0)
        var_1 = service_mgr_fact_collector_1.is_systemd_managed(tuple_0)
    except BaseException:
        pass