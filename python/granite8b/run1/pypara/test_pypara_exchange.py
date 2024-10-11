import unittest
from pypara.exchange import FXRate, FXRateLookupError, FXRateService


class TestFXRate(unittest.TestCase):
    def test_of(self):
        fx_rate = FXRate.of(Currency("USD"), Currency("EUR"), Date(2023, 1, 1), Decimal("1.20"))
        self.assertEqual(fx_rate.ccy1, Currency("USD"))
        self.assertEqual(fx_rate.ccy2, Currency("EUR"))
        self.assertEqual(fx_rate.date, Date(2023, 1, 1))
        self.assertEqual(fx_rate.value, Decimal("1.20"))

    def test_invert(self):
        fx_rate = FXRate.of(Currency.USD, Currency.EUR, Date(2023, 1, 1), Decimal("1.20"))
        inverted_fx_rate = ~fx_rate
        self.assertEqual(inverted_fx_rate.ccy1, Currency("EUR"))
        self.assertEqual(inverted_fx_rate.ccy2, Currency("USD"))
        self.assertEqual(inverted_fx_rate.date, Date(2023, 1, 1))
        self.assertEqual(inverted_fx_rate.value, Decimal("0.833333"))

class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        error = FXRateLookupError(Currency("USD"), Currency("EUR"), Date(2023, 1, 1))
        self.assertEqual(error.ccy1, Currency("USD"))
        self.assertEqual(error.ccy2, Currency("EUR"))
        self.assertEqual(error.asof, Date(2023, 1, 1))
        self.assertEqual(str(error), "Foreign exchange rate for USD/EUR not found as of 2023-01-01")

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        class MockFXRateService(FXRateService):
            def query(self, ccy1, ccy2, asof, strict=False):
                if ccy1 == Currency("USD") and ccy2 == Currency("EUR") and asof == Date(2023, 1, 1):
                    return FXRate.of(Currency("USD"), Currency("EUR"), Date(2023, 1, 1), Decimal("1.20"))
                return None
        service = MockFXRateService()
        fx_rate = service.query(Currency("USD"), Currency("EUR"), Date(2023, 1, 1))
        self.assertEqual(fx_rate.ccy1, Currency("USD"))
        self.assertEqual(fx_rate.ccy2, Currency("EUR"))
        self.assertEqual(fx_rate.date, Date(2023, 1, 1))
        self.assertEqual(fx_rate.value, Decimal("1.20"))

if __name__ == '__main__':
    unittest.main()