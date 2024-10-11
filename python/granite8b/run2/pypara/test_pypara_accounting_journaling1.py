import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries

class TestDirection(unittest.TestCase):
    def test_INC(self):
        self.assertEqual(Direction.INC.value, 1)

    def test_DEC(self):
        self.assertEqual(Direction.DEC.value, -1)

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