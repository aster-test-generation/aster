# Automatically generated by Pynguin.
import requests.models as module_0
import httpie.context as module_1
import argparse as module_2
import httpie.output.writer as module_3
import typing as module_4

def test_case_0():
    try:
        response_0 = module_0.Response()
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        var_0 = module_3.write_message(response_0, environment_0, namespace_0, environment_0)
    except BaseException:
        pass

def test_case_1():
    try:
        base_stream_0 = None
        i_o_0 = None
        bool_0 = False
        var_0 = module_3.write_stream(base_stream_0, i_o_0, bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        base_stream_0 = None
        text_i_o_0 = module_4.TextIO()
        bool_0 = True
        var_0 = module_3.write_stream_with_colors_win_py3(base_stream_0, text_i_o_0, bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        tuple_0 = module_3.get_stream_type_and_kwargs(environment_0, namespace_0)
    except BaseException:
        pass

def test_case_4():
    try:
        prepared_request_0 = module_0.PreparedRequest()
        environment_0 = module_1.Environment()
        namespace_0 = None
        text_i_o_0 = module_4.TextIO()
        var_0 = module_3.write_message(prepared_request_0, environment_0, namespace_0, namespace_0, text_i_o_0)
    except BaseException:
        pass

def test_case_5():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        str_0 = 'style'
        bool_0 = True
        var_0 = setattr(namespace_0, str_0, bool_0)
        str_1 = 'prettify'
        var_1 = setattr(namespace_0, str_1, bool_0)
        str_2 = 'son'
        bool_1 = False
        var_2 = setattr(namespace_0, str_2, bool_1)
        tuple_0 = module_3.get_stream_type_and_kwargs(environment_0, namespace_0)
    except BaseException:
        pass

def test_case_6():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        bool_0 = True
        str_0 = 'stream'
        var_0 = setattr(namespace_0, str_0, bool_0)
        str_1 = 'prettify'
        var_1 = setattr(namespace_0, str_1, bool_0)
        str_2 = 'json'
        bool_1 = True
        var_2 = setattr(namespace_0, str_2, bool_1)
        tuple_0 = module_3.get_stream_type_and_kwargs(environment_0, namespace_0)
    except BaseException:
        pass

def test_case_7():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        str_0 = 'style'
        str_1 = 'solarized'
        var_0 = setattr(namespace_0, str_0, str_1)
        bool_0 = True
        str_2 = 'stream'
        var_1 = setattr(namespace_0, str_2, bool_0)
        str_3 = 'prettify'
        var_2 = setattr(namespace_0, str_3, bool_0)
        str_4 = 'json'
        bool_1 = False
        var_3 = setattr(namespace_0, str_4, bool_1)
        tuple_0 = module_3.get_stream_type_and_kwargs(environment_0, namespace_0)
    except BaseException:
        pass

def test_case_8():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        str_0 = 'style'
        str_1 = 'solarized'
        var_0 = setattr(namespace_0, str_0, str_1)
        bool_0 = True
        str_2 = 'stream'
        var_1 = setattr(namespace_0, str_2, bool_0)
        str_3 = 'prettify'
        var_2 = setattr(namespace_0, str_3, bool_0)
        bool_1 = False
        var_3 = setattr(namespace_0, str_3, bool_1)
        tuple_0 = module_3.get_stream_type_and_kwargs(environment_0, namespace_0)
        var_4 = get_stream_type_and_kwargs(environment_0, namespace_0)[bool_1]
    except BaseException:
        pass

def test_case_9():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        str_0 = 'style'
        str_1 = 'solarized'
        var_0 = setattr(namespace_0, str_0, str_1)
        bool_0 = False
        str_2 = 'stream'
        var_1 = setattr(namespace_0, str_2, bool_0)
        str_3 = 'prettify'
        var_2 = setattr(namespace_0, str_3, namespace_0)
        bool_1 = False
        var_3 = setattr(namespace_0, str_3, bool_1)
        tuple_0 = module_3.get_stream_type_and_kwargs(environment_0, namespace_0)
        var_4 = get_stream_type_and_kwargs(environment_0, namespace_0)[bool_1]
    except BaseException:
        pass

def test_case_10():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        bool_0 = True
        str_0 = 'stream'
        var_0 = setattr(namespace_0, str_0, bool_0)
        response_0 = module_0.Response()
        int_0 = -4337
        var_1 = module_3.write_message(response_0, environment_0, namespace_0, int_0)
    except BaseException:
        pass

def test_case_11():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        bool_0 = False
        str_0 = 'stream'
        var_0 = setattr(namespace_0, str_0, bool_0)
        str_1 = 'YFu<g 9#eZ'
        var_1 = environment_0.log_error(str_1)
        var_2 = environment_0.log_error(namespace_0)
        str_2 = 'prettify'
        bool_1 = True
        var_3 = setattr(namespace_0, str_2, bool_1)
        response_0 = module_0.Response()
        int_0 = -4337
        var_4 = module_3.write_message(response_0, environment_0, namespace_0, int_0)
    except BaseException:
        pass

def test_case_12():
    try:
        environment_0 = module_1.Environment()
        namespace_0 = module_2.Namespace()
        bool_0 = False
        str_0 = 'stream'
        var_0 = setattr(namespace_0, str_0, bool_0)
        str_1 = 'YFu<g 9#eZ'
        var_1 = environment_0.log_error(str_1)
        var_2 = environment_0.log_error(namespace_0)
        str_2 = 'prettify'
        var_3 = setattr(namespace_0, str_2, bool_0)
        response_0 = module_0.Response()
        int_0 = -4337
        var_4 = module_3.write_message(response_0, environment_0, namespace_0, int_0)
    except BaseException:
        pass