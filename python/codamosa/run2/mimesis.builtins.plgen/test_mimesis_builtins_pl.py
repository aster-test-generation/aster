# Automatically generated by Pynguin.
import mimesis.builtins.pl as module_0
import mimesis.providers.date as module_1
import mimesis.enums as module_2

def test_case_0():
    poland_spec_provider_0 = module_0.PolandSpecProvider()

def test_case_1():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.nip()
    str_1 = poland_spec_provider_0.pesel()

def test_case_2():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.pesel()
    str_1 = poland_spec_provider_0.pesel()
    str_2 = poland_spec_provider_0.nip()
    poland_spec_provider_1 = module_0.PolandSpecProvider()
    str_3 = poland_spec_provider_1.regon()
    str_4 = poland_spec_provider_1.regon()

def test_case_3():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.pesel()

def test_case_4():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.pesel()

def test_case_5():
    float_0 = None
    poland_spec_provider_0 = module_0.PolandSpecProvider(float_0)
    str_0 = poland_spec_provider_0.regon()

def test_case_6():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.regon()
    str_1 = poland_spec_provider_0.regon()
    poland_spec_provider_1 = module_0.PolandSpecProvider()
    str_2 = poland_spec_provider_1.regon()
    str_3 = poland_spec_provider_1.regon()

def test_case_7():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.nip()
    int_0 = 2406
    dict_0 = {}
    datetime_0 = module_1.Datetime(**dict_0)
    datetime_1 = datetime_0.datetime(int_0, int_0)
    str_1 = poland_spec_provider_0.pesel(datetime_1)

def test_case_8():
    str_0 = 'pretranscription'
    poland_spec_provider_0 = module_0.PolandSpecProvider(str_0)
    poland_spec_provider_1 = module_0.PolandSpecProvider()
    str_1 = poland_spec_provider_0.pesel()
    str_2 = poland_spec_provider_0.nip()
    int_0 = 2406
    dict_0 = {}
    datetime_0 = None
    gender_0 = module_2.Gender.MALE
    str_3 = poland_spec_provider_0.pesel(datetime_0, gender_0)
    datetime_1 = module_1.Datetime(**dict_0)
    datetime_2 = module_1.Datetime()
    datetime_3 = datetime_1.datetime(int_0, int_0)
    str_4 = poland_spec_provider_0.pesel(datetime_3)

def test_case_9():
    poland_spec_provider_0 = module_0.PolandSpecProvider()
    str_0 = poland_spec_provider_0.nip()
    int_0 = 2395
    str_1 = poland_spec_provider_0.pesel()
    dict_0 = {}
    datetime_0 = module_1.Datetime(**dict_0)
    str_2 = poland_spec_provider_0.regon()
    str_3 = poland_spec_provider_0.nip()
    datetime_1 = datetime_0.datetime(int_0, int_0)
    gender_0 = module_2.Gender.FEMALE
    str_4 = poland_spec_provider_0.pesel(datetime_1, gender_0)