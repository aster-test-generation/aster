# Automatically generated by Pynguin.
import ansible.modules.subversion as module_0

def test_case_0():
    try:
        float_0 = 2.0
        str_0 = '[t3sP$d1;'
        set_0 = {float_0, float_0, str_0}
        bytes_0 = b''
        subversion_0 = module_0.Subversion(float_0, str_0, set_0, bytes_0, str_0, set_0, float_0, bytes_0)
        var_0 = subversion_0.update()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = ''
        list_0 = [str_0, str_0, str_0]
        bytes_0 = b'e\x93\x8fm\x13z\x82`\xd7L\xd2\x86'
        dict_0 = {str_0: str_0}
        int_0 = 534985
        subversion_0 = module_0.Subversion(str_0, list_0, bytes_0, list_0, str_0, str_0, dict_0, int_0)
        var_0 = subversion_0.get_remote_revision()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '__main__'
        list_0 = [str_0]
        bytes_0 = b'e\x93\x85w\x8fsm\x13z\x82`\xd7L\xd2\x86'
        dict_0 = {str_0: str_0, str_0: bytes_0}
        int_0 = 1082
        subversion_0 = module_0.Subversion(str_0, list_0, bytes_0, list_0, str_0, str_0, dict_0, int_0)
        var_0 = subversion_0.checkout(bytes_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ''
        list_0 = [str_0, str_0]
        str_1 = 'ansible.modules.subversion'
        int_0 = 1838
        bytes_0 = b'7\xac6'
        str_2 = 'J'
        dict_0 = {str_2: str_1, str_2: str_2, str_1: bytes_0}
        set_0 = {int_0, str_2}
        float_0 = 4245.146575
        list_1 = [str_2, str_1]
        float_1 = -174.0
        bytes_1 = b'\xf6]\xab\xfa\xf45\x1el\xff{\xc1m'
        subversion_0 = module_0.Subversion(list_1, set_0, float_0, float_1, int_0, str_1, bytes_1, int_0)
        subversion_1 = None
        set_1 = {float_0, subversion_1, str_1}
        subversion_2 = module_0.Subversion(str_1, int_0, bytes_0, dict_0, set_0, float_0, subversion_0, set_1)
        var_0 = subversion_2.export(list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '\nafter:\n    description: List of apt key ids or fingerprints after any modification\n    returned: on change\n    type: list\n    sample: ["D8576A8BA88D21E9", "3B4FE6ACC0B21F32", "D94AA3F0EFE21092", "871920D1991BC93C"]\nbefore:\n    description: List of apt key ids or fingprints before any modifications\n    returned: always\n    type: list\n    sample: ["3B4FE6ACC0B21F32", "D94AA3F0EFE21092", "871920D1991BC93C"]\nfp:\n    description: Fingerprint of the key to import\n    returned: always\n    type: str\n    sample: "D8576A8BA88D21E9"\nid:\n    description: key id from source\n    returned: always\n    type: str\n    sample: "36A1D7869245C8950F966E92D8576A8BA88D21E9"\nkey_id:\n    description: calculated key id, it should be same as \'id\', but can be different\n    returned: always\n    type: str\n    sample: "36A1D7869245C8950F966E92D8576A8BA88D21E9"\nshort_id:\n    description: caclulated short key id\n    returned: always\n    type: str\n    sample: "A88D21E9"\n'
        bool_0 = True
        tuple_0 = ()
        bytes_0 = b'\xe4v\x9c5\xcf\x03\xc1\x9e\x04y\xb9\x15\xe1\x0cn\xa8'
        int_0 = 82
        bytes_1 = b''
        dict_0 = {bool_0: tuple_0, bytes_1: str_0, str_0: tuple_0, bool_0: int_0}
        list_0 = [bytes_1]
        subversion_0 = module_0.Subversion(bool_0, tuple_0, int_0, bytes_0, int_0, bytes_1, dict_0, list_0)
        var_0 = subversion_0.switch()
    except BaseException:
        pass

def test_case_5():
    try:
        bool_0 = False
        set_0 = {bool_0, bool_0}
        bytes_0 = b'E\xe0\xdd\rz\xeeO&\x05kC='
        float_0 = 2424.22036
        list_0 = []
        str_0 = 'ansible.modules.subversion'
        subversion_0 = module_0.Subversion(bool_0, set_0, bytes_0, float_0, list_0, bytes_0, set_0, str_0)
        var_0 = subversion_0.revert()
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = True
        bytes_0 = b'J\xa96\x13\x95\x14)\x1f\x08\x1d\x0b\x1e*\xe8\xc3'
        str_0 = '&-LqwaKV '
        bool_1 = True
        tuple_0 = (bool_0, bytes_0, str_0, bool_1)
        dict_0 = {}
        set_0 = set()
        subversion_0 = module_0.Subversion(tuple_0, set_0, set_0, bool_1, bool_1, set_0, dict_0, set_0)
        var_0 = subversion_0.needs_update()
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = '__main__'
        list_0 = [str_0, str_0]
        bytes_0 = b'e\x93\x85w\x8fsm\x13z\x82`\xd7L\xd2\x86'
        dict_0 = {str_0: str_0, str_0: bytes_0}
        int_0 = 1082
        subversion_0 = module_0.Subversion(str_0, list_0, bytes_0, list_0, str_0, str_0, dict_0, int_0)
        var_0 = subversion_0.get_remote_revision()
    except BaseException:
        pass

def test_case_8():
    try:
        bytes_0 = b'\x91\x9fP\xa5@\x9f\x8fm?u*8\x0c\x81'
        str_0 = 'ansible.modules.subversion'
        bool_0 = False
        list_0 = []
        set_0 = {bool_0}
        float_0 = 0.5
        float_1 = -1089.5229
        tuple_0 = (float_0, float_1, bool_0)
        tuple_1 = (float_0, tuple_0)
        str_1 = 'u-RF]Jd\\=iJ|'
        subversion_0 = module_0.Subversion(bytes_0, str_0, bool_0, list_0, set_0, list_0, tuple_1, str_1)
        var_0 = subversion_0.has_local_mods()
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = '__main__'
        list_0 = [str_0]
        bytes_0 = b'e\x93\x85w\x8fsm\x13z\x82`\xd7L\xd2\x86'
        dict_0 = {str_0: str_0, str_0: bytes_0}
        int_0 = 1113
        subversion_0 = module_0.Subversion(str_0, list_0, bytes_0, list_0, str_0, str_0, dict_0, int_0)
        var_0 = subversion_0.checkout()
    except BaseException:
        pass

def test_case_10():
    try:
        int_0 = 3820
        str_0 = 'KxJ %2#\x0c(EmcrVH(}b}'
        bool_0 = False
        tuple_0 = (bool_0,)
        str_1 = '9S6Lm_E0{DO'
        float_0 = -2518.71203
        list_0 = []
        int_1 = -2956
        subversion_0 = module_0.Subversion(int_0, str_0, tuple_0, str_1, float_0, list_0, int_1, bool_0)
        str_2 = '^manual\\s*$'
        set_0 = set()
        bytes_0 = b'\xe4N'
        str_3 = '=G,f+7SNicG'
        dict_0 = {float_0: list_0, int_0: subversion_0, int_1: int_1, bytes_0: str_3}
        str_4 = 'Validate ``parameters`` against argument spec.\n\n        Error messages in the :class:`ValidationResult` may contain no_log values and should be\n        sanitized with :func:`~ansible.module_utils.common.parameters.sanitize_keys` before logging or displaying.\n\n        :arg parameters: Parameters to validate against the argument spec\n        :type parameters: dict[str, dict]\n\n        :return: :class:`ValidationResult` containing validated parameters.\n\n        :Simple Example:\n\n            .. code-block:: text\n\n                argument_spec = {\n                    \'name\': {\'type\': \'str\'},\n                    \'age\': {\'type\': \'int\'},\n                }\n\n                parameters = {\n                    \'name\': \'bo\',\n                    \'age\': \'42\',\n                }\n\n                validator = ArgumentSpecValidator(argument_spec)\n                result = validator.validate(parameters)\n\n                if result.error_messages:\n                    sys.exit("Validation failed: {0}".format(", ".join(result.error_messages))\n\n                valid_params = result.validated_parameters\n        '
        str_5 = 'w~">'
        subversion_1 = module_0.Subversion(subversion_0, str_2, set_0, dict_0, str_2, str_4, subversion_0, str_5)
        bytes_1 = b'>s\xba\xe6Rt\xae3s\x87V{\x00\xadN\x84\x1b'
        bool_1 = False
        str_6 = '9r'
        subversion_2 = module_0.Subversion(subversion_1, bytes_1, set_0, set_0, bool_1, bool_1, tuple_0, str_6)
        var_0 = subversion_2.export()
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = '__main__'
        list_0 = [str_0, str_0]
        bytes_0 = b'e\x93\x85w\x8fsm\x13z\x82`\xd7L\xd2\x86'
        dict_0 = {str_0: str_0, str_0: bytes_0}
        int_0 = 1082
        subversion_0 = module_0.Subversion(str_0, list_0, bytes_0, list_0, str_0, str_0, dict_0, int_0)
        var_0 = subversion_0.is_svn_repo()
    except BaseException:
        pass