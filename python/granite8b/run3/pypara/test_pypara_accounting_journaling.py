import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries


class TestDirection(unittest.TestCase):
    def test_direction_enum(self):
        self.assertEqual(Direction.INC.value, 1)
        self.assertEqual(Direction.DEC.value, -1)

class TestPosting(unittest.TestCase):
    def test_posting_init(self):
        journal = JournalEntry(date.today(), "Test Entry", None)
        account = Account("Test Account", AccountType.ASSETS)
        posting = Posting(journal, datetime.date.today(), account, Direction.INC, Amount(100))
        self.assertEqual(posting.journal, journal)
        self.assertEqual(posting.date, datetime.date.today())
        self.assertEqual(posting.account, account)
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(100))

class TestJournalEntry(unittest.TestCase):
    def test_journal_entry_init(self):
        journal = JournalEntry(date.today(), "Test Entry", None)
        self.assertEqual(journal.date, datetime.date.today())
        self.assertEqual(journal.description, "Test Entry")
        self.assertEqual(journal.source, None)
        self.assertEqual(len(journal.postings), 0)
        self.assertIsNotNone(journal.guid)

class TestReadJournalEntries(unittest.TestCase):
    def test_read_journal_entries(self):
        class MockReadJournalEntries(ReadJournalEntries):
            def __call__(self, period: DateRange) -> Iterable[JournalEntry]:
                return [JournalEntry(datetime.date.today(), "Test Entry", None)]
        read_journal_entries = MockReadJournalEntries()
        entries = read_journal_entries(DateRange(datetime.date.today(), datetime.date.today()))
        self.assertEqual(len(list(entries)), 1)

if __name__ == '__main__':
    unittest.main()