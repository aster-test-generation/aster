# Automatically generated by Pynguin.
import ansible.plugins.lookup.file as module_0

def test_case_0():
    try:
        lookup_module_0 = module_0.LookupModule()
        str_0 = 'File %s not present'
        list_0 = []
        var_0 = lookup_module_0.run(str_0, list_0)
    except BaseException:
        pass