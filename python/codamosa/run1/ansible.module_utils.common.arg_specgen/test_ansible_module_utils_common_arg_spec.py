# Automatically generated by Pynguin.
import ansible.module_utils.common.arg_spec as module_0

def test_case_0():
    pass

def test_case_1():
    set_0 = None
    validation_result_0 = module_0.ValidationResult(set_0)

def test_case_2():
    dict_0 = {}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_0)
    var_0 = argument_spec_validator_0.validate(dict_0)

def test_case_3():
    str_0 = 'naoe'
    str_1 = 'age'
    str_2 = 'str'
    str_3 = {}
    str_4 = '42'
    str_5 = {str_0: str_2, str_1: str_4}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_3)
    var_0 = argument_spec_validator_0.validate(str_5)
    var_1 = var_0.error_messages
    var_2 = var_0.validated_parameters

def test_case_4():
    str_0 = 'name'
    str_1 = 'str'
    str_2 = {}
    str_3 = {str_0: str_1, str_0: str_1}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_2)
    var_0 = argument_spec_validator_0.validate(str_3)
    var_1 = var_0.error_messages

def test_case_5():
    str_0 = 'name'
    str_1 = 'age'
    str_2 = 'type'
    str_3 = 'int'
    str_4 = {str_2: str_3}
    str_5 = {str_0: str_4, str_1: str_4}
    str_6 = 'bo'
    str_7 = '42'
    str_8 = {str_0: str_6, str_1: str_7}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_5)
    var_0 = argument_spec_validator_0.validate(str_8)
    var_1 = var_0.error_messages

def test_case_6():
    dict_0 = {}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_0)
    bool_0 = True
    str_0 = '=5V\n{7zaFwI>'
    dict_1 = {str_0: str_0, str_0: argument_spec_validator_0, str_0: bool_0}
    list_0 = [dict_1, argument_spec_validator_0, str_0]
    var_0 = argument_spec_validator_0.validate(dict_1, *list_0)

def test_case_7():
    dict_0 = {}
    list_0 = [dict_0]
    module_argument_spec_validator_0 = module_0.ModuleArgumentSpecValidator(*list_0)
    var_0 = module_argument_spec_validator_0.validate(dict_0)

def test_case_8():
    dict_0 = {}
    bool_0 = False
    list_0 = [dict_0, bool_0, dict_0]
    module_argument_spec_validator_0 = module_0.ModuleArgumentSpecValidator(*list_0)
    var_0 = module_argument_spec_validator_0.validate(dict_0)