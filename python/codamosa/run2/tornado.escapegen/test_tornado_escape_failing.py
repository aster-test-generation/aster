# Automatically generated by Pynguin.
import tornado.escape as module_0

def test_case_0():
    try:
        str_0 = '2mg>[.Lfv\tL'
        str_1 = module_0.squeeze(str_0)
        bytes_0 = b'\xe6\xb2\xc8\xd2\xceT4\x1c\x8f7,\xfcUJ'
        str_2 = module_0.xhtml_unescape(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'V[X($p:.oddfbB0z[Nu'
        any_0 = module_0.json_decode(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\xf7\xe6'
        str_0 = module_0.url_escape(bytes_0)
        bytes_1 = b'$\x8f\xa3f\xfe\x0eP\xd0'
        dict_0 = module_0.parse_qs_bytes(bytes_1)
        any_0 = module_0.recursive_unicode(bytes_1)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ''
        str_1 = module_0.linkify(str_0)
        float_0 = 3807.4
        tuple_0 = (str_0, float_0, float_0)
        bytes_0 = b'D\x03\xec\x82\x04IQ\xeei\xfbR'
        optional_0 = module_0.utf8(bytes_0)
        optional_1 = module_0.utf8(tuple_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'\x9c\x85\xb0'
        var_0 = module_0.url_unescape(bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '9q'
        bytes_0 = b'\x87@\x1e\x81\x19Uc\x8aC\x18L\xef\xf8-p"'
        bytes_1 = b'i\xf7Iy\x1b\xa1\x00\xd9\xd2M'
        list_0 = [bytes_0, bytes_1, bytes_1, bytes_0]
        str_1 = 'l02nlr='
        dict_0 = {str_0: list_0, str_1: list_0}
        any_0 = module_0.recursive_unicode(dict_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'u.Re'
        list_0 = [str_0, str_0, str_0]
        str_1 = module_0.linkify(str_0, str_0, list_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = ' Y_[iTY^0tS"1|6\''
        dict_0 = module_0.parse_qs_bytes(str_0)
        any_0 = module_0.recursive_unicode(str_0)
        optional_0 = module_0.utf8(str_0)
        list_0 = []
        list_1 = []
        str_1 = module_0.linkify(str_0, list_1)
        dict_1 = {str_0: list_0, str_0: list_0}
        str_2 = module_0.json_encode(dict_0)
        optional_1 = module_0.to_unicode(dict_1)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'www.facebook.com'
        str_1 = 'http://www.bing.com/search?q=test'
        bool_0 = False
        var_0 = module_0.url_unescape(str_0, str_1, bool_0)
        str_2 = module_0.json_encode(var_0)
        bytes_0 = b'\xad%\x0eD\xea\x98].\xfa\nX\x95\x9e,'
        var_1 = module_0.url_unescape(bytes_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'http:m/www.bing.com/search?q=test'
        var_0 = module_0.url_unescape(str_0)
        str_1 = module_0.linkify(str_0)
        str_2 = module_0.linkify(str_1, str_0)
        str_3 = module_0.xhtml_unescape(str_2)
        bool_0 = False
        str_4 = module_0.linkify(str_0, bool_0, str_1)
        bytes_0 = b'\xf7\x96'
        str_5 = module_0.linkify(bytes_0, str_3)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'This is a test http://a.com/blah_blah?dfdsfsdf last http://www.b.com/g?gh=33&a=2 https://www.c.com'
        list_0 = None
        str_1 = module_0.linkify(str_0, str_0, list_0)
    except BaseException:
        pass