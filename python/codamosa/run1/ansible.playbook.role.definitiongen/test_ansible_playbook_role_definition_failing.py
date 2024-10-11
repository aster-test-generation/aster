# Automatically generated by Pynguin.
import ansible.playbook.role.definition as module_0
import ansible.parsing.yaml.objects as module_1

def test_case_0():
    try:
        role_definition_0 = module_0.RoleDefinition()
        var_0 = role_definition_0.get_role_path()
        str_0 = "\\#>q] gH8\t-Jw'*#vBE]"
        tuple_0 = (str_0,)
        int_0 = -637
        tuple_1 = (tuple_0, int_0)
        var_1 = role_definition_0.load(tuple_1)
    except BaseException:
        pass

def test_case_1():
    try:
        role_definition_0 = module_0.RoleDefinition()
        var_0 = role_definition_0.preprocess_data(role_definition_0)
    except BaseException:
        pass

def test_case_2():
    try:
        role_definition_0 = module_0.RoleDefinition()
        str_0 = 'E:/Ansible/testdata/test_role_definition.yml'
        var_0 = role_definition_0.preprocess_data(str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = 3600
        role_definition_0 = module_0.RoleDefinition()
        var_0 = role_definition_0.preprocess_data(int_0)
    except BaseException:
        pass

def test_case_4():
    try:
        role_definition_0 = module_0.RoleDefinition()
        str_0 = 'role'
        str_1 = 'dummny_role'
        str_2 = {str_0: str_1}
        var_0 = role_definition_0.preprocess_data(str_2)
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = {}
        str_0 = 'dependenci3es'
        role_definition_0 = module_0.RoleDefinition(str_0)
        var_0 = role_definition_0.get_role_path()
        var_1 = role_definition_0.get_role_path()
        var_2 = role_definition_0.preprocess_data(dict_0)
    except BaseException:
        pass

def test_case_6():
    try:
        float_0 = 0.0001
        bool_0 = False
        str_0 = '%s (%s) of unknown type: %s'
        complex_0 = None
        str_1 = '}I~F+V5Mto'
        set_0 = {str_1, complex_0, str_0, str_0}
        list_0 = []
        tuple_0 = (str_0, complex_0, set_0, list_0)
        int_0 = 8
        role_definition_0 = module_0.RoleDefinition(int_0)
        dict_0 = {}
        role_definition_1 = module_0.RoleDefinition(tuple_0, role_definition_0, dict_0, bool_0)
        var_0 = role_definition_0.get_name()
        role_definition_2 = module_0.RoleDefinition(float_0, role_definition_1)
        var_1 = role_definition_1.preprocess_data(str_1)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'role'
        str_1 = 'name'
        bytes_0 = b'(\xaeT'
        dict_0 = {str_0: bytes_0}
        float_0 = -500.835
        role_definition_0 = module_0.RoleDefinition(float_0, str_1)
        var_0 = role_definition_0.preprocess_data(dict_0)
    except BaseException:
        pass

def test_case_8():
    try:
        bool_0 = True
        ansible_base_y_a_m_l_object_0 = module_1.AnsibleBaseYAMLObject()
        role_definition_0 = module_0.RoleDefinition(bool_0, ansible_base_y_a_m_l_object_0)
        var_0 = role_definition_0.get_name()
        var_1 = role_definition_0.preprocess_data(ansible_base_y_a_m_l_object_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'role'
        float_0 = -934.0
        int_0 = 429
        role_definition_0 = module_0.RoleDefinition(int_0)
        var_0 = role_definition_0.get_role_path()
        bool_0 = True
        list_0 = [str_0]
        role_definition_1 = module_0.RoleDefinition(bool_0, list_0)
        int_1 = -2971
        set_0 = {str_0, int_1}
        bool_1 = True
        tuple_0 = (set_0, bool_1)
        role_definition_2 = module_0.RoleDefinition(float_0, int_1, tuple_0)
        var_1 = role_definition_2.get_name()
        str_1 = {str_0: str_0, str_0: str_0}
        var_2 = role_definition_2.preprocess_data(str_1)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = '3.jdY.LYmbvc'
        role_definition_0 = module_0.RoleDefinition()
        var_0 = role_definition_0.preprocess_data(str_0)
    except BaseException:
        pass