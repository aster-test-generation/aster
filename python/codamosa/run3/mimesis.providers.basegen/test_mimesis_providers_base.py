# Automatically generated by Pynguin.
import mimesis.providers.base as module_0

def test_case_0():
    pass

def test_case_1():
    base_provider_0 = module_0.BaseProvider()

def test_case_2():
    base_data_provider_0 = module_0.BaseDataProvider()
    generator_0 = base_data_provider_0.override_locale()
    base_provider_0 = module_0.BaseProvider()
    base_provider_1 = module_0.BaseProvider()
    base_provider_1.reseed()

def test_case_3():
    base_provider_0 = module_0.BaseProvider()
    str_0 = base_provider_0.__str__()

def test_case_4():
    base_data_provider_0 = module_0.BaseDataProvider()

def test_case_5():
    base_data_provider_0 = module_0.BaseDataProvider()
    str_0 = base_data_provider_0.get_current_locale()