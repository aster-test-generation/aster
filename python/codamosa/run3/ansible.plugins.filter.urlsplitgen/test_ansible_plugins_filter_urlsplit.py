# Automatically generated by Pynguin.
import ansible.plugins.filter.urlsplit as module_0

def test_case_0():
    str_0 = 'scheme'
    var_0 = module_0.split_url(str_0, str_0)

def test_case_1():
    dict_0 = {}
    filter_module_0 = module_0.FilterModule(**dict_0)
    var_0 = filter_module_0.filters()