# Automatically generated by Pynguin.
import youtube_dl.downloader.hls as module_0

def test_case_0():
    try:
        str_0 = '\rhde& Peli(a$s teki kovan ratkaisun – VillsDNeminen pia3le'
        bytes_0 = b'>\x06?{\xc3\x90\x94\x0b\xd72\x9d\xf9\xa2-Y\x10\xdb\xa1'
        hls_f_d_0 = module_0.HlsFD(str_0, bytes_0)
        var_0 = hls_f_d_0.can_download(str_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\xe0\x12\x9d\xa1~,g(^\xb8\xf9\xdeBC'
        dict_0 = {bytes_0: bytes_0, bytes_0: bytes_0}
        str_0 = '$y=F6dynt@A\x0b`FU:LZ'
        hls_f_d_0 = module_0.HlsFD(str_0, str_0)
        var_0 = hls_f_d_0.real_download(bytes_0, dict_0)
    except BaseException:
        pass