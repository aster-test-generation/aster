# Automatically generated by Pynguin.
import ansible.constants as module_0

def test_case_0():
    try:
        int_0 = -1253
        list_0 = [int_0, int_0]
        tuple_0 = (int_0,)
        bool_0 = True
        deprecated_sequence_constant_0 = module_0._DeprecatedSequenceConstant(tuple_0, bool_0, int_0)
        var_0 = deprecated_sequence_constant_0.__getitem__(list_0)
    except BaseException:
        pass

def test_case_1():
    try:
        set_0 = set()
        int_0 = 27
        str_0 = "NjjD<'F3GN^76`"
        float_0 = -91.0
        deprecated_sequence_constant_0 = module_0._DeprecatedSequenceConstant(int_0, str_0, float_0)
        var_0 = deprecated_sequence_constant_0.__getitem__(set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b''
        str_0 = '4vpQ%'
        dict_0 = {bytes_0: str_0}
        float_0 = 1740.0
        deprecated_sequence_constant_0 = module_0._DeprecatedSequenceConstant(dict_0, bytes_0, float_0)
        var_0 = deprecated_sequence_constant_0.__len__()
        float_1 = 2.0
        bool_0 = True
        tuple_0 = None
        tuple_1 = (bool_0, tuple_0)
        deprecated_sequence_constant_1 = module_0._DeprecatedSequenceConstant(str_0, float_1, tuple_1)
        var_1 = deprecated_sequence_constant_1.__getitem__(bytes_0)
    except BaseException:
        pass