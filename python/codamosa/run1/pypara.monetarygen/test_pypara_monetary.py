# Automatically generated by Pynguin.
import pypara.monetary as module_0
import decimal as module_1
import pypara.currencies as module_2

def test_case_0():
    pass

def test_case_1():
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.abs()
    currency_0 = None
    bool_0 = True
    none_money_0 = module_0.NoneMoney()
    money_0 = none_money_0.convert(currency_0, bool_0)
    money_1 = money_0.__pos__()
    money_2 = money_1.with_ccy(currency_0)

def test_case_2():
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.abs()
    dict_0 = {}
    none_money_0 = module_0.NoneMoney(**dict_0)
    money_0 = none_money_0.divide(none_price_0)
    money_1 = money_0.abs()
    var_0 = money_1.__round__()
    decimal_0 = module_1.Decimal()

def test_case_3():
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.abs()
    dict_0 = {}
    none_money_0 = module_0.NoneMoney(**dict_0)
    money_0 = none_money_0.divide(none_price_0)
    money_1 = money_0.abs()
    var_0 = money_1.__round__()
    decimal_0 = module_1.Decimal()
    price_1 = none_price_0.subtract(price_0)

def test_case_4():
    var_0 = None
    int_0 = -2722
    none_money_0 = module_0.NoneMoney()
    money_0 = none_money_0.round(int_0)
    money_1 = money_0.abs()
    money_2 = money_1.negative()
    money_3 = money_2.floor_divide(var_0)

def test_case_5():
    var_0 = None
    none_money_0 = module_0.NoneMoney()
    money_0 = none_money_0.round()
    money_1 = money_0.abs()
    money_2 = money_0.negative()
    money_3 = money_0.floor_divide(var_0)
    bool_0 = money_3.__le__(money_3)

def test_case_6():
    var_0 = None
    int_0 = -2722
    none_money_0 = module_0.NoneMoney()
    bool_0 = none_money_0.as_boolean()
    money_0 = none_money_0.round(int_0)
    money_1 = money_0.abs()
    money_2 = money_1.negative()
    money_3 = money_2.floor_divide(var_0)

def test_case_7():
    date_0 = None
    str_0 = 'G;=89+y<2CBD;Gpp'
    int_0 = -1355
    currency_type_0 = module_2.CurrencyType.MONEY
    list_0 = []
    decimal_0 = module_1.Decimal(*list_0)
    currency_type_1 = module_2.CurrencyType.METAL
    decimal_1 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_1, decimal_1, int_0)
    decimal_2 = currency_0.quantize(decimal_0)
    int_1 = 1388
    currency_1 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_2, int_1)
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.convert(currency_1)
    price_1 = price_0.with_dov(date_0)
    bool_0 = False
    list_1 = [bool_0, bool_0, bool_0]
    some_price_0 = module_0.SomePrice(*list_1)
    price_2 = some_price_0.round()
    price_3 = price_2.__add__(price_1)

