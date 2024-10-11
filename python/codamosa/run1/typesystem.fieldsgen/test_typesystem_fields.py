# Automatically generated by Pynguin.
import typesystem.fields as module_0

def test_case_0():
    pass

def test_case_1():
    choice_0 = module_0.Choice()

def test_case_2():
    bool_0 = True
    field_0 = module_0.Field(allow_null=bool_0)
    any_0 = field_0.get_default_value()

def test_case_3():
    str_0 = 'hello'
    field_0 = module_0.Field(default=str_0)
    any_0 = field_0.get_default_value()

def test_case_4():
    str_0 = '26T#v(x_'
    field_0 = module_0.Field(title=str_0)
    array_0 = module_0.Array(field_0)
    any_0 = array_0.serialize(str_0)

def test_case_5():
    bool_0 = True
    string_0 = module_0.String(allow_blank=bool_0, trim_whitespace=bool_0)

def test_case_6():
    string_0 = module_0.String()
    var_0 = string_0 | string_0

def test_case_7():
    string_0 = module_0.String()

def test_case_8():
    str_0 = 'X}m'
    string_0 = module_0.String(pattern=str_0, format=str_0)

def test_case_9():
    str_0 = 'X}m'
    string_0 = module_0.String(pattern=str_0, format=str_0)
    any_0 = string_0.validate(str_0)

def test_case_10():
    string_0 = module_0.String()
    any_0 = string_0.serialize(string_0)

def test_case_11():
    number_0 = module_0.Number()

def test_case_12():
    int_0 = -59
    number_0 = module_0.Number(minimum=int_0, maximum=int_0, exclusive_minimum=int_0, exclusive_maximum=int_0)

def test_case_13():
    int_0 = -87
    number_0 = module_0.Number(multiple_of=int_0)

def test_case_14():
    int_0 = -1500
    number_0 = module_0.Number(maximum=int_0)
    any_0 = number_0.validate(int_0)

def test_case_15():
    int_0 = -96
    number_0 = module_0.Number(multiple_of=int_0)
    any_0 = number_0.validate(int_0)

def test_case_16():
    int_0 = -190
    int_1 = [int_0, int_0, int_0, int_0, int_0, int_0]
    decimal_0 = module_0.Decimal(exclusive_minimum=int_0)
    any_0 = decimal_0.serialize(int_0)
    integer_0 = module_0.Integer()
    array_0 = module_0.Array(integer_0)
    any_1 = array_0.validate(int_1)

def test_case_17():
    object_0 = module_0.Object()

def test_case_18():
    list_0 = []
    array_0 = module_0.Array(list_0)

def test_case_19():
    array_0 = module_0.Array()

def test_case_20():
    text_0 = module_0.Text()

def test_case_21():
    date_0 = module_0.Date()

def test_case_22():
    time_0 = module_0.Time()

def test_case_23():
    date_time_0 = module_0.DateTime()

def test_case_24():
    str_0 = '$V&/#J\\CM\ty2/4'
    bool_0 = True
    field_0 = module_0.Field(title=str_0, default=str_0, allow_null=bool_0)
    field_1 = module_0.Field(title=str_0)
    union_0 = field_1.__or__(field_0)

def test_case_25():
    str_0 = 'X}m'
    const_0 = module_0.Const(str_0)
    string_0 = module_0.String(pattern=str_0, format=str_0)
    any_0 = string_0.validate(str_0)

def test_case_26():
    bool_0 = None
    str_0 = 'X}m'
    int_0 = -1222
    string_0 = module_0.String(min_length=int_0, format=str_0)
    any_0 = string_0.serialize(bool_0)

def test_case_27():
    bool_0 = True
    str_0 = 'X}m4'
    string_0 = module_0.String(allow_blank=bool_0, format=str_0)
    any_0 = string_0.validate(str_0, strict=bool_0)

def test_case_28():
    int_0 = 2
    int_1 = [int_0, int_0, int_0]
    choice_0 = module_0.Choice(choices=int_1)
    any_0 = choice_0.validate(int_0)

def test_case_29():
    int_0 = 1637
    object_0 = module_0.Object(min_properties=int_0, max_properties=int_0)

def test_case_30():
    str_0 = 't}]^/jQ=\\t/nc%::1m'
    field_0 = module_0.Field(title=str_0)
    int_0 = 785
    array_0 = module_0.Array(field_0)
    array_1 = module_0.Array(field_0, field_0, int_0, int_0)

def test_case_31():
    str_0 = 'ai+\r?[\x0cBC'
    field_0 = module_0.Field(title=str_0)
    array_0 = module_0.Array(field_0)
    boolean_0 = module_0.Boolean()

def test_case_32():
    array_0 = module_0.Array()
    any_0 = array_0.serialize(array_0)

def test_case_33():
    field_0 = module_0.Field()
    any_0 = field_0.get_default_value()

