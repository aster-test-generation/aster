# Automatically generated by Pynguin.
import ansible.module_utils.facts.ansible_collector as module_0

def test_case_0():
    float_0 = -508.38
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(float_0)

def test_case_1():
    ansible_fact_collector_0 = module_0.AnsibleFactCollector()

def test_case_2():
    str_0 = 'fG6|<w% D!q\r'
    float_0 = 2576.522
    ansible_fact_collector_0 = module_0.AnsibleFactCollector(str_0)
    var_0 = ansible_fact_collector_0.collect()
    bytes_0 = b'8\x05\x10#\x89'
    var_1 = ansible_fact_collector_0.collect(bytes_0)
    var_2 = ansible_fact_collector_0.collect(float_0)
    var_3 = ansible_fact_collector_0.collect()
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(str_0)

def test_case_3():
    bytes_0 = b'\x955\x89\xe29\xdah\x9d\xad\xef\xf8\x1b'
    float_0 = -2929.758348
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(float_0)
    ansible_fact_collector_0 = module_0.AnsibleFactCollector()
    var_0 = ansible_fact_collector_0.collect(bytes_0)
    var_1 = ansible_fact_collector_0.collect()

def test_case_4():
    ansible_fact_collector_0 = module_0.AnsibleFactCollector()
    list_0 = []
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector()
    var_0 = collector_meta_data_collector_0.collect(ansible_fact_collector_0, list_0)
    set_0 = set()
    var_1 = collector_meta_data_collector_0.collect(set_0)

def test_case_5():
    float_0 = 0.2
    tuple_0 = ()
    float_1 = -131.7522
    set_0 = {tuple_0, tuple_0, tuple_0}
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(set_0)
    int_0 = 776
    var_0 = module_0.get_ansible_collector(tuple_0, int_0)
    ansible_fact_collector_0 = module_0.AnsibleFactCollector()
    tuple_1 = (tuple_0, float_1)
    collector_meta_data_collector_1 = module_0.CollectorMetaDataCollector(float_0, tuple_1)
    var_1 = collector_meta_data_collector_1.collect()

def test_case_6():
    str_0 = 'Na$nE,'
    ansible_fact_collector_0 = module_0.AnsibleFactCollector()
    list_0 = []
    ansible_fact_collector_1 = module_0.AnsibleFactCollector(list_0)
    bytes_0 = b'\xf3N%'
    var_0 = ansible_fact_collector_1.collect(bytes_0, str_0)
    bytes_1 = b'\x81\\A\x8b\xa5\x01\x9e\xafmK\xd0\xb6\xff0\xbb\xb1'
    var_1 = ansible_fact_collector_1.collect(bytes_1)
    bool_0 = False
    str_1 = ''
    str_2 = 'MQJ]pyI'
    var_2 = module_0.get_ansible_collector(bool_0, str_1, str_2, list_0, bool_0)
    var_3 = ansible_fact_collector_0.collect()
    float_0 = -4570.5886
    bytes_2 = b'\xe9\xbe*\xd5\x10k\x92\t\x04'
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector(bytes_2)
    var_4 = collector_meta_data_collector_0.collect(float_0)

def test_case_7():
    bytes_0 = b'\xb2[\xbb\x10\xa4_\xbd\xaaipk\xba\xd6'
    set_0 = {bytes_0, bytes_0}
    collector_meta_data_collector_0 = module_0.CollectorMetaDataCollector()
    ansible_fact_collector_0 = module_0.AnsibleFactCollector(set_0)
    int_0 = -2226
    var_0 = collector_meta_data_collector_0.collect()
    bool_0 = True
    collector_meta_data_collector_1 = module_0.CollectorMetaDataCollector(int_0, bool_0)
    set_1 = {collector_meta_data_collector_1, int_0}
    ansible_fact_collector_1 = module_0.AnsibleFactCollector(set_1)
    var_1 = ansible_fact_collector_1.collect(ansible_fact_collector_0)
    str_0 = '> |FA(_viD{]"|Ct:\n+ '
    collector_meta_data_collector_2 = module_0.CollectorMetaDataCollector()
    ansible_fact_collector_2 = module_0.AnsibleFactCollector()
    list_0 = []
    collector_meta_data_collector_3 = module_0.CollectorMetaDataCollector(list_0)
    collector_meta_data_collector_4 = module_0.CollectorMetaDataCollector(collector_meta_data_collector_3, collector_meta_data_collector_3)
    var_2 = collector_meta_data_collector_4.collect(str_0, ansible_fact_collector_2)
    collector_meta_data_collector_5 = module_0.CollectorMetaDataCollector(bytes_0)
    var_3 = collector_meta_data_collector_0.collect()
    var_4 = collector_meta_data_collector_5.collect()
    str_1 = '~c#0\x0c'
    ansible_fact_collector_3 = module_0.AnsibleFactCollector(str_1)
    str_2 = 'EHB1tl'
    ansible_fact_collector_4 = module_0.AnsibleFactCollector(str_2)