import unittest
from decimal import Decimal
from pypara.exchange import FXRate, FXRateLookupError, FXRateService
from pypara.commons.numbers import ONE, ZERO
from pypara.commons.zeitgeist import Date
from pypara.currencies import Currency


class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        ccy1 = Currency("USD", "US Dollar", 2, "fiat", None, None)
        ccy2 = Currency("EUR")
        asof = Date(2023, 1, 1)
        error = FXRateLookupError(ccy1, ccy2, asof)
        self.assertEqual(error.ccy1, ccy1)
        self.assertEqual(error.ccy2, ccy2)
        self.assertEqual(error.asof, asof)
        self.assertEqual(str(error), "Foreign exchange rate for USD/EUR not found as of 2023-01-01")

class TestFXRate(unittest.TestCase):
    def test_invert(self):
        ccy1 = Currency("USD", "US Dollar", 2, "fiat", None, None)
        ccy2 = Currency("EUR")
        date = Date(2023, 1, 1)
        value = Decimal("1.2")
        fx_rate = FXRate(ccy1, ccy2, date, value)
        inverted = ~fx_rate
        self.assertEqual(inverted.ccy1, ccy2)
        self.assertEqual(inverted.ccy2, ccy1)
        self.assertEqual(inverted.date, date)
        self.assertEqual(inverted.value, Decimal("1") / value)

    def test_of_valid(self):
        ccy1 = Currency("USD", "US Dollar", 2, "fiat", None, None)
        ccy2 = Currency("EUR")
        date = Date(2023, 1, 1)
        value = Decimal("1.2")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(fx_rate.ccy1, ccy1)
        self.assertEqual(fx_rate.ccy2, ccy2)
        self.assertEqual(fx_rate.date, date)
        self.assertEqual(fx_rate.value, value)

    def test_of_invalid_currency(self):
        with self.assertRaises(ValueError):
            FXRate.of("USD", Currency("EUR", "Euro", 2, "fiat", None, None), Date(2023, 1, 1), Decimal("1.2"))

    def test_of_invalid_value(self):
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD", "US Dollar", 2, "fiat", None, None), Currency("EUR", "Euro", 2, "fiat", None, None), Date(2023, 1, 1), Decimal("-1.2"))

    def test_of_same_currency_invalid_value(self):
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD", "US Dollar", 2, "fiat", None, None), Currency("USD", "US Dollar", 2, "fiat", None, None), Date(2023, 1, 1), Decimal("1.2"))

    def test_of_same_currency_valid_value(self):
        fx_rate = FXRate.of(Currency("USD", 2, "fiat", None, None), Currency("USD", 2, "fiat", None, None), Date(2023, 1, 1), ONE)
        self.assertEqual(fx_rate.ccy1, Currency("USD"))
        self.assertEqual(fx_rate.ccy2, Currency("USD"))
        self.assertEqual(fx_rate.date, Date(2023, 1, 1))
        self.assertEqual(fx_rate.value, ONE)

class TestFXRateService(unittest.TestCase):
    def test_query_abstract(self):
        with self.assertRaises(TypeError):
            FXRateService()

    def test_queries_abstract(self):
        with self.assertRaises(TypeError):
            FXRateService()

if __name__ == '__main__':
    unittest.main()