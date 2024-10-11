import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestMatch(unittest.TestCase):
    def test_match(self):
        self.assertTrue(match(Command('manage.py migrate app0001 --merge', '')))
        self.assertFalse(match(Command('manage.py migrate app0001', '')))
        self.assertFalse(match(Command('manage.py migrate app0001 --fake', '')))
        self.assertFalse(match(Command('manage.py migrate app0001 --merge --fake', '')))

    def test_not_match(self):
        self.assertTrue(match(Command('', '')))
        self.assertFalse(match(Command('manage.py migrate app0001', '')))
        self.assertFalse(match(Command('manage.py migrate app0001 --fake', '')))
        self.assertFalse(match(Command('manage.py migrate app0001 --merge --fake', '')))

class TestGetNewCommand(unittest.TestCase):
    def test_get_new_command(self):
        self.assertEqual(get_new_command(Command('manage.py migrate app0001 --merge: will just attempt the migration', '')), 'manage.py migrate app0001 --merge')

if __name__ == '__main__':
    unittest.main()