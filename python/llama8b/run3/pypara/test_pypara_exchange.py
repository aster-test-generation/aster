import unittest
from pypara.exchange import FXRate, FXRateLookupError, FXRateService


class TestFXRate(unittest.TestCase):
    def test_init(self):
        from currency import Currency
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(fx_rate.ccy1, ccy1)
        self.assertEqual(fx_rate.ccy2, ccy2)
        self.assertEqual(fx_rate.date, date)
        self.assertEqual(fx_rate.value, value)

    def test_invert(self):
        from currency import Currency 
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        inverted_fx_rate = ~fx_rate
        self.assertEqual(inverted_fx_rate.ccy1, ccy2)
        self.assertEqual(inverted_fx_rate.ccy2, ccy1)
        self.assertEqual(inverted_fx_rate.date, date)
        self.assertEqual(inverted_fx_rate.value, Decimal("0.8115"))

    def test_eq(self):
        from currency import Currency 
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate1 = FXRate.of(ccy1, ccy2, date, value)
        fx_rate2 = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(fx_rate1, fx_rate2)

    def test_str(self):
        from currency import Currency 
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(str(fx_rate), f"FXRate(ccy1={ccy1}, ccy2={ccy2}, date={date}, value={value})")

    def test_repr(self):
        from currency import Currency
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(repr(fx_rate), f"FXRate(ccy1={ccy1}, ccy2={ccy2}, date={date}, value={value})")

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        from abc import ABC, abstractmethod
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        service.query(ccy1, ccy2, date)  # Should raise FXRateLookupError
        self.assertRaises(FXRateLookupError, service.query, ccy1, ccy2, date)

    def test_queries(self):
        from abc import ABC, abstractmethod
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        queries = [(ccy1, ccy2, date), (ccy2, ccy1, date)]
        results = list(service.queries(queries))
        self.assertEqual(len(results), 2)
        self.assertEqual(results[0], fx_rate)
        self.assertEqual(results[1], ~fx_rate)

class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        from currency import Currency 
        ccy2 = Currency("EUR")
        date = Date("2022-01-01")
        error = FXRateLookupError(ccy1, ccy2, date)
        self.assertEqual(error.ccy1, ccy1)
        self.assertEqual(error.ccy2, ccy2)
        self.assertEqual(error.asof, date)
        self.assertEqual(str(error), f"Foreign exchange rate for {ccy1}/{ccy2} not found as of {date}")

if __name__ == '__main__':
    unittest.main()