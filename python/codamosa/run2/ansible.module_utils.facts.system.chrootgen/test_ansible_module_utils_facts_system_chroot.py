# Automatically generated by Pynguin.
import ansible.module_utils.facts.system.chroot as module_0

def test_case_0():
    pass

def test_case_1():
    var_0 = module_0.is_chroot()

def test_case_2():
    chroot_fact_collector_0 = module_0.ChrootFactCollector()
    var_0 = chroot_fact_collector_0.collect()
    var_1 = module_0.is_chroot()