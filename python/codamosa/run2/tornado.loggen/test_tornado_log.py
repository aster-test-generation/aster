# Automatically generated by Pynguin.
import tornado.log as module_0
import logging as module_1

def test_case_0():
    pass

def test_case_1():
    log_formatter_0 = module_0.LogFormatter()

def test_case_2():
    module_0.enable_pretty_logging()

def test_case_3():
    str_0 = 'Y]xt@N3s[UpJslD8'
    int_0 = 66
    var_0 = None
    log_record_0 = module_1.LogRecord(str_0, int_0, str_0, int_0, str_0, var_0, var_0)
    log_formatter_0 = module_0.LogFormatter()
    str_1 = log_formatter_0.format(log_record_0)