# Automatically generated by Pynguin.
import ansible.collections.list as module_0

def test_case_0():
    try:
        str_0 = 'n2.c3'
        var_0 = module_0.list_collection_dirs(str_0, str_0)
        var_1 = list(var_0)
    except BaseException:
        pass

def test_case_1():
    try:
        var_0 = module_0.list_collection_dirs()
        var_1 = list(var_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '/home/ansible'
        str_1 = '/home/ansible/ansible_collections'
        str_2 = '/home/ansible/foo'
        str_3 = '/home/ansible/foo/ansible_collections'
        str_4 = '/home/ansible/ansible_collections/acme'
        str_5 = '/home/ansible/ansible_collections/acme/*/ansible_collections/acme/*'
        str_6 = (str_0, str_1, str_2, str_3, str_1, str_4, str_3, str_5)
        var_0 = module_0.list_collection_dirs(str_6)
        var_1 = set(var_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'n1'
        var_0 = module_0.list_collection_dirs(str_0, str_0)
        var_1 = list(var_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '\n        Return the build number of the current distribution.\n\n        For details, see :func:`distro.build_number`.\n        '
        var_0 = module_0.list_collection_dirs(str_0, str_0)
        var_1 = list(var_0)
    except BaseException:
        pass