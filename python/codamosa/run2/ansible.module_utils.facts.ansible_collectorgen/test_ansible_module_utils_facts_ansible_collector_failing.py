# Automatically generated by Pynguin.
import ansible.module_utils.facts.ansible_collector as module_0

def test_case_0():
    try:
        bool_0 = False
        tuple_0 = ()
        dict_0 = {}
        ansible_fact_collector_0 = module_0.AnsibleFactCollector(bool_0, tuple_0, dict_0)
        var_0 = ansible_fact_collector_0.collect()
        bool_1 = False
        tuple_1 = (bool_1,)
        ansible_fact_collector_1 = module_0.AnsibleFactCollector()
        list_0 = [ansible_fact_collector_1, bool_1, ansible_fact_collector_1, tuple_1]
        collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(list_0, ansible_fact_collector_1)
        bytes_0 = b'(7n9\x96\xd1L\xc1\xfd\x1f=S\xa9P\xcdO\x06'
        tuple_2 = (bool_1,)
        dict_1 = {collector_meta_data_collector_0: tuple_2, bytes_0: tuple_1}
        var_1 = module_0.get_ansible_collector(tuple_1, collector_meta_data_collector_0, list_0, bytes_0, dict_1)
    except BaseException:
        pass

def test_case_1():
    try:
        ansible_fact_collector_0 = module_0.AnsibleFactCollector()
        ansible_fact_collector_1 = module_0.AnsibleFactCollector()
        var_0 = ansible_fact_collector_1.collect(ansible_fact_collector_0)
        str_0 = 'Download collections and their dependencies as a tarball for an offline install.'
        tuple_0 = ()
        var_1 = module_0.get_ansible_collector(str_0, tuple_0, str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = -262
        bytes_0 = None
        list_0 = [bytes_0, bytes_0, bytes_0]
        ansible_fact_collector_0 = module_0.AnsibleFactCollector(list_0)
        var_0 = ansible_fact_collector_0.collect(int_0)
        ansible_fact_collector_1 = module_0.AnsibleFactCollector()
        float_0 = None
        bool_0 = True
        var_1 = ansible_fact_collector_0.collect(bool_0)
        var_2 = ansible_fact_collector_1.collect()
        complex_0 = None
        collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(list_0)
        var_3 = collector_meta_data_collector_0.collect(complex_0)
        ansible_fact_collector_2 = module_0.AnsibleFactCollector(float_0)
        var_4 = ansible_fact_collector_2.collect()
        var_5 = collector_meta_data_collector_0.collect()
        set_0 = {collector_meta_data_collector_0}
        ansible_fact_collector_3 = module_0.AnsibleFactCollector(int_0)
        var_6 = module_0.get_ansible_collector(set_0)
    except BaseException:
        pass