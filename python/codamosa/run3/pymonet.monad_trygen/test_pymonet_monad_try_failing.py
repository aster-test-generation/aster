# Automatically generated by Pynguin.
import pymonet.monad_try as module_0

def test_case_0():
    try:
        bool_0 = True
        float_0 = 95.4
        bytes_0 = b'#\xbb\xe9\xbc\xd79\xfa\x1c\x9a\xf9\x1av\xfa\x0c'
        try_0 = module_0.Try(bytes_0, bool_0)
        list_0 = [bool_0, bool_0, try_0, bool_0]
        try_1 = module_0.Try(list_0, bool_0)
        var_0 = try_1.map(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = None
        float_0 = 3857.80328
        bool_1 = False
        bytes_0 = b'9\x17\xd8\xd1\xfcTEr\r\x85^\x95eo\x90\xbdo\x92\x1f'
        bool_2 = False
        bool_3 = False
        try_0 = module_0.Try(bool_2, bool_3)
        var_0 = try_0.bind(bytes_0)
        try_1 = module_0.Try(float_0, bool_1)
        var_1 = try_1.map(bool_0)
        dict_0 = None
        bool_4 = True
        try_2 = module_0.Try(dict_0, bool_4)
        try_3 = module_0.Try(bool_0, bool_0)
        tuple_0 = ()
        var_2 = try_1.get()
        var_3 = try_2.filter(tuple_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = "phArw?'`xFGP\n6n3_"
        list_0 = [str_0, str_0, str_0]
        bool_0 = False
        try_0 = module_0.Try(list_0, bool_0)
        str_1 = 'Lw'
        bool_1 = True
        try_1 = module_0.Try(bool_1, bool_1)
        var_0 = try_1.bind(str_1)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '_'
        bytes_0 = b'D\xdb\x18\xa5\x94g\xf0\xab4\x8e'
        list_0 = [str_0, str_0]
        bool_0 = False
        try_0 = module_0.Try(list_0, bool_0)
        var_0 = try_0.on_success(bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = -2681.91
        dict_0 = None
        int_0 = -1576
        tuple_0 = (dict_0, int_0)
        bool_0 = True
        try_0 = module_0.Try(tuple_0, bool_0)
        var_0 = try_0.on_success(float_0)
    except BaseException:
        pass

def test_case_5():
    try:
        int_0 = 14
        bool_0 = True
        try_0 = module_0.Try(int_0, bool_0)
        dict_0 = {}
        var_0 = try_0.on_fail(bool_0)
        var_1 = try_0.bind(dict_0)
    except BaseException:
        pass

def test_case_6():
    try:
        int_0 = 2113
        str_0 = '\x0bV'
        float_0 = 2688.4
        bool_0 = False
        try_0 = module_0.Try(float_0, bool_0)
        bool_1 = try_0.__eq__(try_0)
        var_0 = try_0.get_or_else(int_0)
        float_1 = 323.519602
        bool_2 = False
        try_1 = module_0.Try(float_1, bool_2)
        var_1 = try_1.on_fail(str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        float_0 = 415.95999266282894
        set_0 = {float_0}
        tuple_0 = (float_0, set_0)
        bool_0 = False
        try_0 = module_0.Try(tuple_0, bool_0)
        var_0 = try_0.filter(tuple_0)
        bool_1 = True
        try_1 = module_0.Try(try_0, bool_1)
        var_1 = try_1.filter(float_0)
    except BaseException:
        pass

def test_case_8():
    try:
        bool_0 = True
        str_0 = 'H\x0c5^)x,R.\nY+ve1'
        try_0 = module_0.Try(str_0, bool_0)
        str_1 = try_0.__str__()
        try_1 = module_0.Try(bool_0, bool_0)
        float_0 = 3209.74
        var_0 = try_1.get()
        var_1 = try_1.get_or_else(float_0)
        str_2 = try_1.__str__()
        var_2 = try_1.on_success(try_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = '7zeD'
        list_0 = [str_0]
        bool_0 = True
        try_0 = module_0.Try(list_0, bool_0)
        var_0 = try_0.get()
        dict_0 = None
        bool_1 = False
        bool_2 = False
        str_1 = 'E+]Q/8zz-JS^;l.9'
        try_1 = module_0.Try(str_1, bool_2)
        tuple_0 = (dict_0, list_0)
        try_2 = module_0.Try(tuple_0, bool_1)
        var_1 = try_0.get_or_else(str_0)
        bool_3 = try_1.__eq__(try_2)
        var_2 = try_0.map(try_2)
    except BaseException:
        pass