# Automatically generated by Pynguin.
import ansible.module_utils.facts.system.service_mgr as module_0

def test_case_0():
    try:
        bytes_0 = b':\xa7\xe1\xf5v\x8a\xf6\x89xC\x0b\xc6\x93\xc0\ne'
        bool_0 = True
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector(bool_0)
        var_0 = service_mgr_fact_collector_0.is_systemd_managed(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'2\xcbF\x96\xa0\xe1\xe68\xdf\xb8\xde\x103\xd9\xc4U6'
        service_mgr_fact_collector_0 = module_0.ServiceMgrFactCollector()
        var_0 = service_mgr_fact_collector_0.is_systemd_managed_offline(bytes_0)
    except BaseException:
        pass