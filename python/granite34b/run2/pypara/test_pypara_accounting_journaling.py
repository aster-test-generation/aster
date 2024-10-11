import unittest
from pypara.accounting.journaling import *


class TestDirection(unittest.TestCase):
    def test_of(self):
        self.assertEqual(Direction.of(1), Direction.DEC)
        self.assertEqual(Direction.of(-1), Direction.DEC)
        with self.assertRaises(AssertionError):
            Direction.of(0)

class TestPosting(unittest.TestCase):
    def test_is_debit(self):
        posting = Posting(JournalEntry(datetime.date(2023, 1, 1), "Test", None), datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertTrue(posting.is_debit)

    def test_is_credit(self):
        from datetime import date
        self.assertFalse(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_post(self):
        from datetime import date
        journal_entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), 100)
        self.assertEqual(len(journal_entry.postings), 1)

    def test_validate(self):
        from datetime import date
        journal_entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.ASSETS), 100)
        journal_entry.post(datetime.date(2023, 1, 1), Account("Test", AccountType.REVENUES), 100)
        journal_entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        class MockReadJournalEntries(ReadJournalEntries):
            def __call__(self, period: DateRange) -> Iterable[JournalEntry]:
                return []
        read_journal_entries = MockReadJournalEntries()
        self.assertEqual(list(read_journal_entries(DateRange(datetime.date(2023, 1, 1), datetime.date(2023, 1, 31)))), [])

if __name__ == '__main__':
    unittest.main()