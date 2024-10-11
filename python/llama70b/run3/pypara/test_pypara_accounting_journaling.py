import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries
from datetime import datetime, date
from typing import Iterable


class Quantity:
    def __init__(self, value):
        self.value = value

class Amount:
    def __init__(self, value):
        self.value = value

class Account:
    def __init__(self, name, account_type=None):
        self.name = name
        self.account_type = account_type

class AccountType:
    ASSETS = 1
    REVENUES = 2

class DateRange:
    def __init__(self, start, end):
        self.start = start
        self.end = end

class TestDirectionEnum(unittest.TestCase):
    def test_INC_value(self):
        self.assertEqual(Direction.INC.value, 1)

    def test_DEC_value(self):
        self.assertEqual(Direction.DEC.value, -1)

    def test_of_INC(self):
        self.assertEqual(Direction.of(Quantity(1)), Direction.INC)

    def test_of_DEC(self):
        self.assertEqual(Direction.of(Quantity(-1)), Direction.DEC)

class TestPosting(unittest.TestCase):
    def test_init(self):
        posting = Posting(JournalEntry(str), datetime.date.today(), Account("Test"), Direction.INC, Amount(1))
        self.assertIsNotNone(posting)

    def test_is_debit(self):
        posting = Posting(JournalEntry(str), datetime.date.today(), Account("Test", AccountType.ASSETS), Direction.INC, Amount(1))
        self.assertTrue(posting.is_debit)

    def test_is_credit(self):
        posting = Posting(JournalEntry(str), datetime.date.today(), Account("Test", AccountType.REVENUES), Direction.DEC, Amount(1))
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_init(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        self.assertIsNotNone(journal_entry)

    def test_increments(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        journal_entry.post(datetime.date.today(), Account("Test"), Quantity(1))
        self.assertEqual(list(journal_entry.increments), [journal_entry.postings[0]])

    def test_decrements(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        journal_entry.post(datetime.date.today(), Account("Test"), Quantity(-1))
        self.assertEqual(list(journal_entry.decrements), [journal_entry.postings[0]])

    def test_debits(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        journal_entry.post(datetime.date.today(), Account("Test", AccountType.ASSETS), Quantity(1))
        self.assertEqual(list(journal_entry.debits), [journal_entry.postings[0]])

    def test_credits(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        journal_entry.post(datetime.date.today(), Account("Test", AccountType.REVENUES), Quantity(-1))
        self.assertEqual(list(journal_entry.credits), [journal_entry.postings[0]])

    def test_post(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        journal_entry.post(datetime.date.today(), Account("Test"), Quantity(1))
        self.assertEqual(len(journal_entry.postings), 1)

    def test_validate(self):
        journal_entry = JournalEntry(str, datetime.date.today(), "Test", "Source")
        journal_entry.post(datetime.date.today(), Account("Test", AccountType.ASSETS), Quantity(1))
        journal_entry.post(datetime.date.today(), Account("Test", AccountType.REVENUES), Quantity(-1))
        journal_entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        class MockReadJournalEntries(ReadJournalEntries[str]):
            def __call__(self, period: DateRange) -> Iterable[JournalEntry[str]]:
                return [JournalEntry(str, datetime.date.today(), "Test", "Source")]
        read_journal_entries = MockReadJournalEntries()
        self.assertIsNotNone(read_journal_entries(DateRange(datetime.date.today(), datetime.date.today())))

if __name__ == '__main__':
    unittest.main()