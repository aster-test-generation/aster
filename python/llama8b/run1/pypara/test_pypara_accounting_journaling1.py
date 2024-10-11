import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries
from datetime import date
from pypara.accounting.journaling import Account, AccountType
from pypara.accounting.journaling import makeguid

class TestDirection(unittest.TestCase):
    def test_direction_of(self):
        self.assertEqual(Direction.of(1).name, 'INC')
        self.assertEqual(Direction.of(-1).name, 'DEC')

class TestPosting(unittest.TestCase):
    def test_posting_init(self):
        posting = Posting(None, date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertEqual(posting.journal, None)
        self.assertEqual(posting.date, date(2022, 1, 1))
        self.assertEqual(posting.account, Account('Account1', AccountType.ASSETS))
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(100))

    def test_posting_is_debit(self):
        posting = Posting(None, date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertTrue(posting.is_debit)

    def test_posting_is_credit(self):
        posting = Posting(None, date(2022, 1, 1), Account('Account1', AccountType.REVENUES), Direction.DEC, Amount(100))
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_journal_entry_init(self):
        journal_entry = JournalEntry(date(2022, 1, 1), 'Description', None)
        self.assertEqual(journal_entry.date, date(2022, 1, 1))
        self.assertEqual(journal_entry.description, 'Description')
        self.assertEqual(journal_entry.source, None)
        self.assertEqual(journal_entry.postings, [])

    def test_journal_entry_post(self):
        journal_entry = JournalEntry(date(2022, 1, 1), 'Description', None)
        posting = journal_entry.post(date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Amount(100))
        self.assertEqual(len(journal_entry.postings), 1)
        self.assertEqual(posting.journal, journal_entry)
        self.assertEqual(posting.date, date(2022, 1, 1))
        self.assertEqual(posting.account, Account('Account1', AccountType.ASSETS))
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(100))

    def test_journal_entry_validate(self):
        journal_entry = JournalEntry(date(2022, 1, 1), 'Description', None)
        posting1 = journal_entry.post(date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Amount(100))
        posting2 = journal_entry.post(date(2022, 1, 1), Account('Account2', AccountType.REVENUES), Amount(100))
        journal_entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_read_journal_entries(self):
        class MockReadJournalEntries(ReadJournalEntries):
            def __call__(self, period: DateRange) -> Iterable[JournalEntry]:
                return [JournalEntry(date(2022, 1, 1), 'Description', None)]
        read_journal_entries = MockReadJournalEntries()
        journal_entries = list(read_journal_entries(DateRange(date(2022, 1, 1), date(2022, 1, 1))))
        self.assertEqual(len(journal_entries), 1)

if __name__ == '__main__':
    unittest.main()