def test_case_34():
    list_0 = []
    array_0 = module_0.Array(list_0)
    bool_0 = True
    boolean_0 = module_0.Boolean(default=list_0)
    any_0 = boolean_0.validate(bool_0)

def test_case_35():
    bool_0 = False
    str_0 = ':'
    string_0 = module_0.String(trim_whitespace=bool_0, pattern=str_0, format=str_0)
    any_0 = string_0.validate(str_0)

def test_case_36():
    float_0 = 405.0
    number_0 = module_0.Number(minimum=float_0, maximum=float_0, multiple_of=float_0)
    any_0 = number_0.validate(float_0)

def test_case_37():
    dict_0 = {}
    int_0 = 3833
    object_0 = module_0.Object(max_properties=int_0)
    any_0 = object_0.validate(dict_0)

def test_case_38():
    field_0 = module_0.Field()
    str_0 = 'iS&HS*('
    dict_0 = {str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0}
    object_0 = module_0.Object()
    any_0 = object_0.validate(dict_0)

def test_case_39():
    int_0 = -1495
    int_1 = -1480
    number_0 = module_0.Number(maximum=int_0, exclusive_maximum=int_1, multiple_of=int_0)
    any_0 = number_0.validate(int_0)

def test_case_40():
    str_0 = 'yy"W[g\nA<{cKL\x0cWr3l'
    field_0 = module_0.Field(default=str_0)
    dict_0 = {}
    dict_1 = {str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0}
    object_0 = module_0.Object(properties=dict_1, property_names=field_0)
    any_0 = object_0.validate(dict_0)

def test_case_41():
    bool_0 = True
    str_0 = 'X}m4'
    string_0 = module_0.String(allow_blank=bool_0, trim_whitespace=bool_0, pattern=str_0, format=str_0)
    any_0 = string_0.validate(str_0, strict=bool_0)

def test_case_42():
    field_0 = module_0.Field()
    str_0 = 'SHS*O'
    dict_0 = {str_0: field_0, str_0: field_0, str_0: field_0}
    field_1 = None
    field_2 = None
    object_0 = module_0.Object(pattern_properties=dict_0, additional_properties=field_1, property_names=field_2)
    any_0 = object_0.validate(dict_0)

def test_case_43():
    str_0 = 'yy"W[g\nA<{cKL\x0cWr3l'
    field_0 = module_0.Field(default=str_0)
    dict_0 = {}
    dict_1 = {str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0, str_0: field_0}
    object_0 = module_0.Object(pattern_properties=dict_1, property_names=field_0, **dict_0)
    any_0 = object_0.validate(dict_0)

def test_case_44():
    list_0 = []
    array_0 = module_0.Array(list_0)
    any_0 = array_0.validate(list_0)

def test_case_45():
    int_0 = -188
    int_1 = [int_0, int_0, int_0, int_0, int_0, int_0]
    array_0 = module_0.Array()
    any_0 = array_0.validate(int_1)

def test_case_46():
    int_0 = -8
    int_1 = [int_0, int_0, int_0, int_0, int_0, int_0]
    integer_0 = module_0.Integer()
    array_0 = module_0.Array(integer_0)
    any_0 = array_0.validate(int_1)

def test_case_47():
    list_0 = []
    array_0 = module_0.Array()
    any_0 = array_0.validate(list_0)

def test_case_48():
    field_0 = module_0.Field()
    str_0 = '6L7\x0bE0zr\rn'
    dict_0 = {str_0: field_0, str_0: field_0, str_0: field_0}
    field_1 = None
    object_0 = module_0.Object(pattern_properties=dict_0, additional_properties=field_1, property_names=field_1)
    bool_0 = True
    string_0 = module_0.String(allow_blank=bool_0, format=str_0)
    any_0 = string_0.validate(field_1)

def test_case_49():
    list_0 = []
    array_0 = module_0.Array(list_0)
    any_0 = array_0.serialize(list_0)

def test_case_50():
    bool_0 = True
    list_0 = []
    array_0 = module_0.Array(list_0, bool_0)

def test_case_51():
    int_0 = None
    array_0 = module_0.Array(int_0)
    str_0 = 'YFt_RmTT}IJ4dsR'
    bool_0 = True
    field_0 = module_0.Field(title=str_0, allow_null=bool_0)
    date_time_0 = module_0.DateTime()
    field_1 = module_0.Field(default=date_time_0)
    union_0 = field_1.__or__(field_0)
    any_0 = union_0.validate(int_0)

def test_case_52():
    number_0 = module_0.Number()
    string_0 = module_0.String()
    var_0 = [number_0, number_0, string_0]
    union_0 = module_0.Union(var_0)
    str_0 = '=2\\{vJ^]N\rb9,(a'
    any_0 = union_0.validate(str_0)

def test_case_53():
    boolean_0 = module_0.Boolean()
    list_0 = [boolean_0, boolean_0, boolean_0]
    array_0 = module_0.Array(list_0)
    any_0 = array_0.serialize(list_0)