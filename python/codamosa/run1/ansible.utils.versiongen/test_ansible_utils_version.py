# Automatically generated by Pynguin.
import ansible.utils.version as module_0
import ansible.module_utils.compat.version as module_1

def test_case_0():
    pass

def test_case_1():
    semantic_version_0 = module_0.SemanticVersion()

def test_case_2():
    semantic_version_0 = module_0.SemanticVersion()
    var_0 = semantic_version_0.__repr__()

def test_case_3():
    semantic_version_0 = module_0.SemanticVersion()
    var_0 = semantic_version_0.__gt__(semantic_version_0)

def test_case_4():
    semantic_version_0 = module_0.SemanticVersion()
    var_0 = semantic_version_0.__eq__(semantic_version_0)

def test_case_5():
    semantic_version_0 = module_0.SemanticVersion()
    var_0 = semantic_version_0.__le__(semantic_version_0)

def test_case_6():
    bytes_0 = b'\xca\x7f\xc5)\xa91!'
    set_0 = {bytes_0}
    str_0 = '_async_dir'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
    alpha_0 = module_0._Alpha(dict_0)
    var_0 = alpha_0.__eq__(set_0)

def test_case_7():
    semantic_version_0 = module_0.SemanticVersion()
    str_0 = '1.2.3-4'
    loose_version_0 = module_1.LooseVersion(str_0)
    var_0 = semantic_version_0.from_loose_version(loose_version_0)

def test_case_8():
    str_0 = '1.2.3-alpha.1+20200101.01'
    semantic_version_0 = module_0.SemanticVersion(str_0)
    str_1 = 'alpha'
    alpha_0 = module_0._Alpha(str_1)
    str_2 = '1'
    numeric_0 = module_0._Numeric(str_2)
    int_0 = 20200101
    numeric_1 = module_0._Numeric(int_0)
    int_1 = 1
    numeric_2 = module_0._Numeric(int_1)
    str_3 = '1.2.3+20200101.02'
    semantic_version_1 = module_0.SemanticVersion(str_3)

def test_case_9():
    str_0 = '2019.2.0'
    loose_version_0 = module_1.LooseVersion(str_0)
    semantic_version_0 = module_0.SemanticVersion(str_0)

def test_case_10():
    str_0 = '1.0.0'
    semantic_version_0 = module_0.SemanticVersion(str_0)
    str_1 = '1.0.0-alpha'
    semantic_version_1 = module_0.SemanticVersion(str_1)
    str_2 = 'alpha'
    alpha_0 = module_0._Alpha(str_2)
    str_3 = '1.0.0-alpha.1'
    semantic_version_2 = module_0.SemanticVersion(str_3)

def test_case_11():
    str_0 = '2019.2.0'
    loose_version_0 = module_1.LooseVersion(str_0)
    semantic_version_0 = module_0.SemanticVersion(str_0)
    str_1 = '2019.2.0-1'
    loose_version_1 = module_1.LooseVersion(str_1)
    semantic_version_1 = module_0.SemanticVersion(str_1)
    str_2 = '2019.2.0-foo'
    loose_version_2 = module_1.LooseVersion(str_2)
    semantic_version_2 = module_0.SemanticVersion(str_2)
    str_3 = '2019.2.0-1+foo'
    loose_version_3 = module_1.LooseVersion(str_3)
    semantic_version_3 = module_0.SemanticVersion(str_3)
    str_4 = '2019.2.0+foo'
    loose_version_4 = module_1.LooseVersion(str_4)
    semantic_version_4 = module_0.SemanticVersion(str_4)