def test_case_8():
    str_0 = ''
    monetary_operation_exception_0 = module_0.MonetaryOperationException()
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.divide(monetary_operation_exception_0)
    int_0 = None
    decimal_0 = None
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_1 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_1, int_0)
    list_0 = [int_0, decimal_1, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    price_1 = some_price_0.negative()
    bool_0 = price_1.is_equal(list_0)
    bool_1 = price_0.__le__(price_0)
    bool_2 = some_price_0.gt(price_1)
    price_2 = some_price_0.with_qty(decimal_0)

def test_case_9():
    str_0 = ' F=3 MiN0&4'
    int_0 = -984
    monetary_operation_exception_0 = module_0.MonetaryOperationException()
    currency_type_0 = module_2.CurrencyType.CRYPTO
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    price_0 = some_price_0.negative()
    bool_0 = price_0.is_equal(price_0)
    price_1 = price_0.__sub__(price_0)
    bool_1 = some_price_0.gt(price_1)

def test_case_10():
    str_0 = '8x;G'
    int_0 = -981
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_money_0 = module_0.SomeMoney(*list_0)
    money_0 = some_money_0.abs()
    money_1 = money_0.__pos__()
    money_2 = some_money_0.add(money_0)

def test_case_11():
    str_0 = '8x;G'
    int_0 = -981
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_money_0 = module_0.SomeMoney(*list_0)
    money_0 = some_money_0.abs()
    money_1 = money_0.negative()
    money_2 = some_money_0.add(money_1)

def test_case_12():
    str_0 = ''
    int_0 = None
    currency_type_0 = module_2.CurrencyType.CRYPTO
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    price_0 = some_price_0.abs()
    bool_0 = some_price_0.as_boolean()
    bool_1 = price_0.is_equal(price_0)
    some_money_0 = module_0.SomeMoney(*list_0)
    bool_2 = some_money_0.is_equal(price_0)
    bool_3 = price_0.__le__(price_0)
    bool_4 = some_price_0.gt(price_0)

def test_case_13():
    str_0 = '8x;G'
    int_0 = -981
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_money_0 = module_0.SomeMoney(*list_0)
    money_0 = some_money_0.abs()
    money_1 = some_money_0.with_ccy(currency_0)
    money_2 = some_money_0.add(money_0)

def test_case_14():
    str_0 = ''
    int_0 = -981
    monetary_operation_exception_0 = module_0.MonetaryOperationException()
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.round()
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    bool_0 = some_price_0.gte(price_0)
    price_1 = some_price_0.add(price_0)
    price_2 = some_price_0.add(price_1)

def test_case_15():
    str_0 = ''
    int_0 = -1555
    monetary_operation_exception_0 = module_0.MonetaryOperationException()
    currency_type_0 = module_2.CurrencyType.CRYPTO
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    price_0 = some_price_0.negative()
    bool_0 = some_price_0.as_boolean()
    bool_1 = some_price_0.gte(price_0)

def test_case_16():
    str_0 = ''
    int_0 = -1555
    monetary_operation_exception_0 = module_0.MonetaryOperationException()
    currency_type_0 = module_2.CurrencyType.CRYPTO
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    price_0 = some_price_0.negative()
    bool_0 = some_price_0.gte(price_0)
    bool_1 = some_price_0.gt(price_0)

def test_case_17():
    str_0 = ')o'
    none_money_0 = module_0.NoneMoney()
    int_0 = None
    money_0 = none_money_0.negative()
    currency_type_0 = module_2.CurrencyType.CRYPTO
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    bool_0 = currency_0.__eq__(decimal_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    currency_1 = None
    price_0 = some_price_0.positive()
    some_money_0 = module_0.SomeMoney(*list_0)
    bool_1 = some_money_0.gt(money_0)
    bool_2 = some_price_0.gte(price_0)
    money_1 = some_money_0.subtract(money_0)
    bool_3 = money_1.__ge__(money_1)
    money_2 = money_1.with_ccy(currency_1)
    money_3 = some_money_0.positive()
    money_4 = money_1.add(money_0)
    money_5 = money_4.add(money_1)
    money_6 = some_money_0.subtract(money_1)

def test_case_18():
    str_0 = '8x;G'
    int_0 = -981
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_money_0 = module_0.SomeMoney(*list_0)
    some_price_0 = module_0.SomePrice(*list_0)
    money_0 = some_money_0.negative()
    money_1 = some_money_0.add(money_0)
    money_2 = some_money_0.subtract(money_1)

def test_case_19():
    str_0 = '%o'
    none_money_0 = module_0.NoneMoney()
    int_0 = None
    money_0 = none_money_0.negative()
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    decimal_1 = currency_0.quantize(decimal_0)
    bool_0 = currency_0.__eq__(decimal_1)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    none_price_0 = module_0.NonePrice()
    price_0 = some_price_0.round()
    some_money_0 = module_0.SomeMoney(*list_0)
    some_price_1 = module_0.SomePrice(*list_0)
    money_1 = some_money_0.subtract(money_0)
    bool_1 = money_1.__ge__(money_1)
    int_1 = -5
    currency_1 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_1)
    money_2 = some_money_0.subtract(money_0)

def test_case_20():
    str_0 = '%o'
    none_money_0 = module_0.NoneMoney()
    int_0 = None
    money_0 = none_money_0.negative()
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    bool_0 = currency_0.__eq__(decimal_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    currency_1 = None
    price_0 = some_price_0.with_ccy(currency_1)
    bool_1 = price_0.lt(price_0)
    none_price_0 = module_0.NonePrice()
    price_1 = some_price_0.round()
    some_money_0 = module_0.SomeMoney(*list_0)
    bool_2 = some_money_0.lte(money_0)
    bool_3 = price_1.__gt__(price_0)
    some_price_1 = module_0.SomePrice(*list_0)
    bool_4 = some_money_0.gt(money_0)
    price_2 = price_1.__add__(price_0)
    money_1 = some_money_0.subtract(money_0)
    bool_5 = money_1.__ge__(money_1)
    int_1 = 23
    currency_2 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_1)
    str_1 = "}sRK'"
    bool_6 = price_2.as_boolean()
    money_2 = money_1.add(money_0)
    money_3 = some_money_0.divide(str_1)
    bool_7 = none_money_0.lte(money_0)

def test_case_21():
    str_0 = None
    none_price_0 = module_0.NonePrice()
    price_0 = none_price_0.floor_divide(str_0)
    list_0 = [str_0, none_price_0, price_0]
    some_price_0 = module_0.SomePrice(*list_0)
    decimal_0 = None
    price_1 = some_price_0.with_qty(decimal_0)
    price_2 = some_price_0.subtract(price_0)
    price_3 = some_price_0.abs()
    var_0 = None
    monetary_operation_exception_0 = module_0.MonetaryOperationException()
    price_4 = none_price_0.divide(var_0)
    price_5 = some_price_0.negative()
    price_6 = none_price_0.positive()
    none_money_0 = module_0.NoneMoney()
    money_0 = none_money_0.floor_divide(var_0)
    price_7 = none_price_0.abs()
    price_8 = price_0.subtract(price_4)
    money_1 = price_0.times(var_0)
    bool_0 = none_price_0.gte(price_0)
    price_9 = some_price_0.positive()

def test_case_22():
    price_0 = module_0.Price()
    price_1 = price_0.__sub__(price_0)

def test_case_23():
    str_0 = ')o'
    none_money_0 = module_0.NoneMoney()
    int_0 = None
    money_0 = none_money_0.negative()
    currency_type_0 = module_2.CurrencyType.ALTERNATIVE
    decimal_0 = module_1.Decimal()
    currency_0 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    bool_0 = currency_0.__eq__(decimal_0)
    list_0 = [int_0, decimal_0, currency_0]
    some_price_0 = module_0.SomePrice(*list_0)
    bool_1 = money_0.__le__(money_0)
    price_0 = some_price_0.positive()
    bool_2 = price_0.lt(price_0)
    price_1 = some_price_0.subtract(price_0)
    some_money_0 = module_0.SomeMoney(*list_0)
    bool_3 = some_money_0.lte(money_0)
    bool_4 = price_1.__gt__(price_0)
    some_price_1 = module_0.SomePrice(*list_0)
    bool_5 = some_money_0.gt(money_0)
    price_2 = price_1.__add__(price_0)
    bool_6 = price_0.__le__(price_1)
    money_1 = some_money_0.subtract(money_0)
    bool_7 = money_1.__ge__(money_1)
    currency_1 = module_2.Currency(str_0, str_0, int_0, currency_type_0, decimal_0, int_0)
    var_0 = money_0.__round__()
    bool_8 = price_2.as_boolean()
    money_2 = money_1.add(money_0)
    money_3 = money_2.add(money_1)
    bool_9 = money_1.gt(money_2)
    bool_10 = price_1.gte(price_1)
    money_4 = some_money_0.subtract(money_1)
    date_0 = None
    price_3 = price_2.with_dov(date_0)