# Automatically generated by Pynguin.
import typesystem.formats as module_0
import datetime as module_1

def test_case_0():
    date_time_format_0 = module_0.DateTimeFormat()

def test_case_1():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2021-06-08T12:00:00.0000000'
    date_format_0 = module_0.DateFormat()
    datetime_0 = date_time_format_0.validate(str_0)
    datetime_1 = None
    optional_0 = date_format_0.serialize(datetime_1)
    datetime_2 = date_time_format_0.validate(str_0)
    optional_1 = date_time_format_0.serialize(datetime_2)

def test_case_2():
    str_0 = '2020-10-22T22:22:22'
    date_time_format_0 = module_0.DateTimeFormat()
    datetime_0 = date_time_format_0.validate(str_0)

def test_case_3():
    date_time_format_0 = module_0.DateTimeFormat()
    u_u_i_d_format_0 = module_0.UUIDFormat()
    bool_0 = u_u_i_d_format_0.is_native_type(date_time_format_0)

def test_case_4():
    time_format_0 = module_0.TimeFormat()
    str_0 = '00:00:01.000000'
    time_0 = time_format_0.validate(str_0)

def test_case_5():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2021-06-08T12:00:00.0000000'
    datetime_0 = date_time_format_0.validate(str_0)
    optional_0 = date_time_format_0.serialize(datetime_0)

def test_case_6():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2000-12-12 00:00:00'
    datetime_0 = date_time_format_0.validate(str_0)
    optional_0 = date_time_format_0.serialize(datetime_0)

def test_case_7():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2021-05-18T10:05:00-08:00'
    datetime_0 = date_time_format_0.validate(str_0)

def test_case_8():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2021-06-08T12:00:00.000000'
    datetime_0 = date_time_format_0.validate(str_0)
    str_1 = '2021-06-08T12:00:00.000'
    datetime_1 = date_time_format_0.validate(str_1)
    str_2 = '2021-06-08T12:00:00'
    datetime_2 = date_time_format_0.validate(str_2)
    time_format_0 = module_0.TimeFormat()
    time_0 = module_1.time()
    optional_0 = time_format_0.serialize(time_0)

def test_case_9():
    date_time_format_0 = module_0.DateTimeFormat()
    var_0 = None
    optional_0 = date_time_format_0.serialize(var_0)
    str_0 = '1995-10-01T08:56:34.123456'
    datetime_0 = date_time_format_0.validate(str_0)
    optional_1 = date_time_format_0.serialize(datetime_0)
    str_1 = '1995-10-01T08:56:34+01:00'
    datetime_1 = date_time_format_0.validate(str_1)

def test_case_10():
    date_time_format_0 = module_0.DateTimeFormat()
    str_0 = '2019-07-16T19:20:30Z'
    datetime_0 = date_time_format_0.validate(str_0)
    optional_0 = date_time_format_0.serialize(datetime_0)