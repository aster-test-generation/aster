# Automatically generated by Pynguin.
import ansible.module_utils.facts.system.service_mgr as module_0

def test_case_0():
    try:
        int_0 = -929
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector()
        var_0 = service_mgr_fact_collector_0.is_systemd_managed(int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b''
        list_0 = []
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector(list_0)
        var_0 = service_mgr_fact_collector_0.is_systemd_managed_offline(bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        set_0 = None
        dict_0 = {set_0: set_0}
        str_0 = '?\x0cra,*dU)\x0c6wG{$x@gI'
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector()
        bytes_0 = b'\x8c\xd6\x82c\xde\x04\x8f\x1d\x11\xa6\xec'
        float_0 = -619.18157
        var_0 = service_mgr_fact_collector_0.collect(bytes_0, float_0)
        bytes_1 = b'\xac\xa1\x04\x05\xdc\x86'
        var_1 = service_mgr_fact_collector_0.collect(bytes_1)
        service_mgr_fact_collector_1 = module_0.ServiceMgrFactCollector(str_0)
        var_2 = service_mgr_fact_collector_1.collect()
        var_3 = service_mgr_fact_collector_1.is_systemd_managed(dict_0)
    except BaseException:
        pass