# Automatically generated by Pynguin.
import ansible.plugins.lookup.random_choice as module_0

def test_case_0():
    float_0 = None
    str_0 = 'l*'
    str_1 = '/etc/skel'
    dict_0 = {str_0: float_0, str_1: float_0, str_0: str_1}
    dict_1 = {}
    lookup_module_0 = module_0.LookupModule(dict_1)
    var_0 = lookup_module_0.run(float_0, **dict_0)