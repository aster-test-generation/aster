import unittest
from pypara.exchange import FXRate, FXRateLookupError, FXRateService, Currency, Date


class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        asof = Date(2022, 1, 1)
        error = FXRateLookupError(ccy1, ccy2, asof)
        self.assertEqual(error.ccy1, ccy1)
        self.assertEqual(error.ccy2, ccy2)
        self.assertEqual(error.asof, asof)
        self.assertEqual(str(error), f"Foreign exchange rate for {ccy1}/{ccy2} not found as of {asof}")

class TestFXRate(unittest.TestCase):
    def test_init(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        fx_rate = FXRate(ccy1, ccy2, date, value)
        self.assertEqual(fx_rate.ccy1, ccy1)
        self.assertEqual(fx_rate.ccy2, ccy2)
        self.assertEqual(fx_rate.date, date)
        self.assertEqual(fx_rate.value, value)

    def test_invert(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        fx_rate = FXRate(ccy1, ccy2, date, value)
        inverted_fx_rate = ~fx_rate
        self.assertEqual(inverted_fx_rate.ccy1, ccy2)
        self.assertEqual(inverted_fx_rate.ccy2, ccy1)
        self.assertEqual(inverted_fx_rate.date, date)
        self.assertEqual(inverted_fx_rate.value, value ** -1)

    def test_of(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        fx_rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(fx_rate.ccy1, ccy1)
        self.assertEqual(fx_rate.ccy2, ccy2)
        self.assertEqual(fx_rate.date, date)
        self.assertEqual(fx_rate.value, value)

    def test_str(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        fx_rate = FXRate(ccy1, ccy2, date, value)
        self.assertEqual(str(fx_rate), f"{ccy1}/{ccy2} on {date}: {value}")

    def test_repr(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        fx_rate = FXRate(ccy1, ccy2, date, value)
        self.assertEqual(repr(fx_rate), f"FXRate({ccy1!r}, {ccy2!r}, {date!r}, {value!r})")

class TestFXRateService(unittest.TestCase):
    def test_init(self):
        service = FXRateService()
        self.assertIsInstance(service, FXRateService)

    def test_query(self):
        # This test will fail because query is an abstract method
        service = FXRateService()
        with self.assertRaises(NotImplementedError):
            service.query(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))

    def test_queries(self):
        # This test will fail because queries is an abstract method
        service = FXRateService()
        with self.assertRaises(NotImplementedError):
            service.queries([(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))])

if __name__ == '__main__':
    unittest.main()