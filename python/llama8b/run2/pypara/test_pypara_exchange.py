import unittest
from pypara.exchange import FXRate, FXRateLookupError, FXRateService


class TestFXRate(unittest.TestCase):
    def test_init(self):
        fx_rate = FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))
        self.assertEqual(fx_rate.ccy1, Currency('USD'))
        self.assertEqual(fx_rate.ccy2, Currency('EUR'))
        self.assertEqual(fx_rate.date, Date('2022-01-01'))
        self.assertEqual(fx_rate.value, Decimal('1.2'))

    def test_invert(self):
        fx_rate = FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))
        inverted_fx_rate = ~fx_rate
        self.assertEqual(inverted_fx_rate.ccy1, Currency('EUR'))
        self.assertEqual(inverted_fx_rate.ccy2, Currency('USD'))
        self.assertEqual(inverted_fx_rate.date, Date('2022-01-01'))
        self.assertEqual(inverted_fx_rate.value, Decimal('0.8333333333333333'))

    def test_of(self):
        fx_rate = FXRate.of(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))
        self.assertEqual(fx_rate.ccy1, Currency('USD'))
        self.assertEqual(fx_rate.ccy2, Currency('EUR'))
        self.assertEqual(fx_rate.date, Date('2022-01-01'))
        self.assertEqual(fx_rate.value, Decimal('1.2'))

    def test_str(self):
        fx_rate = FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))
        self.assertEqual(str(fx_rate), f"FXRate(ccy1={fx_rate.ccy1}, ccy2={fx_rate.ccy2}, date={fx_rate.date}, value={fx_rate.value})")

    def test_repr(self):
        fx_rate = FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))
        self.assertEqual(repr(fx_rate), f"FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))")

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        class MockFXRateService(FXRateService):
            def query(self, ccy1, ccy2, asof, strict):
                return FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2'))
        fx_rate_service = MockFXRateService()
        fx_rate = fx_rate_service.query(Currency('USD'), Currency('EUR'), Date('2022-01-01'))
        self.assertEqual(fx_rate.ccy1, Currency('USD'))
        self.assertEqual(fx_rate.ccy2, Currency('EUR'))
        self.assertEqual(fx_rate.date, Date('2022-01-01'))
        self.assertEqual(fx_rate.value, Decimal('1.2'))

    def test_queries(self):
        class MockFXRateService(FXRateService):
            def queries(self, queries, strict):
                return [FXRate(Currency('USD'), Currency('EUR'), Date('2022-01-01'), Decimal('1.2')) for _ in queries]
        fx_rate_service = MockFXRateService()
        queries = [(Currency('USD'), Currency('EUR'), Date('2022-01-01')) for _ in range(2)]
        fx_rates = list(fx_rate_service.queries(queries))
        self.assertEqual(len(fx_rates), 2)
        for fx_rate in fx_rates:
            self.assertEqual(fx_rate.ccy1, Currency('USD'))
            self.assertEqual(fx_rate.ccy2, Currency('EUR'))
            self.assertEqual(fx_rate.date, Date('2022-01-01'))
            self.assertEqual(fx_rate.value, Decimal('1.2'))

if __name__ == '__main__':
    unittest.main()