# Automatically generated by Pynguin.
import ansible.playbook.play_context as module_0

def test_case_0():
    try:
        str_0 = 'hS8d|\tOt]R_NQ-w'
        play_context_0 = module_0.PlayContext(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        play_context_0 = module_0.PlayContext()
        complex_0 = None
        var_0 = play_context_0.set_become_plugin(complex_0)
        play_context_1 = module_0.PlayContext()
        list_0 = None
        play_context_2 = module_0.PlayContext()
        var_1 = play_context_2.set_attributes_from_plugin(list_0)
    except BaseException:
        pass

def test_case_2():
    try:
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_attributes_from_cli()
        int_0 = 27
        float_0 = 0.0001
        str_0 = "\n        Create an AnsibleCollectionRef from components\n        :param collection_name: a collection name of the form 'namespace.collectionname'\n        :param subdirs: optional subdir segments to be appended below the plugin type (eg, 'subdir1.subdir2')\n        :param resource: the name of the resource being references (eg, 'mymodule', 'someaction', 'a_role')\n        :param ref_type: the type of the reference, eg 'module', 'role', 'doc_fragment'\n        "
        var_1 = play_context_0.set_task_and_variable_override(int_0, float_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.update_vars(play_context_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = True
        play_context_0 = module_0.PlayContext()
        dict_0 = {play_context_0: bool_0}
        var_0 = play_context_0.update_vars(dict_0)
        var_1 = play_context_0.set_attributes_from_cli()
        var_2 = play_context_0.set_become_plugin(bool_0)
        str_0 = 'persistent'
        int_0 = None
        var_3 = play_context_0.set_task_and_variable_override(str_0, play_context_0, int_0)
    except BaseException:
        pass

def test_case_5():
    try:
        play_context_0 = module_0.PlayContext()
        str_0 = 'J}'
        var_0 = play_context_0.update_vars(str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_attributes_from_cli()
        str_0 = "\n        Create an AnsibleCollectionRef from components\n        :param collection_name: a collection name of the form 'namespace.collectionname'\n        :param subdirs: optional subdir segments to be appended below the plugin type (eg, 'subdir1.subdir2')\n        :param resource: the name of the resource being references (eg, 'mymodule', 'someaction', 'a_role')\n        :param ref_type: the type of the reference, eg 'module', 'role', 'doc_fragment'\n        "
        play_context_1 = module_0.PlayContext(play_context_0, str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        play_context_0 = module_0.PlayContext()
        var_0 = play_context_0.set_attributes_from_cli()
        int_0 = 27
        str_0 = "\n        Create an AnsibleCollectionRef from components\n        :param collection_name: a collection name of the form 'namespace.collectionname'\n        :param subdirs: optional subdir segments to be appended below the plugin type (eg, 'subdir1.subdir2')\n        :param resource: the name of the resource being references (eg, 'mymodule', 'someaction', 'a_role')\n        :param ref_type: the type of the reference, eg 'module', 'role', 'doc_fragment'\n        "
        dict_0 = {int_0: str_0}
        var_1 = play_context_0.set_task_and_variable_override(play_context_0, dict_0, play_context_0)
    except BaseException:
        pass

def test_case_8():
    try:
        bool_0 = False
        play_context_0 = module_0.PlayContext()
        dict_0 = {play_context_0: bool_0}
        var_0 = play_context_0.update_vars(dict_0)
        var_1 = play_context_0.update_vars(dict_0)
        var_2 = play_context_0.set_attributes_from_cli()
        var_3 = play_context_0.set_become_plugin(bool_0)
        str_0 = 'persistent'
        int_0 = None
        var_4 = play_context_0.set_task_and_variable_override(str_0, play_context_0, int_0)
    except BaseException:
        pass