# Automatically generated by Pynguin.
import tornado.log as module_0
import logging as module_1

def test_case_0():
    try:
        log_formatter_0 = module_0.LogFormatter()
        str_0 = log_formatter_0.format(log_formatter_0)
    except BaseException:
        pass

def test_case_1():
    try:
        module_0.define_logging_options()
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        log_formatter_0 = module_0.LogFormatter(bool_0)
        str_0 = 'Z-#)+ooCB5q"yEDoL'
        int_0 = 1219
        int_1 = 365
        module_0.enable_pretty_logging()
        int_2 = 200
        module_0.enable_pretty_logging()
        dict_0 = {int_0: int_1, int_1: int_2, int_2: int_2}
        log_formatter_1 = module_0.LogFormatter(str_0, dict_0)
        dict_1 = {}
        str_1 = log_formatter_0.format(dict_1)
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        list_0 = [dict_0, dict_0, dict_0, dict_0]
        module_0.enable_pretty_logging(list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        module_0.enable_pretty_logging()
        set_0 = set()
        module_0.enable_pretty_logging()
        logger_0 = module_1.Logger(set_0)
        module_0.enable_pretty_logging()
        log_formatter_0 = module_0.LogFormatter()
        str_0 = 'O'
        str_1 = '7w3'
        str_2 = 'it_IT'
        dict_0 = {}
        log_formatter_1 = module_0.LogFormatter(str_0, str_1, str_2, dict_0)
        module_0.define_logging_options()
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'd"!\\~O@s,}1}vVH%J'
        log_formatter_0 = module_0.LogFormatter(str_0)
        tuple_0 = None
        bool_0 = False
        log_formatter_1 = module_0.LogFormatter(bool_0)
        logger_0 = module_1.Logger(log_formatter_1)
        module_0.enable_pretty_logging(tuple_0, logger_0)
        str_1 = log_formatter_0.format(tuple_0)
    except BaseException:
        pass