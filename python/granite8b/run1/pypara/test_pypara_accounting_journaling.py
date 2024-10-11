from pypara.accounting.journaling import DateRange
import datetime
import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries


class TestDirection(unittest.TestCase):
    def test_of(self):
        self.assertEqual(Direction.of(1), Direction.DEC)
        self.assertEqual(Direction.of(-1), Direction.DEC)
        self.assertEqual(Direction.of(0), Direction.INC)  # Programming error

class TestPosting(unittest.TestCase):
    def test_init(self):
        posting = Posting(None, datetime.date.today(), None, Direction.INC, 10)
        self.assertEqual(posting.journal, None)
        self.assertEqual(posting.date, datetime.date.today())
        self.assertEqual(posting.account, None)
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, 10)
        self.assertTrue(posting.is_credit)
        self.assertFalse(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_init(self):
        entry = JournalEntry(None, "Test Entry", None)
        self.assertEqual(entry.date, None)
        self.assertEqual(entry.description, "Test Entry")
        self.assertEqual(entry.source, None)
        self.assertEqual(entry.postings, [])
        self.assertEqual(entry.guid, '1d1800b4b7aa4ca5b63558473b0b08bb')
        self.assertEqual(list(entry.increments), [])
        self.assertEqual(list(entry.decrements), [])
        self.assertEqual(list(entry.debits), [])
        self.assertEqual(list(entry.credits), [])

    def test_post(self):
        entry = JournalEntry(None, "Test Entry", None)
        entry.post(datetime.date.today(), None, 100)
        self.assertEqual(len(entry.postings), 1)
        self.assertEqual(entry.postings[0].amount, 10)
        self.assertTrue(entry.postings[0].is_debit)
        self.assertFalse(entry.postings[0].is_credit)

    def test_validate(self):
        entry = JournalEntry(None, "Test Entry", None)
        entry.post(datetime.date.today(), None, 100)
        entry.post(datetime.date.today(), None, -10)
        entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        read_journal_entries = ReadJournalEntries()
        entries = read_journal_entries(DateRange(datetime.date.today(), datetime.date.today()))
        self.assertEqual(list(entries), [])

if __name__ == '__main__':
    unittest.main()