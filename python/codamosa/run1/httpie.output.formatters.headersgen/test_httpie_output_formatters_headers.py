# Automatically generated by Pynguin.
import httpie.output.formatters.headers as module_0

def test_case_0():
    str_0 = 'format_options'
    str_1 = 'headers'
    str_2 = 'sort'
    bool_0 = False
    bool_1 = {str_2: bool_0}
    bool_2 = {str_1: bool_1}
    bool_3 = {str_0: bool_2}
    headers_formatter_0 = module_0.HeadersFormatter(**bool_3)

def test_case_1():
    str_0 = 'format_options'
    str_1 = 'headers'
    str_2 = 'sort'
    bool_0 = True
    bool_1 = {str_2: bool_0}
    bool_2 = {str_1: bool_1}
    bool_3 = {str_0: bool_2}
    headers_formatter_0 = module_0.HeadersFormatter(**bool_3)
    str_3 = headers_formatter_0.format_headers(str_1)

def test_case_2():
    str_0 = 'format_options'
    str_1 = 'headers'
    str_2 = 'sort'
    bool_0 = True
    bool_1 = {str_2: bool_0}
    bool_2 = {str_1: bool_1}
    bool_3 = {str_0: bool_2}
    headers_formatter_0 = module_0.HeadersFormatter(**bool_3)
    str_3 = 'h=97Xbz++z[o'
    str_4 = headers_formatter_0.format_headers(str_3)
    str_5 = '\n    '
    str_6 = headers_formatter_0.format_headers(str_5)