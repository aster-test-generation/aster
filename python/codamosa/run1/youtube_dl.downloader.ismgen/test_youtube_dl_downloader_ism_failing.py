# Automatically generated by Pynguin.
import youtube_dl.downloader.ism as module_0

def test_case_0():
    try:
        tuple_0 = ()
        str_0 = 'bra050'
        var_0 = module_0.box(tuple_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\xd3\xb1\xe1\xd6VQ\xef\xab\x00J\x88\x113\xd6\xf7\x11h'
        set_0 = {bytes_0}
        dict_0 = {}
        ism_f_d_0 = module_0.IsmFD(set_0, dict_0)
        float_0 = -2269.484271
        list_0 = [bytes_0, dict_0]
        tuple_0 = (float_0, list_0, float_0)
        float_1 = 513.9946
        int_0 = None
        var_0 = module_0.full_box(ism_f_d_0, tuple_0, float_1, int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'r\xfc\xba\x97\xf7r\x97\x06e\xcf\xf8\xe0\xeb\xdd\xb7\x17\x96'
        bytes_1 = b'\xe3R\xfc6\xd0\xb6w\x86'
        var_0 = module_0.write_piff_header(bytes_0, bytes_1)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'bra050'
        bytes_0 = b']:%\x0f\xcf'
        var_0 = module_0.extract_box_data(bytes_0, str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 475.4
        int_0 = 1438732860
        bool_0 = False
        list_0 = [bool_0]
        ism_f_d_0 = module_0.IsmFD(list_0, list_0)
        var_0 = ism_f_d_0.real_download(float_0, int_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bytes_0 = b'\xd3\xb1\xe1\xd6VQ\xef\xab\x00J\x88\x113\xd6\xf7\x11h'
        set_0 = {bytes_0}
        dict_0 = {}
        ism_f_d_0 = module_0.IsmFD(set_0, dict_0)
        str_0 = '\x0b'
        var_0 = ism_f_d_0.real_download(dict_0, str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'\x00\x00\x00\x0cftypisml\x00\x00\x02\x00piffiso2isml'
        bytes_1 = b'ftyp'
        bytes_2 = [bytes_1, bytes_1]
        var_0 = module_0.extract_box_data(bytes_0, bytes_2)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'fragments'
        str_1 = 'formats'
        str_2 = '_download_params'
        str_3 = 'url'
        str_4 = 'https://example.com/segt1.ismv'
        str_5 = {str_3: str_4}
        str_6 = 'https://example.com/segt2.ismv'
        str_7 = {str_3: str_6}
        str_8 = [str_5, str_7]
        str_9 = 'width'
        int_0 = 100
        int_1 = 640
        int_2 = 480
        int_3 = {str_3: int_0, str_9: int_1, str_2: int_2}
        int_4 = [int_3]
        str_10 = 'test'
        bool_0 = False
        bool_1 = {str_10: bool_0}
        var_0 = {str_0: str_8, str_1: int_4, str_2: bool_1}
        str_11 = 'fragment_retries'
        bool_2 = True
        bool_3 = {str_11: bool_0, str_3: bool_2, str_10: bool_0}
        str_12 = 'testfile'
        str_13 = 'https://example.com/manifest.ism'
        ism_f_d_0 = module_0.IsmFD(str_13, bool_3)
        var_1 = ism_f_d_0.real_download(str_12, var_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'fragments'
        str_1 = 'https://example.com/segt1.ismv'
        str_2 = 'height'
        int_0 = 640
        str_3 = 'test'
        str_4 = 'fragment_retries'
        dict_0 = {int_0: str_1, str_4: str_2, str_3: str_0}
        ism_f_d_0 = module_0.IsmFD(dict_0, dict_0)
        str_5 = ' u4u3\x0b#i(?n=@%\n6lF'
        float_0 = -4348.6891
        var_0 = ism_f_d_0.real_download(str_5, float_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bytes_0 = b'\x00\x00\x00\x0cftypisml\x00\x00\x02\x00piffiso2isml'
        bytes_1 = b'ftyp'
        bytes_2 = [bytes_1]
        var_0 = module_0.extract_box_data(bytes_0, bytes_2)
        float_0 = 1776.26375
        list_0 = []
        dict_0 = {var_0: list_0}
        str_0 = None
        tuple_0 = (list_0, dict_0, str_0)
        tuple_1 = (tuple_0,)
        set_0 = set()
        ism_f_d_0 = module_0.IsmFD(tuple_1, set_0)
        int_0 = -238
        ism_f_d_1 = module_0.IsmFD(ism_f_d_0, int_0)
        var_1 = module_0.extract_box_data(dict_0, float_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'wb'
        var_0 = open(str_0, str_0)
        str_1 = 'track_id'
        str_2 = 'fourcc'
        str_3 = 'duration'
        int_0 = 1467
        var_1 = {str_1: int_0, str_2: str_2, str_3: int_0, str_0: int_0, str_2: str_2, str_2: int_0, str_3: int_0}
        var_2 = module_0.write_piff_header(var_0, var_1)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'wb'
        var_0 = open(str_0, str_0)
        str_1 = 'track_id'
        str_2 = 'fourcc'
        str_3 = 'duration'
        str_4 = 'width'
        str_5 = 'H264'
        int_0 = 100
        int_1 = 10000000
        str_6 = 'en'
        str_7 = '123456789012345678'
        var_1 = {str_1: int_1, str_2: str_5, str_3: int_0, str_0: int_1, str_2: str_6, str_5: int_0, str_4: int_0, str_6: str_7}
        var_2 = module_0.write_piff_header(var_0, var_1)
    except BaseException:
        pass

def test_case_12():
    try:
        str_0 = 'wb'
        var_0 = open(str_0, str_0)
        str_1 = 'track_id'
        str_2 = 'fourcc'
        str_3 = 'duration'
        str_4 = 'timescale'
        str_5 = 'language'
        str_6 = 'height'
        str_7 = 'wd*x3H+i@LV;\n+daE'
        str_8 = 'codec_private_data'
        int_0 = 1
        str_9 = 'H264'
        int_1 = 10000000
        str_10 = '123456789012345678'
        var_1 = {str_1: int_0, str_2: str_9, str_3: int_0, str_4: int_1, str_5: str_6, str_6: int_0, str_7: int_0, str_8: str_10}
        var_2 = module_0.write_piff_header(var_0, var_1)
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = 'test.mp4'
        str_1 = 'wb'
        var_0 = open(str_0, str_1)
        str_2 = 'track_id'
        str_3 = 'fourcc'
        str_4 = 'duration'
        str_5 = 'timescale'
        str_6 = 'height'
        str_7 = 'width'
        str_8 = 'codec_private_data'
        int_0 = 1
        int_1 = 100
        int_2 = 10000000
        str_9 = '`en'
        str_10 = '123456789012345678'
        var_1 = {str_2: int_0, str_3: str_5, str_4: int_1, str_5: int_2, str_0: str_9, str_6: int_1, str_7: int_1, str_8: str_10}
        var_2 = module_0.write_piff_header(var_0, var_1)
    except BaseException:
        pass