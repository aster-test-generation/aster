# Automatically generated by Pynguin.
import youtube_dl.downloader.hls as module_0

def test_case_0():
    try:
        str_0 = 'D\t,Ml(tU|'
        hls_f_d_0 = module_0.HlsFD(str_0, str_0)
        var_0 = hls_f_d_0.can_download(str_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = -3174.1566
        str_0 = 'eagleplatform:%(host)s:%(id)s'
        bool_0 = False
        list_0 = [bool_0]
        hls_f_d_0 = module_0.HlsFD(bool_0, list_0)
        var_0 = hls_f_d_0.real_download(float_0, str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'https://hls.ted.com/talks/2639.m3u8?preroll=Thousandsdnads'
        str_1 = 'id'
        str_2 = 'url'
        str_3 = 'title'
        str_4 = 'is_live'
        str_5 = '2014年，一场激情的演讲'
        bool_0 = False
        var_0 = {str_1: str_0, str_2: str_0, str_3: str_5, str_4: bool_0}
        str_6 = '2639.m3u8'
        var_1 = None
        var_2 = {}
        hls_f_d_0 = module_0.HlsFD(var_1, var_2)
        var_3 = hls_f_d_0.real_download(str_6, var_0)
    except BaseException:
        pass