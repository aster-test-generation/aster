# Automatically generated by Pynguin.
import typesystem.formats as module_0
import uuid as module_1

def test_case_0():
    pass

def test_case_1():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2019-1-07T00:00:0'
    datetime_0 = date_time_format_0.validate(str_0)

def test_case_2():
    u_u_i_d_format_0 = module_0.UUIDFormat()
    str_0 = 'a8098c1a-f86e-11da-bd1a-00112444be1e'
    u_u_i_d_0 = module_1.UUID(str_0)
    u_u_i_d_1 = u_u_i_d_format_0.validate(str_0)

def test_case_3():
    bool_0 = None
    list_0 = []
    u_u_i_d_format_0 = module_0.UUIDFormat(*list_0)
    str_0 = u_u_i_d_format_0.serialize(bool_0)

def test_case_4():
    date_format_0 = module_0.DateFormat()
    str_0 = '2020-11-01'
    date_0 = date_format_0.validate(str_0)

def test_case_5():
    str_0 = '2021-11-11T17:00:00.123456+01:00'
    date_time_format_0 = module_0.DateTimeFormat()
    datetime_0 = date_time_format_0.validate(str_0)

def test_case_6():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2021-11-12T06:32:15.000100'
    datetime_0 = date_time_format_0.validate(str_0)
    optional_0 = date_time_format_0.serialize(datetime_0)