# Automatically generated by Pynguin.
import mimesis.builtins.ru as module_0
import mimesis.enums as module_1
import builtins as module_2

def test_case_0():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.generate_sentence()

def test_case_1():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.kpp()
    str_1 = russia_spec_provider_0.patronymic()
    russia_spec_provider_1 = module_0.RussiaSpecProvider()
    russia_spec_provider_2 = module_0.RussiaSpecProvider()
    int_0 = russia_spec_provider_2.passport_number()
    str_2 = russia_spec_provider_2.bic()
    int_1 = russia_spec_provider_2.passport_number()
    str_3 = russia_spec_provider_0.kpp()

def test_case_2():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.series_and_number()

def test_case_3():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    int_0 = russia_spec_provider_0.passport_number()

def test_case_4():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.snils()
    int_0 = 6
    str_1 = russia_spec_provider_0.passport_series(int_0)
    str_2 = russia_spec_provider_0.series_and_number()
    str_3 = russia_spec_provider_0.inn()
    str_4 = russia_spec_provider_0.generate_sentence()
    str_5 = russia_spec_provider_0.series_and_number()
    str_6 = russia_spec_provider_0.series_and_number()
    str_7 = russia_spec_provider_0.kpp()

def test_case_5():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.kpp()
    str_1 = russia_spec_provider_0.generate_sentence()
    russia_spec_provider_1 = module_0.RussiaSpecProvider()
    str_2 = russia_spec_provider_0.snils()
    str_3 = russia_spec_provider_0.generate_sentence()
    str_4 = russia_spec_provider_1.inn()
    str_5 = russia_spec_provider_0.bic()
    str_6 = russia_spec_provider_1.bic()
    gender_0 = module_1.Gender.FEMALE
    russia_spec_provider_2 = module_0.RussiaSpecProvider()
    str_7 = russia_spec_provider_2.patronymic(gender_0)
    str_8 = russia_spec_provider_1.patronymic()
    russia_spec_provider_3 = module_0.RussiaSpecProvider()
    str_9 = russia_spec_provider_1.snils()
    str_10 = russia_spec_provider_0.patronymic()
    int_0 = -693
    str_11 = russia_spec_provider_0.series_and_number()
    str_12 = russia_spec_provider_2.passport_series(int_0)
    russia_spec_provider_4 = module_0.RussiaSpecProvider()
    str_13 = russia_spec_provider_4.inn()
    str_14 = russia_spec_provider_1.bic()
    russia_spec_provider_5 = module_0.RussiaSpecProvider(str_14)
    str_15 = russia_spec_provider_5.bic()
    str_16 = russia_spec_provider_0.series_and_number()

def test_case_6():
    bytes_0 = b'\x90}\xa2\xcd\xff\xfd'
    russia_spec_provider_0 = module_0.RussiaSpecProvider(bytes_0)
    str_0 = russia_spec_provider_0.bic()
    russia_spec_provider_1 = module_0.RussiaSpecProvider()
    str_1 = russia_spec_provider_1.inn()

def test_case_7():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.inn()
    str_1 = russia_spec_provider_0.ogrn()
    russia_spec_provider_1 = module_0.RussiaSpecProvider()
    str_2 = russia_spec_provider_1.inn()
    int_0 = 23
    russia_spec_provider_2 = module_0.RussiaSpecProvider()
    str_3 = russia_spec_provider_1.kpp()
    str_4 = russia_spec_provider_2.passport_series(int_0)

def test_case_8():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.bic()

def test_case_9():
    russia_spec_provider_0 = module_0.RussiaSpecProvider()
    str_0 = russia_spec_provider_0.bic()
    bytearray_0 = module_2.bytearray()
    russia_spec_provider_1 = module_0.RussiaSpecProvider(bytearray_0)
    str_1 = russia_spec_provider_1.bic()
    russia_spec_provider_2 = module_0.RussiaSpecProvider()
    str_2 = russia_spec_provider_2.kpp()

