# Automatically generated by Pynguin.
import mimesis.providers.generic as module_0

def test_case_0():
    try:
        float_0 = -4131.0
        generic_0 = module_0.Generic()
        generic_0.add_provider(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        type_0 = None
        generic_0 = module_0.Generic()
        generic_0.add_providers()
        list_0 = generic_0.__dir__()
        generic_0.add_provider(type_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '#sP_h"3[Gu4mHb'
        list_0 = [str_0]
        generic_0 = module_0.Generic()
        generic_0.add_providers(*list_0)
    except BaseException:
        pass