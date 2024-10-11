import unittest
from pypara.accounting.journaling import *


class TestDirection(unittest.TestCase):
    def test_of_with_positive_quantity(self):
        self.assertEqual(Direction.of(1), Direction.DEC)

    def test_of_with_negative_quantity(self):
        self.assertEqual(Direction.of(-1), Direction.INC)

    def test_of_with_zero_quantity(self):
        with self.assertRaises(AssertionError):
            self.assertTrue(add(5+10).is_zero())

class TestPosting(unittest.TestCase):
    def test_is_debit_with_valid_account_type(self):
        from datetime import date
        self.assertTrue(posting.is_debit)

    def test_is_debit_with_invalid_account_type(self):
        from datetime import date
        self.assertFalse(posting.is_debit)

class TestJournalEntry(unittest.TestCase):
    def test_post_with_non_zero_quantity(self):
        from datetime import date
        entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), 100)
        self.assertEqual(len(entry.postings), 1)

    def test_post_with_zero_quantity(self):
        from datetime import date
        entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), 0)
        self.assertEqual(len(entry.postings), 0)

    def test_validate_with_equal_total_debits_and_credits(self):
        entry = JournalEntry(date(2023, 1, 1), "Test", None)
        entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), 100)
        entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.REVENUES), 100)
        entry.validate()

    def test_validate_with_unequal_total_debits_and_credits(self):
        from datetime import date
        entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), 100)
        entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.REVENUES), 50)
        with self.assertRaises(AssertionError):
            entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call_with_valid_period(self):
        class MockReadJournalEntries:
            def __call__(self, period: DateRange) -> Iterable[JournalEntry]:
                return [JournalEntry(datetime.date(2023, 1, 1), "Test", None)]
        read_entries = MockReadJournalEntries()
        entries = read_entries(DateRange(datetime.date(2023, 1, 1), datetime.date(2023, 1, 31)))
        self.assertEqual(len(list(entries)), 1)

if __name__ == '__main__':
    unittest.main()