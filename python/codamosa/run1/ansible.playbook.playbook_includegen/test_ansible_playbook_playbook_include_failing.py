# Automatically generated by Pynguin.
import ansible.playbook.playbook_include as module_0
import ansible.parsing.yaml.objects as module_1

def test_case_0():
    try:
        dict_0 = {}
        bool_0 = True
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.load(dict_0, bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        ansible_mapping_0 = module_1.AnsibleMapping()
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.load_data(ansible_mapping_0, ansible_mapping_0)
    except BaseException:
        pass

def test_case_2():
    try:
        playbook_include_0 = module_0.PlaybookInclude()
        str_0 = '='
        playbook_include_1 = module_0.PlaybookInclude()
        playbook_include_2 = module_0.PlaybookInclude()
        var_0 = playbook_include_2.load(str_0, playbook_include_1)
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        bool_0 = None
        list_0 = [dict_0, dict_0]
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.load_data(dict_0, bool_0, list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'import_playbook'
        str_1 = 'vars'
        playbook_include_0 = module_0.PlaybookInclude()
        str_2 = {str_0: str_1}
        str_3 = {str_0: str_0, str_1: str_2}
        var_0 = playbook_include_0.load_data(str_3, str_1)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'import_playbook'
        str_1 = 'vars'
        str_2 = {str_0: str_0, str_0: str_0, str_1: str_1, str_1: str_1}
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.preprocess_data(str_2)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'import_playbook'
        str_1 = 'vars'
        str_2 = 'whe'
        str_3 = ''
        str_4 = 'var1'
        str_5 = {str_4: str_3, str_0: str_3, str_1: str_1, str_2: str_2}
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.preprocess_data(str_5)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'import_playbook'
        str_1 = 'vars'
        str_2 = 'var2'
        str_3 = 'var3 == value3'
        str_4 = {str_2: str_0, str_0: str_0, str_1: str_1, str_0: str_3}
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.preprocess_data(str_4)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'import_playbook'
        playbook_include_0 = module_0.PlaybookInclude()
        str_1 = '='
        dict_0 = {str_1: str_0, str_0: playbook_include_0}
        var_0 = playbook_include_0.preprocess_data(dict_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'import_playbook'
        list_0 = []
        list_1 = None
        str_1 = '.%&\n1UF&}gZ{C|cGW'
        str_2 = 'Unable to load data from include requirements file: %s %s'
        dict_0 = {str_1: list_1, str_2: list_1, str_0: list_1, str_2: list_0}
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.preprocess_data(dict_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'import_playbook'
        str_1 = '/_F'
        dict_0 = {str_0: str_1}
        playbook_include_0 = module_0.PlaybookInclude()
        var_0 = playbook_include_0.load_data(dict_0, str_0)
    except BaseException:
        pass