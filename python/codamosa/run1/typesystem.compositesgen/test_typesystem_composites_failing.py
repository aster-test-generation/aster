# Automatically generated by Pynguin.
import typesystem.composites as module_0
import typesystem.fields as module_1

def test_case_0():
    try:
        list_0 = []
        one_of_0 = module_0.OneOf(list_0)
        any_0 = one_of_0.validate(one_of_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = None
        field_0 = None
        list_0 = [field_0, field_0, field_0, field_0]
        one_of_0 = module_0.OneOf(list_0)
        any_0 = one_of_0.validate(float_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = 257.168
        str_0 = 'rjq"4hP=x.\\L*l5 M'
        bool_0 = None
        field_0 = module_1.Field(title=str_0, default=str_0, allow_null=bool_0)
        list_0 = [field_0]
        all_of_0 = module_0.AllOf(list_0)
        any_0 = all_of_0.validate(float_0)
    except BaseException:
        pass

def test_case_3():
    try:
        field_0 = None
        not_0 = module_0.Not(field_0)
        any_0 = not_0.validate(field_0)
    except BaseException:
        pass

def test_case_4():
    try:
        any_0 = module_1.Any()
        field_0 = module_1.Field()
        if_then_else_0 = module_0.IfThenElse(any_0, field_0, field_0)
        any_1 = if_then_else_0.validate(any_0)
    except BaseException:
        pass

def test_case_5():
    try:
        any_0 = module_1.Any()
        not_0 = module_0.Not(any_0)
        str_0 = 'hello'
        any_1 = not_0.validate(str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        any_0 = module_1.Any()
        any_1 = [any_0, any_0, any_0]
        one_of_0 = module_0.OneOf(any_1)
        int_0 = 1
        any_2 = one_of_0.validate(int_0)
    except BaseException:
        pass

def test_case_7():
    try:
        list_0 = []
        str_0 = 'lw!n!/'
        dict_0 = {str_0: str_0}
        field_0 = module_1.Field(default=dict_0)
        never_match_0 = module_0.NeverMatch()
        if_then_else_0 = module_0.IfThenElse(field_0, field_0)
        any_0 = module_1.Any()
        any_1 = [any_0]
        one_of_0 = module_0.OneOf(any_1)
        any_2 = one_of_0.validate(list_0)
        not_0 = module_0.Not(field_0)
        all_of_0 = module_0.AllOf(list_0)
        any_3 = all_of_0.validate(any_1)
        never_match_1 = module_0.NeverMatch(**dict_0)
    except BaseException:
        pass

def test_case_8():
    try:
        never_match_0 = module_0.NeverMatch()
        field_0 = module_1.Field()
        var_0 = [never_match_0, field_0, field_0]
        bool_0 = False
        one_of_0 = module_0.OneOf(var_0)
        str_0 = 'abc'
        any_0 = one_of_0.validate(str_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'allow_null'
        bool_0 = False
        str_1 = 'C/2S(x\tNL8NY'
        field_0 = module_1.Field(description=str_1, default=str_1, allow_null=bool_0)
        list_0 = [field_0]
        dict_0 = {str_0: list_0}
        all_of_0 = module_0.AllOf(list_0, **dict_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'lw!n!/'
        dict_0 = {str_0: str_0}
        field_0 = module_1.Field(default=dict_0)
        never_match_0 = module_0.NeverMatch()
        if_then_else_0 = module_0.IfThenElse(field_0, field_0)
        any_0 = module_1.Any()
        str_1 = 'allow_null'
        dict_1 = {str_0: field_0, str_1: dict_0}
        if_then_else_1 = module_0.IfThenElse(field_0, field_0, field_0, **dict_1)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'allow_null'
        bool_0 = False
        str_1 = 'C/2S(x\tNL8NY'
        str_2 = '@P}0'
        str_3 = 'WP[)f2Tz^&9?'
        dict_0 = {str_0: str_0, str_2: str_1, str_3: str_0, str_2: bool_0}
        never_match_0 = module_0.NeverMatch(**dict_0)
    except BaseException:
        pass

def test_case_12():
    try:
        list_0 = []
        str_0 = "1Ng^T'_^sGOQER"
        str_1 = 'allow_null'
        all_of_0 = module_0.AllOf(list_0)
        set_0 = None
        dict_0 = {str_0: str_0, str_1: all_of_0, str_0: set_0}
        one_of_0 = module_0.OneOf(list_0, **dict_0)
    except BaseException:
        pass