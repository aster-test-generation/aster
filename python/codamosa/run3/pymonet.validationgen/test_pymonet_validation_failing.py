# Automatically generated by Pynguin.
import pymonet.validation as module_0

def test_case_0():
    try:
        str_0 = "hXQ+'EG|w:H'me\n"
        bool_0 = True
        validation_0 = module_0.Validation(str_0, bool_0)
        var_0 = validation_0.is_fail()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '\\R\'Ix"wuOrEb0P5h|,'
        float_0 = 1280.055
        bool_0 = True
        set_0 = {float_0, float_0, bool_0}
        tuple_0 = (float_0, bool_0, set_0, set_0)
        str_1 = '--TzaR"}\\CSz\x0bA\\:\x0ck'
        validation_0 = module_0.Validation(tuple_0, str_1)
        var_0 = validation_0.map(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = 2888
        dict_0 = {int_0: int_0, int_0: int_0}
        bytes_0 = None
        set_0 = {bytes_0, bytes_0}
        bool_0 = None
        int_1 = -3686
        dict_1 = {bytes_0: bool_0, bool_0: bool_0, int_1: bool_0}
        tuple_0 = (dict_1,)
        validation_0 = module_0.Validation(set_0, tuple_0)
        var_0 = validation_0.bind(dict_0)
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        int_0 = -232
        str_0 = '"rQo@j]6]rR|yKh'
        validation_0 = module_0.Validation(int_0, str_0)
        float_0 = 1190.069
        var_0 = validation_0.__eq__(float_0)
        var_1 = validation_0.ap(dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'h-8}fi|5P'
        dict_0 = {}
        validation_0 = module_0.Validation(str_0, dict_0)
        var_0 = validation_0.to_either()
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = 340.45409
        str_0 = '\n        :param semigroup: other semigroup to concat\n        :type semigroup: All[B]\n        :returns: new All with last truly value or first falsy\n        :rtype: All[A | B]\n        '
        bool_0 = True
        validation_0 = module_0.Validation(str_0, bool_0)
        str_1 = '\t*lA~C;W\\c\x0c,=aLV\\oC3'
        validation_1 = module_0.Validation(validation_0, str_1)
        var_0 = validation_1.to_maybe()
        var_1 = validation_1.to_either()
        var_2 = validation_0.__eq__(float_0)
    except BaseException:
        pass

def test_case_6():
    try:
        float_0 = 1081.450841
        list_0 = [float_0, float_0, float_0, float_0]
        float_1 = 489.4998
        validation_0 = module_0.Validation(list_0, float_1)
        int_0 = True
        validation_1 = module_0.Validation(validation_0, int_0)
        var_0 = validation_1.to_maybe()
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = '\n    Maybe type is the most common way of representing nothingness (or the null type).\n    Maybe is effectively abstract and has two concrete subtypes: Box (also Some) and Nothing.\n    '
        dict_0 = {str_0: str_0, str_0: str_0}
        str_1 = 'l\\\rAU4f@r}'
        validation_0 = module_0.Validation(dict_0, str_1)
        var_0 = validation_0.is_fail()
        bytes_0 = b'\xc6\xff\xde|\x1e\xd9\xect\xb9\xc9sV0@\xd8'
        dict_1 = {bytes_0: bytes_0, bytes_0: bytes_0}
        float_0 = 4261.9
        validation_1 = module_0.Validation(dict_1, float_0)
        validation_2 = module_0.Validation(bytes_0, validation_1)
        var_1 = validation_1.to_box()
        var_2 = validation_2.bind(str_0)
    except BaseException:
        pass

def test_case_8():
    try:
        list_0 = []
        int_0 = True
        float_0 = 1120.09
        set_0 = set()
        validation_0 = module_0.Validation(float_0, set_0)
        var_0 = validation_0.is_success()
        validation_1 = module_0.Validation(int_0, list_0)
        var_1 = validation_1.to_try()
        var_2 = validation_1.to_either()
        var_3 = validation_1.to_maybe()
        var_4 = validation_1.__str__()
        bool_0 = False
        var_5 = validation_1.bind(bool_0)
    except BaseException:
        pass

def test_case_9():
    try:
        float_0 = 1868.011848914365
        set_0 = {float_0, float_0, float_0, float_0}
        bytes_0 = b'\xc6'
        validation_0 = module_0.Validation(bytes_0, set_0)
        var_0 = validation_0.__eq__(set_0)
        bool_0 = False
        bytes_1 = b'\t\xaaJ\xc7'
        validation_1 = module_0.Validation(bool_0, bytes_1)
        var_1 = validation_1.is_fail()
        var_2 = validation_0.to_either()
        var_3 = validation_0.__str__()
        var_4 = validation_0.is_success()
        var_5 = validation_1.__eq__(validation_1)
    except BaseException:
        pass