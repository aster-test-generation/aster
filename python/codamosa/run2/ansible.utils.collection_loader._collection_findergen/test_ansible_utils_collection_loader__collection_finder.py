# Automatically generated by Pynguin.
import ansible.utils.collection_loader._collection_finder as module_0

def test_case_0():
    pass

def test_case_1():
    ansible_collection_finder_0 = module_0._AnsibleCollectionFinder()

def test_case_2():
    ansible_collection_finder_0 = module_0._AnsibleCollectionFinder()
    str_0 = "u\x0b$w'#^x\\]<wy"
    var_0 = ansible_collection_finder_0.set_playbook_paths(str_0)

def test_case_3():
    str_0 = "Alias '{name}' is deprecated. See the module docs for more information"
    dict_0 = {str_0: str_0}
    ansible_path_hook_finder_0 = module_0._AnsiblePathHookFinder(str_0, dict_0)
    var_0 = ansible_path_hook_finder_0.__repr__()

def test_case_4():
    str_0 = 'ansible_collections.ansible.netcommon'
    ansible_collection_pkg_loader_base_0 = module_0._AnsibleCollectionPkgLoaderBase(str_0, str_0)

def test_case_5():
    str_0 = '&'
    bytes_0 = b'Pa'
    list_0 = [bytes_0, bytes_0, bytes_0]
    ansible_collection_finder_0 = module_0._AnsibleCollectionFinder(list_0)
    var_0 = ansible_collection_finder_0.set_playbook_paths(str_0)

def test_case_6():
    bytes_0 = b'I\xa4!\x1b\x1e\xa7\xf7d\xb0G\xaa\x00\x01&'
    ansible_collection_finder_0 = module_0._AnsibleCollectionFinder()
    var_0 = ansible_collection_finder_0.set_playbook_paths(bytes_0)

def test_case_7():
    dict_0 = None
    str_0 = 'oi*Vn'
    ansible_path_hook_finder_0 = module_0._AnsiblePathHookFinder(dict_0, str_0)
    var_0 = ansible_path_hook_finder_0.find_module(str_0, dict_0)

def test_case_8():
    ansible_collection_finder_0 = None
    ansible_collection_finder_1 = module_0._AnsibleCollectionFinder(ansible_collection_finder_0)
    str_0 = '`'
    var_0 = ansible_collection_finder_1.find_module(str_0)

def test_case_9():
    str_0 = 'ansible_collections.aNsTble.netcommon'
    ansible_collection_pkg_loader_base_0 = module_0._AnsibleCollectionPkgLoaderBase(str_0, str_0)
    var_0 = ansible_collection_pkg_loader_base_0.load_module(str_0)

def test_case_10():
    str_0 = 'ansible_collections.ansible.netcommon'
    ansible_collection_pkg_loader_base_0 = module_0._AnsibleCollectionPkgLoaderBase(str_0, str_0)
    var_0 = ansible_collection_pkg_loader_base_0.load_module(str_0)

def test_case_11():
    str_0 = 'ansible_collections.ansible.netcommon'
    str_1 = [str_0]
    ansible_collection_pkg_loader_base_0 = module_0._AnsibleCollectionPkgLoaderBase(str_0, str_1)
    bytes_0 = b'VO\x9b\xa8'
    ansible_collection_finder_0 = module_0._AnsibleCollectionFinder()
    var_0 = ansible_collection_finder_0.set_playbook_paths(bytes_0)
    set_0 = None
    var_1 = ansible_collection_pkg_loader_base_0.iter_modules(set_0)

def test_case_12():
    str_0 = 'ansible_collections.ansible.netcommon'
    ansible_collection_pkg_loader_base_0 = module_0._AnsibleCollectionPkgLoaderBase(str_0, str_0)
    var_0 = ansible_collection_pkg_loader_base_0.__repr__()

def test_case_13():
    str_0 = 'ansible_collections.nsible.netcommon'
    dict_0 = {str_0: str_0}
    ansible_collection_finder_0 = module_0._AnsibleCollectionFinder()
    var_0 = ansible_collection_finder_0.set_playbook_paths(dict_0)
    str_1 = '~::aiZbhc(|yH'
    dict_1 = None
    ansible_path_hook_finder_0 = module_0._AnsiblePathHookFinder(dict_1, str_1)
    var_1 = ansible_path_hook_finder_0.find_module(str_1, dict_0)
    ansible_collection_finder_1 = module_0._AnsibleCollectionFinder()
    var_2 = ansible_collection_finder_0.find_module(str_0, str_1)