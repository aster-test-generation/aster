# Automatically generated by Pynguin.
import ansible.module_utils.facts.system.chroot as module_0

def test_case_0():
    try:
        var_0 = module_0.is_chroot()
        var_1 = module_0.is_chroot(var_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 2765
        str_0 = 'Парола'
        list_0 = [str_0, str_0, str_0]
        chroot_fact_collector_0 = module_0.ChrootFactCollector(list_0)
        var_0 = chroot_fact_collector_0.collect(int_0)
    except BaseException:
        pass