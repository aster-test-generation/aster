# Automatically generated by Pynguin.
import ansible.module_utils.common.arg_spec as module_0

def test_case_0():
    try:
        dict_0 = {}
        argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_0)
        bytes_0 = b"\xc3\xd7G\x1a\xb4^\x17\xb1'\x8d\x96WH~s"
        var_0 = argument_spec_validator_0.validate(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        dict_0 = {}
        module_argument_spec_validator_0 = module_0.ModuleArgumentSpecValidator(**dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'sending task start callback, copying the task so we can template it temporarily'
        dict_0 = {str_0: str_0}
        argument_spec_validator_0 = None
        argument_spec_validator_1 = module_0.ArgumentSpecValidator(dict_0, argument_spec_validator_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'name'
        str_1 = 'age'
        str_2 = 'aliases'
        str_3 = 'type'
        str_4 = 'read_name'
        str_5 = [str_4]
        str_6 = 'str'
        str_7 = {str_2: str_5, str_3: str_6}
        str_8 = 'int'
        str_9 = {str_3: str_8}
        str_10 = {str_0: str_7, str_1: str_9}
        argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_10)
        var_0 = argument_spec_validator_0._mutually_exclusive
        var_1 = None
        var_2 = isinstance(var_0, var_1)
    except BaseException:
        pass

def test_case_4():
    try:
        dict_0 = {}
        argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_0)
        bool_0 = False
        list_0 = [dict_0, argument_spec_validator_0, bool_0, bool_0, dict_0]
        module_argument_spec_validator_0 = module_0.ModuleArgumentSpecValidator(*list_0)
        var_0 = module_argument_spec_validator_0.validate(dict_0)
        str_0 = '--with-colons'
        str_1 = '8rJBl1N!b<'
        float_0 = -1432.586907
        dict_1 = {str_1: float_0, str_0: list_0, str_1: str_0}
        var_1 = argument_spec_validator_0.validate(bool_0, **dict_1)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '*,&<\r~#~Z[&%5(}wO\r'
        list_0 = []
        dict_0 = {}
        bool_0 = False
        validation_result_0 = module_0.ValidationResult(bool_0)
        argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_0, str_0, list_0, validation_result_0, str_0)
        var_0 = argument_spec_validator_0.validate(dict_0, *list_0)
    except BaseException:
        pass