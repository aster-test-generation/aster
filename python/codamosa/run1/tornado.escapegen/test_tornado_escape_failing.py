# Automatically generated by Pynguin.
import tornado.escape as module_0

def test_case_0():
    try:
        str_0 = 'OCZ\n\tQ('
        any_0 = module_0.json_decode(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'u%\x0c3wEmSZrlYn5qPg>'
        str_1 = module_0.squeeze(str_0)
        float_0 = -1427.29
        str_2 = module_0.url_escape(str_1)
        optional_0 = module_0.utf8(float_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\x1b2>d?R\xd0\xf2,H\\'
        bool_0 = False
        optional_0 = module_0.utf8(bytes_0)
        var_0 = module_0.url_unescape(bytes_0, bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = False
        str_0 = module_0.json_encode(bool_0)
        optional_0 = module_0.to_unicode(str_0)
        bytes_0 = b'H\x18xV\xc8w\xba\xfb\xa9#\xe4\xedhy\xfdKj\xd2'
        bool_1 = False
        dict_0 = module_0.parse_qs_bytes(bytes_0, bool_1)
        str_1 = 'Changes the events we listen for ``fd``.\n\n        .. versionchanged:: 4.0\n           Added the ability to pass file-like objects in addition to\n           raw file descriptors.\n        '
        optional_1 = module_0.utf8(str_1)
        str_2 = module_0.xhtml_escape(bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'\xb9'
        any_0 = module_0.json_decode(bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'hJ'
        str_1 = module_0.xhtml_unescape(str_0)
        int_0 = 2053
        optional_0 = module_0.to_unicode(int_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = True
        str_0 = None
        bytes_0 = b'\x11\x10\xc7,\xb8\xd9L\x91\xb2\xa1^'
        bytes_1 = b'\xff\xc9\xd9\x00\x15;C\xd0\xf5%P/'
        bytes_2 = b']\xf0\xab\x89\xe8LL \xbb\xe4\x05~\xaah\xf7\xcd\x83\xfd'
        list_0 = [bytes_0, bytes_0, bytes_1, bytes_2]
        str_1 = "mgg6TCuq\x0b'.GIe)\\\x0b)<"
        dict_0 = {str_0: list_0, str_1: list_0}
        tuple_0 = (bool_0, dict_0)
        any_0 = module_0.recursive_unicode(tuple_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'wm0S'
        list_0 = [str_0]
        str_1 = module_0.linkify(str_0, str_0, list_0)
    except BaseException:
        pass

def test_case_8():
    try:
        bytes_0 = None
        str_0 = module_0.linkify(bytes_0)
    except BaseException:
        pass

def test_case_9():
    try:
        int_0 = None
        any_0 = module_0.recursive_unicode(int_0)
        int_1 = 238
        any_1 = module_0.recursive_unicode(int_1)
        str_0 = 'qEalwnW\\'
        optional_0 = module_0.utf8(str_0)
        str_1 = 'openid.ax.type.firstname'
        bool_0 = False
        var_0 = module_0.url_unescape(str_1, str_1)
        bool_1 = None
        var_1 = module_0.url_unescape(str_1, str_1, bool_1)
        optional_1 = module_0.utf8(str_0)
        str_2 = module_0.url_escape(str_1, bool_0)
        str_3 = module_0.xhtml_unescape(str_1)
        optional_2 = module_0.to_unicode(str_1)
        bool_2 = False
        dict_0 = module_0.parse_qs_bytes(str_2, bool_2)
        str_4 = module_0.json_encode(dict_0)
        str_5 = 'L]N6.W\x0bm'
        str_6 = module_0.squeeze(str_5)
        str_7 = module_0.json_encode(any_0)
        optional_3 = module_0.to_unicode(str_5)
        any_2 = module_0.recursive_unicode(dict_0)
        str_8 = module_0.xhtml_escape(str_7)
        str_9 = 'tl_PH'
        any_3 = module_0.json_decode(str_9)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'I found a link: www.example.com.'
        str_1 = module_0.linkify(str_0)
        str_2 = 'Â¡Hola http://tornadoweb.org! è®¿é\x97® http://www.example.com'
        bool_0 = True
        var_0 = module_0.url_unescape(str_2, bool_0)
        str_3 = module_0.linkify(str_1, bool_0)
        bool_1 = True
        bool_2 = True
        str_4 = '[>.exh<yr2vv=E'
        str_5 = 'Lb'
        str_6 = 'hF.<rV~`NF1hc '
        list_0 = [str_5, str_6, str_1]
        str_7 = module_0.linkify(str_0, bool_2, str_4, bool_1, list_0)
        str_8 = '#'
        str_9 = module_0.squeeze(str_8)
        str_10 = module_0.linkify(str_4, str_7, bool_2)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = "cn'4#'dJy6G"
        bool_0 = False
        bool_1 = None
        list_0 = [str_0, str_0]
        str_1 = module_0.linkify(str_0, bool_0, bool_1, list_0)
        str_2 = 'Â¡Hola http://tornadoweb.org! è®¿é\x97® http://www.example.com'
        any_0 = module_0.recursive_unicode(bool_1)
        str_3 = module_0.xhtml_escape(str_2)
        str_4 = module_0.xhtml_unescape(str_1)
        any_1 = module_0.json_decode(str_0)
    except BaseException:
        pass