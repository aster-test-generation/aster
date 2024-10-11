import unittest
from pypara.exchange import *


class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        asof = Date(2022, 1, 1)
        fx_rate_lookup_error = FXRateLookupError(ccy1, ccy2, asof)
        self.assertEqual(fx_rate_lookup_error.ccy1, ccy1)
        self.assertEqual(fx_rate_lookup_error.ccy2, ccy2)
        self.assertEqual(fx_rate_lookup_error.asof, asof)

    def test_str(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        asof = Date(2022, 1, 1)
        fx_rate_lookup_error = FXRateLookupError(ccy1, ccy2, asof)
        self.assertEqual(str(fx_rate_lookup_error), "Foreign exchange rate for USD/EUR not found as of 2022-01-01")

class TestFXRate(unittest.TestCase):
    def test_of(self):
        from currency import Currency
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal(1.2)
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(fx_rate.ccy1, ccy1)
        self.assertEqual(fx_rate.ccy2, ccy2)
        self.assertEqual(fx_rate.date, date)
        self.assertEqual(fx_rate.value, value)

    def test_invert(self):
        from currency import Currency
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal(1.2)
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(~fx_rate, FXRate.of(ccy2, ccy1, date, Decimal(1 / 1.2)))

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal(1.2)
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        fx_rate_service = FXRateService()
        self.assertEqual(fx_rate_service.query(ccy1, ccy2, date), None)

    def test_queries(self):
        from currency import Currency
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal(1.2)
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        fx_rate_service = FXRateService()
        self.assertEqual(list(fx_rate_service.queries([(ccy1, ccy2, date)])), [None])

if __name__ == '__main__':
    unittest.main()