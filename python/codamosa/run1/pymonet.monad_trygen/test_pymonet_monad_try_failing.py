# Automatically generated by Pynguin.
import pymonet.monad_try as module_0

def test_case_0():
    try:
        float_0 = -2184.0
        bytes_0 = b'5\xfdoY\xbb\x9c\x92\x91\x06\xe8\xf9\x02S\xd0\xe3\xb4\x9b'
        bool_0 = True
        try_0 = module_0.Try(bytes_0, bool_0)
        var_0 = try_0.map(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 1419.125501
        bool_0 = True
        try_0 = module_0.Try(float_0, bool_0)
        str_0 = '?\r'
        var_0 = try_0.bind(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = 3642
        str_0 = 'LB'
        bool_0 = True
        try_0 = module_0.Try(str_0, bool_0)
        var_0 = try_0.on_success(int_0)
    except BaseException:
        pass

def test_case_3():
    try:
        set_0 = set()
        str_0 = 'sB+#\\&rxu'
        str_1 = '$4B'
        int_0 = 292
        bool_0 = False
        try_0 = module_0.Try(int_0, bool_0)
        var_0 = try_0.filter(str_1)
        bool_1 = True
        try_1 = module_0.Try(str_0, bool_1)
        bool_2 = True
        try_2 = module_0.Try(set_0, bool_2)
        list_0 = [set_0]
        bool_3 = try_1.__eq__(list_0)
        dict_0 = None
        var_1 = try_1.on_fail(dict_0)
        var_2 = try_1.filter(set_0)
    except BaseException:
        pass

def test_case_4():
    try:
        set_0 = set()
        str_0 = 'sB+#\\&rxu'
        float_0 = -303.74321
        bool_0 = True
        try_0 = module_0.Try(float_0, bool_0)
        var_0 = try_0.get()
        bool_1 = False
        str_1 = '7<hQpSR'
        bool_2 = try_0.__eq__(str_1)
        try_1 = module_0.Try(str_0, bool_1)
        list_0 = [set_0]
        bool_3 = try_1.__eq__(list_0)
        dict_0 = None
        var_1 = try_1.on_fail(dict_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bool_0 = False
        str_0 = '\n        Take mapper function and return new instance of Left with the same value.\n\n        :returns: Copy of self\n        :rtype: Left[A]\n        '
        bool_1 = False
        try_0 = module_0.Try(str_0, bool_1)
        bool_2 = True
        try_1 = module_0.Try(try_0, bool_2)
        var_0 = try_1.filter(bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = True
        dict_0 = None
        tuple_0 = (dict_0, bool_0)
        str_0 = "M7dc/`'2H^y$[LH"
        bool_1 = True
        try_0 = module_0.Try(str_0, bool_1)
        var_0 = try_0.get_or_else(tuple_0)
        bool_2 = False
        float_0 = 1342.6995
        bytes_0 = b'\x07L[\xb5d'
        try_1 = module_0.Try(bytes_0, bool_2)
        var_1 = try_0.filter(float_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'GF!Br"*2Lx)Lm\'U3,:'
        dict_0 = {str_0: str_0, str_0: str_0}
        bool_0 = False
        bool_1 = True
        try_0 = module_0.Try(bool_0, bool_1)
        tuple_0 = (dict_0, try_0)
        str_1 = ',3dnj*MU!=Q'
        bool_2 = False
        try_1 = module_0.Try(str_1, bool_2)
        var_0 = try_1.get_or_else(tuple_0)
        dict_1 = {}
        tuple_1 = ()
        bool_3 = True
        try_2 = module_0.Try(tuple_1, bool_3)
        var_1 = try_2.get()
        bool_4 = False
        try_3 = module_0.Try(dict_1, bool_4)
        str_2 = 'G#V=w?f'
        var_2 = try_3.filter(str_2)
        bool_5 = try_3.__eq__(str_0)
        bytes_0 = b';L<\x87'
        bool_6 = try_1.__eq__(try_2)
        bool_7 = True
        bool_8 = True
        bytes_1 = b'\xe9l\x01/\xa4\xaa\x15'
        str_3 = 'nOWIDg zqSE9RI'
        bool_9 = False
        dict_2 = {bytes_1: bool_7, str_3: bool_9, bool_9: str_3, bytes_0: bytes_0}
        try_4 = module_0.Try(dict_2, bool_7)
        var_3 = try_4.map(bool_8)
    except BaseException:
        pass