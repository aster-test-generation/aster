# Automatically generated by Pynguin.
import youtube_dl.postprocessor.common as module_0

def test_case_0():
    pass

def test_case_1():
    post_processor_0 = module_0.PostProcessor()

def test_case_2():
    bool_0 = False
    post_processor_0 = module_0.PostProcessor(bool_0)
    dict_0 = {post_processor_0: bool_0, bool_0: post_processor_0}
    post_processor_1 = module_0.PostProcessor()
    var_0 = post_processor_1.set_downloader(dict_0)

def test_case_3():
    float_0 = 6565.007
    post_processor_0 = module_0.PostProcessor()
    list_0 = None
    var_0 = post_processor_0.set_downloader(list_0)
    var_1 = post_processor_0.run(float_0)