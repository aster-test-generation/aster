# Automatically generated by Pynguin.
import youtube_dl.downloader.dash as module_0

def test_case_0():
    try:
        str_0 = {}
        dash_segments_f_d_0 = module_0.DashSegmentsFD(str_0, str_0)
        var_0 = dash_segments_f_d_0.real_download(dash_segments_f_d_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'abc'
        str_1 = 'fragment_base_url'
        str_2 = 'fragments'
        str_3 = 'path'
        str_4 = {str_1: str_3, str_2: str_1}
        dash_segments_f_d_0 = module_0.DashSegmentsFD(str_0, str_4)
        var_0 = dash_segments_f_d_0.real_download(str_0, str_4)
    except BaseException:
        pass