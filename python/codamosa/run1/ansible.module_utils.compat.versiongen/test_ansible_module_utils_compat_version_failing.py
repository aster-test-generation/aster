# Automatically generated by Pynguin.
import ansible.module_utils.compat.version as module_0

def test_case_0():
    try:
        str_0 = '"'
        loose_version_0 = module_0.LooseVersion(str_0)
        version_0 = module_0.Version()
        var_0 = version_0.__repr__()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '/a'
        loose_version_0 = module_0.LooseVersion()
        var_0 = loose_version_0.parse(str_0)
        set_0 = {var_0}
        version_0 = module_0.Version()
        var_1 = version_0.__eq__(set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = None
        version_0 = module_0.Version()
        var_0 = version_0.__lt__(int_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = False
        version_0 = module_0.Version()
        var_0 = version_0.__le__(bool_0)
    except BaseException:
        pass

def test_case_4():
    try:
        set_0 = None
        version_0 = module_0.Version(set_0)
        int_0 = 784
        var_0 = version_0.__gt__(int_0)
    except BaseException:
        pass

def test_case_5():
    try:
        version_0 = module_0.Version()
        version_1 = module_0.Version()
        var_0 = version_1.__ge__(version_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = "]f;7xD-e'U "
        strict_version_0 = module_0.StrictVersion(str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        loose_version_0 = module_0.LooseVersion()
        strict_version_0 = module_0.StrictVersion()
        var_0 = strict_version_0.parse(loose_version_0)
    except BaseException:
        pass

def test_case_8():
    try:
        loose_version_0 = module_0.LooseVersion()
        var_0 = loose_version_0.__str__()
    except BaseException:
        pass

def test_case_9():
    try:
        loose_version_0 = module_0.LooseVersion()
        var_0 = loose_version_0.__repr__()
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = '1.2.3'
        strict_version_0 = module_0.StrictVersion(str_0)
        str_1 = '1.2'
        strict_version_1 = module_0.StrictVersion(str_1)
        str_2 = '1'
        strict_version_2 = module_0.StrictVersion(str_2)
    except BaseException:
        pass