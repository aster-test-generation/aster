# Automatically generated by Pynguin.
import ansible.playbook.role.metadata as module_0

def test_case_0():
    try:
        bool_0 = True
        dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
        role_metadata_0 = module_0.RoleMetadata(dict_0)
        var_0 = role_metadata_0.serialize()
        bytes_0 = None
        var_1 = role_metadata_0.load(dict_0, bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = ']GdI9J=|o'
        str_1 = '(?s)PLATFORM[\\r\\n]+(.*)FOUND(.*)ENDFOUND'
        set_0 = {str_1, str_0, str_0}
        role_metadata_0 = module_0.RoleMetadata()
        var_0 = role_metadata_0.load(str_0, str_1, set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\xc8\xa0\x07\x8f'
        bool_0 = False
        role_metadata_0 = module_0.RoleMetadata(bool_0)
        var_0 = role_metadata_0.deserialize(bytes_0)
    except BaseException:
        pass

def test_case_3():
    try:
        role_metadata_0 = module_0.RoleMetadata()
        dict_0 = {}
        var_0 = role_metadata_0.deserialize(dict_0)
        str_0 = "import_playbook parameters cannot be mixed with 'vars' entries for import statements"
        int_0 = 27
        role_metadata_1 = module_0.RoleMetadata(int_0)
        bool_0 = True
        role_metadata_2 = module_0.RoleMetadata()
        dict_1 = {}
        var_1 = role_metadata_0.serialize()
        var_2 = role_metadata_2.deserialize(dict_1)
        var_3 = role_metadata_0.load(str_0, bool_0, role_metadata_2)
    except BaseException:
        pass

def test_case_4():
    try:
        role_metadata_0 = module_0.RoleMetadata()
        var_0 = role_metadata_0.serialize()
        dict_0 = {}
        str_0 = "F4'm> "
        role_metadata_1 = module_0.RoleMetadata()
        var_1 = role_metadata_0.load(dict_0, str_0)
        var_2 = role_metadata_0.serialize()
        str_1 = 'Kl+\x0b$@|[3Pav'
        var_3 = role_metadata_0.deserialize(str_1)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = ''
        role_metadata_0 = module_0.RoleMetadata(str_0)
        var_0 = role_metadata_0.serialize()
        var_1 = role_metadata_0.load(var_0, var_0)
    except BaseException:
        pass