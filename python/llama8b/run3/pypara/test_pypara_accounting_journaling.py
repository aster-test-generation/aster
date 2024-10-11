import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries


class TestDirection(unittest.TestCase):
    def test_direction_of(self):
        self.assertEqual(Direction.of(1).name, "INC")
        self.assertEqual(Direction.of(-1).name, "DEC")

class TestPosting(unittest.TestCase):
    def test_posting_init(self):
        journal_entry = JournalEntry(date=datetime.date.today(), description="Test", source="Test Source")
        posting = Posting(journal_entry, datetime.date.today(), Account("Test Account"), Direction.INC, Amount(1))
        self.assertEqual(posting.journal, journal_entry)
        self.assertEqual(posting.date, datetime.date.today())
        self.assertEqual(posting.account, Account("Test Account"))
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(1))

    def test_posting_is_debit(self):
        posting = Posting(JournalEntry(date=datetime.date.today(), description="Test", source="Test Source"), datetime.date.today(), Account("Test Account"), Direction.INC, Amount(1))
        self.assertTrue(posting.is_debit)

    def test_posting_is_credit(self):
        posting = Posting(JournalEntry(date=datetime.date.today(), description="Test", source="Test Source"), datetime.date.today(), Account("Test Account"), Direction.DEC, Amount(1))
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_journal_entry_init(self):
        journal_entry = JournalEntry(date=datetime.date.today(), description="Test", source="Test Source")
        self.assertEqual(journal_entry.date, datetime.date.today())
        self.assertEqual(journal_entry.description, "Test")
        self.assertEqual(journal_entry.source, "Test Source")
        self.assertEqual(journal_entry.guid, Guid())

    def test_journal_entry_post(self):
        journal_entry = JournalEntry(date=datetime.date.today(), description="Test", source="Test Source")
        journal_entry.post(datetime.date.today(), Account("Test Account"), Amount(1))
        self.assertEqual(len(journal_entry.postings), 1)

    def test_journal_entry_validate(self):
        journal_entry = JournalEntry(date=datetime.date.today(), description="Test", source="Test Source")
        journal_entry.post(datetime.date.today(), Account("Test Account"), Amount(1))
        journal_entry.post(datetime.date.today(), Account("Test Account"), Amount(-1))
        journal_entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_read_journal_entries(self):
        # This test is incomplete as the ReadJournalEntries protocol is not implemented
        pass

if __name__ == '__main__':
    unittest.main()