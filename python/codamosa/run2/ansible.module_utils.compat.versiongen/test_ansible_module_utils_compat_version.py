# Automatically generated by Pynguin.
import ansible.module_utils.compat.version as module_0

def test_case_0():
    pass

def test_case_1():
    strict_version_0 = module_0.StrictVersion()

def test_case_2():
    str_0 = '0.0'
    strict_version_0 = module_0.StrictVersion(str_0)
    version_0 = module_0.Version()

def test_case_3():
    loose_version_0 = module_0.LooseVersion()

def test_case_4():
    str_0 = '1Ra{S!HOE'
    loose_version_0 = module_0.LooseVersion(str_0)

def test_case_5():
    str_0 = '%s-'
    loose_version_0 = module_0.LooseVersion(str_0)
    var_0 = loose_version_0.__repr__()
    var_1 = loose_version_0.__repr__()

def test_case_6():
    str_0 = '0.0'
    strict_version_0 = module_0.StrictVersion(str_0)
    str_1 = '1.1.1'
    strict_version_1 = module_0.StrictVersion(str_1)
    str_2 = '2.2.2'
    strict_version_2 = module_0.StrictVersion(str_2)

def test_case_7():
    str_0 = 'a~a@kSO.@E'
    loose_version_0 = module_0.LooseVersion(str_0)