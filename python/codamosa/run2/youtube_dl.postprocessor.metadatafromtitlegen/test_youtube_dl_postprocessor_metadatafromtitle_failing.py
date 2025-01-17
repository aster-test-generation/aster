# Automatically generated by Pynguin.
import youtube_dl.postprocessor.metadatafromtitle as module_0

def test_case_0():
    try:
        str_0 = '%(artist)s - %(title)s'
        metadata_from_title_p_p_0 = module_0.MetadataFromTitlePP(str_0, str_0)
        str_1 = 'title'
        str_2 = {str_1: str_0}
        var_0 = metadata_from_title_p_p_0.run(str_2)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '3p\t'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
        metadata_from_title_p_p_0 = module_0.MetadataFromTitlePP(str_0, dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '%(artist)s - %(title~s'
        metadata_from_title_p_p_0 = module_0.MetadataFromTitlePP(str_0, str_0)
        str_1 = 'title'
        str_2 = {str_1: str_0}
        var_0 = metadata_from_title_p_p_0.run(str_2)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '(?P<artist>.+)? - (?P<title>.+)'
        metadata_from_title_p_p_0 = module_0.MetadataFromTitlePP(str_0, str_0)
        str_1 = 'title'
        str_2 = '- Africa'
        str_3 = {str_1: str_2}
        var_0 = metadata_from_title_p_p_0.run(str_3)
    except BaseException:
        pass