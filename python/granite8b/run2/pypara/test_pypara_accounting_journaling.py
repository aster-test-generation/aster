import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries


class TestDirection(unittest.TestCase):
    def test_INC(self):
        self.assertEqual(Direction.INC.value, 1)

    def test_DEC(self):
        self.assertEqual(Direction.DEC.value, -1)

class TestPosting(unittest.TestCase):
    def test_init(self):
        journal = JournalEntry(date=date(2023, 1, 1), description="Test", source=None)
        posting = Posting(journal=journal, date=datetime.date(2023, 1, 1), account=None, direction=Direction.INC, amount=10)
        self.assertEqual(posting.journal, journal)
        self.assertEqual(posting.date, datetime.date(2023, 1, 1))
        self.assertEqual(posting.account, None)
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, 10)

    def test_is_debit(self):
        journal = JournalEntry(date=date(2023, 1, 1), description="Test", source=None)
        posting = Posting(journal=journal, date=datetime.date(2023, 1, 1), account=None, direction=Direction.INC, amount=10)
        self.assertTrue(posting.is_debit)

    def test_is_credit(self):
        journal = JournalEntry(date=date(2023, 1, 1), description="Test", source=None)
        posting = Posting(journal=journal, date=datetime.date(2023, 1, 1), account=None, direction=Direction.DEC, amount=10)
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_init(self):
        journal = JournalEntry(date=date(2023, 1, 1), description="Test", source=None)
        self.assertEqual(journal.date, datetime.date(2023, 1, 1))
        self.assertEqual(journal.description, "Test")
        self.assertEqual(journal.source, None)
        self.assertEqual(len(journal.postings), 0)
        self.assertIsNotNone(journal.guid)

    def test_post(self):
        journal = JournalEntry(date=date(2023, 1, 1), description="Test", source=None)
        journal.post(date=datetime.date(2023, 1, 1), account=None, quantity=10)
        self.assertEqual(len(journal.postings), 1)

    def test_validate(self):
        journal = JournalEntry(date=date(2023, 1, 1), description="Test", source=None)
        journal.post(date=datetime.date(2023, 1, 1), account=None, quantity=10)
        journal.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        read_journal_entries = ReadJournalEntries()
        period = DateRange(start=datetime.date(2023, 1, 1), end=datetime.date(2023, 12, 31))
        result = read_journal_entries(period=period)
        self.assertIsInstance(result, Iterable)

class TestPosting(unittest.TestCase):
    def test_is_debit(self):
        posting = Posting(None, None, None, Direction.INC, 10)
        self.assertTrue(posting.is_debit)

        posting = Posting(None, None, None, Direction.DEC, 10)
        self.assertFalse(posting.is_debit)

    def test_is_credit(self):
        posting = Posting(None, None, None, Direction.INC, 10)
        self.assertFalse(posting.is_credit)

        posting = Posting(None, None, None, Direction.DEC, 10)
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_post(self):
        entry = JournalEntry(None, None, None)
        entry.post(None, None, 10)
        self.assertEqual(len(entry.postings), 1)

        entry.post(None, None, -10)
        self.assertEqual(len(entry.postings), 2)

    def test_validate(self):
        entry = JournalEntry(None, None, None)
        entry.post(None, None, 10)
        entry.post(None, None, -10)
        entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        read_func = ReadJournalEntries(None)
        result = read_func(None)
        self.assertIsInstance(result, Iterable)

if __name__ == '__main__':
    unittest.main()