# Automatically generated by Pynguin.
import ansible.module_utils.common.arg_spec as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'Eyx&V]\rJe[E/4S\rL1U]D'
    validation_result_0 = module_0.ValidationResult(str_0)
    validation_result_1 = module_0.ValidationResult(validation_result_0)

def test_case_2():
    str_0 = 'name'
    str_1 = {}
    str_2 = {str_0: str_0, str_0: str_1}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_2)

def test_case_3():
    dict_0 = {}
    list_0 = [dict_0]
    module_argument_spec_validator_0 = module_0.ModuleArgumentSpecValidator(*list_0)
    var_0 = module_argument_spec_validator_0.validate(dict_0)

def test_case_4():
    str_0 = '6D@n)y<^X'
    float_0 = 746.0
    dict_0 = {}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_0, float_0, str_0, float_0)
    var_0 = argument_spec_validator_0.validate(dict_0, **dict_0)

def test_case_5():
    str_0 = '6D@n)y<^X'
    float_0 = 746.0
    dict_0 = {str_0: str_0, str_0: str_0}
    dict_1 = {}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(dict_1, float_0, str_0, float_0)
    var_0 = argument_spec_validator_0.validate(dict_0, **dict_0)

def test_case_6():
    str_0 = 'age'
    str_1 = 'type'
    str_2 = 'str'
    str_3 = {str_1: str_2}
    str_4 = {str_1: str_0}
    str_5 = {str_1: str_3, str_0: str_4}
    str_6 = 'bo'
    str_7 = {str_6: str_6, str_0: str_2}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_5)
    var_0 = argument_spec_validator_0.validate(str_7)
    var_1 = var_0.validated_parameters

def test_case_7():
    str_0 = 'age'
    str_1 = 'type'
    str_2 = 'str'
    str_3 = {str_1: str_2}
    str_4 = {str_1: str_0}
    str_5 = {str_1: str_3, str_0: str_4}
    str_6 = 'bo'
    str_7 = {str_6: str_6, str_0: str_2}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_5)
    var_0 = argument_spec_validator_0.validate(str_7)
    var_1 = var_0.error_messages
    var_2 = var_0.validated_parameters

def test_case_8():
    str_0 = 'name'
    str_1 = 'age'
    str_2 = 'exclude'
    str_3 = 'include'
    str_4 = 'type'
    str_5 = 'str'
    str_6 = {str_4: str_5}
    str_7 = 'int'
    str_8 = {str_4: str_7}
    str_9 = 'default'
    str_10 = 'list'
    str_11 = ''
    str_12 = {str_4: str_10, str_9: str_11}
    str_13 = {str_4: str_10, str_9: str_11}
    str_14 = {str_0: str_6, str_1: str_8, str_2: str_12, str_3: str_13}
    str_15 = 'bo'
    str_16 = '42'
    str_17 = 'sample'
    str_18 = {str_0: str_15, str_1: str_16, str_2: str_17, str_3: str_17}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(str_14)
    var_0 = argument_spec_validator_0.validate(str_18)
    var_1 = print(str_0)
    var_2 = print(str_14)
    str_19 = '\n'
    var_3 = print(str_19)
    str_20 = 'parameters = '
    var_4 = print(str_20)
    var_5 = print(str_18)
    var_6 = print(str_19)
    str_21 = 'result.unsupported_parameters = '
    var_7 = print(str_21)
    var_8 = var_0.unsupported_parameters
    var_9 = print(var_8)
    var_10 = set()

def test_case_9():
    str_0 = 'age'
    str_1 = 'no_log'
    str_2 = 'ty'
    str_3 = 'aliases'
    str_4 = 'str'
    str_5 = 'username'
    str_6 = [str_5]
    str_7 = {str_2: str_4, str_3: str_6}
    str_8 = 'int'
    str_9 = 'years'
    str_10 = [str_9]
    str_11 = {str_2: str_8, str_3: str_10}
    str_12 = 'default'
    str_13 = 'bool'
    bool_0 = False
    var_0 = {str_2: str_13, str_12: bool_0}
    var_1 = {str_5: str_7, str_0: str_11, str_1: var_0}
    str_14 = 'test'
    str_15 = '21'
    bool_1 = True
    var_2 = {str_5: str_14, str_9: str_15, str_1: bool_1}
    argument_spec_validator_0 = module_0.ArgumentSpecValidator(var_1)
    var_3 = argument_spec_validator_0.validate(var_2)
    var_4 = var_3.error_messages
    str_16 = 'Validatd parameters: %s'
    var_5 = var_3.validated_parameters
    var_6 = str_16 % var_5
    var_7 = print(var_6)