def test_case_10():
    dict_0 = None
    tuple_0 = (dict_0,)
    gender_0 = module_1.Gender.FEMALE
    int_0 = -933
    russia_spec_provider_0 = module_0.RussiaSpecProvider(int_0)
    russia_spec_provider_1 = module_0.RussiaSpecProvider(int_0)
    str_0 = russia_spec_provider_1.passport_series()
    str_1 = russia_spec_provider_0.patronymic(gender_0)
    russia_spec_provider_2 = module_0.RussiaSpecProvider(tuple_0)
    str_2 = russia_spec_provider_1.snils()
    russia_spec_provider_3 = module_0.RussiaSpecProvider()
    str_3 = russia_spec_provider_1.series_and_number()
    russia_spec_provider_4 = module_0.RussiaSpecProvider(str_1)
    str_4 = russia_spec_provider_3.snils()
    str_5 = russia_spec_provider_3.passport_series()
    str_6 = russia_spec_provider_3.snils()
    russia_spec_provider_5 = module_0.RussiaSpecProvider(str_0)
    str_7 = russia_spec_provider_3.inn()
    str_8 = russia_spec_provider_0.kpp()
    str_9 = russia_spec_provider_4.inn()
    str_10 = russia_spec_provider_4.passport_series()
    russia_spec_provider_6 = module_0.RussiaSpecProvider(str_4)
    str_11 = russia_spec_provider_5.ogrn()
    str_12 = russia_spec_provider_5.bic()
    str_13 = russia_spec_provider_2.inn()
    str_14 = russia_spec_provider_4.inn()
    str_15 = russia_spec_provider_1.patronymic()
    str_16 = russia_spec_provider_1.bic()
    str_17 = russia_spec_provider_5.bic()

def test_case_11():
    bytearray_0 = module_2.bytearray()
    russia_spec_provider_0 = module_0.RussiaSpecProvider(bytearray_0)
    str_0 = russia_spec_provider_0.patronymic()
    str_1 = russia_spec_provider_0.bic()
    russia_spec_provider_1 = module_0.RussiaSpecProvider()
    russia_spec_provider_2 = module_0.RussiaSpecProvider()
    str_2 = russia_spec_provider_2.series_and_number()
    str_3 = russia_spec_provider_2.inn()
    russia_spec_provider_3 = module_0.RussiaSpecProvider()
    str_4 = russia_spec_provider_3.snils()
    str_5 = russia_spec_provider_3.inn()
    int_0 = russia_spec_provider_2.passport_number()
    str_6 = russia_spec_provider_0.inn()
    str_7 = russia_spec_provider_0.inn()
    russia_spec_provider_4 = module_0.RussiaSpecProvider()
    str_8 = russia_spec_provider_4.generate_sentence()
    str_9 = russia_spec_provider_1.kpp()
    str_10 = russia_spec_provider_4.bic()
    str_11 = russia_spec_provider_2.kpp()
    str_12 = russia_spec_provider_0.passport_series()
    str_13 = russia_spec_provider_2.passport_series()
    str_14 = russia_spec_provider_3.kpp()
    str_15 = russia_spec_provider_0.series_and_number()
    russia_spec_provider_5 = module_0.RussiaSpecProvider()
    str_16 = russia_spec_provider_5.snils()
    str_17 = russia_spec_provider_4.kpp()
    russia_spec_provider_6 = module_0.RussiaSpecProvider()
    str_18 = russia_spec_provider_1.passport_series()
    str_19 = russia_spec_provider_2.inn()
    str_20 = russia_spec_provider_4.ogrn()
    russia_spec_provider_7 = module_0.RussiaSpecProvider()
    str_21 = russia_spec_provider_7.bic()
    str_22 = russia_spec_provider_4.passport_series()
    str_23 = russia_spec_provider_6.bic()
    str_24 = russia_spec_provider_7.bic()
    str_25 = russia_spec_provider_5.patronymic()
    str_26 = russia_spec_provider_5.generate_sentence()
    str_27 = russia_spec_provider_6.snils()