# Automatically generated by Pynguin.
import sty.lib as module_0
import sty.primitive as module_1

def test_case_0():
    module_0.unmute()

def test_case_1():
    module_0.mute()
    module_0.mute()
    module_0.unmute()
    module_0.unmute()

def test_case_2():
    register_0 = module_1.Register()
    list_0 = [register_0, register_0, register_0, register_0]
    module_0.mute(*list_0)

def test_case_3():
    register_0 = module_1.Register()
    register_1 = module_1.Register()
    register_2 = module_1.Register()
    list_0 = [register_1]
    module_0.unmute(*list_0)